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
import sistem.pakar.component.TableModelInferensi;
import sistem.pakar.component.TableRender1;
import sistem.pakar.component.TableRender2;
import sistem.pakar.sugeno.WeightAverage;
import swingx.component.table.renderer.TableCellAlignmentRenderer;

/**
 *
 * @author casper
 */
public class PanelInferensi extends javax.swing.JPanel {

    /**
     * Creates new form PanelInferensi
     */
    private TableModelInferensi tableModel;
    private PanelDiagnosa panelDiagnosa;
    private FrameMain frameMain;

    public PanelInferensi(FrameMain frameMain, PanelDiagnosa panelDiagnosa) {
        initComponents();

        this.frameMain = frameMain;
        this.panelDiagnosa = panelDiagnosa;
        tableModel = new TableModelInferensi();
        table.setModel(tableModel);
    }

    public void setData() {

        List<WeightAverage> list = panelDiagnosa.getListRule();
        Collections.sort(list, new Comparator<WeightAverage>() {

            @Override
            public int compare(WeightAverage o1, WeightAverage o2) {
                return o1.getKode().compareTo(o2.getKode());
            }
        });
        tableModel.setList(list);

        table.setModel(tableModel);
        table.setRowSorter(tableModel.getSorter());

        table.setRowHeight(75);
        new swingx.component.table.renderer.TableColumnSizeRenderer().setRenderSizeColumn(table, JTable.AUTO_RESIZE_OFF);
//        table.getColumnModel().getColumn(1).setPreferredWidth(60);

//        table.getColumnModel().getColumn(0).setCellRenderer(new TableCellColorAlignmentRenderer(JLabel.CENTER));
        table.getColumnModel().getColumn(1).setCellRenderer(new TableRender1());

        table.getColumnModel().getColumn(0).setCellRenderer(new TableCellAlignmentRenderer(JLabel.CENTER));
        table.getColumnModel().getColumn(2).setCellRenderer(new TableCellAlignmentRenderer(JLabel.CENTER));
        table.getColumnModel().getColumn(3).setCellRenderer(new TableCellAlignmentRenderer(JLabel.CENTER));
        table.getColumnModel().getColumn(4).setCellRenderer(new TableCellAlignmentRenderer(JLabel.CENTER));
        table.getColumnModel().getColumn(1).setPreferredWidth(400);

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
        jLabel1.setText("<html><center>\nPROSES INFERENSI <br>\nPENETUAN NILAI MIN. A-PREDIKAT DAN Z\n</html>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
