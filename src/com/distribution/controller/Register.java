/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.distribution.controller;

import com.distribution.common.ConnectDB;
import com.distribution.common.UserTrace;
import com.distribution.model.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Sanjaya Koju
 */
public class Register {
    public void registerUser(Login ob)
    {
        Connection con=null;
        try
        {
            con=ConnectDB.getConnection();
            String sql="insert into login(username,password,status) values(?,md5(?),?)";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1,ob.getUsername());
            pst.setString(2,ob.getPassword());
            pst.setInt(3,ob.getStatus());
            
            pst.execute();
            JOptionPane.showMessageDialog(null,"User Register Succesfully");
            
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
    }

