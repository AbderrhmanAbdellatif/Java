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
public abstract class Hesap  {
    
    protected String id;
    protected double bakiye;

    public Hesap(String id, double bakiye) {
        this.id = id;
        this.bakiye = bakiye;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    @Override
    public String toString() {
        return "Hesap{" + "ID:" + id + ", bakiye:" + bakiye + '}';
    }
    
    public abstract boolean paracekme(double tutar);
    
    public abstract void parayatirma(double tutar);
        
    
    
}
