
package DAO;


import POJO.Cliente;
import POJO.Material;
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
public class MaterialDAO {
     public int insertar(Material friend) {
        Connection con = null;
        PreparedStatement st = null;
        int id = 0;
        try {
            con = DAO.Conexion.getConnection();
            st = con.prepareStatement("call insert_material(?,?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS);
            st.setString(1, friend.getNombre());
            st.setString(2, friend.getDescripcion());
            st.setDouble(3, friend.getPrecio());
            st.setInt(4, friend.getCantidad());
           
            id = st.executeUpdate();
            ResultSet rs = st.getGeneratedKeys();
            if (rs.next()) {
                id = rs.getInt(1);
            }
            JOptionPane.showMessageDialog(null, "éxito");

        } catch (Exception e) {
            System.out.println("Error al insertar material " + e);
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
        String encabezados[] = {"NOMBRE", "PRECIO", "CANTIDAD"};
        try {
            con = DAO.Conexion.getConnection();
            st = con.prepareStatement("select * from material");
            dt = new DefaultTableModel();
            dt.setColumnIdentifiers(encabezados);
            try (ResultSet rs = st.executeQuery()) {
                while (rs.next()) {
                    Object ob[] = new Object[3];
                       
                    ob[0] = inflaPOJO(rs);
                    ob[1] = rs.getDouble("precio");
                    ob[2] = rs.getInt("cantidad");

                    dt.addRow(ob);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } catch (Exception e) {
            System.out.println("Error en cargar modelo material " + e);
        } finally {
            DAO.Conexion.close(con);
            DAO.Conexion.close(st);
        }
        return dt;
    }

    private static Material inflaPOJO(ResultSet rs) {

         Material pojo = new Material();
        try {
            pojo.setIdmaterial(rs.getInt("idmaterial"));
            pojo.setNombre(rs.getString("nombre"));
            pojo.setDescripcion (rs.getString("descipcion"));
            pojo.setPrecio(rs.getDouble("precio"));
            pojo.setCantidad(rs.getInt("cantidad"));
            
        } catch (SQLException ex) {
            System.out.println("Error al inflar pojo empleado: " + ex);
        }
        return pojo;
    }
    
    
    public boolean modificar(Material cliente){
        Connection con=null;
        PreparedStatement st=null;
        try{
            con=DAO.Conexion.getConnection();
            st=con.prepareStatement("call update_material(?,?,?,?,?)");
            st.setString(1, cliente.getNombre());
            st.setString(2, cliente.getDescripcion());
            st.setDouble(3, cliente.getPrecio());
            st.setInt(4, cliente.getCantidad());
            st.setInt(5, cliente.getIdmaterial());
            int c=st.executeUpdate();
            if (c==0) {
                return false;
            }

        }catch(Exception e){
            System.out.println("error al actualizar material: "+e);
        }finally{
            DAO.Conexion.close(con);
            DAO.Conexion.close(st);
        }
        return true;
    }
}
