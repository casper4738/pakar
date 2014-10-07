/*
 * Netbeans 8.0 
 * JDK 1.7  
 */
package sistem.pakar.view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import sistem.pakar.component.TableModelIntensitas;
import sistem.pakar.sugeno.Defuzzyfikasi;
import sistem.pakar.sugeno.Fuzzyfikasi;
import sistem.pakar.sugeno.Gejala;
import sistem.pakar.sugeno.inferensi.Rule;
import sistem.pakar.sugeno.WeightAverage;
import sistem.pakar.sugeno.inferensi.IntensitasGejala;
import sistem.pakar.sugeno.inferensi.Perilaku;
import swingx.component.table.renderer.TableCellColorAlignmentRenderer;

/**
 *
 * @author casper
 */
public class PanelNilaiIntesitas extends javax.swing.JPanel {

    /**
     * Creates new form PanelNilaiDerajatKeanggotaan
     */
    private TableModelIntensitas tableModel;
    private PanelDiagnosa panelDiagnosa;
    private List<Gejala> arrayList;

    public PanelNilaiIntesitas(PanelDiagnosa panelDiagnosa) {
        initComponents();
        this.panelDiagnosa = panelDiagnosa;
        tableModel = new TableModelIntensitas();
        table.setRowHeight(25);
    }

    public void setData(List<Gejala> vlist) {
        arrayList = new ArrayList<>();
//        arrayList.addAll(vlist);
        List<Gejala> list = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (Gejala e : vlist) {
            if (e.isSelected()) {
                list.add(e);
                stringBuilder.append(e.getKodeGangguan());
                stringBuilder.append(";");
            }
        }

        for (Gejala e : vlist) {
            String[] stringArray = stringBuilder.toString().split(";");
            for (String string : stringArray) {
                if (string.equals(e.getKodeGangguan())) {
                    e.setValue(1);
                    arrayList.add(e);
                    break;
                }
            }
        }
        
        tableModel.setList(list);
        table.setModel(tableModel);

        new swingx.component.table.renderer.TableColumnSizeRenderer().setRenderSizeColumn(table, JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(1).setPreferredWidth(45);
        table.getColumnModel().getColumn(0).setPreferredWidth(100);

        table.getColumnModel().getColumn(0).setCellRenderer(new TableCellColorAlignmentRenderer(JLabel.CENTER));
        table.getColumnModel().getColumn(1).setCellRenderer(new TableCellColorAlignmentRenderer(JLabel.CENTER));
        table.getColumnModel().getColumn(2).setCellRenderer(new TableCellColorAlignmentRenderer(JLabel.LEFT));
        table.getColumnModel().getColumn(0).setCellEditor(
                new DefaultCellEditor(new JComboBox(new Object[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}))
        );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        buttonProses = new javax.swing.JButton();
        buttonReset = new javax.swing.JButton();
        buttonKembali = new javax.swing.JButton();

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Masukkan Nilai Intensitas ( 1 - 10 )");

        jPanel2.setOpaque(false);

        buttonProses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistem/pakar/resources/process.png"))); // NOI18N
        buttonProses.setText("Proses");
        buttonProses.setPreferredSize(new java.awt.Dimension(120, 35));
        buttonProses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProsesActionPerformed(evt);
            }
        });
        jPanel2.add(buttonProses);

        buttonReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistem/pakar/resources/undo.png"))); // NOI18N
        buttonReset.setText("Reset");
        buttonReset.setPreferredSize(new java.awt.Dimension(120, 35));
        buttonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonResetActionPerformed(evt);
            }
        });
        jPanel2.add(buttonReset);

        buttonKembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistem/pakar/resources/back.png"))); // NOI18N
        buttonKembali.setText("Kembali");
        buttonKembali.setPreferredSize(new java.awt.Dimension(120, 35));
        buttonKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKembaliActionPerformed(evt);
            }
        });
        jPanel2.add(buttonKembali);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProsesActionPerformed
        List<Fuzzyfikasi> listFuzzyfikasis1 = new ArrayList<>();
        List<Fuzzyfikasi> listFuzzyfikasis2 = new ArrayList<>();

        double[][] listGejala1 = new double[5][3];
        double[][] listGejala2 = new double[5][3];
        double[][] listGejala3 = new double[4][3];
        double[][] listGejala4 = new double[3][3];
        double[][] listGejala5 = new double[6][3];

        for (Gejala e : arrayList) {
            for (Gejala ve : tableModel.getList()) {
                if (ve.getKode().equals(e.getKode())) {
                    e.setValue(ve.getValue());
                }
            }
        }

        for (Gejala e : arrayList) {
            Fuzzyfikasi keanggotaan = new Fuzzyfikasi();
            keanggotaan.setKode(e.getKode());
            keanggotaan.setGejala(e.getGejala());
            keanggotaan.setKodeGangguan(e.getKodeGangguan());
            keanggotaan.setJenisGangguan(e.getJenisGangguan());
            keanggotaan.setNumber(e.getNumber());
            keanggotaan.setValue(e.getValue());
            keanggotaan.setSelected(e.isSelected());

            keanggotaan.setJarang(IntensitasGejala.getKeanggotaanJarang(e.getValue()));
            keanggotaan.setSedang(IntensitasGejala.getKeanggotaanSedang(e.getValue()));
            keanggotaan.setSering(IntensitasGejala.getKeanggotaanSering(e.getValue()));
            listFuzzyfikasis1.add(keanggotaan);

            if (e.isSelected()) {
                listFuzzyfikasis2.add(keanggotaan);
            }
        }

        for (Fuzzyfikasi e : listFuzzyfikasis1) {
            switch (e.getKodeGangguan()) {
                case "P1":
                    listGejala1[e.getNumber()][0] = e.getJarang();
                    listGejala1[e.getNumber()][1] = e.getSedang();
                    listGejala1[e.getNumber()][2] = e.getSering();
                    break;
                case "P2":
                    listGejala2[e.getNumber()][0] = e.getJarang();
                    listGejala2[e.getNumber()][1] = e.getSedang();
                    listGejala2[e.getNumber()][2] = e.getSering();
                    break;
                case "P3":
                    listGejala3[e.getNumber()][0] = e.getJarang();
                    listGejala3[e.getNumber()][1] = e.getSedang();
                    listGejala3[e.getNumber()][2] = e.getSering();
                    break;
                case "P4":
                    listGejala4[e.getNumber()][0] = e.getJarang();
                    listGejala4[e.getNumber()][1] = e.getSedang();
                    listGejala4[e.getNumber()][2] = e.getSering();

                    break;
                case "P5":
                    listGejala5[e.getNumber()][0] = e.getJarang();
                    listGejala5[e.getNumber()][1] = e.getSedang();
                    listGejala5[e.getNumber()][2] = e.getSering();
                    break;
            }
        }

        Rule rule = new Rule();
        rule.setListGejala1(listGejala1);
        rule.setListGejala2(listGejala2);
        rule.setListGejala3(listGejala3);
        rule.setListGejala4(listGejala4);
        rule.setListGejala5(listGejala5);

        Perilaku perilaku = new Perilaku();
        perilaku.perilaku1();
        perilaku.perilaku2();
        perilaku.perilaku3();
        perilaku.perilaku4();
        perilaku.perilaku5();

        List<WeightAverage> list = new ArrayList<>();
        List<WeightAverage> vlist = perilaku.getList();

        double[] wa = new double[5];
        Defuzzyfikasi d = new Defuzzyfikasi();
        try {
            rule.rule1();
            List<WeightAverage> listWA = new ArrayList<>();
            List<Double> list1 = rule.getRule();
            List<Double> list2 = rule.getValueOutput();
            d.calcWeightAverage(list1, list2);
            wa[0] = d.getWeightAverage();
            int t = 0;
            for (int i = 0; i < list1.size(); i++) {
                if (list1.get(i) != 0) {
                    int vx = 0 + i;
                    WeightAverage wax = vlist.get(vx);
                    wax.setPredikatAturan(list1.get(i));
                    wax.setNilaiOutput(list2.get(i));
                    list.add(wax);
                    t++;
                }
            }
            System.out.println("PERILAKU 1 :" + t);
        } catch (Exception e) {
        }
        try {
            rule.rule2();
            List<WeightAverage> listWA = new ArrayList<>();
            List<Double> list1 = rule.getRule();
            List<Double> list2 = rule.getValueOutput();
            d.calcWeightAverage(list1, list2);
            wa[1] = d.getWeightAverage();
            int t = 0;
            for (int i = 0; i < list1.size(); i++) {
                if (list1.get(i) != 0) {
                    int vx = 243 + i;
                    WeightAverage wax = vlist.get(vx);
                    wax.setPredikatAturan(list1.get(i));
                    wax.setNilaiOutput(list2.get(i));
                    list.add(wax);
                    t++;
                }
            }
            System.out.println("PERILAKU 2 :" + t);
        } catch (Exception e) {
        }
        try {
            rule.rule3();
            List<WeightAverage> listWA = new ArrayList<>();
            List<Double> list1 = rule.getRule();
            List<Double> list2 = rule.getValueOutput();
            d.calcWeightAverage(list1, list2);
            wa[2] = d.getWeightAverage();
            int t = 0;
            for (int i = 0; i < list1.size(); i++) {
                if (list1.get(i) != 0) {
                    int vx = 486 + i;
                    WeightAverage wax = vlist.get(vx);
                    wax.setPredikatAturan(list1.get(i));
                    wax.setNilaiOutput(list2.get(i));
                    list.add(wax);
                    t++;
                }
            }
            System.out.println("PERILAKU 3 :" + t);
        } catch (Exception e) {
        }

        try {
            rule.rule4();
            List<WeightAverage> listWA = new ArrayList<>();
            List<Double> list1 = rule.getRule();
            List<Double> list2 = rule.getValueOutput();
            d.calcWeightAverage(list1, list2);
            wa[3] = d.getWeightAverage();
            int t = 0;
            for (int i = 0; i < list1.size(); i++) {
                if (list1.get(i) != 0) {
                    int vx = 567 + i;
                    WeightAverage wax = vlist.get(vx);
                    wax.setPredikatAturan(list1.get(i));
                    wax.setNilaiOutput(list2.get(i));
                    list.add(wax);
                    t++;
                }
            }
            System.out.println("PERILAKU 4 :" + t);
        } catch (Exception e) {
        }

        try {
            rule.rule5();
            List<WeightAverage> listWA = new ArrayList<>();
            List<Double> list1 = rule.getRule();
            List<Double> list2 = rule.getValueOutput();
            d.calcWeightAverage(list1, list2);
            wa[4] = d.getWeightAverage();
            int t = 0;
            for (int i = 0; i < list1.size(); i++) {
                if (list1.get(i) != 0) {
                    int vx = 594 + i;
                    WeightAverage wax = vlist.get(vx);
                    wax.setPredikatAturan(list1.get(i));
                    wax.setNilaiOutput(list2.get(i));
                    list.add(wax);
                    t++;
                }
            }
            System.out.println("PERILAKU 5 :" + t);
            System.out.println("===============================================");
        } catch (Exception e) {
        }

        panelDiagnosa.showPanel("card4");
        panelDiagnosa.showMenu("menu3");
        panelDiagnosa.getPanelFuzzyfikazi().setData(listFuzzyfikasis2);
        panelDiagnosa.getPanelInferensi().setData(list);
        panelDiagnosa.getPanelDeffuzyfikasi().setData(wa);
        panelDiagnosa.getPanelHasil().setHasilDiagnosa(wa);
    }//GEN-LAST:event_buttonProsesActionPerformed

    private void buttonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResetActionPerformed
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            Gejala e = tableModel.get(i);
            e.setValue(1);
            tableModel.update(i, e);
        }
    }//GEN-LAST:event_buttonResetActionPerformed

    private void buttonKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKembaliActionPerformed
        panelDiagnosa.showMenu("menu1");
        panelDiagnosa.showPanel("card1");
    }//GEN-LAST:event_buttonKembaliActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonKembali;
    private javax.swing.JButton buttonProses;
    private javax.swing.JButton buttonReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

}
