/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Ship;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aver
 */
public class ShipDao extends DBContext {

    public int addInfo(int uid, int oid, String fullname, String phone, String address, float price) {
        try {
            String sql = "INSERT INTO [dbo].[Ship] VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,1)";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, uid);
            stm.setInt(2, oid);
            stm.setString(3, phone);
            stm.setString(4, address);
            stm.setString(5, fullname);
            stm.setFloat(6, price);
            stm.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(ShipDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
        return 1;
    }

    public int deleteShip(int id) {
        try {
            String sql = "delete from Ship where userId = ?";
            PreparedStatement stm = connection.prepareCall(sql);
            stm.setInt(1, id);
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ShipDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
        return 1;
    }

    public int cancelShip(int id) {
        try {
            String sql = "UPDATE [dbo].[Ship]\n"
                    + "   SET [statuss] = 2\n"
                    + "WHERE orderId = ?";
            PreparedStatement stm = connection.prepareCall(sql);
            stm.setInt(1, id);
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ShipDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
        return 1;

    }

    public int changeShipStatus(int id, int status) {
        try {
            String sql = "UPDATE [dbo].[Ship]\n"
                    + "   SET [statuss] = ?\n"
                    + "WHERE orderId = ?";
            PreparedStatement stm = connection.prepareCall(sql);
            stm.setInt(1, status);
            stm.setInt(2, id);
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ShipDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
        return 1;

    }

    public int getShipStatusByID(int id) {
        try {
            String sql = "select statuss from Ship where OrderId = ?";
            PreparedStatement stm = connection.prepareCall(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                int count = rs.getInt("statuss");
                return count;
            }
            return 0;
        } catch (SQLException ex) {
            Logger.getLogger(ShipDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public int totalShip() {
        try {
            String sql = "select count([orderID]) as count from [Ship] where statuss != 0 ";
            PreparedStatement stm = connection.prepareCall(sql);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                int count = rs.getInt("count");
                return count;
            }
            return 0;
        } catch (SQLException ex) {
            Logger.getLogger(ShipDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public int totalShipById(int id) {
        try {
            String sql = "select count([orderID]) as count from [Ship] where userid = ?";
            PreparedStatement stm = connection.prepareCall(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                int count = rs.getInt("count");
                return count;
            }
            return 0;
        } catch (SQLException ex) {
            Logger.getLogger(ShipDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public List<Ship> getShipById(int UserId, int page) {
        List<Ship> ship = new ArrayList<>();
        try {
            String sql = "select * from Ship "
                    + "where userid = ? "
                    + "order by [orderID] desc offset (?-1)*10 row fetch next 10 row only \n";
            PreparedStatement stm = connection.prepareCall(sql);
            stm.setInt(1, UserId);
            stm.setInt(2, page);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Ship fl = new Ship();
                fl.setUserId(rs.getInt("userId"));
                fl.setOrderID(rs.getInt("orderID"));
                fl.setPhone(rs.getString("phone"));
                fl.setAddress(rs.getString("addresss"));
                fl.setName(rs.getString("name"));
                fl.setPrice(rs.getFloat("totalPrice"));
                fl.setStatus(rs.getInt("statuss"));
                ship.add(fl);
            }
            return ship;
        } catch (SQLException ex) {
            Logger.getLogger(ShipDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public List<Ship> getAllShip(int page) {
        List<Ship> ship = new ArrayList<>();
        try {
            String sql = "select * from Ship "
                    + "where statuss != 0\n"
                    + "order by [orderID] desc offset (?-1)*10 row fetch next 10 row only";
            PreparedStatement stm = connection.prepareCall(sql);
            stm.setInt(1, page);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Ship fl = new Ship();
                fl.setUserId(rs.getInt("userId"));
                fl.setOrderID(rs.getInt("orderID"));
                fl.setPhone(rs.getString("phone"));
                fl.setAddress(rs.getString("addresss"));
                fl.setName(rs.getString("name"));
                fl.setPrice(rs.getFloat("totalPrice"));
                fl.setStatus(rs.getInt("statuss"));
                ship.add(fl);
            }
            return ship;
        } catch (SQLException ex) {
            Logger.getLogger(productDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public static void main(String args[]) {
        ShipDao s = new ShipDao();
        System.out.println(s.totalShip());
        System.out.println(s.getShipById(17, 1));

    }
}
