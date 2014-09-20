/*
 * Netbeans 8.0 
 * JDK 1.7  
 */
package sistem.pakar.sugeno;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author casper
 */
public class Perilaku {

    private final JenisGangguan[] jenisGangguans;
    private final List<Gejala>[] listCiri;

    public Perilaku() {
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

    public JenisGangguan[] getJenisGangguans() {
        return jenisGangguans;
    }

    public List<Gejala>[] getListCiri() {
        return listCiri;
    }

}
