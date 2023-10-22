/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uts.view;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import uts.Databases.Database;

/**
 *
 * @author ASUS
 */
public class LoginForm extends javax.swing.JFrame {

    Database db = new Database();
    
    public LoginForm() {
        initComponents();
        setLocationRelativeTo(null);
        
    }
    
    private void clearField(){
        txtPassword.setText("");
        txtUsername.setText("");
        newPasswordTXT.setText("");
        newUsernameTXT.setText("");
        buttonGroup1.clearSelection();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        panelLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btDaftar = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        radioUser = new javax.swing.JRadioButton();
        radioAdmin = new javax.swing.JRadioButton();
        panelDaftar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        newPasswordTXT = new javax.swing.JPasswordField();
        newUsernameTXT = new javax.swing.JTextField();
        btnDaftar = new javax.swing.JButton();
        btbBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Perpustakaan");
        getContentPane().setLayout(new java.awt.CardLayout());

        mainPanel.setLayout(new java.awt.CardLayout());

        panelLogin.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("LOGIN");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("USERNAME");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("PASSWORD");

        txtUsername.setBackground(new java.awt.Color(255, 255, 255));

        txtPassword.setBackground(new java.awt.Color(255, 255, 255));
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uts/icon/login_FILL0_wght400_GRAD0_opsz24.png"))); // NOI18N
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btDaftar.setForeground(new java.awt.Color(0, 0, 0));
        btDaftar.setText("DAFTAR AKUN");
        btDaftar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btDaftarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btDaftarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btDaftarMouseExited(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("ROLE");

        buttonGroup1.add(radioUser);
        radioUser.setForeground(new java.awt.Color(0, 0, 0));
        radioUser.setText("USER");

        buttonGroup1.add(radioAdmin);
        radioAdmin.setForeground(new java.awt.Color(0, 0, 0));
        radioAdmin.setText("ADMIN");

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(jLabel1))
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(btDaftar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66)
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                                .addComponent(radioUser, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(radioAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 97, Short.MAX_VALUE))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addGap(58, 58, 58)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(radioUser)
                    .addComponent(radioAdmin))
                .addGap(18, 18, 18)
                .addComponent(btDaftar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        mainPanel.add(panelLogin, "card2");

        panelDaftar.setBackground(new java.awt.Color(204, 204, 204));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("DAFTAR");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("NEW USERNAME");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("NEW PASSWORD");

        btnDaftar.setText("DAFTAR");
        btnDaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDaftarActionPerformed(evt);
            }
        });

        btbBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uts/icon/arrow_back_ios_FILL0_wght400_GRAD0_opsz24.png"))); // NOI18N
        btbBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btbBack.setMaximumSize(new java.awt.Dimension(50, 50));
        btbBack.setMinimumSize(new java.awt.Dimension(50, 50));
        btbBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btbBackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelDaftarLayout = new javax.swing.GroupLayout(panelDaftar);
        panelDaftar.setLayout(panelDaftarLayout);
        panelDaftarLayout.setHorizontalGroup(
            panelDaftarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDaftarLayout.createSequentialGroup()
                .addGroup(panelDaftarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelDaftarLayout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(btnDaftar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelDaftarLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btbBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelDaftarLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(panelDaftarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(43, 43, 43)
                        .addGroup(panelDaftarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newPasswordTXT)
                            .addComponent(newUsernameTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .addGroup(panelDaftarLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(136, 136, 136))
        );
        panelDaftarLayout.setVerticalGroup(
            panelDaftarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDaftarLayout.createSequentialGroup()
                .addGroup(panelDaftarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDaftarLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel4))
                    .addGroup(panelDaftarLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btbBack, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(88, 88, 88)
                .addGroup(panelDaftarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newUsernameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(46, 46, 46)
                .addGroup(panelDaftarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPasswordTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(72, 72, 72)
                .addComponent(btnDaftar)
                .addGap(47, 47, 47))
        );

        mainPanel.add(panelDaftar, "card3");

        getContentPane().add(mainPanel, "card4");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnDaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDaftarActionPerformed
        try {
            String username = newUsernameTXT.getText();
            String password = String.copyValueOf(newPasswordTXT.getPassword());
            int saldo = 0;
            if (password.equals("") || username.equals("")){
                JOptionPane.showMessageDialog(null, "USERNAME ATAU PASSWORD TIDAK BOLEH KOSONG");
                
            }else{
                db.executeUpdateQuery(String.format("INSERT INTO akun VALUES ('%s','%s','%d');", username,password,saldo));
                JOptionPane.showMessageDialog(null, "BERHASIL MENDAFTAR");
                mainPanel.removeAll();
                mainPanel.repaint();
                mainPanel.revalidate();

                mainPanel.add(panelLogin);
                mainPanel.repaint();
                mainPanel.revalidate();
            }clearField();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }//GEN-LAST:event_btnDaftarActionPerformed

    private void btDaftarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDaftarMouseEntered
        btDaftar.setForeground(Color.red);
    }//GEN-LAST:event_btDaftarMouseEntered

    private void btDaftarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDaftarMouseExited
        btDaftar.setForeground(Color.BLACK);
    }//GEN-LAST:event_btDaftarMouseExited

    private void btDaftarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDaftarMouseClicked
        btDaftar.setForeground(Color.BLACK);
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        mainPanel.add(panelDaftar);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btDaftarMouseClicked

    private void btbBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btbBackMouseClicked
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        mainPanel.add(panelLogin);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btbBackMouseClicked

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String inputUsername = txtUsername.getText();
        String inputPassword = new String(txtPassword.getPassword());
        boolean diTemukan = true;
        
        if (inputUsername.equals("") || inputPassword.equals("") || buttonGroup1.isSelected(null)) {
            JOptionPane.showMessageDialog(null, "HARAP LENGKAPI DATA");
        }else{
            if (radioUser.isSelected()) {
                try {
                    ResultSet values = db.executeSelectQuery("SELECT * FROM akun;");
                    while(values.next()){
                        String username = values.getString("username");
                        String password = values.getString("password");
                        if (inputUsername.equals(username)) {
                            if (inputPassword.equals(password)) {
                                diTemukan = false;
                                clearField();
                                JOptionPane.showMessageDialog(null, "ANDA BERHASIL LOGIN SEBAGAI USER");
                                int saldo = values.getInt("saldo");
                                this.dispose();
                                new UserForm(Integer.toString(saldo), username).setVisible(true);
                                
                            }
                        }
                    }if(diTemukan) {
                        JOptionPane.showMessageDialog(null, "Username atau password salah");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else if (radioAdmin.isSelected()){
                String[][] adminAccount = db.getAdminAcc();
                for (int i = 0; i < adminAccount.length; i++) {
                    for (int j = 0; j < 1; j++) {
                        if (adminAccount[i][j].equals(inputUsername) && adminAccount[i][j+1].equals(inputPassword)) {
                            JOptionPane.showMessageDialog(null, "ANDA BERHASIL LOGIN SEBAGAI ADMIN");
                            diTemukan = false;
                            clearField();
                            this.dispose();
                            new AdminForm().setVisible(true);
                        }
                    }
                    
                }if (diTemukan) {
                    JOptionPane.showMessageDialog(null, "Username atau password salah");
                }
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btDaftar;
    private javax.swing.JLabel btbBack;
    private javax.swing.JButton btnDaftar;
    private javax.swing.JButton btnLogin;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPasswordField newPasswordTXT;
    private javax.swing.JTextField newUsernameTXT;
    private javax.swing.JPanel panelDaftar;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JRadioButton radioAdmin;
    private javax.swing.JRadioButton radioUser;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
