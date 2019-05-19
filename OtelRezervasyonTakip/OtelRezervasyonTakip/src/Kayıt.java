
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.regex.*;

public class Kayıt extends javax.swing.JFrame {

    DefaultTableModel dtm = new DefaultTableModel();

    ArrayList<Musteri> Liste = new ArrayList();
    ArrayList<AyrilanMusteri> Liste3 = new ArrayList();

    public Kayıt() {
        initComponents();
//        kayitliMusteriler();
        this.getContentPane().setBackground(Color.cyan.darker());
        this.setLocationRelativeTo(this);

        String[] data = {"Ad", "Soyad", "TC", "Oda NO"};
        dtm.setColumnIdentifiers(data);
        tbl_table.setModel(dtm);

    }

//    void tcKimlikKontrol() {
//        Pattern p = Pattern.compile("%d");
//        Matcher matcher = p.matcher(txt_tc.getText());
//        if (matcher.find()) {
//
//        } else {
//            JOptionPane.showMessageDialog(this, "tc numaralı giriniz");
//        }
//    }

    public void kayitliMusteriler() {

        Musteri m1 = new Musteri();
        m1.ad = "Ahmet";
        m1.soyad = "Tekalan";
        m1.tcKimlikNo = "123456789";
        m1.odaNumarasi = "101";
        Liste.add(m1);

        Musteri m2 = new Musteri();
        m2.ad = "Mehmet";
        m2.soyad = "Tekalan";
        m2.tcKimlikNo = "987654321";
        m2.odaNumarasi = "102";
        Liste.add(m2);

        Musteri m3 = new Musteri();
        m3.ad = "Gürkan";
        m3.soyad = "Tekalan";
        m3.tcKimlikNo = "456789123";
        m3.odaNumarasi = "103";
        Liste.add(m3);

    }

    public Kayıt(ArrayList<Musteri> Liste1, ArrayList<AyrilanMusteri> Liste2) {
        Liste = Liste1;
        Liste3 = Liste2;
        initComponents();
        this.getContentPane().setBackground(Color.cyan.darker());
        String[] data = {"Ad", "Soyad", "TC", "Oda NO"};
        dtm.setColumnIdentifiers(data);

        dtm.setRowCount(0);
        for (Musteri musteri : Liste) {
            String[] veri = {musteri.ad, musteri.soyad, musteri.tcKimlikNo, musteri.odaNumarasi};
            dtm.addRow(veri);
        }
        tbl_table.setModel(dtm);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lbl_ad = new javax.swing.JLabel();
        lbl_soyad = new javax.swing.JLabel();
        lbltc = new javax.swing.JLabel();
        txt_adi = new javax.swing.JTextField();
        txt_soyadi = new javax.swing.JTextField();
        txt_tc = new javax.swing.JTextField();
        btn_yenile = new javax.swing.JButton();
        btn_kayit = new javax.swing.JButton();
        cmbx_odanumarasi = new javax.swing.JComboBox<>();
        lbl_odanumarasi = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_table = new javax.swing.JTable();
        btn_duzenlemeSayfasi = new javax.swing.JButton();
        lbl_rez = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_ad.setText("Adı:");

        lbl_soyad.setText("Soyadı:");

        lbltc.setText("TC Kimlik No. :");

        btn_yenile.setText("Yenile");
        btn_yenile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_yenileActionPerformed(evt);
            }
        });

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

        lbl_odanumarasi.setText("Oda Numarası:");

        tbl_table.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tbl_table);

        btn_duzenlemeSayfasi.setText("Düzenleme Sayfasına Geçiş");
        btn_duzenlemeSayfasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_duzenlemeSayfasiActionPerformed(evt);
            }
        });

        lbl_rez.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        lbl_rez.setText("Nizam Motel Rezervasyon");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
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
                            .addComponent(cmbx_odanumarasi, 0, 182, Short.MAX_VALUE)
                            .addComponent(txt_tc)
                            .addComponent(txt_soyadi)
                            .addComponent(txt_adi)))
                    .addComponent(btn_kayit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btn_yenile, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(btn_duzenlemeSayfasi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_rez)
                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lbl_rez, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ad)
                    .addComponent(txt_adi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_yenile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
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
                        .addComponent(btn_kayit, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_duzenlemeSayfasi, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbx_odanumarasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbx_odanumarasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbx_odanumarasiActionPerformed

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

    private void btn_yenileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_yenileActionPerformed

        dtm.setRowCount(0);
        for (Musteri musteri : Liste) {
            String[] veri = {musteri.ad, musteri.soyad, musteri.tcKimlikNo, musteri.odaNumarasi};
            dtm.addRow(veri);
        }
        tbl_table.setModel(dtm);


    }//GEN-LAST:event_btn_yenileActionPerformed

    private void btn_duzenlemeSayfasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_duzenlemeSayfasiActionPerformed

        this.setVisible(false);
        new DuzenlemeSayfasi(Liste, Liste3).setVisible(true);

    }//GEN-LAST:event_btn_duzenlemeSayfasiActionPerformed

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
            java.util.logging.Logger.getLogger(Kayıt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kayıt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kayıt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kayıt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kayıt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_duzenlemeSayfasi;
    private javax.swing.JButton btn_kayit;
    private javax.swing.JButton btn_yenile;
    private javax.swing.JComboBox<String> cmbx_odanumarasi;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_ad;
    private javax.swing.JLabel lbl_odanumarasi;
    private javax.swing.JLabel lbl_rez;
    private javax.swing.JLabel lbl_soyad;
    private javax.swing.JLabel lbltc;
    private javax.swing.JTable tbl_table;
    private javax.swing.JTextField txt_adi;
    private javax.swing.JTextField txt_soyadi;
    private javax.swing.JTextField txt_tc;
    // End of variables declaration//GEN-END:variables
}
