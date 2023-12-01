package com.example.btl_quanlychitieu.model;
public class User {

    private  int id;
    private String tennguoidung;
    private String matkhau;

    public User(){

    }

    public User (String ten, String mk){
        this.tennguoidung= ten;
        this.matkhau= mk;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id= id;
    }

    public  String gettennguoidung(){
        return tennguoidung;
    }
    public void settennguoidung(String tenn){
        this.tennguoidung= tenn;
    }

    public String getmatkhau(){
        return matkhau;
    }
    public void set(String mk){
        this.matkhau= mk;
    }

    public String toString() {
        return "DangNhap{" +
                "Tên người dùng=" + tennguoidung +
                ", Mật khẩu=" + matkhau + '\'' +
                '}';
    }
}
