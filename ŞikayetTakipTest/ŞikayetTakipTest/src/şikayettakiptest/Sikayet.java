package şikayettakiptest;

import static şikayettakiptest.SikayetTakipTest.db;

public class Sikayet implements IGeriBildirim {

    private Kisi kisi;
    private Sirket sirket;
    private String sikayetKonusu;
    private String sikayetAciklamasi;
    private int takipNo;

    public Sikayet(Sirket sirket) {
        this.sirket = sirket;
    }

    public Sikayet(Kisi kisi, Sirket sirket, String sikayetKonusu, String sikayetAciklamasi, int takipNo) {
        this.kisi = kisi;
        this.sirket = sirket;
        this.sikayetKonusu = sikayetKonusu;
        this.sikayetAciklamasi = sikayetAciklamasi;
        this.takipNo = takipNo;
    }

    public Kisi getKisi() {
        return kisi;
    }

    public void setKisi(Kisi kisi) {
        this.kisi = kisi;
    }

    public Sirket getSirket() {
        return sirket;
    }

    public void setSirket(Sirket sirket) {
        this.sirket = sirket;
    }

    public String getSikayetKonusu() {
        return sikayetKonusu;
    }

    public void setSikayetKonusu(String sikayetKonusu) {
        this.sikayetKonusu = sikayetKonusu;
    }

    public String getSikayetAciklamasi() {
        return sikayetAciklamasi;
    }

    public void setSikayetAciklamasi(String sikayetAciklamasi) {
        this.sikayetAciklamasi = sikayetAciklamasi;
    }

    public int getTakipNo() {
        return takipNo;
    }

    public void setTakipNo(int takipNo) {
        this.takipNo = takipNo;
    }

    @Override
    public void geriBildirimdeBulun(IGeriBildirim geriBildirim) {
        db.add((Sikayet) geriBildirim);
    }
}
