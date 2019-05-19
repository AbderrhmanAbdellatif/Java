/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package şikayettakiptest;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class Uygulama {
    
    public ArrayList<Sikayet> db = new ArrayList<>();
    
    public void sikayetEden(String ad)
    {
        for (Sikayet sikayetListesi1 : db) {
            if(sikayetListesi1.kisi.adi.equals(ad))
            {
                
                System.out.println("Şikayet Konusu : " + sikayetListesi1.sikayetKonusu);
                System.out.println("Şikayet Açıklaması : " + sikayetListesi1.sikayetAciklamasi);
                System.out.println("Şikayet Edilen Firma Adı : " + sikayetListesi1.sirket.sirketAdi);
            }
            
        }
    }
}
