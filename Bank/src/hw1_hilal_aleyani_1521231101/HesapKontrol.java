 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw1_hilal_aleyani_1521231101;

import java.util.ArrayList;

/**
 *
 * @author macbookpro
 */
public class HesapKontrol extends Hesap {
    private int numberOfKart;
    private double miktar;

    public HesapKontrol(int numberOfKart, double miktar, String id, double bakiye) {
        super(id, bakiye);
        this.numberOfKart = numberOfKart;
        this.miktar = miktar;
    }
    
    
    public boolean paracekme(double miktar){
        return true;
    }
    
    public void parayatirma(double miktar){
    }
    
    public void Kartkullanimisifirla (){
    }
    
    public int kullanilanKartSayisi(){
        return 0;
    }
    
}
