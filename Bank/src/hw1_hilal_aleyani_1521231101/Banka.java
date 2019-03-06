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
public class Banka {

    private ArrayList<Hesap> hesaplar;
    private double tasarrufFaizOrani;

    public Banka() {
        hesaplar = new ArrayList<>();
    }

    public void faiziayarla(double oran) {
        for (int i = 0; i < hesaplar.size(); i++) {
            double artilan = (this.hesaplar.get(i).bakiye * oran) / 100;
            this.hesaplar.get(i).bakiye += artilan;
        }
    }

    public int hesapsayisi() {
        int aktifolanlar = 0;
        for (int i = 0; i < this.hesaplar.size(); i++) {
            if (this.hesaplar.get(i).bakiye > 0) {
                aktifolanlar++;
            }
        }
        return aktifolanlar;
    }

    public void hesapekle(Hesap a) {
        this.hesaplar.add(a);
    }

    public Hesap gethesap(String hesapID) {
        for (int i = 0; i < hesaplar.size(); i++) {
            if (hesaplar.get(i).id.equals(hesapID)) {
                return hesaplar.get(i);
            }
        }
        return null;
    }

    public boolean parayatirma(String hesapID, double miktar) {

        for (int i = 0; i < hesaplar.size(); i++) {
            if (hesaplar.get(i).id.equals(hesapID)) {
                hesaplar.get(i).bakiye += miktar;
                return true;
            }

        }
        return false;
    }

    public boolean paracekme(String accountID, double amount) {

        for (int i = 0; i < hesaplar.size(); i++) {
            if (hesaplar.get(i).id.equals(accountID)) {
                if (hesaplar.get(i).bakiye < 10) {
                    return false;
                } else {
                    hesaplar.get(i).bakiye -= amount;
                }
                return true;
            }
        }
        return false;
    }

    public boolean transfer(String gonhesapID, String alicihesapID, double miktar) {
        for (int i = 0; i < this.hesaplar.size(); i++) {
            if (this.hesaplar.get(i).id.equals(gonhesapID)) {
                this.hesaplar.get(i).bakiye -= miktar;
            }
            if (this.hesaplar.get(i).id.equals(alicihesapID)) {
                this.hesaplar.get(i).bakiye -= miktar;
                return true;
            }

        }
        return false;
    }

    public void faiz() {
        for (Hesap hesap : hesaplar) {
            this.tasarrufFaizOrani = (hesap.bakiye * 3) / 100;
            hesap.bakiye += this.tasarrufFaizOrani;
        }
    }

    public void reset() {
        for (int i = 0; i < this.hesaplar.size(); i++) {
            this.hesaplar.get(i).bakiye = 0;
        }
    }

}
