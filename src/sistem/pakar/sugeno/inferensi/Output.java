/*
 * Netbeans 8.0 
 * JDK 1.7  
 */
package sistem.pakar.sugeno.inferensi;

/**
 *
 * @author casper
 */
public class Output {

    public static double getKeanggotaanRingan(int x) {
        double value = 0;

        if (x <= 0) {
            value = 0;
        } else if (x > 0 && x <= 2) {
            value = (x - 0) / 2;
        } else if (x > 2 && x <= 5) {
            value = (2 - x) / 3;
        }

        return value;
    }

    public static double getKeanggotaanSedang(int x) {
        double value = 0;

        if (x <= 2) {
            value = 0;
        } else if (x > 2 && x <= 5) {
            value = (x - 2) / 3;
        } else if (x > 5 && x <= 8) {
            value = (5 - x) / 3;
        }

        return value;
    }

    public static double getKeanggotaanBerat(int x) {
        double value = 0;

        if (x <= 5) {
            value = 0;
        } else if (x > 5 && x <= 8) {
            value = (x - 5) / 3;
        } else if (x > 8 && x <= 10) {
            value = (8 - x) / 2;
        }

        return value;
    }

}
