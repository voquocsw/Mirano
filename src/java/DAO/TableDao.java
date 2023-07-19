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
import Model.Table;

/**
 *
 * @author Admin
 */
public class TableDao extends DBContext {

    public List<Table> getTableIsBooking(int whenid) {
        List<Table> seats = new ArrayList<>();
        try {
            String sql = "select s.seatId, s.seatName from seat s right join booking_detail bd on s.seatId = bd.seatId\n"
                    + "right join booking b on bd.bookingId = b.bookingId \n"
                    + "right join show sh on b.showId = sh.showId\n"
                    + "where b.showId = ?";
            PreparedStatement stm = connection.prepareCall(sql);
            stm.setInt(1, whenid);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Table s = new Table();
                s.setTableId(rs.getInt("seatId"));
                s.setTableName(rs.getString("seatName"));
                seats.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TableDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return seats;
    }

    public int totalTable() {
        try {
            String sql = "select count([tableId]) as count from [table] ";
            PreparedStatement stm = connection.prepareCall(sql);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                int count = rs.getInt("count");
                return count;
            }
            return 0;
        } catch (SQLException ex) {
            Logger.getLogger(TableDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public int deleteTable(int tableId) {
        try {
            String sql = "delete from [table] where tableid = ?";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, tableId);
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TableDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
        return 1;
    }

    public int addTable(String tableName) {
        try {
            String sql = "insert into [table] values (?, ?)";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, tableName);
            st.setInt(2, 0);
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TableDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
        return 1;
    }

    public List<Table> getTableCanDelete() {
        List<Table> table = new ArrayList<>();
        try {
            String sql = "SELECT tableid, tableName\n"
                    + " FROM [table]\n"
                    + " WHERE tableid NOT IN (SELECT DISTINCT tableid FROM [cart]);";
            PreparedStatement stm = connection.prepareCall(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Table s = new Table();
                s.setTableId(rs.getInt("tableId"));
                s.setTableName(rs.getString("tableName"));
                table.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TableDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return table;
    }

    public List<Table> getTableInvalid() {
        List<Table> table = new ArrayList<>();
        try {
            String sql = "SELECT DISTINCT a.tableId, b.tableName\n"
                    + "from Cart a , [table] b\n"
                    + "where a.tableId = b.tableId";
            PreparedStatement stm = connection.prepareCall(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Table s = new Table();
                s.setTableId(rs.getInt("tableId"));
                s.setTableName(rs.getString("tableName"));
                table.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TableDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return table;
    }

    public Table getTableByName(String tableName) {
        try {
            String sql = "select * from [table] where tableName = ?";
            PreparedStatement stm = connection.prepareCall(sql);
            stm.setString(1, tableName);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Table s = new Table();
                s.setTableId(rs.getInt("tableId"));
                s.setTableName(rs.getString("tableName"));
                return s;
            }
        } catch (SQLException ex) {
            Logger.getLogger(TableDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return null;
    }

    public List<Table> GetAllTable() {
        List<Table> table = new ArrayList<>();
        try {
            String sql = "select * from [table]";
            PreparedStatement stm = connection.prepareCall(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Table s = new Table();
                s.setTableId(rs.getInt("tableId"));
                s.setTableName(rs.getString("tableName"));
                table.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TableDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return table;
    }

    public List<Table> GetTableAvaiable() {
        List<Table> table = new ArrayList<>();
        try {
            String sql = "select * from [table] where tableStatus = 0";
            PreparedStatement stm = connection.prepareCall(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Table s = new Table();
                s.setTableId(rs.getInt("tableId"));
                s.setTableName(rs.getString("tableName"));
                table.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TableDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return table;
    }

    public static void main(String[] args) {
        TableDao db = new TableDao();
        List<Table> table = db.getTableCanDelete();
        System.out.println(table);
    }
}
