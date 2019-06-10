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
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Sanjaya Koju
 */
public class LoginController {
     public int userLogin(Login ob)
    {
        int status=-1;
        Connection con=null;
        try
        {
            con=ConnectDB.getConnection();
            String sql="select * from login where username=? and password=md5(?)";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1,ob.getUsername());
            pst.setString(2,ob.getPassword());
            ResultSet rs=pst.executeQuery();
            if(rs.next())
            {
                int id=rs.getInt("ID");
                String username=rs.getString("username");
                status=rs.getInt("status");
                UserTrace.id=id;
                UserTrace.username=username;
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
        return status;
    }
    
}
