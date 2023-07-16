/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Cart;
import Model.Category;
import Model.Item;
import Model.Order;
import Model.OrderDetail;
import Model.Product;
import Model.User;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aver
 */
public class OrderDAO extends DBContext {

    public List<Item> getItemByTableId(int tableId) {
        List<Item> item = new ArrayList<>();
        productDao p = new productDao();
        try {
            String sql = "Select * from Cart where tableId = ?";
            PreparedStatement stm = connection.prepareCall(sql);
            stm.setInt(1, tableId);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Item it = new Item();
                it.setProduct(p.getProductByID(rs.getInt("productID")));
                it.setPrice(rs.getFloat("productPrice"));
                it.setQuantity(rs.getInt("quantity"));
                item.add(it);
            }
            return item;
        } catch (SQLException ex) {
            Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public List<Product> getAllProduct() {
        List<Product> products = new ArrayList<>();
        try {
            String sql = "select * from Products";
            PreparedStatement stm = connection.prepareCall(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Product fl = new Product();
                fl.setProductId(rs.getInt("productID"));
                fl.setProductName(rs.getString("productName"));
                fl.setDescript(rs.getString("descript"));
                fl.setImage(rs.getString("imagee"));
                fl.setPrice(rs.getFloat("price"));
                Category cat = new Category();
                cat.setCategoryId(rs.getInt("categoryId"));
                fl.setCategory(cat);
                products.add(fl);
            }
            return products;
        } catch (SQLException ex) {
            Logger.getLogger(productDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public List<Order> getAllOrder(int page) {
        List<Order> orders = new ArrayList<>();
        try {
            String sql = "select * from Orders where status = 0"
                    + "order by [date_Time] desc offset (?-1)*10 row fetch next 10 row only ";
            PreparedStatement stm = connection.prepareCall(sql);
            stm.setInt(1, page);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Order fl = new Order();
                fl.setOrderID(rs.getInt("orderID"));
                fl.setUserID(rs.getInt("userId"));
                fl.setDate(rs.getDate("date_Time"));
                fl.setTotalPrice(rs.getFloat("totalPrice"));
                orders.add(fl);
            }
            return orders;
        } catch (SQLException ex) {
            Logger.getLogger(productDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public void addCart(Cart cart, int tableId) {
        try {
            for (Item i : cart.getItems()) {
                String sql = "select * from Cart where productId = ? and tableId = ?";
                PreparedStatement st = connection.prepareStatement(sql);
                st.setInt(1, i.getProduct().getProductId());
                st.setInt(2, tableId);
                ResultSet rs = st.executeQuery();
                if (rs.next()) {
                    String sql1 = "select productPrice, quantity from cart where productId = ? and tableId = ?";
                    PreparedStatement st1 = connection.prepareStatement(sql1);
                    st1.setInt(1, i.getProduct().getProductId());
                    st1.setInt(2, tableId);
                    ResultSet rs1 = st1.executeQuery();
                    if (rs1.next()) {
                        int qt = rs1.getInt("quantity");
                        String sql2 = "update cart set quantity = ? where productId = ? and tableId = ?";
                        PreparedStatement st2 = connection.prepareStatement(sql2);
                        st2.setInt(1, qt + i.getQuantity());
                        st2.setInt(2, i.getProduct().getProductId());
                        st2.setInt(3, tableId);
                        st2.executeUpdate();
                    }
                } else {
                    String sql3 = "insert into [Cart] values(?,?,?,?)";
                    PreparedStatement st3 = connection.prepareStatement(sql3);
                    st3.setInt(1, i.getProduct().getProductId());
                    st3.setInt(2, tableId);
                    st3.setInt(3, i.getQuantity());
                    st3.setFloat(4, (i.getPrice() / 2));
                    st3.executeUpdate();
                }
            }
        } catch (SQLException e) {
        }
    }

    public float totalPrice(int tableId) {
        try {
            String sql = "SELECT SUM(multiplied_value) AS total_sum\n"
                    + "FROM (\n"
                    + "  SELECT productPrice * quantity AS multiplied_value\n"
                    + "  FROM cart where tableId = ?\n"
                    + ") AS subquery_result;";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, tableId);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                float t = rs.getFloat("total_sum");
                return t;
            }
        } catch (SQLException e) {
        }
        return 0;
    }

    public List<Item> getCartByTableID(int tableId) {
        List<Item> item = new ArrayList<>();
        productDao pr = new productDao();
        try {
            String sql = "select * from Cart "
                    + "where tableId = ?";
            PreparedStatement stm = connection.prepareCall(sql);
            stm.setInt(1, tableId);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Item it = new Item();
                it.setProduct(pr.getProductByID(rs.getInt("productID")));
                it.setPrice(rs.getFloat("productPrice"));
                it.setQuantity(rs.getInt("quantity"));
                item.add(it);
            }
            return item;
        } catch (SQLException ex) {
            Logger.getLogger(productDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public double totalMoneyDay(int day) {
        double a = 0;     
        try {
            String sql = "select top 1 SUM(totalPrice) as sum from Orders where DATEPART(dw,[date_Time]) = ? Group by date_Time order by sum desc";
            PreparedStatement stm = connection.prepareCall(sql);
            stm.setInt(1, day);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                a = rs.getFloat("sum");
                return a;
            }
        } catch (Exception e) {
        }
        return 0;
    }

    public double totalMoneyMonth(int month) {
        String sql = "select SUM(totalPrice) from Orders\r\n"
                + "where MONTH(date_Time)= ? and status = 0\r\n"
                + "Group by MONTH(date_Time)";
        try {
            PreparedStatement stm = connection.prepareCall(sql);
            stm.setInt(1, month);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                return rs.getDouble(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }

    public int setOrderStatus(int id) {
        try {
            String sql = "UPDATE [dbo].[orders]\n"
                    + "   SET [status] = 1\n"
                    + "WHERE [orders].orderId = ?";
            PreparedStatement stm = connection.prepareCall(sql);
            stm.setInt(1, id);
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
        return 1;
    }

    public void addOrder(User c, Cart cart) {
        LocalDate curDate = LocalDate.now();
        String date = curDate.toString();
        try {
            //add order
            String sql = "insert into [orders] values(?,?,?,?)";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, c.getId());
            st.setString(2, date);
            st.setDouble(3, cart.getTotalMoney());
            st.setInt(4, 0);
            st.executeUpdate();
            //lay id cua order vua add

            String sql1 = "select top 1 orderID from [Orders] order by orderID desc";
            PreparedStatement st1 = connection.prepareStatement(sql1);
            ResultSet rs = st1.executeQuery();
            //add bang OrderDetail
            if (rs.next()) {
                int oid = rs.getInt("orderID");
                for (Item i : cart.getItems()) {
                    String sql2 = "insert into [OrderItems] values(?,?,?,?)";
                    PreparedStatement st2 = connection.prepareStatement(sql2);
                    st2.setInt(1, i.getProduct().getProductId());
                    st2.setInt(2, oid);
                    st2.setFloat(3, (i.getPrice() / 2));
                    st2.setInt(4, i.getQuantity());
                    st2.executeUpdate();
                }
            }
        } catch (SQLException e) {
        }
    }

    public int deleteFromCart(int tableId) {
        try {
            String sql = "delete from Cart where tableId = ?";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, tableId);
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
        return 1;
    }

    public void addOrder2(User c, List<Item> item, float totalPrice) {
        LocalDate curDate = LocalDate.now();
        String date = curDate.toString();
        try {
            //add order
            String sql = "insert into [orders] values(?,?,?)";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, c.getId());
            st.setString(2, date);
            st.setFloat(3, totalPrice);
            st.executeUpdate();
            //lay id cua order vua add
            String sql1 = "select top 1 orderID from [Orders] order by orderID desc";
            PreparedStatement st1 = connection.prepareStatement(sql1);
            ResultSet rs = st1.executeQuery();
            //add bang OrderDetail
            if (rs.next()) {
                int oid = rs.getInt("orderID");
                for (Item i : item) {
                    String sql2 = "insert into [OrderItems] values(?,?,?,?)";
                    PreparedStatement st2 = connection.prepareStatement(sql2);
                    st2.setInt(1, i.getProduct().getProductId());
                    st2.setInt(2, oid);
                    st2.setFloat(3, (i.getPrice() / 2));
                    st2.setInt(4, i.getQuantity());
                    st2.executeUpdate();
                }
            }
        } catch (SQLException e) {
        }
    }

    public int deleteOrder(int id) {
        try {
            String sql = "delete from Orders\n"
                    + "where UserID = ?";
            PreparedStatement stm = connection.prepareCall(sql);
            stm.setInt(1, id);
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
        return 1;
    }

    public int deleteOrderItems(int id) {
        try {
            String sql = "delete a from OrderItems a left join Orders b on (a.OrderId = b.OrderId)\n"
                    + "where b.UserID = ?";
            PreparedStatement stm = connection.prepareCall(sql);
            stm.setInt(1, id);
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
        return 1;
    }

    public float getTotalStaffMoney() {
        try {
            String sql = "select sum(a.totalPrice)\n"
                    + "    from Orders a, users b \n"
                    + "where a.userId = b.userId and b.roleID = 0 and a.[status] = 0";
            PreparedStatement stm = connection.prepareCall(sql);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                float count = rs.getFloat(1);
                return count;
            }
            return 0;
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public float getTotalMoneyById(int id) {
        try {
            String sql = "select Sum(totalPrice) from Orders where userid = ?";
            PreparedStatement stm = connection.prepareCall(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                float count = rs.getFloat(1);
                return count;
            }
            return 0;
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public float getTotalMoney() {
        try {
            String sql = "select sum(totalPrice) from [Orders] where status = 0";
            PreparedStatement stm = connection.prepareCall(sql);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                float count = rs.getFloat(1);
                return count;
            }
            return 0;
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public float getTotalPrice(int id) {
        try {
            String sql = "select totalPrice from [Orders] where orderID = ?";
            PreparedStatement stm = connection.prepareCall(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                float count = rs.getFloat("totalPrice");
                return count;
            }
            return 0;
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public Date getDateOrder(int id) {
        try {
            String sql = "select date_Time from [Orders] where orderID = ?";
            PreparedStatement stm = connection.prepareCall(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                Date count = rs.getDate("date_Time");
                return count;
            }
            return null;
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public List<OrderDetail> getOrderDetail(int orderId) {
        List<OrderDetail> oddt = new ArrayList<>();
        try {
            String sql = "select a.productPrice, a.quantity, b.productName \n"
                    + "from OrderItems a, Products b\n"
                    + "where a.productID = b.productID and OrderID = ?";
            PreparedStatement stm = connection.prepareCall(sql);
            stm.setInt(1, orderId);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                OrderDetail fl = new OrderDetail();
                fl.setOid(orderId);
                fl.setProductName(rs.getString("productName"));
                fl.setPrice(rs.getFloat("productPrice"));
                fl.setQuantity(rs.getInt("quantity"));
                oddt.add(fl);
            }
            return oddt;
        } catch (SQLException ex) {
            Logger.getLogger(productDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public int totalOrder() {
        try {
            String sql = "select count([orderID]) as count from [Orders] where status = 0";
            PreparedStatement stm = connection.prepareCall(sql);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                int count = rs.getInt("count");
                return count;
            }
            return 0;
        } catch (SQLException ex) {
            Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public int getTopOrderId(int id) {
        try {
            String sql = "select top 1 orderID from [Orders] order by orderID desc";
            PreparedStatement stm = connection.prepareCall(sql);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                int count = rs.getInt("orderID");
                return count;
            }
            return 0;
        } catch (SQLException ex) {
            Logger.getLogger(productDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public static void main(String[] args) {
        OrderDAO n = new OrderDAO();
        System.out.println(n.totalMoneyDay(7));
    }
}
