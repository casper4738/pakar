/*
 * Netbeans 8.0 
 * JDK 1.7  
 */
package sistem.pakar.sugeno.inferensi;

/**
 *
 * @author casper
 */
public class IntensitasGejala {

    public static double getKeanggotaanJarang(int x) {
        double value = 0;

        if (x <= 0) {
            value = 0;
        } else if (x > 0 && x <= 2.0) {
            value = 1.0;
        } else if (x > 2.0 && x <= 5.0) {
            value = (5.0 - x) / 3.0;
        } else if (x > 5.0) {
            value = 0;
        }

        return Math.abs(value);
    }

    public static double getKeanggotaanSering(int x) {
        double value = 0;

        if (x <= 2.0) {
            value = 0;
        } else if (x > 2.0 && x <= 5.0) {
            value = (2 - x) / 3.0;
        } else if (x > 5.0 && x <= 8.0) {
            value = (5.0 - x) / 3.0;
        } else if (x > 8.0) {
            value = 0;
        }

        return Math.abs(value);
    }

    public static double getKeanggotaanHampirSelalu(int x) {
        double value = 0;

        if (x <= 5.0) {
            value = 0;
        } else if (x > 5.0 && x <= 8.0) {
            value = (5.0 - x) / 3.0;
        } else if (x > 8.0) {
            value = 1.0;
        }

        return Math.abs(value);
    }

}
