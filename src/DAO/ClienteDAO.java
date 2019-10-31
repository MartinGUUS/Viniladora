/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJO.Carro;
import POJO.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MartinPC
 */
public class ClienteDAO {
    
    
    public DefaultComboBoxModel cargarModeloCombo() {
        Connection con = null;
        PreparedStatement st = null;
        DefaultComboBoxModel dt = null;
    
        try {
            con = DAO.Conexion.getConnection();
            st = con.prepareStatement("call select_a_cliente");
            dt = new DefaultComboBoxModel();
            
            try (ResultSet rs = st.executeQuery()) {
                while (rs.next()) {
                    Cliente cliente = inflaPOJO(rs);
                    dt.addElement(cliente);
                    
                //    dt.addRow(ob);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } catch (Exception e) {
            System.out.println("Error en cargar modelo combo Clientes " + e);
        } finally {
            DAO.Conexion.close(con);
            DAO.Conexion.close(st);
        }
        return dt;
    }
    
     private static Cliente inflaPOJO(ResultSet rs) {

         Cliente pojo = new Cliente();
        try {
            pojo.setIdcliente(rs.getInt("idcliente"));
            pojo.setNombre(rs.getString("nombre"));
            pojo.setNumero(rs.getString("numero"));
            pojo.setCorreo(rs.getString("correo"));
        } catch (SQLException ex) {
            System.out.println("Error al inflar pojo cliente: " + ex);
        }
        return pojo;
    }
     
      public int insertar(Cliente friend) {
        Connection con = null;
        PreparedStatement st = null;
        int id = 0;
        try {
            con = DAO.Conexion.getConnection();
            st = con.prepareStatement("call insert_cliente(?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS);
            st.setString(1, friend.getNombre());
            st.setString(2, friend.getNumero());
            st.setString(3, friend.getCorreo());
              
           
            id = st.executeUpdate();
            ResultSet rs = st.getGeneratedKeys();
            if (rs.next()) {
                id = rs.getInt(1);
            }
            JOptionPane.showMessageDialog(null, "éxito");

        } catch (Exception e) {
            System.out.println("Error al insertar cliente " + e);
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
        String encabezados[] = {"NOMBRE", "CORREO", "NUMERO"};
        try {
            con = DAO.Conexion.getConnection();
            st = con.prepareStatement("select * from cliente");
            dt = new DefaultTableModel();
            dt.setColumnIdentifiers(encabezados);
            try (ResultSet rs = st.executeQuery()) {
                while (rs.next()) {
                    Object ob[] = new Object[3];

                    ob[0] = inflaPOJO(rs);
                    ob[1] = rs.getString("correo");
                    ob[2] = rs.getString("numero");

                    dt.addRow(ob);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } catch (Exception e) {
            System.out.println("Error en cargar modelo clientes " + e);
        } finally {
            DAO.Conexion.close(con);
            DAO.Conexion.close(st);
        }
        return dt;
    }
    
    
    public boolean modificar(Cliente cliente){
        Connection con=null;
        PreparedStatement st=null;
        try{
            con=DAO.Conexion.getConnection();
            st=con.prepareStatement("call update_cliente(?,?,?,?)");
            st.setString(1, cliente.getNombre());
            st.setString(2, cliente.getNumero());
            st.setString(3, cliente.getCorreo());
            st.setInt(4, cliente.getIdcliente());
            int c=st.executeUpdate();
            if (c==0) {
                return false;
            }

        }catch(Exception e){
            System.out.println("error al actualizar clientes: "+e);
        }finally{
            DAO.Conexion.close(con);
            DAO.Conexion.close(st);
        }
        return true;
    }

   
}
