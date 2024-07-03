/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasijualrumah;

/**
 *
 * @author sulai
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        // Inisialisasi komponen GUI ketika frame dibuat
         
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
        cbjnsrmh = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfhrg = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfktrngn = new javax.swing.JTextArea();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jCheckBox4 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        hapuspilihanButton = new javax.swing.JButton();
        tampilkanButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Jual Beli Rumah");

        cbjnsrmh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "Tipe 36 (2 Kamar)", "Tipe 36 (Taman)", "Tipe 36 (3 Kamar)", "Tipe 36 (1 Lantai)", "Tipe 36 (2 Lantai)" }));
        cbjnsrmh.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbjnsrmhItemStateChanged(evt);
            }
        });
        cbjnsrmh.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                cbjnsrmhHierarchyChanged(evt);
            }
        });
        cbjnsrmh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbjnsrmhActionPerformed(evt);
            }
        });

        jLabel2.setText("Jenis Rumah:");

        jLabel3.setText("Harga:");

        tfhrg.setEditable(false);
        tfhrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfhrgActionPerformed(evt);
            }
        });

        jLabel4.setText("Keterangan:");

        tfktrngn.setEditable(false);
        tfktrngn.setColumns(20);
        tfktrngn.setRows(5);
        tfktrngn.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                tfktrngnMouseWheelMoved(evt);
            }
        });
        jScrollPane1.setViewportView(tfktrngn);

        jCheckBox1.setText("Kitchen Set");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("Furniture Interior");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Tambahan:");

        jCheckBox4.setText("Kanopi");

        jLabel6.setText("Rp.5.000.000");

        jLabel7.setText("Rp.15.000.000");

        jLabel8.setText("Rp.6.000.000");

        jLabel9.setText("Pratinjau Rumah:");

        jButton1.setText("Konfirmasi");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        hapuspilihanButton.setText("Hapus Pilihan");
        hapuspilihanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapuspilihanButtonActionPerformed(evt);
            }
        });

        tampilkanButton.setText("Tampilkan Gambar");
        tampilkanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tampilkanButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbjnsrmh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfhrg)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                            .addComponent(tampilkanButton))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBox2)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8))
                                .addGap(52, 52, 52))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hapuspilihanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbjnsrmh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfhrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(154, 154, 154))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tampilkanButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jCheckBox1)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox2)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox4)
                    .addComponent(jLabel8))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(hapuspilihanButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbjnsrmhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbjnsrmhActionPerformed
    switch(cbjnsrmh.getSelectedIndex()) {
        case 0:
            // Pilihan default, kosongkan harga dan keterangan
            tfhrg.setText("");
            tfktrngn.setText("");
            break;
        case 1:
            // Tipe 36 (2 Kamar)
            tfhrg.setText("Rp.110.000.000");
            tfktrngn.setText("1. 2 kamar tidur (6m x 6m) \n2. 1 Ruang kosong (5m x 4m)\n3. 1 Kamar Mandi (3m x 3m)\n4. Teras dan Garasi (3m x 3m dan 5m x 2m) \n\nLuas tanah: 36 m²\nLebar rumah: 6 m\nTinggi rumah: 4 m\nAlamat:\nPerumahan Kopi,\nJl. Menteng Raya,\nKec. Menteng,\nKota Jakarta Pusat,\nDKI Jakarta");
            break;
        case 2:
            // Tipe 36 (Taman)
            tfhrg.setText("Rp.180.000.000");
            tfktrngn.setText("1. 2 kamar tidur (7m x 6m) \n2. 1 Ruang Tamu (5.5m x 5m)\n3. 1 Kamar Mandi (3.5m x 3.5m)\n4. Teras dan Garasi (3m x 3m dan 5m x 2m)\n5. Taman (5m x 5m)\n\nLuas tanah: 40 m²\nLebar rumah: 7 m\nTinggi rumah: 5 m\nAlamat:\nPerumahan Cendana,\nJl. Cendana Raya,\nKec. Sawangan,\nKota Depok,\nJawa Barat");
            break;
        case 3:
            // Tipe 36 (3 Kamar)
            tfhrg.setText("Rp.215.000.000");
            tfktrngn.setText("1. 3 kamar tidur (6.5m x 5.5m) \n2. 1 Ruang Tamu (6m x 4.5m)\n3. 2 Kamar Mandi (4m x 3.5m)\n4. Teras dan Garasi (3m x 3m dan 5m x 2m)\n\nLuas tanah: 38 m²\nLebar rumah: 6.5 m\nTinggi rumah: 5.5 m\nAlamat:\nPerumahan Merdeka,\nJl. Merdeka No. 10,\nKec. Karawaci,\nKota Tangerang,\nBanten");
            break;
        case 4:
            // Tipe 36 (1 Lantai)
            tfhrg.setText("Rp.230.000.000");
            tfktrngn.setText("1. 2 kamar tidur (5.5m x 5m) \n2. 1 Ruang Tamu (5m x 4.5m)\n3. 1 Kamar Mandi (3.5m x 3m)\n4. 1 Dapur (3m x 4m)\n5. Teras dan Garasi (3m x 3m dan 5m x 2m)\n\nLuas tanah: 35 m²\nLebar rumah: 5.5 m\nTinggi rumah: 4.5 m\nAlamat:\nPerumahan Kenanga,\nJl. Kenanga Indah,\nKec. Cibubur,\nKota Jakarta Timur,\nDKI Jakarta");
            break;
        case 5:
            // Tipe 36 (2 Lantai)
            tfhrg.setText("Rp.300.000.000");
            tfktrngn.setText("1. 3 kamar tidur (7.5m x 6m) \n2. 1 Ruang Tamu (6.5m x 5.5m)\n3. 2 Kamar Mandi (4.5m x 3.5m)\n4. Teras dan Garasi (3m x 3m dan 5m x 2m)\n5. Taman (2m x 3m)\n6. Ruang Makan (3m x 6m)\n7. Ruang Keluarga (3m x 5m)\n\nLuas tanah: 42 m²\nLebar rumah: 7.5 m\nTinggi rumah: 6 m\nAlamat:\nPerumahan Flamboyan,\nJl. Flamboyan Blok C2,\nKec. Sawah Besar,\nKota Bandung,\nJawa Barat");
            break;
    }
    
    // Set fokus kembali ke cbjnsrmh agar tidak berpindah fokus otomatis
    cbjnsrmh.requestFocusInWindow();
    }//GEN-LAST:event_cbjnsrmhActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed
 
    private void cbjnsrmhItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbjnsrmhItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbjnsrmhItemStateChanged

    private void hapuspilihanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapuspilihanButtonActionPerformed
    // Reset pilihan ComboBox ke yang pertama
    cbjnsrmh.setSelectedIndex(0);

    // Kosongkan TextField harga
    tfhrg.setText("");

    // Kosongkan TextArea keterangan
    tfktrngn.setText("");

    // Set semua CheckBox ke tidak tercentang
    jCheckBox1.setSelected(false);
    jCheckBox2.setSelected(false);
    jCheckBox4.setSelected(false);
    }//GEN-LAST:event_hapuspilihanButtonActionPerformed

    private void tfhrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfhrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfhrgActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   // Ambil harga rumah
    String hargaRumah = tfhrg.getText().replace("Rp.", "").replace(".", "").trim();
    int hargaTambahan = 0;

    // Tambahkan harga tambahan jika ada
    if (jCheckBox1.isSelected()) {
        hargaTambahan += 5000000; // Harga Kitchen Set
    }
    if (jCheckBox2.isSelected()) {
        hargaTambahan += 15000000; // Harga Furniture Interior
    }
    if (jCheckBox4.isSelected()) {
        hargaTambahan += 6000000; // Harga Kanopi
    }

    // Tampilkan TotalFrame
    TotalFrame totalFrame = new TotalFrame(hargaRumah, hargaTambahan);
    totalFrame.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbjnsrmhHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_cbjnsrmhHierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbjnsrmhHierarchyChanged

    private void tampilkanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tampilkanButtonActionPerformed
    // Ambil nama file gambar berdasarkan pilihan dari ComboBox
    String namaFile = null;
    switch(cbjnsrmh.getSelectedIndex()) {
        case 1:
            namaFile = "/aplikasijualrumah/Tipe 36 2 Kamar.jpg";
            break;
        case 2:
            namaFile = "/aplikasijualrumah/Tipe 36 Taman.jpg";
            break;
        case 3:
            namaFile = "/aplikasijualrumah/Tipe 36 3 Kamar.jpg";
            break;
        case 4:
            namaFile = "/aplikasijualrumah/Tipe 36 1 Lantai.jpg";
            break;
        case 5:
            namaFile = "/aplikasijualrumah/Tipe 36 2 Lantai.jpg";
            break;
        default:
            // Tidak ada pilihan yang valid, kembali dari metode ini
            return;
    }
    
    // Buat instance dari DetailFrame
    DetailFrame detailFrame = new DetailFrame(cbjnsrmh.getSelectedItem().toString(), "", namaFile);
    detailFrame.pack(); // Mengatur ukuran jendela ke konten yang dimuat
    detailFrame.setLocationRelativeTo(null); // Menempatkan frame di tengah layar
    detailFrame.setVisible(true); // Menampilkan frame
    }//GEN-LAST:event_tampilkanButtonActionPerformed

    private void tfktrngnMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_tfktrngnMouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_tfktrngnMouseWheelMoved
        
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        // Membuat dan Menampilkan Form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbjnsrmh;
    private javax.swing.JButton hapuspilihanButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton tampilkanButton;
    private javax.swing.JTextField tfhrg;
    private javax.swing.JTextArea tfktrngn;
    // End of variables declaration//GEN-END:variables
}
