/*
 * Netbeans 8.0 
 * JDK 1.7  
 */
package sistem.pakar.view;

import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import sistem.pakar.sugeno.WeightAverage;

/**
 *
 * @author casper
 */
public class PanelDiagnosa extends javax.swing.JPanel {

    /**
     * Creates new form PanelDiagnosa
     */
    private FrameMain frameMain;
    private PanelNilaiIntesitas panelNilaiIntesitas;
    private PanelGejala panelGejala;
    private PanelNilaiDerajatKeanggotaan panelNilaiDerajatKeanggotaan;
    private PanelPredikatAturan panelPredikatAturan;
    private PanelHasil panelHasil;
    private PanelPerilaku panelPerilaku;
    private PanelPasien panelPasien;

    List<WeightAverage> listRule;

    public PanelDiagnosa(FrameMain frameMain) {
        initComponents();
        this.frameMain = frameMain;

        listRule = new ArrayList<>();

        panelNilaiIntesitas = new PanelNilaiIntesitas(frameMain, this);
        panelGejala = new PanelGejala(frameMain, this);
        panelNilaiDerajatKeanggotaan = new PanelNilaiDerajatKeanggotaan(frameMain, this);
        panelPredikatAturan = new PanelPredikatAturan(frameMain, this);
        panelHasil = new PanelHasil(frameMain, this);
        panelPerilaku = new PanelPerilaku(frameMain);
        panelPasien = new PanelPasien(frameMain, this);

        panelNilaiIntesitas.setOpaque(false);
        panelGejala.setOpaque(false);
        panelNilaiDerajatKeanggotaan.setOpaque(false);
        panelPredikatAturan.setOpaque(false);
        panelHasil.setOpaque(false);
        panelPerilaku.setOpaque(false);
        panelPasien.setOpaque(false);

        jPanel3.add(panelGejala, "card1");
        jPanel3.add(panelNilaiIntesitas, "card2");
        jPanel3.add(panelNilaiDerajatKeanggotaan, "card3");
        jPanel3.add(panelPredikatAturan, "card4");
        jPanel3.add(panelHasil, "card5");
        jPanel3.add(panelPerilaku, "card6");
        jPanel3.add(panelPasien, "card7");
    }

    public void showPanel(String panel) {
        ((CardLayout) jPanel3.getLayout()).show(jPanel3, panel);
    }

    public void showMenu(String panel) {
        ((CardLayout) panelMenu.getLayout()).show(panelMenu, panel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iPanel1 = new sistem.pakar.component.IPanel();
        iPanel3 = new sistem.pakar.component.IPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        buttonMenuUtama = new sistem.pakar.component.IButton();
        buttonPerilaku = new sistem.pakar.component.IButton();
        buttonBantuan = new sistem.pakar.component.IButton();
        jPanel2 = new javax.swing.JPanel();
        buttonMenuUtama1 = new sistem.pakar.component.IButton();
        jPanel4 = new javax.swing.JPanel();
        buttonMenuUtama2 = new sistem.pakar.component.IButton();
        buttonPerilaku1 = new sistem.pakar.component.IButton();
        buttonBantuan1 = new sistem.pakar.component.IButton();

        setLayout(new java.awt.BorderLayout());

        iPanel1.setBackgroundImage(new javax.swing.ImageIcon(getClass().getResource("/sistem/pakar/resources/bg-1.jpg"))); // NOI18N

        iPanel3.setBackgroundImage(new javax.swing.ImageIcon(getClass().getResource("/sistem/pakar/resources/BANNER.png"))); // NOI18N
        iPanel3.setOpaque(false);

        javax.swing.GroupLayout iPanel3Layout = new javax.swing.GroupLayout(iPanel3);
        iPanel3.setLayout(iPanel3Layout);
        iPanel3Layout.setHorizontalGroup(
            iPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 668, Short.MAX_VALUE)
        );
        iPanel3Layout.setVerticalGroup(
            iPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

        jLabel8.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("MENU");

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.CardLayout());

        panelMenu.setOpaque(false);
        panelMenu.setLayout(new java.awt.CardLayout());

        jPanel1.setOpaque(false);

        buttonMenuUtama.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistem/pakar/resources/home-1.png"))); // NOI18N
        buttonMenuUtama.setText("Menu Utama");
        buttonMenuUtama.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonMenuUtama.setPreferredSize(new java.awt.Dimension(173, 41));
        buttonMenuUtama.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/sistem/pakar/resources/home-2.png"))); // NOI18N
        buttonMenuUtama.setRoundRect(true);
        buttonMenuUtama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMenuUtamaActionPerformed(evt);
            }
        });
        jPanel1.add(buttonMenuUtama);

        buttonPerilaku.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistem/pakar/resources/people-1.png"))); // NOI18N
        buttonPerilaku.setText("Perilaku Abnormal");
        buttonPerilaku.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonPerilaku.setPreferredSize(new java.awt.Dimension(173, 41));
        buttonPerilaku.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/sistem/pakar/resources/people-2.png"))); // NOI18N
        buttonPerilaku.setRoundRect(true);
        buttonPerilaku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPerilakuActionPerformed(evt);
            }
        });
        jPanel1.add(buttonPerilaku);

        buttonBantuan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistem/pakar/resources/help-1.png"))); // NOI18N
        buttonBantuan.setText("Bantuan");
        buttonBantuan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonBantuan.setPreferredSize(new java.awt.Dimension(173, 41));
        buttonBantuan.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/sistem/pakar/resources/help-2.png"))); // NOI18N
        buttonBantuan.setRoundRect(true);
        jPanel1.add(buttonBantuan);

        panelMenu.add(jPanel1, "menu1");

        jPanel2.setOpaque(false);

        buttonMenuUtama1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistem/pakar/resources/back-1.png"))); // NOI18N
        buttonMenuUtama1.setText("Kembali");
        buttonMenuUtama1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonMenuUtama1.setPreferredSize(new java.awt.Dimension(173, 41));
        buttonMenuUtama1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/sistem/pakar/resources/back-2.png"))); // NOI18N
        buttonMenuUtama1.setRoundRect(true);
        buttonMenuUtama1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMenuUtama1ActionPerformed(evt);
            }
        });
        jPanel2.add(buttonMenuUtama1);

        panelMenu.add(jPanel2, "menu2");

        jPanel4.setOpaque(false);

        buttonMenuUtama2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistem/pakar/resources/home-1.png"))); // NOI18N
        buttonMenuUtama2.setText("Menu Utama");
        buttonMenuUtama2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonMenuUtama2.setPreferredSize(new java.awt.Dimension(173, 41));
        buttonMenuUtama2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/sistem/pakar/resources/home-2.png"))); // NOI18N
        buttonMenuUtama2.setRoundRect(true);
        buttonMenuUtama2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMenuUtama2ActionPerformed(evt);
            }
        });
        jPanel4.add(buttonMenuUtama2);

        buttonPerilaku1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistem/pakar/resources/save-1.png"))); // NOI18N
        buttonPerilaku1.setText("Print Laporan");
        buttonPerilaku1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonPerilaku1.setPreferredSize(new java.awt.Dimension(173, 41));
        buttonPerilaku1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/sistem/pakar/resources/save-2.png"))); // NOI18N
        buttonPerilaku1.setRoundRect(true);
        buttonPerilaku1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPerilaku1ActionPerformed(evt);
            }
        });
        jPanel4.add(buttonPerilaku1);

        buttonBantuan1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistem/pakar/resources/help-1.png"))); // NOI18N
        buttonBantuan1.setText("Bantuan");
        buttonBantuan1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonBantuan1.setPreferredSize(new java.awt.Dimension(173, 41));
        buttonBantuan1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/sistem/pakar/resources/help-2.png"))); // NOI18N
        buttonBantuan1.setRoundRect(true);
        jPanel4.add(buttonBantuan1);

        panelMenu.add(jPanel4, "menu3");

        javax.swing.GroupLayout iPanel1Layout = new javax.swing.GroupLayout(iPanel1);
        iPanel1.setLayout(iPanel1Layout);
        iPanel1Layout.setHorizontalGroup(
            iPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(iPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(iPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addGap(10, 10, 10))
                    .addGroup(iPanel1Layout.createSequentialGroup()
                        .addGroup(iPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(iPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(iPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        iPanel1Layout.setVerticalGroup(
            iPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(iPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(iPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 196, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        add(iPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonMenuUtamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMenuUtamaActionPerformed
        frameMain.setPanel(new PanelMain(frameMain));
    }//GEN-LAST:event_buttonMenuUtamaActionPerformed

    private void buttonPerilakuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPerilakuActionPerformed
        showPanel("card6");
        showMenu("menu2");
    }//GEN-LAST:event_buttonPerilakuActionPerformed

    private void buttonMenuUtama1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMenuUtama1ActionPerformed
        frameMain.setPanel(new PanelMain(frameMain));
    }//GEN-LAST:event_buttonMenuUtama1ActionPerformed

    private void buttonMenuUtama2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMenuUtama2ActionPerformed
        buttonMenuUtama1ActionPerformed(evt);
    }//GEN-LAST:event_buttonMenuUtama2ActionPerformed

    private void buttonPerilaku1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPerilaku1ActionPerformed
        showPanel("card7");
        showMenu("menu3");
    }//GEN-LAST:event_buttonPerilaku1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private sistem.pakar.component.IButton buttonBantuan;
    private sistem.pakar.component.IButton buttonBantuan1;
    private sistem.pakar.component.IButton buttonMenuUtama;
    private sistem.pakar.component.IButton buttonMenuUtama1;
    private sistem.pakar.component.IButton buttonMenuUtama2;
    private sistem.pakar.component.IButton buttonPerilaku;
    private sistem.pakar.component.IButton buttonPerilaku1;
    private sistem.pakar.component.IPanel iPanel1;
    private sistem.pakar.component.IPanel iPanel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelMenu;
    // End of variables declaration//GEN-END:variables

    public PanelNilaiIntesitas getPanelNilaiIntesitas() {
        return panelNilaiIntesitas;
    }

    public PanelGejala getPanelGejala() {
        return panelGejala;
    }

    public PanelNilaiDerajatKeanggotaan getPanelNilaiDerajatKeanggotaan() {
        return panelNilaiDerajatKeanggotaan;
    }

    public PanelPredikatAturan getPanelPredikatAturan() {
        return panelPredikatAturan;
    }

    public PanelHasil getPanelHasil() {
        return panelHasil;
    }

    public List<WeightAverage> getListRule() {
        return listRule;
    }

    public void setListRule(List<WeightAverage> listRule) {
        this.listRule = listRule;
    }

}