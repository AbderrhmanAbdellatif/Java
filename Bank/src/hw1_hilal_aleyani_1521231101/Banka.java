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
public class Banka{
    
    
    
    private ArrayList<Hesap> hesaplar;
    private double tasarrufFaizOrani;

    public Banka() {
    }

    public ArrayList<Hesap> getHesaplar() {
        return hesaplar;
    }

    public void setHesaplar(ArrayList<Hesap> hesaplar) {
        this.hesaplar = hesaplar;
    }
    
 
    public Banka(ArrayList<Hesap> hesaplar, double tasarrufFaizOrani) {
        this.hesaplar = hesaplar;
        this.tasarrufFaizOrani = tasarrufFaizOrani;
    }
    
    public void faizi_ayarla(double oran){
    }
    
    public int hesapsayisi(){
        return 0;
    }
    
    public void hesapekle(Hesap a){
        
        
    }
    
    public Hesap gethesap(String hesapID){
    }
    
    public boolean parayatirma(String hesapID, double miktar){
        for (int i = 0; i < hesaplar.size(); i++) {
            if (hesaplar.get(i).id.equals(hesapID)) {
                hesaplar.get(i).bakiye +=miktar;  
                return true;
            }
            
        }
        return false;
    }
    
    public boolean paracekme(String accountID, double amount){
        for (int i =0; i < hesaplar.size(); i++) {
            if (hesaplar.get(i).id.equals(accountID)) {
                hesaplar.get(i).bakiye -= amount;
                return true;
            }
        }
        return false;
    }
    
    public boolean transfer(String gonhesapID, String alicihesapID, double miktar){
    }
    
    public void faiz(){
    }
    
    public void reset(){
    }
     
     
     
     
    
    
}
