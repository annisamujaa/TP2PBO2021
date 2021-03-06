/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tp2;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Annisa
 */
public class barbar extends javax.swing.JFrame {

    /**
     * Creates new form 
     */
    ArrayList<Mobil> listMobil;
    String header[] = new String[]{"No", "Merk", "Plat", "Warna", "Jenis"};
    DefaultTableModel dtm;
    int row,col;
    
    //konstruktor
    public barbar() {
        initComponents();
        listMobil = new ArrayList<>();
        dtm = new DefaultTableModel(header, 0);
        jTable1.setModel(dtm);
        this.setLocationRelativeTo(null);
        
        panForm.setVisible(false);
        panTable.setVisible(false);
        panInfo.setVisible(false);
        jPanel2.setVisible(true);
        welcome.setVisible(true);
        jComboBox1.setVisible(true);
    }
    
    //memasukkan data ke tabel
    public void getDataMobil(){
        
        DefaultTableModel table = (DefaultTableModel)jTable1.getModel();
        table.getDataVector( ).removeAllElements( );
        table.fireTableDataChanged( );

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/tp2pbo2021", "root", "");
            Statement st;
            st = koneksi.createStatement();
            String sql = "SELECT * from dataMobil";
            ResultSet res   = st.executeQuery(sql);

            while(res.next ()) {
                Object[ ] dt = new Object[6];
                dt[0] = res.getString("no");
                dt[1] = res.getString("merk");
                dt[2] = res.getString("plat");
                dt[3] = res.getString("warna");
                dt[4] = res.getString("jenis");
                //menambahkan data pada tabel
                table.addRow(dt);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "error");
        }
        //menampilkan tombol tabel dan info
        btnTable.setVisible(true);
        btnInfo.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nav = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnForm = new javax.swing.JButton();
        btnTable = new javax.swing.JButton();
        btnInfo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        welcome = new javax.swing.JLabel();
        panForm = new javax.swing.JPanel();
        lbMerk = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tMerk = new javax.swing.JTextPane();
        lbPlat = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tPlat = new javax.swing.JTextPane();
        lbWarna = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tWarna = new javax.swing.JTextPane();
        lbJenis = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jSubmit = new javax.swing.JButton();
        panTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panInfo = new javax.swing.JPanel();
        lbnama = new javax.swing.JLabel();
        lbnim = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nav.setBackground(new java.awt.Color(102, 51, 0));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Data Mobil");

        btnForm.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnForm.setText("Form");
        btnForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFormActionPerformed(evt);
            }
        });

        btnTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnTable.setText("Table");
        btnTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTableActionPerformed(evt);
            }
        });

        btnInfo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnInfo.setText("Info");
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout navLayout = new javax.swing.GroupLayout(nav);
        nav.setLayout(navLayout);
        navLayout.setHorizontalGroup(
            navLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnForm)
                .addGap(130, 130, 130)
                .addComponent(btnTable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInfo)
                .addGap(36, 36, 36))
            .addGroup(navLayout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        navLayout.setVerticalGroup(
            navLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(navLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInfo)
                    .addComponent(btnForm)
                    .addComponent(btnTable))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));

        welcome.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        welcome.setText("Selamat Datang!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(welcome)
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(324, 324, 324)
                .addComponent(welcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(338, 338, 338))
        );

        panForm.setBackground(new java.awt.Color(255, 204, 102));

        lbMerk.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbMerk.setText("Merk");

        tMerk.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane2.setViewportView(tMerk);

        lbPlat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbPlat.setText("Plat");

        tPlat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane3.setViewportView(tPlat);

        lbWarna.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbWarna.setText("Warna");

        tWarna.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane4.setViewportView(tWarna);

        lbJenis.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbJenis.setText("Jenis");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Biasa", "Balap", "Sport", "Truk" }));

        jSubmit.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jSubmit.setText("Submit");
        jSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panFormLayout = new javax.swing.GroupLayout(panForm);
        panForm.setLayout(panFormLayout);
        panFormLayout.setHorizontalGroup(
            panFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFormLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(panFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbMerk)
                    .addComponent(lbPlat)
                    .addComponent(lbWarna)
                    .addComponent(lbJenis))
                .addGap(38, 38, 38)
                .addGroup(panFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2)
                        .addComponent(jScrollPane3)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        panFormLayout.setVerticalGroup(
            panFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFormLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(panFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbMerk)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(panFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panFormLayout.createSequentialGroup()
                        .addComponent(lbPlat)
                        .addGap(3, 3, 3))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(panFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbWarna))
                .addGap(27, 27, 27)
                .addGroup(panFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbJenis))
                .addGap(152, 152, 152)
                .addComponent(jSubmit)
                .addContainerGap(216, Short.MAX_VALUE))
        );

        panTable.setBackground(new java.awt.Color(255, 204, 102));

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
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout panTableLayout = new javax.swing.GroupLayout(panTable);
        panTable.setLayout(panTableLayout);
        panTableLayout.setHorizontalGroup(
            panTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panTableLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        panTableLayout.setVerticalGroup(
            panTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTableLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        panInfo.setBackground(new java.awt.Color(255, 204, 102));

        lbnama.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbnama.setText("NIM   : 1902125");

        lbnim.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbnim.setText(" Nama : Annisa Muja Ahidah");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Windows7\\Pictures\\me.jpeg")); // NOI18N

        javax.swing.GroupLayout panInfoLayout = new javax.swing.GroupLayout(panInfo);
        panInfo.setLayout(panInfoLayout);
        panInfoLayout.setHorizontalGroup(
            panInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panInfoLayout.createSequentialGroup()
                .addGroup(panInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panInfoLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel2))
                    .addGroup(panInfoLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(panInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbnim)
                            .addGroup(panInfoLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(lbnama)))))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        panInfoLayout.setVerticalGroup(
            panInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panInfoLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(lbnim)
                .addGap(26, 26, 26)
                .addComponent(lbnama)
                .addGap(126, 126, 126))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panTable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nav, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(nav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        //tombol form
    private void btnFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFormActionPerformed
        // TODO add your handling code here:
        jPanel2.setVisible(false);
        panForm.setVisible(true);
        panTable.setVisible(false);
        panInfo.setVisible(false);
        btnForm.setVisible(true);
        btnTable.setVisible(false);
        btnInfo.setVisible(false);
    }//GEN-LAST:event_btnFormActionPerformed
    
    //tombol table
    private void btnTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTableActionPerformed
        // TODO add your handling code here:
        jPanel2.setVisible(false);
        panForm.setVisible(false);
        panTable.setVisible(true);
        panInfo.setVisible(false);
        btnForm.setVisible(false);
        btnTable.setVisible(true);
        btnInfo.setVisible(false);
    }//GEN-LAST:event_btnTableActionPerformed
    
    //tombol info
    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        // TODO add your handling code here:
        jPanel2.setVisible(false);
        panForm.setVisible(false);
        panTable.setVisible(false);
        panInfo.setVisible(true);
        btnForm.setVisible(false);
        btnTable.setVisible(false);
        btnInfo.setVisible(true);
    }//GEN-LAST:event_btnInfoActionPerformed

    //tombol submit 
    private void jSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSubmitActionPerformed
        // TODO add your handling code here:
        String merk = tMerk.getText();
        String plat = tPlat.getText();
        String warna = tWarna.getText();
        String jenis = jComboBox1.getSelectedItem().toString();
        String query = "INSERT INTO dataMobil" + "(merk, plat, warna, jenis) VALUES" + " (?, ?, ?, ?)";
        if(merk.equals("") || plat.equals("") || warna.equals("") || jenis.equals("")){
            JOptionPane.showMessageDialog(null, "Lengkapi Data!");
        }else{
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/tp2pbo2021", "root", ""); 
                PreparedStatement stmt = koneksi.prepareStatement(query);
                stmt.setString(1, merk);
                stmt.setString(2, plat);
                stmt.setString(3, warna);
                stmt.setString(4, jenis);
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan");   
            } 
            catch (Exception e){
               JOptionPane.showMessageDialog(null, "error");
            }
            tMerk.setText("");
            tPlat.setText("");
            tWarna.setText("");
            jComboBox1.setSelectedItem("");
            btnTable.setEnabled(true);
            btnInfo.setEnabled(true);
            btnTable.setVisible(true);
            btnInfo.setVisible(true);
        }
    }//GEN-LAST:event_jSubmitActionPerformed
            
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
            java.util.logging.Logger.getLogger(barbar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(barbar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(barbar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(barbar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new barbar().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnForm;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnTable;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton jSubmit;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbJenis;
    private javax.swing.JLabel lbMerk;
    private javax.swing.JLabel lbPlat;
    private javax.swing.JLabel lbWarna;
    private javax.swing.JLabel lbnama;
    private javax.swing.JLabel lbnim;
    private javax.swing.JPanel nav;
    private javax.swing.JPanel panForm;
    private javax.swing.JPanel panInfo;
    private javax.swing.JPanel panTable;
    private javax.swing.JTextPane tMerk;
    private javax.swing.JTextPane tPlat;
    private javax.swing.JTextPane tWarna;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
