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

        if (x >= 0 && x <= 2) {
            value = 1;
        } else if (x > 2 && x < 5.0) {
            value = (5.0 - x) / (5.0 - 2.0);
        } else if (x >= 5.0) {
            value = 0;
        }

        return Math.abs(value);
    }

    public static double getKeanggotaanSedang(int x) {
        double value = 0;

        if (x <= 3.0) {
            value = 0;
        } else if (x > 3.0 && x < 5.0) {
            value = (x - 3.0) / (5.0 - 3.0);
        } else if (x >= 5.0 && x <= 6.0) {
            value = 1;
        } else if (x > 6.0 && x < 8.0) {
            value = (8.0 - x) / (8.0 - 6.0);
        }

        return Math.abs(value);
    }

    public static double getKeanggotaanSering(int x) {
        double value = 0;

        if (x <= 7.0) {
            value = 0;
        } else if (x > 7.0 && x < 10.0) {
            value = (x - 7.0) / (10.0 - 7.0);
        } else if (x == 10.0) {
            value = 1.0;
        }

        return Math.abs(value);
    }

}
