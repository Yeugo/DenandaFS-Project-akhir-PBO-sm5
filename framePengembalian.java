/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;

import com.mysql.jdbc.Statement;
import database.configdb_2110010228;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author ACER
 */
public class framePengembalian extends javax.swing.JFrame {
configdb_2110010228 obj;
    /**
     * Creates new form framePeminjaman
     */
    public void tampilDataPengembalian(){
        
        String[] JudulKolom = {"ID Pengembalian","Tanggal Pengembalian","Kejaksaan Penyerah","Penyidik Penerima","ID Pinjam"};
        int[] lebar = {100, 100, 200, 200, 100};
        
        String query = "SELECT * FROM pengembalian";
        obj.JudulJtable(jTable1, JudulKolom);
        obj.tampilTable(JudulKolom, query, jTable1);
        obj.LebarJtable(jTable1, lebar);
        lblJum.setText("Jumlah Data : "+String.valueOf(obj.jumlahRecord(query)));
    }
    public framePengembalian() {
        initComponents();
        
        obj = new configdb_2110010228();
        tampilDataPengembalian();
        this.setLocationRelativeTo(null);
        //jTable1.setModel(new DefaultTableModel());
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
        jTable1 = new javax.swing.JTable();
        btnCetak = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtIdPengembalian = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTgl = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtKejaksaann = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPenyidik = new javax.swing.JTextField();
        txtIdPinjam = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        txtCari = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lblJum = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnCetak.setText("Cetak Laporan");
        btnCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakActionPerformed(evt);
            }
        });

        jLabel1.setText("ID Pengembalian");

        jLabel2.setText("Tanggal Pengembalian");

        txtTgl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTglActionPerformed(evt);
            }
        });

        jLabel3.setText("Kejaksaan Penyerah");

        jLabel4.setText("Penyidik Penerima");

        jLabel5.setText("ID Pinjam");

        btnSimpan.setText("SIMPAN");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnUbah.setText("UBAH");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnHapus.setText("HAPUS");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        txtCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCariActionPerformed(evt);
            }
        });
        txtCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCariKeyPressed(evt);
            }
        });

        jLabel8.setText("Cari Data");

        lblJum.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblJum.setText("Jumlah Data");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 896, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(80, 80, 80))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtKejaksaann, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIdPengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPenyidik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIdPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSimpan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUbah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnHapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnClear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCetak))
                            .addComponent(lblJum))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtIdPengembalian, txtIdPinjam, txtKejaksaann, txtPenyidik, txtTgl});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdPengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKejaksaann, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPenyidik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnUbah)
                    .addComponent(btnHapus)
                    .addComponent(btnClear)
                    .addComponent(btnCetak))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(lblJum)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakActionPerformed
        // TODO add your handling code here:
        String SqlCetak = "SELECT * FROM pengembalian WHERE id_pengembalian LIKE '%"+txtCari.getText()+"%' OR penyidik_yg_menerima  LIKE '%"+txtCari.getText()+"%'";
        obj.tampilLaporan("src/laporan/lapPengembalian.jrxml", SqlCetak);
        
    }//GEN-LAST:event_btnCetakActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        String[] Fieldnya = {"id_pengembalian","tgl_pengembalian","kejaksaan_yg_menyerahkan","penyidik_yg_menerima","id_pinjam"};
        String[] isiFieldnya = {txtIdPengembalian.getText(), 
                                txtTgl.getText(), 
                                txtKejaksaann.getText(), 
                                txtPenyidik.getText(), 
                                txtIdPinjam.getText()};
        
        if (txtIdPengembalian.getText().isEmpty()){ 
                JOptionPane.showMessageDialog(this, "ID Pengembalian Belum Di isi!");
                txtIdPengembalian.requestFocus();
            } else if(txtTgl.getText().isEmpty()) { 
                JOptionPane.showMessageDialog(this, "Tanggal Pengembalian Belum Di isi!");
                txtTgl.requestFocus();
            } else if(txtKejaksaann.getText().isEmpty()){ 
                JOptionPane.showMessageDialog(this, "Kejaksaan Belum Di isi!");
                txtKejaksaann.requestFocus();
            } else if(txtPenyidik.getText().isEmpty()){ 
                JOptionPane.showMessageDialog(this, "Penyidik Belum Di isi!");
                txtPenyidik.requestFocus();
            } else if(txtIdPinjam.getText().isEmpty()){ 
                JOptionPane.showMessageDialog(this, "ID Pinjam Belum Di isi!");
                txtIdPinjam.requestFocus();
            } else if (obj.dupikasiKey("pengembalian", "id_pengembalian", txtIdPengembalian.getText())){
                JOptionPane.showMessageDialog(this, "ID Pengembalian Sudah Terdaftar");
            try {
                Statement stm = (Statement) obj.getKoneksi().createStatement();
                    ResultSet rslt = stm.executeQuery("SELECT * FROM pengembalian WHERE id_pengembalian ='"+txtIdPengembalian.getText()+"'");
                    rslt.next();
                    txtTgl.setText(rslt.getString(2));
                    txtKejaksaann.setText(rslt.getString(3));
                    txtPenyidik.setText(rslt.getString(4));
                    txtIdPinjam.setText(rslt.getString(5));
                        } catch (SQLException ex) {
                Logger.getLogger(framePengembalian.class.getName()).log(Level.SEVERE, null, ex);
            }
            } else {
                obj.simpanDBAuto("pengembalian", Fieldnya, isiFieldnya);
                tampilDataPengembalian();
                JOptionPane.showMessageDialog(this, "Data Berhasil Disimpan");
            }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void txtTglActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTglActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTglActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            int baris = jTable1.getSelectedRow();
            txtIdPengembalian.setText(jTable1.getValueAt(baris, 0).toString());
            txtTgl.setText(jTable1.getValueAt(baris, 1).toString());
            txtKejaksaann.setText(jTable1.getValueAt(baris, 2).toString());
            txtPenyidik.setText(jTable1.getValueAt(baris, 3).toString());
            txtIdPinjam.setText(jTable1.getValueAt(baris, 4).toString());
        } catch (Exception e){
            
        }
            
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        try {
            if (
                (txtIdPengembalian.getText().equals("")) &&
                (txtTgl.getText().equals("")) &&
                (txtKejaksaann.getText().equals("")) &&
                (txtPenyidik.getText().equals("")) &&
                (txtIdPinjam.getText().equals(""))
            ) {
            JOptionPane.showMessageDialog(this, "Silahkan Pilih Data!");
            jTable1.requestFocus();
        } else {
                String[] Fieldnya = {"tgl_pengembalian","kejaksaan_yg_menyerahkan","penyidik_yg_menerima","id_pinjam"};
                String[] isiFieldnya = {txtTgl.getText(), 
                                        txtKejaksaann.getText(), 
                                        txtPenyidik.getText(), 
                                        txtIdPinjam.getText()};
                obj.UbahDBAuto("pengembalian", "id_pengembalian", txtIdPengembalian.getText(), Fieldnya, isiFieldnya);
                JOptionPane.showMessageDialog(this, "Data Berhasil Diubah");
                tampilDataPengembalian();
            }
        } catch (Exception e){
            System.err.println(e.toString());
        }
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        try {
            if (
                (txtIdPengembalian.getText().equals("")) &&
                (txtTgl.getText().equals("")) &&
                (txtKejaksaann.getText().equals("")) &&
                (txtPenyidik.getText().equals("")) &&
                (txtIdPinjam.getText().equals(""))
            ) {
                JOptionPane.showMessageDialog(this, "Silahkan Pilih Data!");
                jTable1.requestFocus();
            } else {
                obj.HapusDBAuto("pengembalian", "id_pengembalian", txtIdPengembalian.getText());
                tampilDataPengembalian();
                JOptionPane.showMessageDialog(this,"Data Berhasil Dihapus");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtIdPengembalian.setText(null);
        txtTgl.setText(null);
        txtKejaksaann.setText(null);
        txtPenyidik.setText(null);
        txtIdPinjam.setText(null);
        txtIdPengembalian.requestFocus();
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtCariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariKeyPressed
        try {
            String SQL = "SELECT * FROM pengembalian WHERE id_pengembalian LIKE '%"+txtCari.getText()+"%' OR penyidik_yg_menerima LIKE '%"+txtCari.getText()+"%'";
            String[] JudulKolom = {"ID Pengembalian","Tanggal Pengembalian","Kejaksaan Penyerah","Penyidik Penerima","ID Pinjam"};
            int[] lebar = {100, 100, 200, 200, 100};
            obj.JudulJtable(jTable1, JudulKolom);
            obj.tampilTable(JudulKolom, SQL, jTable1);
            obj.LebarJtable(jTable1, lebar);
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }//GEN-LAST:event_txtCariKeyPressed

    private void txtCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCariActionPerformed

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
            java.util.logging.Logger.getLogger(framePengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(framePengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(framePengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(framePengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new framePengembalian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCetak;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblJum;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtIdPengembalian;
    private javax.swing.JTextField txtIdPinjam;
    private javax.swing.JTextField txtKejaksaann;
    private javax.swing.JTextField txtPenyidik;
    private javax.swing.JTextField txtTgl;
    // End of variables declaration//GEN-END:variables
}
