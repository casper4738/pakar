/*
 * Netbeans 8.0 
 * JDK 1.7  
 */
package sistem.pakar.sugeno;

/**
 *
 * @author casper
 */
public class WeightAverage {

    private String kode;
    private String rule;
    private String then;
    private double predikatAturan;
    private double nilaiOutput;

    public WeightAverage() {
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public String getThen() {
        return then;
    }

    public void setThen(String then) {
        this.then = then;
    }

    public double getPredikatAturan() {
        return predikatAturan;
    }

    public void setPredikatAturan(double predikatAturan) {
        this.predikatAturan = predikatAturan;
    }

    public double getNilaiOutput() {
        return nilaiOutput;
    }

    public void setNilaiOutput(double nilaiOutput) {
        this.nilaiOutput = nilaiOutput;
    }

}
