/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJO.Carro;
import POJO.Cliente;
import POJO.Usario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MartinPC
 */
public class UsuarioDAO {
      public int insertar(Usario friend) {
        Connection con = null;
        PreparedStatement st = null;
        int id = 0;
        try {
            con = DAO.Conexion.getConnection();
            st = con.prepareStatement("call insert_usuario(?,?)", PreparedStatement.RETURN_GENERATED_KEYS);
            st.setString(1, friend.getUsuario());
            st.setString(2, friend.getContraseña());
          
           
            id = st.executeUpdate();
            ResultSet rs = st.getGeneratedKeys();
            if (rs.next()) {
                id = rs.getInt(1);
            }
            JOptionPane.showMessageDialog(null, "éxito");

        } catch (Exception e) {
            System.out.println("Error al insertar usuario " + e);
        } finally {
            DAO.Conexion.close(con);
            DAO.Conexion.close(st);
        }
        return id;
    }

    public DefaultTableModel cargarModelo() {
        Connection con = null;
        PreparedStatement st = null;
        DefaultTableModel dt = null;
        String encabezados[] = {"ID", "USUARIO"};
        try {
            con = DAO.Conexion.getConnection();
            st = con.prepareStatement("call select_all_usuario");
            dt = new DefaultTableModel();
            dt.setColumnIdentifiers(encabezados);
            try (ResultSet rs = st.executeQuery()) {
                while (rs.next()) {
                    Object ob[] = new Object[2];

                    ob[0] = rs.getInt("idusuario");
                    ob[1] = rs.getString("usuario");
                

                    dt.addRow(ob);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } catch (Exception e) {
            System.out.println("Error en cargar modelo usuarios " + e);
        } finally {
            DAO.Conexion.close(con);
            DAO.Conexion.close(st);
        }
        return dt;
    }
    
    public boolean modificar(Usario cliente){
        Connection con=null;
        PreparedStatement st=null;
        try{
            con=DAO.Conexion.getConnection();
            st=con.prepareStatement("call update_usuario(?,?,?)");
            st.setString(1, cliente.getUsuario());
            st.setString(2, cliente.getContraseña());
            st.setInt(3, cliente.getIdusuario());
            int c=st.executeUpdate();
            if (c==0) {
                return false;
            }

        }catch(Exception e){
            System.out.println("error al actualizar usuario: "+e);
        }finally{
            DAO.Conexion.close(con);
            DAO.Conexion.close(st);
        }
        return true;
    }
}
