/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.distribution.view;

import com.distribution.common.UserTrace;
import com.distribution.controller.ProductController;
import com.distribution.model.Product;
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import static com.sun.corba.se.impl.orbutil.CorbaResourceUtil.getText;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import static javax.swing.UIManager.getString;
import javax.swing.table.DefaultTableModel;
import static jdk.nashorn.internal.objects.NativeDate.getDate;

/**
 *
 * @author Sanjaya Koju
 */
public class AddProduct extends javax.swing.JInternalFrame {
    DefaultTableModel model;
    private double price;
    private Product Product;
    private Product ob;
    private int qty;
    private String names;
    
     public AddProduct() {
        initComponents();
        model=new DefaultTableModel(null,new String[]{"Id","Names","Quantity","Price","Date","CheckedBy"});
        jTable_product.setModel(model);
    }

     
     private void clearTable()
    {
        int count = jTable_product.getRowCount();
        for(int i=0;i<count;i++)
        {
            model.removeRow(0);
        }
        clearField();
    }
     
     private void loadData()
    {
         clearTable();
        ProductController pdc=new ProductController();
        ArrayList<Product> list=pdc.fetchData();
        for(int i=0;i<list.size();i++)
        {
            model.addRow(new Object[]{list.get(i).getId(),
            list.get(i).getNames(),
            list.get(i).getQty(),
            list.get(i).getPrice(),
            list.get(i).getDate(),
            list.get(i).getCheckedBy()});
        }
    }
    private void clearField()
    {
        jLabel_id.setText("");
        jTextField_names.setText("");
        jTextField_price.setText("");
        jTextField_qty.setText("");
    }
    /**
     * Creates new form AddStock
     */

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
        jTextField_names = new javax.swing.JTextField();
        jTextField_qty = new javax.swing.JTextField();
        jTextField_price = new javax.swing.JTextField();
        jButton_save = new javax.swing.JButton();
        jButton_update = new javax.swing.JButton();
        jButton_loadData = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_product = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel_id = new javax.swing.JLabel();
        jButton_delete = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton_clearTable = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setTitle("Add Stock Form");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 204, 0));
        jLabel1.setText("Names");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 51));
        jLabel2.setText("Quantity");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 51));
        jLabel3.setText("Price");

        jTextField_names.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_namesActionPerformed(evt);
            }
        });

        jTextField_qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_qtyActionPerformed(evt);
            }
        });

        jTextField_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_priceActionPerformed(evt);
            }
        });

        jButton_save.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_save.setForeground(new java.awt.Color(204, 0, 51));
        jButton_save.setIcon(new javax.swing.ImageIcon("D:\\Icons\\if_Add Green Button_38761.png")); // NOI18N
        jButton_save.setText("Save");
        jButton_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_saveActionPerformed(evt);
            }
        });

        jButton_update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_update.setForeground(new java.awt.Color(204, 0, 51));
        jButton_update.setIcon(new javax.swing.ImageIcon("D:\\Icons\\if_Button_Sync_72918.png")); // NOI18N
        jButton_update.setText("Update");
        jButton_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_updateActionPerformed(evt);
            }
        });

        jButton_loadData.setBackground(new java.awt.Color(204, 204, 204));
        jButton_loadData.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_loadData.setForeground(new java.awt.Color(153, 0, 0));
        jButton_loadData.setIcon(new javax.swing.ImageIcon("D:\\Icons\\if_button-synchronize_blue_68694.png")); // NOI18N
        jButton_loadData.setText("Load Data");
        jButton_loadData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_loadDataActionPerformed(evt);
            }
        });

        jTable_product.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_product.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_productMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_product);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 51));
        jLabel4.setText("ID");

        jLabel_id.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_id.setForeground(new java.awt.Color(204, 0, 51));

        jButton_delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_delete.setForeground(new java.awt.Color(153, 0, 51));
        jButton_delete.setIcon(new javax.swing.ImageIcon("D:\\Icons\\if_button_cancel_18572.png")); // NOI18N
        jButton_delete.setText("Delete");
        jButton_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_deleteActionPerformed(evt);
            }
        });

        jButton_clearTable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_clearTable.setForeground(new java.awt.Color(255, 0, 51));
        jButton_clearTable.setText("Clear");
        jButton_clearTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_clearTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(254, 707, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jButton_save, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_update)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton_clearTable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_loadData)
                .addGap(119, 119, 119))
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_id, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_price, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(jTextField_qty)
                            .addComponent(jTextField_names))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
                        .addGap(33, 33, 33))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel_id, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_names, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField_qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(125, 125, 125)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_save, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_update, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_loadData)
                            .addComponent(jButton_clearTable))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_saveActionPerformed
        Product ob1=new Product();
        ob1.setNames(jTextField_names.getText());
        int qty=Integer.parseInt(jTextField_qty.getText());
        qty=Math.abs(qty);
        ob1.setQty(qty);
        double price=Double.parseDouble(jTextField_price.getText());
        price=Math.abs(price);
        ob1.setPrice(price);
        ob1.setDate((new Date().toString()));
        ProductController sc=new ProductController();
        sc.saveStock(ob1);
        clearField();
        
    }//GEN-LAST:event_jButton_saveActionPerformed

    private void jButton_loadDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_loadDataActionPerformed
        // TODO add your handling code here:
        loadData();
        
    }//GEN-LAST:event_jButton_loadDataActionPerformed

    private void jTable_productMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_productMouseClicked
        // TODO add your handling code here:
        int row=jTable_product.getSelectedRow();
        jLabel_id.setText(jTable_product.getValueAt(row,0).toString());
        jTextField_names.setText(jTable_product.getValueAt(row, 1).toString());
        jTextField_qty.setText(jTable_product.getValueAt(row,2).toString());
        jTextField_price.setText(jTable_product.getValueAt(row, 3).toString());
        
    }//GEN-LAST:event_jTable_productMouseClicked

    private void jButton_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_updateActionPerformed
        // TODO add your handling code here:
        int id=Integer.parseInt(jLabel_id.getText());
        String names=jTextField_names.getText();
        int qty=Integer.parseInt(jTextField_qty.getText());
        qty=Math.abs(qty);
        double price=Double.parseDouble(jTextField_price.getText());
        price=Math.abs(price);
        ProductController pdc=new ProductController();
        
        Product ob=new Product();
        ob.setId(id);
        ob.setNames(names);
        ob.setQty(qty);
        ob.setPrice(price);
        pdc.updateProduct(ob);
        loadData();
        clearField();
    }//GEN-LAST:event_jButton_updateActionPerformed

    private void jButton_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_deleteActionPerformed
        // TODO add your handling code here:
        int id=Integer.parseInt(jLabel_id.getText());
        ProductController pdc=new ProductController();
        pdc.deleteProduct(id);
        loadData();
        clearField();
    }//GEN-LAST:event_jButton_deleteActionPerformed

    private void jTextField_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_priceActionPerformed

    private void jTextField_qtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_qtyActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jTextField_qtyActionPerformed

    private void jButton_clearTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_clearTableActionPerformed
        // TODO add your handling code here:
        clearTable();
    }//GEN-LAST:event_jButton_clearTableActionPerformed

    private void jTextField_namesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_namesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_namesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_clearTable;
    private javax.swing.JButton jButton_delete;
    private javax.swing.JButton jButton_loadData;
    private javax.swing.JButton jButton_save;
    private javax.swing.JButton jButton_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_id;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_product;
    private javax.swing.JTextField jTextField_names;
    private javax.swing.JTextField jTextField_price;
    private javax.swing.JTextField jTextField_qty;
    // End of variables declaration//GEN-END:variables
}
