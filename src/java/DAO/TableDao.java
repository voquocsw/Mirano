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

    public static void main(String[] args) {
        TableDao db = new TableDao();
        List<Table> table = db.getTableIsBooking(1);
        System.out.println(table.size());
    }
}
