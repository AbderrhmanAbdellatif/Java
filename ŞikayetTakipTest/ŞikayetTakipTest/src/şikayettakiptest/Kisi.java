package şikayettakiptest;

public class Kisi {

    private String adi;
    private String soyadi;
    private String adres;
    private String telNo;

    public Kisi(String adi, String soyadi, String adres, String telNo) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.adres = adres;
        this.telNo = telNo;

    }

    Kisi() {

    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

}
