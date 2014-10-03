/*
 * Netbeans 8.0 
 * JDK 1.7  
 */
package sistem.pakar.sugeno;

/**
 *
 * @author casper
 */
public class Fuzzyfikasi extends Gejala {

    private double jarang;
    private double sedang;
    private double sering;

    public Fuzzyfikasi() {
    }

    public Fuzzyfikasi(double jarang, double sedang, double sering) {
        this.jarang = jarang;
        this.sedang = sedang;
        this.sering = sering;
    }

    public double getJarang() {
        return jarang;
    }

    public void setJarang(double jarang) {
        this.jarang = jarang;
    }

    public double getSedang() {
        return sedang;
    }

    public void setSedang(double sedang) {
        this.sedang = sedang;
    }

    public double getSering() {
        return sering;
    }

    public void setSering(double sering) {
        this.sering = sering;
    }
}
