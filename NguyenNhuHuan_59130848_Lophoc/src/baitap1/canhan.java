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
abstract public class canhan {
    private String hoten ;
    private int tuoi ;
    private String diachi ;
    private String sdt ;
    public String gethoten(){
        return hoten ;
    }
    public void sethoten(String hoten){
        this.hoten = hoten ;
    }
    public int gettuoi(){
        return tuoi ;
    }
    public void settuoi(int tuoi){
        this.tuoi = tuoi ;
    }
    public String getdiachi(){
        return diachi ;
    }
    public void setdiachi(String diachi){
        this.diachi = diachi ;
    }
    public String getsdt(){
        return sdt ;
    }
    public void setsdt(String sdt){
        this.sdt = sdt ;
    }
    public canhan(String hoten, String diachi, String sdt, int tuoi) {
        this.hoten = hoten;
        this.diachi = diachi;
        this.sdt = sdt;
        this.tuoi = tuoi;
    }
    
    public canhan(){
        this.hoten = "";
        this.diachi = "";
        this.tuoi = 0;
        this.sdt = "";
    }
    abstract public String HienthiTT();
}
