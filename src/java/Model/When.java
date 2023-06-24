/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;


public class When{

    private int whenId;
    private String time;
    private Date showDate;
    private int status;

    public When() {
    }

    public When(int whenId, String time, Date showDate, int status) {
        this.whenId = whenId;
        this.time = time;
        this.showDate = showDate;
        this.status = status;
    }

    public int getWhenId() {
        return whenId;
    }

    public void setWhenId(int whenId) {
        this.whenId = whenId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Date getShowDate() {
        return showDate;
    }

    public void setShowDate(Date showDate) {
        this.showDate = showDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "When{" + "whenId=" + whenId + ", time=" + time + ", showDate=" + showDate + ", status=" + status + '}';
    }

    
}
