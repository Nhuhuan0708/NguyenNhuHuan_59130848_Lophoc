/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

/**
 *
 * @author dell
 */
public class giaovien extends canhan {
    private String monday ;
    private String tobomon ;
    public String getmonday(){
        return monday ;
    }
    public void setmonday(String monday){
        this.monday = monday ;
    }
    public String gettobomon(){
        return tobomon ;
    }
    public void settobomon(String tobomon){
        this.tobomon = tobomon ;
    }
    public giaovien(){
        super();
        this.monday = " ";
        this.tobomon = " ";
    }
    public giaovien(String monday, String tobomon, String hoten, String diachi, String sdt, int tuoi) {
        super(hoten, diachi, sdt, tuoi);
        this.monday = monday;
        this.tobomon = tobomon;
    }
    @Override
    public String HienthiTT() {
        return ("Họ tên giáo viên: "+gethoten()+", Tuổi: "+gettuoi()+", Địa chỉ: "+getdiachi()+", Số điện thoại: "+getsdt()+", Môn dạy: "+this.monday+", Tổ bộ môn: "+this.tobomon);
    }
}
