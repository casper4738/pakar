/*
 * Netbeans 8.0 
 * JDK 1.7  
 */
package sistem.pakar.sugeno;

/**
 *
 * @author casper
 */
public class JenisGangguan {

    private String kode;
    private String jenis;

    public JenisGangguan() {
    }

    public JenisGangguan(String kode, String jenis) {
        this.kode = kode;
        this.jenis = jenis;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

}
