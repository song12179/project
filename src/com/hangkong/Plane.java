package com.hangkong;
public class Plane {
   //航班属性
    String hbno;//航班号
    String hbname;//航班名
    String cfd;//出发地
    String mdd;//目的地
    int time;//航行时间
    int price;//价格
//空参构造
    public Plane() {
    }
//全参构造
    public Plane(String hbno, String hbname, String cfd, String mdd, int time, int price) {
        this.hbno = hbno;
        this.hbname = hbname;
        this.cfd = cfd;
        this.mdd = mdd;
        this.time = time;
        this.price = price;
    }

    //相应get/set方法

    public String getHbno() {
        return hbno;
    }

    public void setHbno(String hbno) {
        this.hbno = hbno;
    }

    public String getHbname() {
        return hbname;
    }

    public void setHbname(String hbname) {
        this.hbname = hbname;
    }

    public String getCfd() {
        return cfd;
    }

    public void setCfd(String cfd) {
        this.cfd = cfd;
    }

    public String getMdd() {
        return mdd;
    }

    public void setMdd(String mdd) {
        this.mdd = mdd;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
