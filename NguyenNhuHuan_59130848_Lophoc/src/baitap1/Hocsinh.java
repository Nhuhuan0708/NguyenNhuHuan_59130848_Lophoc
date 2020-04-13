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
public class Hocsinh extends canhan {
    private String lop ;
    private String nangkhieu;
    public String getlop(){
        return lop ;
    }
    public void setlop(String lop){
        this.lop = lop ;
    }
    public String getnangkhieu(){
        return nangkhieu ;
    }
    public void setnangkhieu(String nangkhieu){
        this.nangkhieu = nangkhieu ;
    }
    public Hocsinh(String lop, String nangkhieu, String hoten, String diachi, String sdt, int tuoi) {
        super(hoten , diachi ,sdt ,tuoi);
        this.lop = lop;
        this.nangkhieu = nangkhieu;
    }
    @Override
    public String HienthiTT() {
        return ("Họ tên học sinh: "+gethoten()+", Tuổi: "+gettuoi()+", Địa chỉ: "+getdiachi()+", Số điện thoại: "+getsdt()+", Lớp: "+this.lop+", Năng khiếu: "+this.nangkhieu);
    }
}
