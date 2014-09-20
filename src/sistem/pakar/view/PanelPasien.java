/*
 * Netbeans 8.0 
 * JDK 1.7  
 */
package sistem.pakar.view;

import java.util.ArrayList;
import java.util.HashMap;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import swingx.utility.FilterInput;
import swingx.utility.UtilityPrint;

/**
 *
 * @author casper
 */
public class PanelPasien extends javax.swing.JPanel {

    /**
     * Creates new form PanelPasien
     */
    private PanelDiagnosa panelDiagnosa;
    private FrameMain frameMain;

    public PanelPasien(FrameMain frameMain, PanelDiagnosa panelDiagnosa) {
        initComponents();
        this.frameMain = frameMain;
        this.panelDiagnosa = panelDiagnosa;

        textNama.setDocument(new FilterInput().getTextLimit(50, true));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iPanelBorder1 = new sistem.pakar.component.IPanelBorder();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textNama = new sistem.pakar.component.ITextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        jLabel1.setText("MASUKKAN DATA ANAK / PASIEN :");

        jLabel2.setText("NAMA :");

        jLabel3.setText("Jenis Kelamin :");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "LAKI - LAKI", "PEREMPUAN" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2", "3", "4", "5", "6" }));

        jLabel4.setText("USIA :");

        jPanel2.setOpaque(false);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistem/pakar/resources/stock_print.png"))); // NOI18N
        jButton5.setText("Print");
        jButton5.setPreferredSize(new java.awt.Dimension(120, 35));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistem/pakar/resources/back.png"))); // NOI18N
        jButton6.setText("Kembali");
        jButton6.setPreferredSize(new java.awt.Dimension(120, 35));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);

        javax.swing.GroupLayout iPanelBorder1Layout = new javax.swing.GroupLayout(iPanelBorder1);
        iPanelBorder1.setLayout(iPanelBorder1Layout);
        iPanelBorder1Layout.setHorizontalGroup(
            iPanelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iPanelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(iPanelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
                    .addGroup(iPanelBorder1Layout.createSequentialGroup()
                        .addGroup(iPanelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(iPanelBorder1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(49, 49, 49)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(iPanelBorder1Layout.createSequentialGroup()
                                .addGroup(iPanelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, iPanelBorder1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(iPanelBorder1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(44, 44, 44)))
                                .addGroup(iPanelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textNama, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        iPanelBorder1Layout.setVerticalGroup(
            iPanelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iPanelBorder1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(iPanelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(iPanelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(iPanelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(149, 149, 149)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iPanelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iPanelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            JRBeanCollectionDataSource dt = new JRBeanCollectionDataSource(new ArrayList<>());
            HashMap map = new HashMap();
            map.put("parameter1", textNama.getText());
            map.put("parameter2", jComboBox1.getSelectedItem());
            map.put("parameter3", jComboBox2.getSelectedItem());
            map.put("parameter4", panelDiagnosa.getPanelHasil().getHasilDiagnosa());
            map.put("parameter5", panelDiagnosa.getPanelHasil().getSaran());
            UtilityPrint.printReport(dt, "./report1", map);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private sistem.pakar.component.IPanelBorder iPanelBorder1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private sistem.pakar.component.ITextField textNama;
    // End of variables declaration//GEN-END:variables

}
