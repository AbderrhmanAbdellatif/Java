package şikayettakiptest;

public class Sirket {

    private String sektor;
    private String sirketAdi;

    public Sirket(String sektor, String sirketAdi) {
        this.sektor = sektor;
        this.sirketAdi = sirketAdi;

    }

    Sirket() {

    }

    public String getSektor() {
        return sektor;
    }

    public void setSektor(String sektor) {
        this.sektor = sektor;
    }

    public String getSirketAdi() {
        return sirketAdi;
    }

    public void setSirketAdi(String sirketAdi) {
        this.sirketAdi = sirketAdi;
    }

}
