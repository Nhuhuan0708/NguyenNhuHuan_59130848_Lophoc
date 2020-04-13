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
import java.util.ArrayList;
public class QLDS implements IQLDS{
    ArrayList<canhan> listCaNhan = new ArrayList<>();
    @Override
    public int them(canhan p) {
        listCaNhan.add(p);
        return 1;
    }
    @Override
    public void inDS() {
        for(int i = 0; i < listCaNhan.size(); i++){
            System.out.println(listCaNhan.get(i).HienthiTT());
            System.out.println(" ");
        }
    }
}
