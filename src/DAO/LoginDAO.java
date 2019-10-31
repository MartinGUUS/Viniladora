/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import jdk.nashorn.internal.ir.CatchNode;

/**
 *
 * @author MartinPC
 */
public class LoginDAO {
    private static final String TABLE="usuario";
    private static final String LOGIN="select * from "+TABLE+" where usuario=? and contrasena=?";
    
    public static int loginF(String usuario,String contrasena) {
        
        Connection con=null;
        int id=0;
        try{
        con= Conexion.getConnection();
        PreparedStatement st =con.prepareStatement(LOGIN);
        st.setString(1, usuario);
        st.setString(2, contrasena);
        ResultSet rs=st.executeQuery();
        while(rs.next()){
            id=rs.getInt("idusuario");
        }
    }catch(Exception e){
            System.out.println("error en login "+e);
    }
    return id;
}
}

