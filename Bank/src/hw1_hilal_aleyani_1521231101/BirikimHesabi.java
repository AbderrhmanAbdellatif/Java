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
public class BirikimHesabi extends Hesap {

    private double ilkyatirma;
    private double tutar;
    protected double oran;
    Banka banka = new Banka();

    public BirikimHesabi(String id, double ilkyatirma) {
        super(id, ilkyatirma);
        this.ilkyatirma = ilkyatirma;

        if (this.ilkyatirma >= 100) {
            this.ilkyatirma = ilkyatirma;
        } else if (this.ilkyatirma <= 10.000) {
            this.ilkyatirma += 200;
            System.out.println("Hesabiniza 200 TL Eklendi.");
        } else {
            System.out.println(" yatirma islemi gerceklesmiyor ......");
        }

    }

    @Override
    public boolean paracekme(double tutar) {
        if (this.bakiye > 10) {
            this.bakiye = this.bakiye - tutar + 10;
            return true;

        } else {
            System.out.println("paraniniz yok ");
            return false;
        }
    }

    public void parayatirma(double tutar) {
        this.bakiye = this.bakiye + tutar;
    }

    public double faiz(double oran) {
        double artilan = (this.bakiye * oran) / 100;

        return this.bakiye + artilan;
    }

}
