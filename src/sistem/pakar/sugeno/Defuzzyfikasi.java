/*
 * Netbeans 8.0 
 * JDK 1.7  
 */
package sistem.pakar.sugeno;

import java.util.ArrayList;
import java.util.List;
import sistem.pakar.sugeno.inferensi.IntensitasGejala;

/**
 *
 * @author casper
 */
public class Defuzzyfikasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] value = {2, 2, 2, 1, 2};
        boolean[] bool = {true, true, false, false, false};

        double[][] listGejala = new double[5][3];
        listGejala[0][0] = IntensitasGejala.getKeanggotaanJarang(value[0]);
        listGejala[0][1] = IntensitasGejala.getKeanggotaanSering(value[0]);
        listGejala[0][2] = IntensitasGejala.getKeanggotaanHampirSelalu(value[0]);

        listGejala[1][0] = IntensitasGejala.getKeanggotaanJarang(value[1]);
        listGejala[1][1] = IntensitasGejala.getKeanggotaanSering(value[1]);
        listGejala[1][2] = IntensitasGejala.getKeanggotaanHampirSelalu(value[1]);

        listGejala[2][0] = IntensitasGejala.getKeanggotaanJarang(value[1]);
        listGejala[2][1] = IntensitasGejala.getKeanggotaanSering(value[1]);
        listGejala[2][2] = IntensitasGejala.getKeanggotaanHampirSelalu(value[1]);

        listGejala[3][0] = IntensitasGejala.getKeanggotaanJarang(value[1]);
        listGejala[3][1] = IntensitasGejala.getKeanggotaanSering(value[1]);
        listGejala[3][2] = IntensitasGejala.getKeanggotaanHampirSelalu(value[1]);

        listGejala[4][0] = IntensitasGejala.getKeanggotaanJarang(value[1]);
        listGejala[4][1] = IntensitasGejala.getKeanggotaanSering(value[1]);
        listGejala[4][2] = IntensitasGejala.getKeanggotaanHampirSelalu(value[1]);

        Rule rule = new Rule();
        rule.setListGejala1(listGejala);
        rule.setListGejalaBool1(bool);
        rule.rule1();
        rule.rule2();
        rule.rule3();
        rule.rule4();
        rule.rule5();

        List<WeightAverage> listWA = new ArrayList<>();
        List<Double> list1 = rule.getRule();
        List<Double> list2 = rule.getValueOutput();
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) != 0) {

                System.out.print(i + ":" + list1.get(i));
                System.out.print(" | " + list2.get(i));
                System.out.println();
//                
                WeightAverage wa = new WeightAverage();
                wa.setKode("R" + (i + 1));
                wa.setPredikatAturan(list1.get(i));
                wa.setNilaiOutput(list2.get(i));
                wa.setRule("RULE " + (i + 1));
                listWA.add(wa);
            }
        }

        Defuzzyfikasi d = new Defuzzyfikasi();
        d.calcWeightAverage(list1, list2);

        System.out.println("x : " + listWA.size());
        System.out.println("WA : " + d.getWeightAverage());
    }

    private double weightAverage = 0;

    public void calcWeightAverage(List<Double> a, List<Double> z) {
        double x = 0.0;
        double y = 0.0;
        for (int i = 0; i < a.size(); i++) {
            x = x + (a.get(i) * z.get(i));
            y = y + a.get(i);
        }
        weightAverage = x / y;
    }

    public double getWeightAverage() {
        return weightAverage;
    }

    private boolean[] bool = new boolean[5];

    public void setBool(boolean[] bool) {
        this.bool = bool;
    }

}
