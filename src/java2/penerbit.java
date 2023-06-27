/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2;

/**
 *
 * @author ThinkPad X250
 */
import java2.koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class penerbit extends javax.swing.JFrame {

    /**
     * Creates new form penerbit
     */
    public penerbit() {
        initComponents();
        this.TampilData();
        bBaru.setEnabled(true);
        bsimpan.setEnabled(false);
        bedit.setEnabled(false);
        bhapus.setEnabled(false);
        tidpenerbit.setVisible(true);
    }
private DefaultTableModel DftTblModel_penerbit;
private String SQL;
public void TampilData() {
    DftTblModel_penerbit = new DefaultTableModel();
    DftTblModel_penerbit.addColumn("ID PENERBIT");
    DftTblModel_penerbit.addColumn("NAMA PENERBIT");
    DftTblModel_penerbit.addColumn("ALAMAT");
    DftTblModel_penerbit.addColumn("TELEFON");
    
    jtbpenerbit.setModel(DftTblModel_penerbit);
    Connection conn = koneksi.getConnection();
    try {
        java.sql.Statement stmt = conn.createStatement(); 
         SQL ="select * from tbpenerbit";
        java.sql.ResultSet res = stmt.executeQuery(SQL);
        while (res.next()) {
  
            DftTblModel_penerbit.addRow(new Object []{
                res.getString ("idpenerbit"),
                res.getString ("namapenerbit"),
                res.getString ("alamat"),
                res.getString ("telp"),
            });
        }
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }}
private void cariJudul(String key) {
    DftTblModel_penerbit = new DefaultTableModel();
    DftTblModel_penerbit.addColumn("ID PENERBIT");
    DftTblModel_penerbit.addColumn("NAMA PENERBIT");
    DftTblModel_penerbit.addColumn("ALAMAT");
    DftTblModel_penerbit.addColumn("TELEFON");
    jtbpenerbit.setModel(DftTblModel_penerbit);
    Connection conn = koneksi.getConnection();
    try {
        java.sql.Statement stmt = conn.createStatement(); 
         SQL ="select * from tbpenerbit where idpenerbit like '%"+key+"%'";
        java.sql.ResultSet res = stmt.executeQuery(SQL);
        while (res.next()) {
            DftTblModel_penerbit.addRow(new Object []{
                res.getString ("idpenerbit"),
                res.getString ("namapenerbit"),
                res.getString ("alamat"),
                res.getString ("telp"),
            });
        }
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }

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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tnamapenerbit = new javax.swing.JTextField();
        talamat = new javax.swing.JTextField();
        tTelp = new javax.swing.JTextField();
        tidpenerbit = new javax.swing.JTextField();
        bBaru = new javax.swing.JButton();
        bsimpan = new javax.swing.JButton();
        bedit = new javax.swing.JButton();
        bhapus = new javax.swing.JButton();
        bclose = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbpenerbit = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        cari = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel1.setText("PENERBIT");

        jLabel2.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel2.setText("NAMA PENERBIT");

        jLabel3.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel3.setText("ALAMAT");

        jLabel4.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel4.setText("TELEPON");

        tnamapenerbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnamapenerbitActionPerformed(evt);
            }
        });

        talamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                talamatActionPerformed(evt);
            }
        });

        tTelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tTelpActionPerformed(evt);
            }
        });

        tidpenerbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tidpenerbitActionPerformed(evt);
            }
        });

        bBaru.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bBaru.setText("BARU");
        bBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBaruActionPerformed(evt);
            }
        });

        bsimpan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bsimpan.setText("SIMPAN");
        bsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsimpanActionPerformed(evt);
            }
        });

        bedit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bedit.setText("EDIT");
        bedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beditActionPerformed(evt);
            }
        });

        bhapus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bhapus.setText("HAPUS");
        bhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhapusActionPerformed(evt);
            }
        });

        bclose.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bclose.setText("CLOSE");
        bclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcloseActionPerformed(evt);
            }
        });

        jtbpenerbit.setModel(new javax.swing.table.DefaultTableModel(
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
        jtbpenerbit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbpenerbitMouseClicked(evt);
            }
        });
        jtbpenerbit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtbpenerbitKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtbpenerbit);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("CARI ");

        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });
        cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cariKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192))
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(176, 176, 176)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(tnamapenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(talamat, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tTelp, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tidpenerbit))))
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(bBaru)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bsimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addComponent(bedit)
                        .addGap(58, 58, 58)
                        .addComponent(bhapus)
                        .addGap(58, 58, 58)
                        .addComponent(bclose)
                        .addGap(101, 101, 101))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tnamapenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(talamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tidpenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bBaru)
                    .addComponent(bedit)
                    .addComponent(bhapus)
                    .addComponent(bclose)
                    .addComponent(bsimpan))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(259, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tnamapenerbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnamapenerbitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnamapenerbitActionPerformed

    private void talamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_talamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_talamatActionPerformed

    private void tTelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tTelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tTelpActionPerformed

    private void tidpenerbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tidpenerbitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tidpenerbitActionPerformed

    private void bcloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcloseActionPerformed
        // TODO add your handling code here:
        int pilih = JOptionPane.showConfirmDialog(null, "Apakah anda yakin akan logout?=","konfirmasi", JOptionPane.YES_NO_OPTION);
        if (pilih ==JOptionPane.YES_OPTION)
            dispose();
        else if (pilih ==JOptionPane.NO_OPTION){
            
        }
    }//GEN-LAST:event_bcloseActionPerformed

    private void bhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhapusActionPerformed
        // TODO add your handling code here:
        try{
            Connection conn = koneksi.getConnection();
            PreparedStatement stmt = conn.prepareStatement("delete from tbpenerbit where idpenerbit='"+tidpenerbit.getText()+"'");
            stmt.executeUpdate();
            conn.close();
            TampilData();
            JOptionPane.showMessageDialog(null, "Data berhasil di hapus");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "proses hapus gagal/koneksi gagal..");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_bhapusActionPerformed

    private void bsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsimpanActionPerformed
        // TODO add your handling code here:
        try {
             Connection coon = koneksi.getConnection();
            PreparedStatement stmt = coon.prepareStatement("insert into tbpenerbit(namapenerbit, alamat, telp) values (?,?,?)");
            stmt.setString(1, tnamapenerbit.getText());
            stmt.setString(2, talamat.getText());
            stmt.setString(3, tTelp.getText());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan", "Pesan", JOptionPane.INFORMATION_MESSAGE);
            TampilData();
            tnamapenerbit.setText("");
            talamat.setText("");
            tTelp.setText("");
            tidpenerbit.setText("");
            
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
                           
        
    }//GEN-LAST:event_bsimpanActionPerformed

    private void bBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBaruActionPerformed
        // TODO add your handling code here:
        bBaru.setEnabled(true);
        bsimpan.setEnabled(true);
        bedit.setEnabled(true);
        bhapus.setEnabled(true);
    }//GEN-LAST:event_bBaruActionPerformed

    private void jtbpenerbitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbpenerbitMouseClicked
        // TODO add your handling code here:
        int baris = jtbpenerbit.getSelectedRow();
        tnamapenerbit.setText(DftTblModel_penerbit.getValueAt(baris, 1).toString());
        talamat.setText(DftTblModel_penerbit.getValueAt(baris, 2).toString());
        tTelp.setText(DftTblModel_penerbit.getValueAt(baris, 3).toString());
        tidpenerbit.setText(DftTblModel_penerbit.getValueAt(baris, 0).toString());
        
        bBaru.setEnabled(true);
        bsimpan.setEnabled(true);
        bedit.setEnabled(true);
        bhapus.setEnabled(true);
    }//GEN-LAST:event_jtbpenerbitMouseClicked

    private void beditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beditActionPerformed
        // TODO add your handling code here:
        try {
            Connection conn = koneksi.getConnection();
            PreparedStatement stmt = conn.prepareStatement("update tbpenerbit set namapenerbit=?, alamat=?, telp=? where idpenerbit=?");
            stmt.setString(1, tnamapenerbit.getText());
            stmt.setString(2, talamat.getText());
            stmt.setString(3, tTelp.getText());
            stmt.setString(4, tidpenerbit.getText());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan", "Pesan", JOptionPane.INFORMATION_MESSAGE);
            TampilData();
            
            tnamapenerbit.setText("");
            talamat.setText("");
            tTelp.setText("");
            tidpenerbit.setText("");
            
             bBaru.setEnabled(true);
             bsimpan.setEnabled(true);
             bedit.setEnabled(true);
             bhapus.setEnabled(true);
             
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_beditActionPerformed

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cariActionPerformed

    private void cariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cariKeyReleased
        // TODO add your handling code here:
        String key=cari.getText();
        System.out.println(key);

        if(key!=""){
            cariJudul(key);
        }else{
            TampilData();
        }
    }//GEN-LAST:event_cariKeyReleased

    private void jtbpenerbitKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtbpenerbitKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtbpenerbitKeyReleased

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
            java.util.logging.Logger.getLogger(penerbit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(penerbit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(penerbit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(penerbit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new penerbit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBaru;
    private javax.swing.JButton bclose;
    private javax.swing.JButton bedit;
    private javax.swing.JButton bhapus;
    private javax.swing.JButton bsimpan;
    private javax.swing.JTextField cari;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbpenerbit;
    private javax.swing.JTextField tTelp;
    private javax.swing.JTextField talamat;
    private javax.swing.JTextField tidpenerbit;
    private javax.swing.JTextField tnamapenerbit;
    // End of variables declaration//GEN-END:variables
}
