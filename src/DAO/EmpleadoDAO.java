/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJO.Carro;
import POJO.Cliente;
import POJO.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MartinPC
 */
public class EmpleadoDAO {
     public int insertar(Empleado friend) {
        Connection con = null;
        PreparedStatement st = null;
        int id = 0;
        try {
            con = DAO.Conexion.getConnection();
            st = con.prepareStatement("call insert_empleado(?,?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS);
            st.setString(1, friend.getNombre());
            st.setDouble(2, friend.getSalario());
            st.setString(3, friend.getNumero());
            st.setString(4, friend.getCorreo());
           
            id = st.executeUpdate();
            ResultSet rs = st.getGeneratedKeys();
            if (rs.next()) {
                id = rs.getInt(1);
            }
            JOptionPane.showMessageDialog(null, "éxito");

        } catch (Exception e) {
            System.out.println("Error al insertar empleado " + e);
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
        String encabezados[] = {"NOMBRE", "NUMERO", "CORREO"};
        try {
            con = DAO.Conexion.getConnection();
            st = con.prepareStatement("select * from empleado");
            dt = new DefaultTableModel();
            dt.setColumnIdentifiers(encabezados);
            try (ResultSet rs = st.executeQuery()) {
                while (rs.next()) {
                    Object ob[] = new Object[3];
                       
                    ob[0] = inflaPOJO(rs);
                    ob[1] = rs.getString("numero");
                    ob[2] = rs.getString("correo");

                    dt.addRow(ob);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } catch (Exception e) {
            System.out.println("Error en cargar modelo empleado " + e);
        } finally {
            DAO.Conexion.close(con);
            DAO.Conexion.close(st);
        }
        return dt;
    }

    private static Empleado inflaPOJO(ResultSet rs) {

         Empleado pojo = new Empleado();
        try {
            pojo.setIdempleado(rs.getInt("idempleado"));
            pojo.setNombre(rs.getString("nombre"));
            pojo.setSalario(rs.getDouble("salario"));
            pojo.setNumero(rs.getString("numero"));
            pojo.setCorreo(rs.getString("correo"));
            
        } catch (SQLException ex) {
            System.out.println("Error al inflar pojo empleado: " + ex);
        }
        return pojo;
    }
    
    public boolean modificar(Empleado cliente){
        Connection con=null;
        PreparedStatement st=null;
        try{
            con=DAO.Conexion.getConnection();
            st=con.prepareStatement("call update_empleado(?,?,?,?,?)");
            st.setString(1, cliente.getNombre());
            st.setDouble(2, cliente.getSalario());
            st.setString(3, cliente.getNumero());
            st.setString(4, cliente.getCorreo());
            st.setInt(5, cliente.getIdempleado());
            
            int c=st.executeUpdate();
            if (c==0) {
                return false;
            }

        }catch(Exception e){
            System.out.println("error al actualizar empleado: "+e);
        }finally{
            DAO.Conexion.close(con);
            DAO.Conexion.close(st);
        }
        return true;
    }
}
