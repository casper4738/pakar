/*
 * Netbeans 8.0 
 * JDK 1.7  
 */
package sistem.pakar.view;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTable;
import sistem.pakar.component.TableModelPredikat;
import sistem.pakar.sugeno.WeightAverage;
import swingx.component.table.renderer.TableCellColorAlignmentRenderer;

/**
 *
 * @author casper
 */
public class PanelPredikatAturan extends javax.swing.JPanel {

    /**
     * Creates new form PanelPredikatAturan
     */
    private TableModelPredikat tableModel;
    private PanelDiagnosa panelDiagnosa;
    private FrameMain frameMain;

    public PanelPredikatAturan(FrameMain frameMain, PanelDiagnosa panelDiagnosa) {
        initComponents();

        this.frameMain = frameMain;
        this.panelDiagnosa = panelDiagnosa;

        tableModel = new TableModelPredikat();
        table.setRowHeight(25);
    }

    public void setData() {

        List<WeightAverage> list = panelDiagnosa.getListRule();
        Collections.sort(list, new Comparator<WeightAverage>() {

            @Override
            public int compare(WeightAverage o1, WeightAverage o2) {
                return o1.getKode().compareTo(o2.getKode());
            }
        });
        tableModel.setList(panelDiagnosa.getListRule());
        table.setModel(tableModel);
        table.setRowSorter(tableModel.getSorter());

        new swingx.component.table.renderer.TableColumnSizeRenderer().setRenderSizeColumn(table, JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(1).setPreferredWidth(60);

        table.getColumnModel().getColumn(0).setCellRenderer(new TableCellColorAlignmentRenderer(JLabel.CENTER));
        table.getColumnModel().getColumn(1).setCellRenderer(new TableCellColorAlignmentRenderer(JLabel.CENTER));
        table.getColumnModel().getColumn(2).setCellRenderer(new TableCellColorAlignmentRenderer(JLabel.CENTER));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Perhitungan Predikat Aturan");

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

        jPanel2.setOpaque(false);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistem/pakar/resources/back.png"))); // NOI18N
        jButton5.setText("Kembali");
        jButton5.setPreferredSize(new java.awt.Dimension(120, 35));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        panelDiagnosa.showPanel("card3");
        panelDiagnosa.showMenu("menu1");
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
