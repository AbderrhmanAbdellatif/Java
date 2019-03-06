/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw1_hilal_aleyani_1521231101;

/**
 *
 * @author macbookpro
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Banka bank = new Banka();
        bank.faiziayarla(0.25);
        Hesap a1 = new BirikimHesabi("kazim", 100.00);
        Hesap a2 = new HesapKontrol("seda", 50.00);
        bank.hesapekle(a1);
        bank.hesapekle(a2);
        System.out.println("Hesapların sayısı: " + bank.hesapsayisi());
        boolean result = bank.paracekme("kazim",20.0);
        System.out.println(result);
        result = bank.parayatirma("seda", 20.00);
        System.out.println(result);
        bank.faiz();
        System.out.println(bank.gethesap("kazim"));
        System.out.println(bank.gethesap("seda"));
    }

}
