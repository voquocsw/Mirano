/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Time;
import java.time.LocalTime;


public class Table {
    private int tableId;
    private String tableName;

    public Table() {
    }

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    
//    public static void main(String[] args) {
//        LocalTime time = LocalTime.of(6, 30);
//        time = time.plusMinutes(120);
//        System.out.println(time.compareTo(LocalTime.of(8, 00)));
//    }

    public Table(int tableId, String tableName) {
        this.tableId = tableId;
        this.tableName = tableName;
    }
}
