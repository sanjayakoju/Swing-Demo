/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.distribution.controller;

import com.distribution.common.ConnectDB;
import com.distribution.model.Distribution;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Sanjaya Koju
 */
public class DistributionController {
    
    public void saveData(ArrayList<Distribution> list) 
    {
        Connection con=null;
        try
        {
           con=ConnectDB.getConnection();
           con.setAutoCommit(false);
           for(int i=0;i<list.size();i++)
           {
               String d=new java.util.Date().toString();
               int qt=list.get(i).getQty();
               ProductController pdc=new ProductController();
               int qty=pdc.getQty(list.get(i).getPid(),con);
               
               //update stock quantity of product table
               if(qty >= qt)
               {
                    int newQty=qty-list.get(i).getQty();
                    pdc.updateQty(list.get(i).getPid(), newQty,con);
                    
               
               String sql="insert into distribution (pid,names,qty,price,date,checkedBy,place,total) values (?,?,?,?,?,?,?,?)";
               PreparedStatement pst=con.prepareStatement(sql);
               
               pst.setInt(1,list.get(i).getPid());
               pst.setString(2,list.get(i).getNames());
               pst.setInt(3,list.get(i).getQty());
               pst.setDouble(4,list.get(i).getPrice());
              
               pst.setDate(5,new java.sql.Date(list.get(i).getDate().getTime()));
                pst.setString(6,list.get(i).getCheckedBy());
              pst.setString(7,list.get(i).getPlace());
              pst.setDouble(8,list.get(i).getTotal());
               pst.execute();
               
               
               
               JOptionPane.showMessageDialog(null,"Record Saved Successfully.");
               }
               else
               {
                   JOptionPane.showMessageDialog(null,"Qunatity not Sufficient.");
               }
               con.commit();
                
           }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
            try
            {
                con.rollback();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        finally
        {
            try
            {
                con.close();
            }
            catch(Exception ex)
            {
                System.out.println(ex);
            }
        }
    }
    
    
   
    
}
