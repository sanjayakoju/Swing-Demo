/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.distribution.view;

import com.distribution.controller.LoginController;
import com.distribution.model.Login;
import static com.distribution.view.Main.jMenuItem_AddStock;
import static com.distribution.view.Main.jMenuItem_distribution;
import javax.swing.JOptionPane;

/**
 *
 * @author Sanjaya Koju
 */
public class LoginUser extends javax.swing.JInternalFrame {

    /**
     * Creates new form LoginUser
     */
    public LoginUser() {
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

        jLabel_username = new javax.swing.JLabel();
        jLabel_password = new javax.swing.JLabel();
        jTextField_username = new javax.swing.JTextField();
        jPasswordField_password = new javax.swing.JPasswordField();
        jButton_login = new javax.swing.JButton();

        setClosable(true);
        setTitle("User Login Form");

        jLabel_username.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_username.setForeground(new java.awt.Color(255, 0, 51));
        jLabel_username.setText("Username");

        jLabel_password.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_password.setForeground(new java.awt.Color(255, 0, 51));
        jLabel_password.setText("Password");

        jTextField_username.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField_username.setForeground(new java.awt.Color(255, 0, 0));

        jPasswordField_password.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPasswordField_password.setForeground(new java.awt.Color(255, 0, 0));

        jButton_login.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_login.setForeground(new java.awt.Color(255, 0, 0));
        jButton_login.setIcon(new javax.swing.ImageIcon("D:\\Icons\\if_Login_in_85205 (1).png")); // NOI18N
        jButton_login.setText("Login");
        jButton_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_password)
                            .addComponent(jLabel_username))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_username, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(jPasswordField_password)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jButton_login)))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_username)
                    .addComponent(jTextField_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_password)
                    .addComponent(jPasswordField_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jButton_login)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_loginActionPerformed
        // TODO add your handling code here:
        Login ob=new Login();
        ob.setUsername(jTextField_username.getText());
        ob.setPassword(new String(jPasswordField_password.getPassword()));
        
        LoginController lc=new LoginController();
        int status=lc.userLogin(ob);
        if(status==-1)
        {
            JOptionPane.showMessageDialog(null,"Invalid username");
        }
        else if(status==0)//Normal user
        {
           JOptionPane.showMessageDialog(null,"Loggin Success"); 
           jMenuItem_AddStock.setEnabled(true);
        jMenuItem_distribution.setEnabled(true);
           dispose();
        }
        else if(status==1)//Normal user
        {
           JOptionPane.showMessageDialog(null,"Loggin Success"); 
            jMenuItem_AddStock.setEnabled(true);
        jMenuItem_distribution.setEnabled(true);
           dispose();
        }
        
    }//GEN-LAST:event_jButton_loginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_login;
    private javax.swing.JLabel jLabel_password;
    private javax.swing.JLabel jLabel_username;
    private javax.swing.JPasswordField jPasswordField_password;
    private javax.swing.JTextField jTextField_username;
    // End of variables declaration//GEN-END:variables
}
