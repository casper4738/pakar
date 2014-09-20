/*
 * Netbeans 8.0 
 * JDK 1.7  
 */
package sistem.pakar.sugeno;

/**
 *
 * @author casper
 */
public class Gejala {

    private String kode;
    private String gejala;
    private int value;
    private boolean selected;
    private int number;
    
    private String kodeGangguan;
    private String jenisGangguan;

    public Gejala() {
    }

    public Gejala(String kode, String gejala, boolean selected) {
        this.kode = kode;
        this.gejala = gejala;
        this.selected = selected;
    }

    public Gejala(String kode, String gejala) {
        this.kode = kode;
        this.gejala = gejala;
        this.selected = false;
    }
    
    public Gejala(String kode, String gejala, int number) {
        this.kode = kode;
        this.gejala = gejala;
        this.selected = false;
        this.number = number;
    }
    
    
    public Gejala(String kode, String gejala, int number, String kodeGangguan, String jenisGangguan) {
        this.kode = kode;
        this.gejala = gejala;
        this.selected = false;
        this.number = number;
        this.kodeGangguan = kodeGangguan;
        this.jenisGangguan = jenisGangguan;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getGejala() {
        return gejala;
    }

    public void setGejala(String gejala) {
        this.gejala = gejala;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getKodeGangguan() {
        return kodeGangguan;
    }

    public void setKodeGangguan(String kodeGangguan) {
        this.kodeGangguan = kodeGangguan;
    }

    public String getJenisGangguan() {
        return jenisGangguan;
    }

    public void setJenisGangguan(String jenisGangguan) {
        this.jenisGangguan = jenisGangguan;
    }
    
    

}
