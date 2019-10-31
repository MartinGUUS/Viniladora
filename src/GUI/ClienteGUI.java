/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.CarroDAO;
import DAO.ClienteDAO;
import POJO.Carro;
import POJO.Cliente;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author MartinPC
 */
public class ClienteGUI extends javax.swing.JFrame {
    
    TableRowSorter<TableModel> sorter;
    ClienteDAO ff;
    
    public ClienteGUI() {
        
        setTitle("Clientes svipe");
        initComponents();
        ff = new ClienteDAO();
        loadmodel();
    }
    
    void loadmodel() {
        
        DefaultTableModel df = ff.cargarModelo();
        
        sorter = new TableRowSorter<TableModel>(df);
        jTable1.setModel(df);
        jTable1.setAutoCreateRowSorter(true);
        jTable1.setRowSorter(sorter);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        insertar = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        modificar = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jPanel4.setLayout(null);

        jLabel13.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Insertar");
        jPanel4.add(jLabel13);
        jLabel13.setBounds(110, 10, 80, 30);

        jLabel14.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Correo");
        jPanel4.add(jLabel14);
        jLabel14.setBounds(40, 110, 60, 20);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/checked40.png"))); // NOI18N
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton8);
        jButton8.setBounds(150, 210, 70, 50);
        jPanel4.add(jTextField3);
        jTextField3.setBounds(120, 110, 120, 24);

        jLabel19.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Numero");
        jPanel4.add(jLabel19);
        jLabel19.setBounds(40, 150, 60, 20);
        jPanel4.add(jTextField5);
        jTextField5.setBounds(120, 150, 120, 24);

        jLabel21.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Nombre");
        jPanel4.add(jLabel21);
        jLabel21.setBounds(40, 70, 60, 20);
        jPanel4.add(jTextField7);
        jTextField7.setBounds(120, 70, 120, 24);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancel40.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1);
        jButton1.setBounds(50, 210, 60, 50);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/fondo con figuras.jpg"))); // NOI18N
        jPanel4.add(jLabel15);
        jLabel15.setBounds(0, 0, 360, 380);

        javax.swing.GroupLayout insertarLayout = new javax.swing.GroupLayout(insertar.getContentPane());
        insertar.getContentPane().setLayout(insertarLayout);
        insertarLayout.setHorizontalGroup(
            insertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        insertarLayout.setVerticalGroup(
            insertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insertarLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel5.setLayout(null);

        jLabel16.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Modificar");
        jPanel5.add(jLabel16);
        jLabel16.setBounds(90, 10, 100, 30);

        jLabel17.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Nombre");
        jPanel5.add(jLabel17);
        jLabel17.setBounds(40, 70, 60, 20);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancel40.png"))); // NOI18N
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton9);
        jButton9.setBounds(40, 200, 70, 60);
        jPanel5.add(jTextField4);
        jTextField4.setBounds(120, 70, 120, 24);

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/checked40.png"))); // NOI18N
        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton10);
        jButton10.setBounds(180, 200, 70, 60);
        jPanel5.add(jTextField6);
        jTextField6.setBounds(120, 170, 120, 24);

        jLabel20.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("numero");
        jPanel5.add(jLabel20);
        jLabel20.setBounds(40, 170, 60, 20);
        jPanel5.add(jTextField8);
        jTextField8.setBounds(120, 120, 120, 24);

        jLabel22.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Correo");
        jPanel5.add(jLabel22);
        jLabel22.setBounds(40, 120, 60, 20);

        jLabel18.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/fondo con figuras_1.jpg"))); // NOI18N
        jPanel5.add(jLabel18);
        jLabel18.setBounds(0, 0, 300, 360);

        javax.swing.GroupLayout modificarLayout = new javax.swing.GroupLayout(modificar.getContentPane());
        modificar.getContentPane().setLayout(modificarLayout);
        modificarLayout.setHorizontalGroup(
            modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        modificarLayout.setVerticalGroup(
            modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Dueño", "Placas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(150, 160, 270, 279);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(150, 120, 160, 30);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/back.png"))); // NOI18N
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(0, 400, 60, 32);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGmenu/logo nuevo128.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 10, 130, 120);

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Clientes");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(190, 30, 170, 55);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Insertar");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(320, 330, 60, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOMBRE", "CORREO", "NUMERO" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(330, 120, 90, 30);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/add100.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/add90.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/add110.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(0, 180, 140, 150);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/fondo con figuras_1.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 430, 450);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int idACT;
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        if (evt.getClickCount() == 1) {
            int row = jTable1.getSelectedRow();
            
            Cliente cliente = (Cliente) jTable1.getValueAt(row, 0);
            idACT = cliente.getIdcliente();
            String correo=cliente.getCorreo();
            String numero=cliente.getNumero();
            String nombre = cliente.getNombre();
            jTextField8.setText(correo);
            jTextField6.setText(numero);
            jTextField4.setText(nombre);
            modificar.setVisible(true);
            modificar.setSize(270, 310);
            modificar.setTitle("Modificar Cliente: " + nombre);
            modificar.setLocationRelativeTo(null);
            
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        filter();
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        MenuAdmin menuAdmin = new MenuAdmin();
        menuAdmin.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        insertar.setVisible(true);
        insertar.setSize(270, 330);
        insertar.setTitle("Insertar cliente");
        insertar.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        insertar();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTextField7.setText("");
        jTextField5.setText("");
        jTextField3.setText("");
        insertar.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        
        if (jTextField4.getText().equals("") || jTextField8.getText().equals("") || jTextField6.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Espacios vacios");
        } else {
            Cliente cliente = new Cliente(jTextField4.getText().toUpperCase().trim(), jTextField8.getText().toUpperCase().trim(), jTextField6.getText().toUpperCase().trim(), idACT);
            ClienteDAO clienteDAO = new ClienteDAO();
            clienteDAO.modificar(cliente);
            JOptionPane.showMessageDialog(null, ";)");
            loadmodel();
            modificar.dispose();
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        modificar.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed
    void insertar() {
        ClienteDAO carroDAO = new ClienteDAO();
        if (jTextField3.getText().equals("") || jTextField7.getText().equals("") || jTextField5.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campos Vacios");
        } else {
            String nombre = jTextField7.getText().trim().toUpperCase();
            String correo = jTextField3.getText().trim().toUpperCase();
            String numero = jTextField5.getText().trim().toUpperCase();
            
            Cliente carro = new Cliente(nombre, correo, numero);
            carroDAO.insertar(carro);
            loadmodel();
            jTextField7.setText("");
            jTextField5.setText("");
            jTextField3.setText("");
            insertar.dispose();
        }
    }
    
    void filter() {
        try {
            sorter.setRowFilter(RowFilter.regexFilter(jTextField1.getText().toUpperCase().trim(), jComboBox1.getSelectedIndex()));
        } catch (Exception e) {
            System.out.println("texto vacio " + e);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JDialog insertar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JDialog modificar;
    // End of variables declaration//GEN-END:variables
}
