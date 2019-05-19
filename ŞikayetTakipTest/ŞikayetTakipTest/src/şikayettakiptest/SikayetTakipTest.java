package şikayettakiptest;

import java.util.ArrayList;
import java.util.Scanner;

public class SikayetTakipTest {

    public static ArrayList<IGeriBildirim> db = new ArrayList<>();

    public static void main(String[] args) {

        boolean cikis = true;
        int count = 1;
        Scanner s = new Scanner(System.in);
        Kisi k1 = new Kisi();
        System.out.print("Adınızı Giriniz : ");
        k1.setAdi(s.next());
        System.out.print("Soyadınızı Giriniz : ");
        k1.setSoyadi(s.next());
        System.out.print("Adresinizi Giriniz : ");
        k1.setAdres(s.next());
        System.out.print("Telinizi Giriniz : ");
        k1.setTelNo(s.next());
        int asd;
        while (cikis) {
            System.out.println();
            System.out.println("---------------------------------------------------------");
            System.out.println(" Kişisel bilgilerinizi Düzenlemek için 1, \n Şikayet İçin 2, \n Tüm Şikayetlerini Görmek İçin 3,  \n Tüm Şikayet Sayısı için 4 \n Programdan Çıkmak için 5");
            System.out.println();
            System.out.println("yazıp 'Enter'a basınız...");
            System.out.println("---------------------------------------------------------");
            System.out.print("Seçenek Numarasını Giriniz : ");
            asd = s.nextInt();
            System.out.println();
            if (asd == 1) {
                System.out.println("Neyi Düzenlemek İstersiniz? ");
                System.out.println(" Adınızı düzenlemek için 1, \n Soyadınızı düzenlemek için 2, \n Adresinizi düzenlemek için 3, \n Tel. No'nuzu düzenlemek için 4");
                System.out.println();
                System.out.println("yazıp 'Enter'a basınız...");
                System.out.println("---------------------------------------------------------");
                System.out.print("Seçenek Numarasını Giriniz: ");
                asd = s.nextInt();
                if (asd == 1) {
                    System.out.print("Adınızı düzenleyiniz: ");
                    k1.setAdi(s.next());
                    System.out.println("İsminiz düzenlendi ----> " + k1.getAdi());
//                  System.out.println("Yeni Adınız: " + ""+k1.adi+"");
                } else if (asd == 2) {
                    System.out.print("Soyadınızı düzenleyiniz: ");
                    k1.setSoyadi(s.next());
                    System.out.println("Soyadınız düzenlendi ----> " + k1.getSoyadi());

                } else if (asd == 3) {
                    System.out.print("Adresinizi düzenleyiniz: ");
                    k1.setAdres(s.next());
                    System.out.println("Adresiniz düzenlendi ----> " + k1.getAdres());

                } else if (asd == 4) {
                    System.out.print("Tel.No'nuzu düzenleyiniz: ");
                    k1.setTelNo(s.next());
                    System.out.println("Tel. No.'nuz düzenlendi ----> " + k1.getTelNo());
                    System.out.println("Yeni Tel No.'nuz: " + k1.getTelNo());
                }

            } else if (asd == 4) {

                getToplamSikayetSayisi();
                
            } else if (asd == 2) {

                System.out.println("Şikayet Edilecek firma bilgilerini giriniz. \n");
                Sirket sirket = new Sirket();
                System.out.print("Firma Adı : ");
                sirket.setSirketAdi(s.next());
                System.out.print("Firma Sektörü : ");
                sirket.setSektor(s.next());

                System.out.print("Şikayet Bilgileri giriniz : \n\n");

                System.out.print("Şikayet Konusu : ");
                String konu = s.next();
                System.out.print("Şikayet Açıklama : ");
                String aciklama = s.next();

                Sikayet sikayet = new Sikayet(k1, sirket, konu, aciklama, count);

                sikayet.geriBildirimdeBulun(sikayet);

            } else if (asd == 3) {

                for (int i = 0; i < db.size(); i++) {
                    System.out.println("--------------------------------");
                    System.out.print("Şikayeti yapılan şirket : ");
                    System.out.println(((Sikayet) (db.get(i))).getSirket().getSirketAdi());
                    System.out.print("Şikayeti yapılan şirketin sektörü : ");
                    System.out.println(((Sikayet) db.get(i)).getSirket().getSektor());

                    System.out.print("Şikayet konusu: ");
                    System.out.println(((Sikayet) db.get(i)).getSikayetKonusu());
                    System.out.print("Şikayet açıklaması: ");
                    System.out.println(((Sikayet) db.get(i)).getSikayetAciklamasi());
                    System.out.print("Şİkayet takip no: ");
                    System.out.println(((Sikayet) db.get(i)).getTakipNo() + "");
                }

            } else if (asd == 5) {
                System.exit(0);
            } else {
                System.out.println("1'den 5'e kadar sayı giriniz.");
            }
        }

    }

    public void sikayetEden() {
        for (IGeriBildirim sikayetListesi1 : db) {
            System.out.println("Şikayet Konusu : " + ((Sikayet) sikayetListesi1).getSikayetKonusu());
            System.out.println("Şikayet Açıklaması : " + ((Sikayet) sikayetListesi1).getSikayetAciklamasi());
            System.out.println("Şikayet Edilen Firma Adı : " + ((Sikayet) sikayetListesi1).getSirket().getSirketAdi());
        }
    }

    public static void getToplamSikayetSayisi() {
        System.out.println("Toplam Şikayet Sayısı: " + db.size());
    }

}
