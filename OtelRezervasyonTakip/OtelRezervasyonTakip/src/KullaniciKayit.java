/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahmett
 */
public class KullaniciKayit extends javax.swing.JFrame {

    /**
     * Creates new form KullaniciKayit
     */
    public KullaniciKayit() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_odanumarasi = new javax.swing.JLabel();
        lbl_rez = new javax.swing.JLabel();
        lbl_ad = new javax.swing.JLabel();
        lbl_soyad = new javax.swing.JLabel();
        lbltc = new javax.swing.JLabel();
        txt_adi = new javax.swing.JTextField();
        txt_soyadi = new javax.swing.JTextField();
        txt_tc = new javax.swing.JTextField();
        btn_kayit = new javax.swing.JButton();
        cmbx_odanumarasi = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_odanumarasi.setText("Oda Numarası:");

        lbl_rez.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        lbl_rez.setText("Nizam Motel Rezervasyon");

        lbl_ad.setText("Adı:");

        lbl_soyad.setText("Soyadı:");

        lbltc.setText("TC Kimlik No. :");

        btn_kayit.setText("Kayıt");
        btn_kayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kayitActionPerformed(evt);
            }
        });

        cmbx_odanumarasi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "101", "102", "103", "104", "105", "106" }));
        cmbx_odanumarasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbx_odanumarasiActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel1.setText("Kullanıcı Kaydı");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel1)
                .addContainerGap(128, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(lbltc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbl_soyad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbl_ad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(lbl_odanumarasi))
                                    .addGap(36, 36, 36)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cmbx_odanumarasi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_tc)
                                        .addComponent(txt_soyadi)
                                        .addComponent(txt_adi)))
                                .addComponent(btn_kayit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(196, 196, 196))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_rez)))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addContainerGap(263, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(lbl_rez)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_ad)
                        .addComponent(txt_adi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_soyad)
                        .addComponent(txt_soyadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbltc)
                        .addComponent(txt_tc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbx_odanumarasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_odanumarasi))
                    .addGap(18, 18, 18)
                    .addComponent(btn_kayit, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(5, 5, 5)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_kayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kayitActionPerformed
        // TODO add your handling code here:
        boolean kontrol = true;
        boolean kontrol2=true;
        for (Musteri musteri : Liste) {
            if (musteri.odaNumarasi.equals(cmbx_odanumarasi.getSelectedItem().toString())) {
                kontrol = false;
                JOptionPane.showMessageDialog(this, "Aynı odaya birden fazla kayıt yapılamaz.");
            } else if (musteri.tcKimlikNo.equals(txt_tc.getText())) {
                kontrol = false;
                JOptionPane.showMessageDialog(this, "Aynı TC kimlikle birden fazla kayıt yapılamaz.");

            }
        }

        if (kontrol) {
            Musteri m1 = new Musteri();
            m1.ad = txt_adi.getText();
            m1.soyad = txt_soyadi.getText();
            Pattern p = Pattern.compile("[0-9]");
            Matcher matcher = p.matcher(txt_tc.getText());
            if (matcher.find()) {
                m1.tcKimlikNo = txt_tc.getText();
                kontrol2=false;
            } else {
                kontrol=false;
                JOptionPane.showMessageDialog(this, "Tc Kimlik bölümünü sayı olarak giriniz");
            }
            m1.odaNumarasi = cmbx_odanumarasi.getSelectedItem().toString();
            if (!(txt_adi.getText().isEmpty() || txt_soyadi.getText().isEmpty() || kontrol2 || cmbx_odanumarasi.getSelectedItem().toString().isEmpty())) {
                Liste.add(m1);
                System.out.println();
                JOptionPane.showMessageDialog(this, "Kaydınız başarılıdır.");
            } else {
                //                JOptionPane.showMessageDialog(this, "Boş alan bırakılamaz.");
            }
        }

        txt_adi.setText(null);
        txt_soyadi.setText(null);
        txt_tc.setText(null);

    }//GEN-LAST:event_btn_kayitActionPerformed

    private void cmbx_odanumarasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbx_odanumarasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbx_odanumarasiActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KullaniciKayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KullaniciKayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KullaniciKayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KullaniciKayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KullaniciKayit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_kayit;
    private javax.swing.JComboBox<String> cmbx_odanumarasi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_ad;
    private javax.swing.JLabel lbl_odanumarasi;
    private javax.swing.JLabel lbl_rez;
    private javax.swing.JLabel lbl_soyad;
    private javax.swing.JLabel lbltc;
    private javax.swing.JTextField txt_adi;
    private javax.swing.JTextField txt_soyadi;
    private javax.swing.JTextField txt_tc;
    // End of variables declaration//GEN-END:variables
}
