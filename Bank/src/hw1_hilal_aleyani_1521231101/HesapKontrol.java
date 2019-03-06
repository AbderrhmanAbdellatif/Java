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

    private int numberOfKart = 0;

    public HesapKontrol(String id, double ilkbakye) {
        super(id, ilkbakye);
    }

    public boolean paracekme(double miktar) {
        if (this.bakiye < 0) {
            System.out.println("Yetersiz bekiye");
            return false;
        } else {
            this.bakiye = this.bakiye - miktar - 2;
            return true;
        }
    }

    public void parayatirma(double miktar) {
        this.bakiye = this.bakiye + miktar;
        System.out.println(" hesabe eklendi");
    }

    public void Kartkullanimisifirla() {
        this.numberOfKart = 0;
    }

    public int kullanilanKartSayisi() {

        return numberOfKart;
    }

}
