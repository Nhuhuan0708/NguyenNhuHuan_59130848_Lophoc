/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;


public class Main {
    public static void Main(String [] args){
        
        
        Hocsinh HS1 = new Hocsinh("59CNTT2","Hát","Nguyen Nhu Huan","Van Ninh","038649xxxx",21);
        Hocsinh HS2 = new Hocsinh("60CNTT2","Múa","Tran Thi Hue","Ninh Hoa","035442xxxx",20);
        
        giaovien GV1 = new giaovien("Toan" , "CNTT" ,"Duc Thuan" ,"Nha Trang", "036452xxx" , 45);
        giaovien GV2 = new giaovien("Phat trien web","CNTT","Bui Chi Thanh","Nha Trang","036524xxxx",40);
        lophoc LH = new lophoc();
        LH.themhocsinh(HS1);
        LH.themhocsinh(HS2);
        LH.themGVDG(GV1);
        LH.themGVDG(GV2);
    }
}
