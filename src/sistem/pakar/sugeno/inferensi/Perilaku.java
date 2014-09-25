/*
 * Netbeans 8.0 
 * JDK 1.7  
 */
package sistem.pakar.sugeno.inferensi;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import sistem.pakar.sugeno.Gejala;
import sistem.pakar.sugeno.Gejala;
import sistem.pakar.sugeno.JenisGangguan;
import sistem.pakar.sugeno.JenisGangguan;
import sistem.pakar.sugeno.WeightAverage;
import sistem.pakar.sugeno.WeightAverage;

/**
 *
 * @author casper
 */
public class Perilaku {

    public static void main(String[] args) {

        Perilaku tes = new Perilaku();
        tes.perilaku1();
//        Perilaku.perilaku2();
//        Perilaku.perilaku3();
//        Perilaku.perilaku4();
//        tes.perilaku5();

//        String string = "A  B";
//        System.out.println(tes.getSumString(string, "B"));
    }

    private final JenisGangguan[] jenisGangguans;
    private final List<Gejala>[] listCiri;

    private final String[] kategori = {"RINGAN", "SEDANG", "BERAT"};
    private final List<WeightAverage> list;
    private final DecimalFormat decimalFormat;
    private int x = 1;

    public Perilaku() {
        decimalFormat = new DecimalFormat("#0000");
        list = new ArrayList<>();

        jenisGangguans = new JenisGangguan[5];
        jenisGangguans[0] = new JenisGangguan("P1", "ADHD");
        jenisGangguans[1] = new JenisGangguan("P2", "PERKEMBANGAN BELAJAR");
        jenisGangguans[2] = new JenisGangguan("P3", "KETERAMPILAN MOTORIK");
        jenisGangguans[3] = new JenisGangguan("P4", "KOMUNIKASI");
        jenisGangguans[4] = new JenisGangguan("P5", "AUTISME");

        listCiri = new ArrayList[5];
        listCiri[0] = new ArrayList<>();
        listCiri[0].add(new Gejala("G01", "Tidak mengikuti instruksi sederhana", 0, jenisGangguans[0].getKode(), jenisGangguans[0].getJenis()));
        listCiri[0].add(new Gejala("G02", "Mudah Teralihkan", 1, jenisGangguans[0].getKode(), jenisGangguans[0].getJenis()));
        listCiri[0].add(new Gejala("G03", "Terus bergerak saat posisi duduk", 2, jenisGangguans[0].getKode(), jenisGangguans[0].getJenis()));
        listCiri[0].add(new Gejala("G04", "Berlari kesana kemari tanpa tujuan", 3, jenisGangguans[0].getKode(), jenisGangguans[0].getJenis()));
        listCiri[0].add(new Gejala("G05", "Berbicara berlebihan tanpa henti", 4, jenisGangguans[0].getKode(), jenisGangguans[0].getJenis()));

        listCiri[1] = new ArrayList<>();
        listCiri[1].add(new Gejala("G06", "Sulit mencari ekspresi kata yang tepat", 0, jenisGangguans[1].getKode(), jenisGangguans[1].getJenis()));
        listCiri[1].add(new Gejala("G07", "Sulit memahami bacaan", 1, jenisGangguans[1].getKode(), jenisGangguans[1].getJenis()));
        listCiri[1].add(new Gejala("G08", "Menyimpangkan pengucapan kalimat saat membaca dengan keras", 2, jenisGangguans[1].getKode(), jenisGangguans[1].getJenis()));
        listCiri[1].add(new Gejala("G09", "Kesulitan mengingat fakta secara cepat dan akurat", 3, jenisGangguans[1].getKode(), jenisGangguans[1].getJenis()));
        listCiri[1].add(new Gejala("G10", "Sulit mengurutkan angka dalam kolom", 4, jenisGangguans[1].getKode(), jenisGangguans[1].getJenis()));

        listCiri[2] = new ArrayList<>();
        listCiri[2].add(new Gejala("G11", "Kesulitan dalam bermain bola", 0, jenisGangguans[2].getKode(), jenisGangguans[2].getJenis()));
        listCiri[2].add(new Gejala("G12", "Sulit mengancingkan kancing baju atau resleting", 1, jenisGangguans[2].getKode(), jenisGangguans[2].getJenis()));
        listCiri[2].add(new Gejala("G13", "Kesulitan mengikat tali sepatu", 2, jenisGangguans[2].getKode(), jenisGangguans[2].getJenis()));
        listCiri[2].add(new Gejala("G14", "Mengalami masalah dalam menulis/mewarnai pada sebuah gambar kotak", 3, jenisGangguans[2].getKode(), jenisGangguans[2].getJenis()));

        listCiri[3] = new ArrayList<>();
        listCiri[3].add(new Gejala("G15", "Sulit mengekspresikan diri dalam berbicara", 0, jenisGangguans[3].getKode(), jenisGangguans[3].getJenis()));
        listCiri[3].add(new Gejala("G16", "Sulit mengucapkan kata dengan jelas ", 1, jenisGangguans[3].getKode(), jenisGangguans[3].getJenis()));
        listCiri[3].add(new Gejala("G17", "Sering mengulang/memanjangkan pengucapan vokal/konsonan kata", 2, jenisGangguans[3].getKode(), jenisGangguans[3].getJenis()));

        listCiri[4] = new ArrayList<>();
        listCiri[4].add(new Gejala("G18", "Kurangnya perilaku nonverbal seperti kontak mata, bahasa tubuh dan ekspresi wajah", 0, jenisGangguans[4].getKode(), jenisGangguans[4].getJenis()));
        listCiri[4].add(new Gejala("G19", "Kurangnya hubungan sosial terhadap anak sebaya", 1, jenisGangguans[4].getKode(), jenisGangguans[4].getJenis()));
        listCiri[4].add(new Gejala("G20", "Keterlambatan Bahasa Bicara", 2, jenisGangguans[4].getKode(), jenisGangguans[4].getJenis()));
        listCiri[4].add(new Gejala("G21", "Bahasa yang diulang-ulang", 3, jenisGangguans[4].getKode(), jenisGangguans[4].getJenis()));
        listCiri[4].add(new Gejala("G22", "Kurang bermain sesuai tahap perkembangannya", 4, jenisGangguans[4].getKode(), jenisGangguans[4].getJenis()));
        listCiri[4].add(new Gejala("G23", "Keterlambatan permainan imajinatif", 5, jenisGangguans[4].getKode(), jenisGangguans[4].getJenis()));
    }

    public void perilaku1() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        for (int m = 0; m < 3; m++) {
                            WeightAverage wa = new WeightAverage();
                            wa.setKode("R" + decimalFormat.format(x));
                            wa.setRule(listCiri[0].get(0).getGejala() + " " + kategori[i] + " ; "
                                    + listCiri[0].get(1).getGejala() + " " + kategori[j] + " ; "
                                    + listCiri[0].get(2).getGejala() + " " + kategori[k] + " ; "
                                    + listCiri[0].get(3).getGejala() + " " + kategori[l] + " ; "
                                    + listCiri[0].get(4).getGejala() + " " + kategori[m] + " ; ");
                            wa.setThen(jenisGangguans[0].getJenis() + " " + thenGejala5(getSumString(wa.getRule(), "RINGAN") + ";" + getSumString(wa.getRule(), "SEDANG") + ";" + getSumString(wa.getRule(), "BERAT")));
                            list.add(wa);
                            x++;
                        }
                    }
                }
            }
        }
    }

    public void perilaku2() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        for (int m = 0; m < 3; m++) {
                            WeightAverage wa = new WeightAverage();
                            wa.setKode("R" + decimalFormat.format(x));
                            wa.setRule(listCiri[1].get(0).getGejala() + " " + kategori[i] + " ; "
                                    + listCiri[1].get(1).getGejala() + " " + kategori[j] + " ; "
                                    + listCiri[1].get(2).getGejala() + " " + kategori[k] + " ; "
                                    + listCiri[1].get(3).getGejala() + " " + kategori[l] + " ; "
                                    + listCiri[1].get(4).getGejala() + " " + kategori[m] + " ; ");
                            wa.setThen(jenisGangguans[1].getJenis() + " " + thenGejala5(getSumString(wa.getRule(), "RINGAN") + ";" + getSumString(wa.getRule(), "SEDANG") + ";" + getSumString(wa.getRule(), "BERAT")));
                            list.add(wa);
                            x++;
                        }
                    }
                }
            }
        }
    }

    public void perilaku3() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        WeightAverage wa = new WeightAverage();
                        wa.setKode("R" + decimalFormat.format(x));
                        wa.setRule(listCiri[2].get(0).getGejala() + " " + kategori[i] + " ; "
                                + listCiri[2].get(1).getGejala() + " " + kategori[j] + " ; "
                                + listCiri[2].get(2).getGejala() + " " + kategori[k] + " ; "
                                + listCiri[2].get(3).getGejala() + " " + kategori[k] + " ; ");
                        wa.setThen(jenisGangguans[2].getJenis() + " " + thenGejala4(getSumString(wa.getRule(), "RINGAN") + ";" + getSumString(wa.getRule(), "SEDANG") + ";" + getSumString(wa.getRule(), "BERAT")));
                        list.add(wa);
                        x++;
                    }
                }
            }
        }

    }

    public void perilaku4() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    WeightAverage wa = new WeightAverage();
                    wa.setKode("R" + decimalFormat.format(x));
                    wa.setRule(listCiri[3].get(0).getGejala() + " " + kategori[i] + " ; "
                            + listCiri[3].get(1).getGejala() + " " + kategori[j] + " ; "
                            + listCiri[3].get(2).getGejala() + " " + kategori[k] + " ; ");
                    wa.setThen(jenisGangguans[3].getJenis() + " " + thenGejala3(getSumString(wa.getRule(), "RINGAN") + ";" + getSumString(wa.getRule(), "SEDANG") + ";" + getSumString(wa.getRule(), "BERAT")));
                    list.add(wa);
                    x++;
                }
            }
        }
    }

    public void perilaku5() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        for (int m = 0; m < 3; m++) {
                            for (int n = 0; n < 3; n++) {
                                WeightAverage wa = new WeightAverage();
                                wa.setKode("R" + decimalFormat.format(x));
                                wa.setRule(listCiri[4].get(0).getGejala() + " " + kategori[i] + " ; "
                                        + listCiri[4].get(1).getGejala() + " " + kategori[j] + " ; "
                                        + listCiri[4].get(2).getGejala() + " " + kategori[k] + " ; "
                                        + listCiri[4].get(3).getGejala() + " " + kategori[l] + " ; "
                                        + listCiri[4].get(4).getGejala() + " " + kategori[m] + " ; "
                                        + listCiri[4].get(5).getGejala() + " " + kategori[n] + " ; ");
                                wa.setThen(jenisGangguans[4].getJenis() + " " + thenGejala6(getSumString(wa.getRule(), "RINGAN") + ";" + getSumString(wa.getRule(), "SEDANG") + ";" + getSumString(wa.getRule(), "BERAT")));
//                                System.out.println(wa.getRule());
                                list.add(wa);
                                x++;
                            }
                        }
                    }
                }
            }
        }
    }

    public String thenGejala3(String match) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String[] string : thenGejala3) {
            if (match.equals(string[0])) {
                switch (string[1]) {
                    case "2":
                        stringBuilder.append("RINGAN");
                        break;
                    case "5":
                        stringBuilder.append("SEDANG");
                        break;
                    case "8":
                        stringBuilder.append("BERAT");
                        break;
                }
                break;
            }
        }
        return stringBuilder.toString();
    }

    public String thenGejala4(String match) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String[] string : thenGejala4) {
            if (match.equals(string[0])) {
                switch (string[1]) {
                    case "2":
                        stringBuilder.append("RINGAN");
                        break;
                    case "5":
                        stringBuilder.append("SEDANG");
                        break;
                    case "8":
                        stringBuilder.append("BERAT");
                        break;
                }
                break;
            }
        }
        return stringBuilder.toString();
    }

    public String thenGejala5(String match) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String[] string : thenGejala5) {
            if (match.equals(string[0])) {
                switch (string[1]) {
                    case "2":
                        stringBuilder.append("RINGAN");
                        break;
                    case "5":
                        stringBuilder.append("SEDANG");
                        break;
                    case "8":
                        stringBuilder.append("BERAT");
                        break;
                }
                break;
            }
        }
        return stringBuilder.toString();
    }

    public String thenGejala6(String match) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String[] string : thenGejala6) {
            if (match.equals(string[0])) {
                switch (string[1]) {
                    case "2":
                        stringBuilder.append("RINGAN");
                        break;
                    case "5":
                        stringBuilder.append("SEDANG");
                        break;
                    case "8":
                        stringBuilder.append("BERAT");
                        break;
                }
                break;
            }
        }
        return stringBuilder.toString();
    }

    private int getSumString(String string, String search) {
        string = string.replaceAll("  ", " ");
        String[] vString = string.split(" ");
        int sum = 0;
        for (String string7 : vString) {
            if (string7.equals(search)) {
                sum++;
            }
        }
        return sum;
    }

    public List<WeightAverage> getList() {
        return list;
    }

    public JenisGangguan[] getJenisGangguans() {
        return jenisGangguans;
    }

    public List<Gejala>[] getListCiri() {
        return listCiri;
    }

    String[][] thenGejala3 = {
        {"3;0;0", "2"},
        {"2;1;0", "2"},
        {"2;0;1", "5"},
        {"1;2;0", "5"},
        {"1;1;1", "5"},
        {"0;3;0", "5"},
        {"0;2;1", "5"},
        {"1;0;2", "8"},
        {"0;1;2", "8"},
        {"0;0;3", "8"}};

    String[][] thenGejala4 = {
        {"4;0;0", "2"},
        {"3;1;0", "2"},
        {"3;0;1", "5"},
        {"2;2;0", "5"},
        {"0;4;0", "5"},
        {"2;1;1", "5"},
        {"2;0;2", "5"},
        {"1;3;0", "5"},
        {"1;2;1", "5"},
        {"1;1;2", "5"},
        {"0;3;1", "5"},
        {"0;0;4", "8"},
        {"1;0;3", "8"},
        {"0;1;3", "8"},
        {"0;2;2", "8"}};

    private String[][] thenGejala5 = {
        {"5;0;0", "2"},
        {"4;1;0", "2"},
        {"4;0;1", "5"},
        {"3;2;0", "5"},
        {"3;1;1", "5"},
        {"0;5;0", "5"},
        {"1;4;0", "5"},
        {"0;4;1", "5"},
        {"2;3;0", "5"},
        {"1;3;1", "5"},
        {"2;2;1", "5"},
        {"2;1;2", "5"},
        {"2;0;3", "5"},
        {"3;0;2", "5"},
        {"1;2;2", "5"},
        {"0;0;5", "8"},
        {"1;0;4", "8"},
        {"0;1;4", "8"},
        {"0;2;3", "8"},
        {"1;1;3", "8"},
        {"0;3;2", "8"}};

    String[][] thenGejala6 = {
        {"6;0;0", "2"},
        {"5;1;0", "2"},
        {"5;0;1", "2"},
        {"4;2;0", "2"},
        {"4;0;2", "5"},
        {"4;1;1", "5"},
        {"3;3;0", "5"},
        {"0;6;0", "5"},
        {"1;5;0", "5"},
        {"0;5;1", "5"},
        {"1;4;1", "5"},
        {"2;4;0", "5"},
        {"0;4;2", "8"},
        {"2;3;1", "5"},
        {"1;3;2", "5"},
        {"3;2;1", "5"},
        {"2;2;2", "5"},
        {"3;1;2", "5"},
        {"2;1;3", "5"},
        {"3;0;3", "5"},
        {"0;0;6", "8"},
        {"1;0;5", "8"},
        {"0;1;5", "8"},
        {"2;0;4", "8"},
        {"0;2;4", "8"},
        {"1;1;4", "8"},
        {"1;2;3", "8"},
        {"0;3;3", "8"}
    };

}
