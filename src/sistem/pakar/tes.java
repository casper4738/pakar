/*
 * Netbeans 8.0 
 * JDK 1.7  
 */
package sistem.pakar;

/**
 *
 * @author casper
 */
public class tes {

    String[] string1 = {"RINGAN", "SEDANG", "BERAT"};

    String[] string2 = {
        "Tidak mengikuti instruksi sederhana",
        "Mudah Teralihkan",
        "Terus bergerak saat posisi duduk",
        "Berlari kesana kemari tanpa tujuan",
        "Berbicara berlebihan tanpa henti"
    };

    String[] string3 = {
        "Sulit mencari ekspresi kata yang tepat",
        "Sulit memahami bacaan",
        "Menyimpangkan pengucapan kalimat saat membaca dengan keras",
        "Kesulitan mengingat fakta secara cepat dan akurat",
        "Sulit mengurutkan angka dalam kolom"
    };
    String[] string4 = {
        "Kesulitan dalam bermain bola",
        "Sulit mengancingkan kancing baju atau resleting",
        "Kesulitan mengikat tali sepatu",
        "Mengalami masalah dalam menulis/mewarnai pada sebuah gambar kotak"};
    String[] string5 = {
        "Sulit mengekspresikan diri dalam berbicara",
        "Sulit mengucapkan kata dengan jelas",
        "Sering mengulang/memanjangkan pengucapan vokal/konsonan kata",};
    String[] string6 = {
        "Kurangnya perilaku nonverbal seperti kontak mata, bahasa tubuh dan ekspresi wajah",
        "Kurangnya hubungan sosial terhadap anak sebaya",
        "Keterlambatan Bahasa Bicara",
        "Bahasa yang diulang-ulang",
        "Kurang bermain sesuai tahap perkembangannya",
        "Keterlambatan permainan imajinatif",};

    int x = 1;

    private void perilaku1() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        for (int m = 0; m < 3; m++) {
                            System.out.println(x + " ; "
                                    + string2[0] + "-" + string1[i] + " "
                                    + string2[1] + " " + string1[j] + " "
                                    + string2[2] + " " + string1[k] + " "
                                    + string2[3] + " " + string1[l] + " "
                                    + string2[4] + " " + string1[m]);
                            x++;
                        }
                    }
                }
            }
        }
    }

    private void perilaku2() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        for (int m = 0; m < 3; m++) {
                            System.out.println(x + " ; "
                                    + string3[0] + "-" + string1[i] + " "
                                    + string3[1] + " " + string1[j] + " "
                                    + string3[2] + " " + string1[k] + " "
                                    + string3[3] + " " + string1[l] + " "
                                    + string3[4] + " " + string1[m]);
                            x++;
                        }
                    }
                }
            }
        }
    }

    private void perilaku3() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.println(x + " ; "
                            + string3[0] + "-" + string1[i] + " "
                            + string3[1] + " " + string1[j] + " "
                            + string3[2] + " " + string1[k] + " "
                    );
                    x++;
                }
            }
        }
    }

    private void perilaku4() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        System.out.println(x + " ; "
                                + string5[0] + "-" + string1[i] + " "
                                + string5[1] + " " + string1[j] + " "
                                + string5[2] + " " + string1[k]);

                        x++;
                    }
                }
            }
        }
    }

    private void perilaku5() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        for (int m = 0; m < 3; m++) {
                            for (int n = 0; n < 3; n++) {
                                System.out.println(x + " ; "
                                        + string2[0] + "-" + string1[i] + " "
                                        + string6[1] + " " + string1[j] + " "
                                        + string6[2] + " " + string1[k] + " "
                                        + string6[3] + " " + string1[l] + " "
                                        + string6[4] + " " + string1[m] + " "
                                        + string6[5] + " " + string1[n]);
                                x++;

                            }
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        tes tes = new tes();
//        tes.perilaku1();
//        tes.perilaku2();
//        tes.perilaku3();
//        tes.perilaku4();
//        tes.perilaku5();

        int x = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                x++;
            }
        }
        System.out.println("x:"+x);

    }

}
