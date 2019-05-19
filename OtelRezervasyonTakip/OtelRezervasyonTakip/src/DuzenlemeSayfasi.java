
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DuzenlemeSayfasi extends javax.swing.JFrame {

    DefaultTableModel dtm = new DefaultTableModel();
    DefaultListModel dlm = new DefaultListModel();
    ArrayList<Musteri> List = new ArrayList();
    ArrayList<AyrilanMusteri> Ayrilanlar = new ArrayList();
    
    public DuzenlemeSayfasi(ArrayList<Musteri> Liste) {
        initComponents();
        this.getContentPane().setBackground(Color.cyan.darker());
        this.setLocationRelativeTo(this);
       
        List = Liste;
        String[] data = {"Ad", "Soyad", "TC", "Oda NO"};
        dtm.setColumnIdentifiers(data);

        for (Musteri musteri : List) {
            String[] veri = {musteri.ad, musteri.soyad, musteri.tcKimlikNo, musteri.odaNumarasi};
            dtm.addRow(veri);
        }
        tbl_table.setModel(dtm);
    }

    public DuzenlemeSayfasi(ArrayList<Musteri> Liste, ArrayList<AyrilanMusteri> Liste2) {
        initComponents();
        this.getContentPane().setBackground(Color.cyan.darker());
        this.setLocationRelativeTo(this);
        dlm.setSize(0);
        for (AyrilanMusteri musteri : Liste2) {
            dlm.addElement("TC numarası " + musteri.tcKimlikNo + " olan müşteriden alınacak ücret " + Integer.parseInt(musteri.maliyet) * 85 + " TL'dir.");
            
        }
        jList1.setModel(dlm);
        Ayrilanlar = Liste2;
        List = Liste;
        String[] data = {"Ad", "Soyad", "TC", "Oda NO"};
        dtm.setColumnIdentifiers(data);

        for (Musteri musteri : List) {
            String[] veri = {musteri.ad, musteri.soyad, musteri.tcKimlikNo, musteri.odaNumarasi};
            dtm.addRow(veri);
        }
        tbl_table.setModel(dtm);
    }

    public DuzenlemeSayfasi() {
        initComponents();
        this.getContentPane().setBackground(Color.cyan.darker());
        this.setLocationRelativeTo(this);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_sorgula = new javax.swing.JButton();
        btn_sil = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_table = new javax.swing.JTable();
        btn_geri = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_sorgula.setText("TC ile Sorgula");
        btn_sorgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sorgulaActionPerformed(evt);
            }
        });

        btn_sil.setText("Seçilen Müşteriyi KaydnıSil");
        btn_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_silActionPerformed(evt);
            }
        });

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
        jScrollPane1.setViewportView(tbl_table);

        btn_geri.setText("Kayıt Sayfasına Dön");
        btn_geri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_geriActionPerformed(evt);
            }
        });

        jLabel1.setText("Kaldığı Gün Sayısı");

        jButton1.setText("Çıkış Al");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jList1);

        jButton2.setText("Tablo Yenile");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_sil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_sorgula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_geri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_sil)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_geri))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_sorgula)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jLabel1)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_silActionPerformed
        // TODO add your handling code here:
        if (!(List.isEmpty())) {
            for (Musteri musteri : List) {
                if (musteri.tcKimlikNo.equals(dtm.getValueAt(tbl_table.getSelectedRow(), 2).toString())) {
                    List.remove(musteri);
                    break;
                }
            }
            dtm.removeRow(tbl_table.getSelectedRow());
            //dtm.removeRow(Integer.parseInt(jList1.getSelectedValuesList());
            tbl_table.setModel(dtm);
        }

    }//GEN-LAST:event_btn_silActionPerformed

    private void btn_sorgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sorgulaActionPerformed

        boolean kontrol = false;
        for (Musteri musteri : List) {

            if (musteri.tcKimlikNo.equals(jTextField1.getText())) {
                dtm.setRowCount(0);
                String[] veri = {musteri.ad, musteri.soyad, musteri.tcKimlikNo, musteri.odaNumarasi};
                dtm.addRow(veri);
                tbl_table.setModel(dtm);
                kontrol = true;
            }

        }

        if (kontrol == false) {
            JOptionPane.showMessageDialog(this, "Müşteri bulunamadı.");
        }
        
    }//GEN-LAST:event_btn_sorgulaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dtm.setRowCount(0);
        for (Musteri musteri : List) {
            String[] veri = {musteri.ad, musteri.soyad, musteri.tcKimlikNo, musteri.odaNumarasi};
            dtm.addRow(veri);
        }
        tbl_table.setModel(dtm);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        if (!(jTextField2.getText().isEmpty())) {//veya tablonun secılı olup olmaması
            for (Musteri musteri : List) {
                if (dtm.getValueAt(tbl_table.getSelectedRow(), 2).toString().equals(musteri.tcKimlikNo)) {
                    AyrilanMusteri musteri2 = new AyrilanMusteri();
                    musteri2.ad = musteri.ad;
                    musteri2.soyad = musteri.soyad;
                    musteri2.odaNumarasi = musteri.odaNumarasi;
                    musteri2.tcKimlikNo = musteri.tcKimlikNo;
                    musteri2.maliyet = jTextField2.getText();
                    Ayrilanlar.add(musteri2);

                    dlm.addElement("TC numarası " + musteri.tcKimlikNo + " olan müşteriden alınacak ücret " + Integer.parseInt(jTextField2.getText()) * 85 + " TL'dir.");

                    jList1.setModel(dlm);
                    List.remove(musteri);
                    dtm.removeRow(tbl_table.getSelectedRow());
                    break;
                }
            }
            jList1.setModel(dlm);

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_geriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_geriActionPerformed

        this.setVisible(false);
        new Kayıt(List, Ayrilanlar).setVisible(true);
    }//GEN-LAST:event_btn_geriActionPerformed
    
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
            java.util.logging.Logger.getLogger(DuzenlemeSayfasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DuzenlemeSayfasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DuzenlemeSayfasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DuzenlemeSayfasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DuzenlemeSayfasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_geri;
    private javax.swing.JButton btn_sil;
    private javax.swing.JButton btn_sorgula;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable tbl_table;
    // End of variables declaration//GEN-END:variables
}
