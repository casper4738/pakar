/*
 * Netbeans 8.0 
 * JDK 1.7  
 */
package sistem.pakar.view;

import java.awt.CardLayout;
import javax.swing.JTabbedPane;

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
    private PanelFuzzyfikasi panelFuzzyfikazi;
    private PanelInferensi panelInferensi;
    private PanelDeffuzyfikasi panelDeffuzyfikasi;
    private PanelHasil panelHasil;
    private PanelPerilaku panelPerilaku;
    private PanelPasien panelPasien;
    private PanelBantuan panelBantuan;
    private PanelAdmin panelAdmin;
    
    public PanelDiagnosa(FrameMain frameMain) {
        initComponents();
       
        this.frameMain = frameMain;
        
        tabbedPane = new JTabbedPane();
        
        
        panelGejala = new PanelGejala(this);
        panelNilaiIntesitas = new PanelNilaiIntesitas(this);
        panelHasil = new PanelHasil(this);
        panelFuzzyfikazi = new PanelFuzzyfikasi();
        panelInferensi = new PanelInferensi();
        panelDeffuzyfikasi = new PanelDeffuzyfikasi();
        
        panelPerilaku = new PanelPerilaku(frameMain);
        panelPasien = new PanelPasien(frameMain, this);
        panelBantuan = new PanelBantuan(frameMain, this);
        panelAdmin = new PanelAdmin(frameMain);
        
        panelNilaiIntesitas.setOpaque(false);
        panelGejala.setOpaque(false);
        panelFuzzyfikazi.setOpaque(false);
        panelHasil.setOpaque(false);
        panelPerilaku.setOpaque(false);
        panelPasien.setOpaque(false);
        panelBantuan.setOpaque(false);
        panelInferensi.setOpaque(false);
        panelAdmin.setOpaque(false);
        
        tabbedPane.addTab("TABEL FUZZYFIKASI", panelFuzzyfikazi);
        tabbedPane.addTab("TABEL INFERENSI", panelInferensi);
        tabbedPane.addTab("TABEL DEFFUZIKAZY", panelDeffuzyfikasi);
        
        tabbedPane.setOpaque(false);
        
        jPanel3.add(panelGejala, "card1");
        jPanel3.add(panelNilaiIntesitas, "card2");
        jPanel3.add(tabbedPane, "card3");
        jPanel3.add(panelHasil, "card4");
        jPanel3.add(panelPasien, "card5");
        jPanel3.add(panelPerilaku, "card6");
        jPanel3.add(panelBantuan, "card7");
        jPanel3.add(panelAdmin, "card8");

//        iPanel1.setBackgroundImage(new javax.swing.ImageIcon(getClass().getResource("/sistem/pakar/resources/BACKGROUNG1.jpg"))); // NOI18N
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
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        buttonMenuUtama1 = new sistem.pakar.component.IButton();
        buttonAdmin1 = new sistem.pakar.component.IButton();
        jPanel11 = new javax.swing.JPanel();
        buttonMenuUtama2 = new sistem.pakar.component.IButton();
        buttonAdmin2 = new sistem.pakar.component.IButton();
        jPanel2 = new javax.swing.JPanel();
        buttonKembali1 = new sistem.pakar.component.IButton();
        jPanel4 = new javax.swing.JPanel();
        buttonMenuUtama3 = new sistem.pakar.component.IButton();
        jPanel5 = new javax.swing.JPanel();
        buttonKembali2 = new sistem.pakar.component.IButton();
        jPanel6 = new javax.swing.JPanel();
        buttonKembali3 = new sistem.pakar.component.IButton();
        jPanel7 = new javax.swing.JPanel();
        buttonKembali4 = new sistem.pakar.component.IButton();
        iPanelBg1 = new sistem.pakar.component.IPanelBg();
        iPanelBg2 = new sistem.pakar.component.IPanelBg();

        setLayout(new java.awt.BorderLayout());

        jLabel8.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("MENU");

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.CardLayout());

        panelMenu.setOpaque(false);
        panelMenu.setLayout(new java.awt.CardLayout());

        jPanel1.setOpaque(false);

        buttonMenuUtama1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistem/pakar/resources/home-1.png"))); // NOI18N
        buttonMenuUtama1.setText("Menu Utama");
        buttonMenuUtama1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonMenuUtama1.setPreferredSize(new java.awt.Dimension(173, 41));
        buttonMenuUtama1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/sistem/pakar/resources/home-2.png"))); // NOI18N
        buttonMenuUtama1.setRoundRect(true);
        buttonMenuUtama1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMenuUtama1ActionPerformed(evt);
            }
        });
        jPanel1.add(buttonMenuUtama1);

        buttonAdmin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistem/pakar/resources/admin.png"))); // NOI18N
        buttonAdmin1.setText("Data Admin");
        buttonAdmin1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonAdmin1.setPreferredSize(new java.awt.Dimension(173, 41));
        buttonAdmin1.setRoundRect(true);
        buttonAdmin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdmin1ActionPerformed(evt);
            }
        });
        jPanel1.add(buttonAdmin1);

        panelMenu.add(jPanel1, "menu1");

        jPanel11.setOpaque(false);

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
        jPanel11.add(buttonMenuUtama2);

        buttonAdmin2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistem/pakar/resources/admin.png"))); // NOI18N
        buttonAdmin2.setText("Data Admin");
        buttonAdmin2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonAdmin2.setPreferredSize(new java.awt.Dimension(173, 41));
        buttonAdmin2.setRoundRect(true);
        buttonAdmin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdmin2ActionPerformed(evt);
            }
        });
        jPanel11.add(buttonAdmin2);

        panelMenu.add(jPanel11, "menu11");

        jPanel2.setOpaque(false);

        buttonKembali1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistem/pakar/resources/back-1.png"))); // NOI18N
        buttonKembali1.setText("Kembali");
        buttonKembali1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonKembali1.setPreferredSize(new java.awt.Dimension(173, 41));
        buttonKembali1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/sistem/pakar/resources/back-2.png"))); // NOI18N
        buttonKembali1.setRoundRect(true);
        buttonKembali1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKembali1ActionPerformed(evt);
            }
        });
        jPanel2.add(buttonKembali1);

        panelMenu.add(jPanel2, "menu2");

        jPanel4.setOpaque(false);

        buttonMenuUtama3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistem/pakar/resources/home-1.png"))); // NOI18N
        buttonMenuUtama3.setText("Menu Utama");
        buttonMenuUtama3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonMenuUtama3.setPreferredSize(new java.awt.Dimension(173, 41));
        buttonMenuUtama3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/sistem/pakar/resources/home-2.png"))); // NOI18N
        buttonMenuUtama3.setRoundRect(true);
        buttonMenuUtama3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMenuUtama3ActionPerformed(evt);
            }
        });
        jPanel4.add(buttonMenuUtama3);

        panelMenu.add(jPanel4, "menu3");

        jPanel5.setOpaque(false);

        buttonKembali2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistem/pakar/resources/back-1.png"))); // NOI18N
        buttonKembali2.setText("Kembali");
        buttonKembali2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonKembali2.setPreferredSize(new java.awt.Dimension(173, 41));
        buttonKembali2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/sistem/pakar/resources/back-2.png"))); // NOI18N
        buttonKembali2.setRoundRect(true);
        buttonKembali2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKembali2ActionPerformed(evt);
            }
        });
        jPanel5.add(buttonKembali2);

        panelMenu.add(jPanel5, "menu4");

        jPanel6.setOpaque(false);

        buttonKembali3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistem/pakar/resources/back-1.png"))); // NOI18N
        buttonKembali3.setText("Kembali");
        buttonKembali3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonKembali3.setPreferredSize(new java.awt.Dimension(173, 41));
        buttonKembali3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/sistem/pakar/resources/back-2.png"))); // NOI18N
        buttonKembali3.setRoundRect(true);
        buttonKembali3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKembali3ActionPerformed(evt);
            }
        });
        jPanel6.add(buttonKembali3);

        panelMenu.add(jPanel6, "menu6");

        jPanel7.setOpaque(false);

        buttonKembali4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistem/pakar/resources/back-1.png"))); // NOI18N
        buttonKembali4.setText("Kembali");
        buttonKembali4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonKembali4.setPreferredSize(new java.awt.Dimension(173, 41));
        buttonKembali4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/sistem/pakar/resources/back-2.png"))); // NOI18N
        buttonKembali4.setRoundRect(true);
        buttonKembali4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKembali4ActionPerformed(evt);
            }
        });
        jPanel7.add(buttonKembali4);

        panelMenu.add(jPanel7, "menu7");

        iPanelBg1.setBackgroundImage(new javax.swing.ImageIcon(getClass().getResource("/sistem/pakar/resources/gambar judul.png"))); // NOI18N
        iPanelBg1.setOpaque(false);

        javax.swing.GroupLayout iPanelBg1Layout = new javax.swing.GroupLayout(iPanelBg1);
        iPanelBg1.setLayout(iPanelBg1Layout);
        iPanelBg1Layout.setHorizontalGroup(
            iPanelBg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 658, Short.MAX_VALUE)
        );
        iPanelBg1Layout.setVerticalGroup(
            iPanelBg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        iPanelBg2.setBackgroundImage(new javax.swing.ImageIcon(getClass().getResource("/sistem/pakar/resources/02.png"))); // NOI18N
        iPanelBg2.setOpaque(false);

        javax.swing.GroupLayout iPanelBg2Layout = new javax.swing.GroupLayout(iPanelBg2);
        iPanelBg2.setLayout(iPanelBg2Layout);
        iPanelBg2Layout.setHorizontalGroup(
            iPanelBg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        iPanelBg2Layout.setVerticalGroup(
            iPanelBg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout iPanel1Layout = new javax.swing.GroupLayout(iPanel1);
        iPanel1.setLayout(iPanel1Layout);
        iPanel1Layout.setHorizontalGroup(
            iPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iPanel1Layout.createSequentialGroup()
                .addGroup(iPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(iPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(iPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(iPanel1Layout.createSequentialGroup()
                        .addGroup(iPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iPanelBg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(iPanel1Layout.createSequentialGroup()
                                .addGap(164, 164, 164)
                                .addComponent(iPanelBg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(iPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(9, 9, 9))
        );
        iPanel1Layout.setVerticalGroup(
            iPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iPanel1Layout.createSequentialGroup()
                .addGroup(iPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iPanelBg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(iPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(iPanelBg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(iPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addGroup(iPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(iPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(6, 6, 6)
                        .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(iPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonMenuUtama1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMenuUtama1ActionPerformed
        frameMain.setPanel(frameMain.getPanelMenuUtama());
    }//GEN-LAST:event_buttonMenuUtama1ActionPerformed

    private void buttonKembali1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKembali1ActionPerformed
        buttonMenuUtama1ActionPerformed(evt);
    }//GEN-LAST:event_buttonKembali1ActionPerformed

    private void buttonMenuUtama3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMenuUtama3ActionPerformed
        buttonMenuUtama1ActionPerformed(evt);
    }//GEN-LAST:event_buttonMenuUtama3ActionPerformed

    private void buttonKembali2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKembali2ActionPerformed
        showPanel("card4");
        showMenu("menu3");
    }//GEN-LAST:event_buttonKembali2ActionPerformed

    private void buttonAdmin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdmin1ActionPerformed
        panelAdmin.setData();
        showPanel("card8");
        showMenu("menu6");
    }//GEN-LAST:event_buttonAdmin1ActionPerformed

    private void buttonKembali3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKembali3ActionPerformed
        showPanel("card1");
        showMenu("menu1");
    }//GEN-LAST:event_buttonKembali3ActionPerformed

    private void buttonMenuUtama2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMenuUtama2ActionPerformed
        buttonMenuUtama1ActionPerformed(evt);
    }//GEN-LAST:event_buttonMenuUtama2ActionPerformed

    private void buttonAdmin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdmin2ActionPerformed
        panelAdmin.setData();
        showPanel("card8");
        showMenu("menu7");
    }//GEN-LAST:event_buttonAdmin2ActionPerformed

    private void buttonKembali4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKembali4ActionPerformed
        showPanel("card2");
        showMenu("menu11");
    }//GEN-LAST:event_buttonKembali4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private sistem.pakar.component.IButton buttonAdmin1;
    private sistem.pakar.component.IButton buttonAdmin2;
    private sistem.pakar.component.IButton buttonKembali1;
    private sistem.pakar.component.IButton buttonKembali2;
    private sistem.pakar.component.IButton buttonKembali3;
    private sistem.pakar.component.IButton buttonKembali4;
    private sistem.pakar.component.IButton buttonMenuUtama1;
    private sistem.pakar.component.IButton buttonMenuUtama2;
    private sistem.pakar.component.IButton buttonMenuUtama3;
    private sistem.pakar.component.IPanel iPanel1;
    private sistem.pakar.component.IPanelBg iPanelBg1;
    private sistem.pakar.component.IPanelBg iPanelBg2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelMenu;
    // End of variables declaration//GEN-END:variables
    private JTabbedPane tabbedPane;
    
    public PanelNilaiIntesitas getPanelNilaiIntesitas() {
        return panelNilaiIntesitas;
    }
    
    public PanelGejala getPanelGejala() {
        return panelGejala;
    }
    
    public PanelFuzzyfikasi getPanelFuzzyfikazi() {
        return panelFuzzyfikazi;
    }
    
    
    public PanelHasil getPanelHasil() {
        return panelHasil;
    }
    
    public PanelInferensi getPanelInferensi() {
        return panelInferensi;
    }
    
    public PanelDeffuzyfikasi getPanelDeffuzyfikasi() {
        return panelDeffuzyfikasi;
    }
    
}
