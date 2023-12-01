package com.example.btl_quanlychitieu.model;

public class KhoanThu {
    public String tenkhoanthu;
    public String tenloaithu;
    public  float sotien;

    public static final String khoanthu= "tenkhoanthu";
    public static final String loaithu= "tenloaithu";
    public static final float tien= Float.parseFloat("sotien");

    public KhoanThu(String tenkhoanthu, String tenloaithu, float sotien){
        this.tenkhoanthu= tenkhoanthu;
        this.tenloaithu= loaithu;
        this.sotien= sotien;
    }

    public KhoanThu(){

    }
    public String gettenloaithu(String tenloaithu) { return tenloaithu;}
    public void setTenloaithu(String tenloaithu) { this.tenloaithu= tenloaithu;}

    public String gettenkhoanthu (String tenkhoanthu){
        return tenkhoanthu;
    }
    public void setTenkhoanthu(String tenkhoanthu){
        this.tenkhoanthu= tenkhoanthu;
    }


    public float getsotien(float sotien){
        return sotien;
    }
    public void setSotien(float sotien){
        this.sotien= sotien;
    }


}
