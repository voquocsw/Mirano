/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import Model.Category;

/**
 *
 * @author int.thong.nk
 */
public class CategoryDao extends DBContext {

    public int addCategory(String categoryName) {
        try {
            String sql = "insert into category values (?)";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, categoryName);
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
        return 1;
    }

    public List<Category> getAllCategory(int page) {
        List<Category> category = new ArrayList<>();
        try {
            String sql = "SELECT Category.categoryID, Category.categoryName, COUNT(Products.categoryId) AS productCount\n"
                    + "FROM Category\n"
                    + "LEFT JOIN Products ON Category.categoryId = Products.categoryId\n"
                    + "GROUP BY Category.categoryName, Category.categoryID\n"
                    + "ORDER BY Category.categoryID offset (?-1)*10 row fetch next 10 row only;";
            PreparedStatement stm = connection.prepareCall(sql);
            stm.setInt(1, page);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Category cat = new Category();
                cat.setCategoryId(rs.getInt("categoryID"));
                cat.setCategoryName(rs.getString("categoryName"));
                cat.setTotalProduct(rs.getInt("productCount"));
                category.add(cat);
            }
            return category;
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public String getCategoryNameByID(int id){
        String categoryName = null;
        try{
            String sql = "select CategoryName from category where categoryID = ?";
            PreparedStatement stm = connection.prepareCall(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            while (rs.next()){
                categoryName = rs.getString("categoryName");
            }
            return categoryName;
        }
        catch (SQLException ex) {
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public int updateCategory(int categoryId, String categoryName) {
        try {
            String sql = "UPDATE [dbo].[Category]\n"
                    + "   SET [categoryName] = ?\n"
                    + "WHERE [Category].CategoryID = ?";
            PreparedStatement stm = connection.prepareCall(sql);
            stm.setString(1, categoryName);
            stm.setInt(2, categoryId);
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
        return 1;
    }

    public int totalCategory() {
        try {
            String sql = "select count([categoryID]) as count from [Category]";
            PreparedStatement stm = connection.prepareCall(sql);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                int count = rs.getInt("count");
                return count;
            }
            return 0;
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public List<Category> getAllCategory() {
        List<Category> category = new ArrayList<>();

        try {
            String sql = "select * from [Category]";
            PreparedStatement stm = connection.prepareCall(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Category cat = new Category();
                cat.setCategoryId(rs.getInt("categoryID"));
                cat.setCategoryName(rs.getString("categoryName"));
                category.add(cat);
            }
            return category;
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public static void main(String[] args) {
        CategoryDao db = new CategoryDao();
        int cat = db.updateCategory(2, "Drink");
        System.out.println(cat);
    }
}
