/*
 * Netbeans 8.0 
 * JDK 1.7  
 */
package sistem.pakar.sugeno;

/**
 *
 * @author casper
 */
public class DerajatKeanggotaan extends Gejala {

    private double ringan;
    private double sedang;
    private double berat;

    public DerajatKeanggotaan() {
    }

    public DerajatKeanggotaan(double ringan, double sedang, double berat) {
        this.ringan = ringan;
        this.sedang = sedang;
        this.berat = berat;
    }

    public double getRingan() {
        return ringan;
    }

    public void setRingan(double ringan) {
        this.ringan = ringan;
    }

    public double getSedang() {
        return sedang;
    }

    public void setSedang(double sedang) {
        this.sedang = sedang;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

}
