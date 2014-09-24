/*
 * Netbeans 8.0 
 * JDK 1.7  
 */
package sistem.pakar.view;

import java.util.Arrays;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import sistem.pakar.component.TableModelPerilakuGangguan;
import sistem.pakar.sugeno.JenisGangguan;
import sistem.pakar.sugeno.Perilaku;
import swingx.component.table.renderer.TableCellColorAlignmentRenderer;

/**
 *
 * @author casper
 */
public class PanelPerilaku extends javax.swing.JPanel {

    /**
     * Creates new form PanelPerilaku
     */
    private FrameMain frameMain;
    private Perilaku perilaku;

    private JTable table1;
    private JComboBox comboSearch1;
    private JTextField textSearch1;

    public PanelPerilaku(FrameMain frameMain) {
        initComponents();
        this.frameMain = frameMain;
        perilaku = new Perilaku();

        table1 = iTable1.getTable();
        comboSearch1 = iTable1.getComboSearch();
        textSearch1 = iTable1.getTextSearch();

        final TableModelPerilakuGangguan tableModelGangguan = new TableModelPerilakuGangguan();
        JenisGangguan[] jenisGangguans = perilaku.getJenisGangguans();
        tableModelGangguan.setList(Arrays.asList(jenisGangguans));
        table1.setModel(tableModelGangguan);

        comboSearch1.removeAllItems();
        for (int i = 0; i < tableModelGangguan.getColumnCount(); i++) {
            comboSearch1.addItem(tableModelGangguan.getColumnName(i));
        }

        textSearch1.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent e) {
                tableModelGangguan.setFilter(textSearch1.getText(), comboSearch1.getSelectedIndex());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                tableModelGangguan.setFilter(textSearch1.getText(), comboSearch1.getSelectedIndex());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                tableModelGangguan.setFilter(textSearch1.getText(), comboSearch1.getSelectedIndex());
            }
        });

        table1.setRowHeight(25);
        table1.setRowSorter(tableModelGangguan.getSorter());
        table1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent e) {
                try {
                    int index = table1.convertRowIndexToModel(table1.getSelectedRow());
                    if (index == 0) {
                        jLabel2.setText("<html><b>Gangguan Pemusatan Perhatian/Hiperaktivitas</b>\n"
                                + "ADHD Adalah kependekan dari Attentation Deficit Hyperactive Disorders yang merupakan "
                                + "istilah yang paling sering digunakan untuk menyatakan suatu keadaan yang memiliki karakterisrik "
                                + "utama ketidakmampuan memusatkan perhatian, impulsivitas, dan hiperaktivitas yang tidak sesuai "
                                + "dengan perkembangan anak.\n"
                                + "Penyebab ADHD ditimbulkan karena faktor lingkungan sosial atau karena "
                                + "metode pengasuhan anak, penyebab yang paling subtansi dan paling diyakini "
                                + "adalah faktor neurologidan faktor genetis. Semua faktor memberikan dampak "
                                + "peningkatan terhadap gangguan</html>");
                    } else if (index == 1) {
                        jLabel2.setText("<html><b>Gangguan Perkembangan Belajar</b>\n"
                                + "DSM IV-TR membagi gangguan perkembangan belajar menjadi tiga kategori yaitu "
                                + "gangguan membaca atau diseleksia, gangguan menulis ekspresif atau "
                                + "kesulitan dalam menyusun kata-kata tertulis (termasuk kesalahan ejaan, "
                                + "tata bahasa atau tanda baca), dan gangguan berhitung.</html>");
                    } else if (index == 2) {
                        jLabel2.setText("<html><b>Gangguan Komunikasi</b> \n"
                                + "Gangguan komunikasi yaitu anak mengalami kesulitan untuk mengeskpresikan diri"
                                + " dalam berbicara, pengucapan kata yang tidak jelas dan gangguan kefasihan "
                                + "verbal yang ditandai dengan pengulangan konsonan atau vokal suatu kata.</html>");
                    } else if (index == 3) {
                        jLabel2.setText("<html><b>Gangguan Keterampilan Motorik</b>\n"
                                + "Gangguan keterampilan motorik sering juga disebut sebagai gangguan"
                                + " koordinasi perkembangan, dimana seorang anak mengalami kesulitan "
                                + "dalam melakukan hal fisik yang sederhana sesuai dengan usianya "
                                + "seperti mengancingkan baju, mengikat tali sepatu, bermain bola "
                                + "bahkan menggambar dan menulis.</b>");
                    } else if (index == 4) {
                        jLabel2.setText("<html><b>Gangguan Autistik</b>\n"
                                + "Autisme merupakan gangguan perkembangan yang luas yang ada pada anak. "
                                + "Seorang ahli mengatakan autisme adalah dasar dari manusia yang berkepribadian "
                                + "ganda (Sizhophren). Autis pada anak berbeda-beda tarafnya dari yang "
                                + "ringan sampai yang berat. Autis dapat terjadi pada siapa saja tanpa"
                                + " membedakan perbedaan status sosial maupun ekonomi. Dengan perbandingan "
                                + "4:1 pada anak laki-laki. IQ pada anak autis bisa dari yang rendah sampai "
                                + "IQ yang tinggi. Gejala pada anak autis sudah tampak sebelum anak berumur 3 tahun,"
                                + " yaitu antara lain dengan tidak adanya kontak mata, dan tidak menunjukkan "
                                + "responsif terhadap lingkungan. Jika kemudian tidak diadakan terapi, maka "
                                + "setelah usia 3 tahun perkembangan anak terhenti/mundur, seperti tidak  mengenal "
                                + "suara orang tuanya dan tidak mengenal namanya.</html>");
                    }

                } catch (Exception ex) {
                }
            }
        });

        new swingx.component.table.renderer.TableColumnSizeRenderer().setRenderSizeColumn(table1, JTable.AUTO_RESIZE_OFF);
        table1.getColumnModel().getColumn(0).setCellRenderer(new TableCellColorAlignmentRenderer(JLabel.CENTER));
        table1.getColumnModel().getColumn(1).setCellRenderer(new TableCellColorAlignmentRenderer(JLabel.CENTER));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iTable1 = new sistem.pakar.component.ITable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        iTable1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Pilih Jenis Gangguan :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel2.setText("<html><b>Gangguan Autistik</b> Autisme merupakan gangguan perkembangan yang luas yang ada pada anak.  Seorang ahli mengatakan autisme adalah dasar dari manusia  yang berkepribadian ganda (Sizhophren) . Autis pada anak berbeda-beda tarafnya dari yang ringan sampai yang berat.  Autis dapat terjadi pada siapa saja tanpa membedakan perbedaan status sosial maupun ekonomi. Dengan perbandingan  4:1 pada anak laki-laki. IQ pada anak autis bisa dari yang rendah sampai IQ yang tinggi.  Gejala pada anak autis sudah tampak sebelum anak berumur 3 tahun, yaitu antara lain dengan tidak adanya kontak mata,  dan tidak menunjukkan responsif terhadap lingkungan.  Jika kemudian tidak diadakan terapi, maka setelah usia 3 tahun perkembangan anak terhenti/mundur,  seperti tidak  mengenal suara orang tuanya dan tidak mengenal namanya. </html> ");
        jLabel2.setAutoscrolls(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iTable1, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iTable1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private sistem.pakar.component.ITable iTable1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
