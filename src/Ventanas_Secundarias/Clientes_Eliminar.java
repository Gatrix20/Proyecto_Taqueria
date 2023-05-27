/*
Descripción: PROYECTO FINAL
Fecha: AGOSTO 2022
Equipo:
*Aguilar Brun Mario
*Lizárraga Moreno Ricardo
*Lopez Mora Alan Ignacio
*Meza Borrego Juan Manuel
*Pérez Pérez Joshua Mizraim
*Toledo Becerra Gustavo

 */
package Ventanas_Secundarias;

import Metodos_SQL.Conexion_SQL;
import Metodos_SQL.IniciarSesion_BD;
import Ventana_Principales.Clientes;
import static Ventana_Principales.Ventana_Admin.Contenido;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author leone
 */
public class Clientes_Eliminar extends javax.swing.JPanel {
    Connection reg;
    Conexion_SQL conn;
    private int id;
    IniciarSesion_BD bd = new IniciarSesion_BD();
    
    /**
     * Creates new form Empleados_Eliminar
     */
    public Clientes_Eliminar() {
        initComponents();
        //Metodo para mostar Los clientes en la tabla
        try{
            DefaultTableModel modelo = new DefaultTableModel();
            ClientesD.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Connection conectar = Conexion_SQL.getConnection();
            
            String sql = "SELECT * FROM clientes";
            
            ps = conectar.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            
            modelo.addColumn("ID");
            modelo.addColumn("Direccion");
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido");
            modelo.addColumn("Telefono");
            
            
            
            
            while(rs.next()){
                
                Object[] filas = new Object[cantidadColumnas];
                for (int i=0; i< cantidadColumnas; i++){
                    filas[i] = rs.getObject(i+1);
                }
                modelo.addRow(filas);
            }
            
        }catch (SQLException ex){
            System.err.println(ex.toString());
            
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Regresar = new javax.swing.JPanel();
        lblRegresar = new javax.swing.JLabel();
        Eliminar = new javax.swing.JPanel();
        lblEE = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txt_id = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ClientesD = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setBackground(new java.awt.Color(13, 71, 171));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Eliminar Cliente");

        javax.swing.GroupLayout TituloLayout = new javax.swing.GroupLayout(Titulo);
        Titulo.setLayout(TituloLayout);
        TituloLayout.setHorizontalGroup(
            TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TituloLayout.createSequentialGroup()
                .addContainerGap(334, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(270, 270, 270))
        );
        TituloLayout.setVerticalGroup(
            TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TituloLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel10)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 100));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Regresar.setBackground(new java.awt.Color(19, 90, 173));
        Regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegresarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RegresarMousePressed(evt);
            }
        });
        Regresar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRegresar.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        lblRegresar.setForeground(new java.awt.Color(255, 255, 255));
        lblRegresar.setText("Regresar");
        Regresar.add(lblRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel2.add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 160, 50));

        Eliminar.setBackground(new java.awt.Color(19, 90, 173));
        Eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EliminarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EliminarMousePressed(evt);
            }
        });
        Eliminar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEE.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        lblEE.setForeground(new java.awt.Color(255, 255, 255));
        lblEE.setText("Eliminar Cliente");
        Eliminar.add(lblEE, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jPanel2.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, 220, 50));

        lblNombre.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(13, 71, 171));
        lblNombre.setText("Clientes");
        jPanel2.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(19, 90, 173));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 810, 10));

        txt_id.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_id.setForeground(new java.awt.Color(153, 153, 153));
        txt_id.setText("Ingrese el ID del Cliente a Eliminar");
        txt_id.setBorder(null);
        txt_id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_idMousePressed(evt);
            }
        });
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });
        txt_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_idKeyTyped(evt);
            }
        });
        jPanel2.add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 810, 30));

        ClientesD.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        ClientesD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido", "Direccion", "Telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ClientesD.setSelectionBackground(new java.awt.Color(0, 102, 255));
        jScrollPane1.setViewportView(ClientesD);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 810, 200));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 860, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 865, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 865, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void EliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarMouseExited
        resetColor(Eliminar);
    }//GEN-LAST:event_EliminarMouseExited

    private void EliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarMouseEntered
        setColor(Eliminar);
    }//GEN-LAST:event_EliminarMouseEntered

    private void RegresarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresarMousePressed
        /////REGRESAR A LA SECCION/////
        Clientes c = new Clientes();
        c.setSize(860, 560);
        c.setLocation(0,0);
        
        Contenido.removeAll();
        Contenido.add(c, BorderLayout.CENTER);
        Contenido.revalidate();
        Contenido.repaint();
    }//GEN-LAST:event_RegresarMousePressed

    private void RegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresarMouseExited
        //Metodo para darle color al entrar
        resetColor(Regresar);
    }//GEN-LAST:event_RegresarMouseExited

    private void RegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresarMouseEntered
        //Metodo para darle color al entrar
        setColor(Regresar);
    }//GEN-LAST:event_RegresarMouseEntered

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
       
    }//GEN-LAST:event_txt_idActionPerformed

    private void txt_idMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_idMousePressed
        //Metodo al hacer click desaparesca el texto por defauilt
        if(txt_id.getText().equals("Ingrese el ID del Cliente a Eliminar"))
        txt_id.setText("");
        txt_id.setForeground(Color.black);
        
    }//GEN-LAST:event_txt_idMousePressed

    private void EliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarMousePressed
        //Metodo Para eliminar Al cliente Registrado dentro de la base de datos
        if(bd.existeClientesP(txt_id.getText())==1){
            JOptionPane.showMessageDialog(null, "El Cliente no se puede eliminar por que tiene un Pedido Activo");
        }else{
        if(bd.existeClientes(txt_id.getText())==0){
            JOptionPane.showMessageDialog(null, "El ID no existe");
        }
        else{
        String id = txt_id.getText();
        if(id.equals("Ingrese el ID del Cliente a Eliminar")||id.equals("")){
            JOptionPane.showMessageDialog(null, "Por Favor Digite el ID del Cliente");
        }else{
            int pregunta = JOptionPane.showConfirmDialog(null, "¿ Esta seguro que Desea Eliminar al Cliente: ", "Eliminar", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if(pregunta==0){
                if(pregunta==0){
                IniciarSesion_BD Eliminar = new IniciarSesion_BD();
                String valor = txt_id.getText();
                int value = Integer.parseInt(valor);
                Eliminar.eliminarClientes(value);
                JOptionPane.showMessageDialog(this, "El Cliente se elimino correctamente");
                tablaClientes();
                }
            }
          }
        }
      }
        
        
        
        /*int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null,"Desea eliminar al Cliente? ","Eliminar",dialog); //Dar un mensaje para verificar que desea salir
        
        if(result==0){ //Si el resultado es Si
            IniciarSesion_BD Eliminar = new IniciarSesion_BD();
            String valor = txt_id.getText();
            int value = Integer.parseInt(valor);
            Eliminar.eliminarClientes(value);
          
        }*/
        
    }//GEN-LAST:event_EliminarMousePressed

    private void txt_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_idKeyTyped
       //Valida el ingreso de solo numeros
        Character n = evt.getKeyChar();
        
        if(!Character.isDigit(n)){
            evt.consume();
        
        }
        if(txt_id.getText().length() >=9){
            evt.consume();
        }
    }//GEN-LAST:event_txt_idKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ClientesD;
    private javax.swing.JPanel Eliminar;
    private javax.swing.JPanel Regresar;
    private javax.swing.JPanel Titulo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblEE;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRegresar;
    private javax.swing.JTextField txt_id;
    // End of variables declaration//GEN-END:variables
    
    //Metodo para definir color
    private void setColor(JPanel panel) {
       panel.setBackground(new Color(21,101,192));
    }
    //Metodo para definir color
    private void resetColor(JPanel panel) {
         panel.setBackground(new Color(18,90,173));
    }
    public void tablaClientes(){
        //Metodo para mostar Los clientes en la tabla
        try{
            DefaultTableModel modelo = new DefaultTableModel();
            ClientesD.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Connection conectar = Conexion_SQL.getConnection();
            
            String sql = "SELECT * FROM clientes";
            
            ps = conectar.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            
            modelo.addColumn("ID");
            modelo.addColumn("Direccion");
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido");
            modelo.addColumn("Telefono");
            
            
            
            
            while(rs.next()){
                
                Object[] filas = new Object[cantidadColumnas];
                for (int i=0; i< cantidadColumnas; i++){
                    filas[i] = rs.getObject(i+1);
                }
                modelo.addRow(filas);
            }
            
        }catch (SQLException ex){
            System.err.println(ex.toString());
            
        }
    }
   
}
