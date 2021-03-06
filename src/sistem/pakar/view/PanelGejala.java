/*
 * Netbeans 8.0 
 * JDK 1.7  
 */
package sistem.pakar.view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import sistem.pakar.component.TableModelGejala;
import sistem.pakar.sugeno.Gejala;
import sistem.pakar.sugeno.inferensi.Perilaku;
import swingx.component.table.renderer.TableCellColorAlignmentRenderer;
import swingx.component.table.renderer.TableCellColorRenderer;

/**
 *
 * @author casper
 */
public class PanelGejala extends javax.swing.JPanel {

    /**
     * Creates new form PanelNilaiDerajatKeanggotaan
     */
    private PanelDiagnosa panelDiagnosa;
    private TableModelGejala tableModel;

    public PanelGejala(PanelDiagnosa panelDiagnosa) {
        initComponents();
        this.panelDiagnosa = panelDiagnosa;
        tableModel = new TableModelGejala();

        Perilaku perilaku = new Perilaku();
        List<Gejala>[] list = perilaku.getListCiri();

        List<Gejala> vList = new ArrayList<>();
        for (int i = 0; i < list.length; i++) {
            vList.addAll(list[i]);
        }

        tableModel.setList(vList);
        table.setModel(tableModel);

        new swingx.component.table.renderer.TableColumnSizeRenderer().setRenderSizeColumn(table, JTable.AUTO_RESIZE_OFF);

        table.getColumnModel().getColumn(1).setCellRenderer(new TableCellColorAlignmentRenderer(JLabel.CENTER));
        table.getColumnModel().getColumn(2).setCellRenderer(new TableCellColorRenderer());
        table.getColumnModel().getColumn(1).setPreferredWidth(50);
        table.getColumnModel().getColumn(0).setPreferredWidth(35);

        table.setRowHeight(25);
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
        jPanel1 = new javax.swing.JPanel();
        buttonProses = new javax.swing.JButton();
        buttonReset = new javax.swing.JButton();

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
        jLabel1.setText("Pilih Data Gejala");

        jPanel1.setOpaque(false);

        buttonProses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistem/pakar/resources/process.png"))); // NOI18N
        buttonProses.setText("Proses");
        buttonProses.setPreferredSize(new java.awt.Dimension(120, 35));
        buttonProses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProsesActionPerformed(evt);
            }
        });
        jPanel1.add(buttonProses);

        buttonReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistem/pakar/resources/undo.png"))); // NOI18N
        buttonReset.setText("Reset");
        buttonReset.setPreferredSize(new java.awt.Dimension(120, 35));
        buttonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonResetActionPerformed(evt);
            }
        });
        jPanel1.add(buttonReset);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProsesActionPerformed
        int jumlah = 0;
        for (Gejala e : tableModel.getList()) {
            if (e.isSelected()) {
                jumlah++;
            }
        }

        if (jumlah == 0) {
            JOptionPane.showMessageDialog(panelDiagnosa, "silakan memilih gejala terlebih dahulu ", "SISTEM PAKAR", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        panelDiagnosa.getPanelNilaiIntesitas().setData(tableModel.getList());
        panelDiagnosa.showPanel("card2");
        panelDiagnosa.showMenu("menu11");
    }//GEN-LAST:event_buttonProsesActionPerformed

    private void buttonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResetActionPerformed
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            Gejala e = tableModel.get(i);
            e.setSelected(false);
            tableModel.update(i, e);
        }
    }//GEN-LAST:event_buttonResetActionPerformed

    public List<Gejala> getList() {
        return tableModel.getList();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonProses;
    private javax.swing.JButton buttonReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

}
