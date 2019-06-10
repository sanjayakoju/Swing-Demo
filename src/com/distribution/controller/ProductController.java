/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.distribution.controller;

import com.distribution.common.ConnectDB;
import com.distribution.common.UserTrace;
import com.distribution.model.Product;

/**
 *
 * @author Sanjaya Koju
 */
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class ProductController {
    public void saveStock(Product ob1)
    {
        Connection con=null;
        try
        {
            con=ConnectDB.getConnection();
            String sql="insert into product(names,qty,price,date,CheckedBy) values(?,?,?,?,?)";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1,ob1.getNames());
            pst.setInt(2,ob1.getQty());
            pst.setDouble(3,ob1.getPrice());
            pst.setString(4,ob1.getDate());
            pst.setString(5,UserTrace.username);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Record saved");
            
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"Record Already Save");
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

    public ArrayList<Product> fetchData()
    {
        ArrayList<Product> list=new ArrayList();
        Connection con=null;
        try
        {
            con=ConnectDB.getConnection();
            String sql="select * from product";
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next())
            {
                
                Product ob=new Product();
                ob.setId(rs.getInt("id"));
                ob.setNames(rs.getString("names"));
                ob.setPrice(rs.getDouble("price"));
                ob.setQty(rs.getInt("qty"));
                ob.setDate(rs.getString("date"));
                ob.setCheckedBy(rs.getString("checkedBy"));
                list.add(ob);
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
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
        return list;
    }
    
    
     public void updateProduct(Product ob)
    {
        Connection con=null;
        try
        {
            con=ConnectDB.getConnection();
            String sql="update product set names=?, qty=?, price=? where id=?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1,ob.getNames());
            pst.setInt(2,ob.getQty());
            pst.setDouble(3,ob.getPrice());
            pst.setInt(4,ob.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Record Updated");
            
        }
        catch(Exception ex)
        {
            System.out.println(ex);
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
    
     public void deleteProduct(int id)
    {
        Connection con=null;
        try
        {
            con=ConnectDB.getConnection();
            String sql="delete from product where id=?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setInt(1,id);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Record Deleted");
            
        }
        catch(Exception ex)
        {
            System.out.println(ex);
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

    //Insert into table sales product code
   public  Product fetchData(int id)
    {
       
        Connection con=null;
        
        try
        {
            con=ConnectDB.getConnection();
            String sql="select * from product where id=?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setInt(1,id);
            ResultSet rs=pst.executeQuery();
            while(rs.next())
            {
                Product ob=new Product();
                ob.setId(rs.getInt("id"));
                ob.setNames(rs.getString("names"));
                ob.setQty(rs.getInt("qty"));
                ob.setPrice(rs.getDouble("price"));
                ob.setCheckedBy(rs.getString("checkedBy"));
                return ob;
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
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
        return null;
    }
     
     
     public  int getQty(int id,Connection con)
    {
        int qty=0;
        try
        {
            
            String sql="select * from product where id=?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setInt(1,id);
            ResultSet rs=pst.executeQuery();
            
            while(rs.next())
            {
                qty=rs.getInt("qty");
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        
        return qty;
    }
   
    public void updateQty(int id,int newQty,Connection con)
    {
        
        try
        {
            
            String sql="update product set qty=? where id=?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setInt(1,newQty);
            pst.setInt(2,id);
            pst.execute();
            
            
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        
        
    }


}
