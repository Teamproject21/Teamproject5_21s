package com.example.board;

import java.util.Date;

public class BoardVO {
    private int num;
    private String stdnum;
    private String stdname;
    private String dormname;
    private int roomn;
    private String outdate;
    private String why;
    private String in_out;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getStdnum() {
        return stdnum;
    }

    public void setStdnum(String stdnum) {
        this.stdnum = stdnum;
    }

    public String getStdname() {
        return stdname;
    }

    public void setStdname(String stdname) {
        this.stdname = stdname;
    }

    public String getDormname() {
        return dormname;
    }

    public void setDormname(String dormname) {
        this.dormname = dormname;
    }

    public int getRoomn() {
        return roomn;
    }

    public void setRoomn(int roomn) {
        this.roomn = roomn;
    }

    public String getOutdate() { return outdate; }

    public void setOutdate (String outdate) {
        this.outdate = outdate;
    }

    public String getWhy() {
        return why;
    }

    public void setWhy(String why) {
        this.why = why;
    }

    public String getIn_out() {
        return in_out;
    }

    public void setIn_out(String in_out) {
        this.in_out = in_out;
    }
}
