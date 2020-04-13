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
public class lophoc {
    giaovien GVCN = new giaovien();
    QLDS qldsGVGD = new QLDS();
    QLDS qldsHS = new QLDS();
    
    public lophoc(giaovien giaoVienCN) {
        this.GVCN = GVCN;
    }
    
    
    public int themhocsinh(Hocsinh hs){
        if(qldsHS.them(hs)==1)
            return 1;
        else
            return 0;
    }
    public int themGVDG(giaovien gv){
        if(qldsGVGD.them(gv) == 1)
            return 1;
        else
            return 0;
    }
    public int inDSHS(){
        System.out.println("Danh sách học sinh");
        qldsHS.inDS();
        return 1;
    }
    public int inDSGVGD(){
        System.out.println("Danh sách giáo viên");
        qldsGVGD.inDS();
        return 1;
    }
}
