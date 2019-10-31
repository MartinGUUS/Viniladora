/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJO.Carro;
import POJO.Cliente;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MartinPC
 */
public class CarroDAO {

    public int insertar(Carro friend) {
        Connection con = null;
        PreparedStatement st = null;
        int id = 0;
        try {
            con = DAO.Conexion.getConnection();
            st = con.prepareStatement("call insert_carro(?,?,?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS);
            st.setString(1, friend.getModelo());
            st.setString(2, friend.getPlacas());
            st.setString(3, friend.getColor());
            st.setString(4, friend.getMarca());
            st.setInt(5 , friend.getCliente_idcliente());    
           
            id = st.executeUpdate();
            ResultSet rs = st.getGeneratedKeys();
            if (rs.next()) {
                id = rs.getInt(1);
            }
            JOptionPane.showMessageDialog(null, "éxito");

        } catch (Exception e) {
            System.out.println("Error al insertar carro " + e);
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
        String encabezados[] = {"ID", "CLIENTE", "PLACAS"};
        try {
            con = DAO.Conexion.getConnection();
            st = con.prepareStatement("call select_all_carro");
            dt = new DefaultTableModel();
            dt.setColumnIdentifiers(encabezados);
            try (ResultSet rs = st.executeQuery()) {
                while (rs.next()) {
                    Object ob[] = new Object[3];

                    ob[0] = rs.getInt("idcarro");
                    ob[1] = rs.getString("Nombre");
                    ob[2] = rs.getString("Placas");

                    dt.addRow(ob);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } catch (Exception e) {
            System.out.println("Error en cargar modelo carros " + e);
        } finally {
            DAO.Conexion.close(con);
            DAO.Conexion.close(st);
        }
        return dt;
    }

    private static Carro inflaPOJO(ResultSet rs) {

         Carro pojo = new Carro();
        try {
            pojo.setIdcarro(rs.getInt("idcarro"));
            pojo.setModelo(rs.getString("modelo"));
            pojo.setColor(rs.getString("color"));
            pojo.setMarca(rs.getString("marca"));
            pojo.setCliente_idcliente(rs.getInt("cliente_idcliente"));
            pojo.setPlacas(rs.getString("placas"));
        } catch (SQLException ex) {
            System.out.println("Error al inflar pojo materia: " + ex);
        }
        return pojo;
    }
    
    public boolean modificar(Carro cliente){
        Connection con=null;
        PreparedStatement st=null;
        try{
            con=DAO.Conexion.getConnection();
            st=con.prepareStatement("call update_carro(?,?,?,?)");
            st.setString(1, cliente.getModelo());    
            st.setString(2, cliente.getColor());
            st.setString(3, cliente.getMarca());
            st.setInt(4, cliente.getIdcarro());
            int c=st.executeUpdate();
            if (c==0) {
                return false;
            }

        }catch(Exception e){
            System.out.println("error al actualizar carro: "+e);
        }finally{
            DAO.Conexion.close(con);
            DAO.Conexion.close(st);
        }
        return true;
    }
    
}
