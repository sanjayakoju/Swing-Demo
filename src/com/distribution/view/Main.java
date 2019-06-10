/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.distribution.view;

import java.awt.Color;

/**
 *
 * @author Sanjaya Koju
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
       
        jMenuItem_logout.setEnabled(false);
        jMenuItem_register.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem_login = new javax.swing.JMenuItem();
        jMenuItem_register = new javax.swing.JMenuItem();
        jMenuItem_logout = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem_AddStock = new javax.swing.JMenuItem();
        jMenuItem_distribution = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Welcome To The Nepal Oil Corporation");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Please Login to Access This System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(516, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addContainerGap(423, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        desktop.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenu1.setText("User");

        jMenuItem_login.setText("Login");
        jMenuItem_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_loginActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_login);

        jMenuItem_register.setText("Register");
        jMenuItem_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_registerActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_register);

        jMenuItem_logout.setText("Logout");
        jMenuItem_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_logoutActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_logout);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Application");

        jMenuItem_AddStock.setText("Add Stock");
        jMenuItem_AddStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_AddStockActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_AddStock);

        jMenuItem_distribution.setText("Distribution");
        jMenuItem_distribution.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_distributionActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_distribution);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_loginActionPerformed
        // TODO add your handling code here:
        LoginUser ob =new LoginUser();
        desktop.add(ob);
        ob.setVisible(true);
    }//GEN-LAST:event_jMenuItem_loginActionPerformed

    private void jMenuItem_AddStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_AddStockActionPerformed
        // TODO add your handling code here:
        AddProduct ob=new AddProduct();
        desktop.add(ob);
        ob.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem_AddStockActionPerformed

    private void jMenuItem_distributionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_distributionActionPerformed
        // TODO add your handling code here:
        DistributionDetail b=new DistributionDetail();
        desktop.add(b);
        b.setVisible(true);
    }//GEN-LAST:event_jMenuItem_distributionActionPerformed

    private void jMenuItem_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_logoutActionPerformed
        // TODO add your handling code here:
        jMenuItem_AddStock.setEnabled(false);
        jMenuItem_distribution.setEnabled(false);
        jMenuItem_logout.setEnabled(false);
        jMenuItem_login.setEnabled(true);
        jMenuItem_register.setEnabled(true);
        desktop.removeAll();
        desktop.repaint();
    }//GEN-LAST:event_jMenuItem_logoutActionPerformed

    private void jMenuItem_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_registerActionPerformed
        // TODO add your handling code here:
        RegisterDemo r=new RegisterDemo();
        desktop.add(r);
        r.setVisible(true);
        jMenuItem_login.setEnabled(true);
        
    }//GEN-LAST:event_jMenuItem_registerActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    public static javax.swing.JMenuItem jMenuItem_AddStock;
    public static javax.swing.JMenuItem jMenuItem_distribution;
    public static javax.swing.JMenuItem jMenuItem_login;
    public static javax.swing.JMenuItem jMenuItem_logout;
    public static javax.swing.JMenuItem jMenuItem_register;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private AddProduct AddProduct() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
