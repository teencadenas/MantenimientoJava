/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista;

import clases.Cliente;
import control.ControlCliente;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author teenc
 */
public final class CrearClienteFrm extends javax.swing.JInternalFrame {

    /**
     * Creates new form CrearClienteFrm
     */
    
    //Se inportan clases requeridas
    ControlCliente cc = new ControlCliente();
    Cliente cliente = null;

    public CrearClienteFrm() throws SQLException {
        initComponents();
        
        //Se inicia el listado de clientes actuales
        listaClientes();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbNit = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        lbDireccion = new javax.swing.JLabel();
        lbTelefono = new javax.swing.JLabel();
        txtNit = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setClosable(true);
        setTitle("registroCliente");

        lbNit.setText("Nit ");

        lbNombre.setText("Nombre");

        lbDireccion.setText("Direccion");

        lbTelefono.setText("Telefono");

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        tbClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbClientes);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.setEnabled(false);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizar)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbTelefono)
                            .addComponent(lbDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbNit, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNit)
                            .addComponent(txtNombre)
                            .addComponent(txtDireccion)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(btnLimpiar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNit)
                            .addComponent(txtNit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbDireccion)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTelefono)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNuevo)
                            .addComponent(btnBuscar)
                            .addComponent(btnEliminar)
                            .addComponent(btnActualizar))))
                .addGap(18, 18, 18)
                .addComponent(btnLimpiar)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Evento clicl en boton nuevo
    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        
        //Validar casillas con datos
        if (!validarCasillasVacias()) {
            
            try {
                
                //Se valida si el registro ya esta creado
                Cliente nitBuscar = cc.buscarCliente(txtNit.getText());
                
                //Condicional de respuesta a la busqueda del registro
                if (nitBuscar==null) {
                    
                    //Se envia alerta de confirmacion para registro
                    int seleccion = alertaCliente("Crear");
                    
                    //Respuesta a la seleccion de la alerta
                    switch (seleccion) {
                        case 0 -> {
                            nuevoCliente();
                            limpiarCasillas();
                        }
                        case 1 -> {
                            break;
                        }
                            
                        default -> throw new AssertionError();
                    }
                    
                } else {
                    
                    //Error registro ya creado
                    JOptionPane.showMessageDialog(null, "Cliente ya existe en registro");
                }
            } catch (Exception ex) {
                
                Logger.getLogger(CrearClienteFrm.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } else {
            
            JOptionPane.showMessageDialog(null, "Casilla sin datos, complete la informacion");
        }
        try {
            
            //Se actualiza lista registros
            listaClientes();
        } catch (SQLException ex) {
            
            Logger.getLogger(CrearClienteFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnNuevoActionPerformed

    //Accion clic en boton buscar
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        //Validacion casillas diligenciadas
        if (validarCasillasVacias()) {
            
            //ejecuta solicitud
            buscarCliente();
        } else {
            
            JOptionPane.showMessageDialog(null, "Casilla sin datos, complete la informacion");
        }
        try {
            
            //Se actualiza lista de registros
            listaClientes();
        } catch (SQLException ex) {
            
            Logger.getLogger(CrearClienteFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    //Accion clic en boton eliminar cliente
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        //Validacion casillas diligenciadas
        if (!validarCasillasVacias()) {
            
            //confirmacion de alerta 
            int confirmacion = alertaCliente("eliminara");
            
            //accion segun alerta 
            switch (confirmacion) {
                case 0:
                    
                    //accion de eliminar registro
                    eliminarCliente();
                    break;
                case 1:break;    
            }
        } else {
            
            JOptionPane.showMessageDialog(null, "Casillas sin datos, complete la informacion");
        }
        try {
            
            //Actualizacion de listado registros
            listaClientes();
        } catch (SQLException ex) {
            Logger.getLogger(CrearClienteFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        
        //validacion de casillas diligenciadas
        if (!validarCasillasVacias()) {
            
            //alerta de confirmacion
            int confirmacion = alertaCliente("actualizara");
            
            //Accion segun confirmacion
            switch (confirmacion) {
                case 0:
                    
                    //Actualizacion de registro
                    actualizarCliente();
                    break;
                case 1:
                    break;
            }} else {
            
            JOptionPane.showMessageDialog(null, "Casillas sin datos, complete la informacion");
        }
        try {
            
            //Actualizacion listado de registros
            listaClientes();
        } catch (SQLException ex) {
            Logger.getLogger(CrearClienteFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    //Accion boton limpiar
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarCasillas();
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnBuscar.setEnabled(true);
        btnNuevo.setEnabled(true);
        txtNit.setEditable(true);
        try {
            
            //Actualiza listado
            listaClientes();
        } catch (SQLException ex) {
            
            Logger.getLogger(CrearClienteFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLimpiarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDireccion;
    private javax.swing.JLabel lbNit;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbTelefono;
    private javax.swing.JTable tbClientes;
    public javax.swing.JTextField txtDireccion;
    public javax.swing.JTextField txtNit;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    //Validar texto vacio
    public boolean validarCasillasVacias(){
        
        //Texto vacio
        String texto = "";
        
        //Se valida que ninguna casilla este vacia
        return (txtDireccion.getText().equals(texto)||txtNit.getText().equals(texto)||txtNombre.getText().equals(texto)
                ||txtTelefono.getText().equals(texto));
        
    }
    
    public void nuevoCliente() throws SQLException{
        
        //Se construye clase desde los textos
        cliente = new Cliente(txtNit.getText().toLowerCase(), txtNombre.getText().toLowerCase(), txtDireccion.getText().toLowerCase(),
            txtTelefono.getText().toLowerCase());
        
        //Se crea nuevo registro
        cc.nuevoCliente(cliente);
        
    }
    
    //Buscar cliente
    public void buscarCliente(){
        
        try {
            
            //Se crea la clase con la informacion recogida
            cliente = cc.buscarCliente(txtNit.getText().toLowerCase());
            
            if(cliente==null){
                
                JOptionPane.showMessageDialog(null, "Cliente no encontrado");
            }else{
                
                //Se envia la informacion a las casillas
                txtNit.setText(cliente.getNit().toLowerCase());
                txtNombre.setText(cliente.getNombreCliente().toLowerCase());
                txtDireccion.setText(cliente.getDireccionCliente().toLowerCase());
                txtTelefono.setText(cliente.getTelefonoCliente().toLowerCase());
                txtNit.setEditable(false);
                btnEliminar.setEnabled(true);
                btnActualizar.setEnabled(true);
                btnNuevo.setEnabled(false);
            }
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e.getMessage());
            
        }
    }
    
    //Limpiar casillas
    public void limpiarCasillas(){
        txtDireccion.setText("");
        txtNit.setText("");
        txtNombre.setText("");
        txtTelefono.setText("");
    }
    
    //Alerta cambios en base de datos
    public int alertaCliente(String accion){
        
        //Alerta con la informacion del registro que se alterara
        return JOptionPane.showConfirmDialog(null,
    "\"Se "+accion+" el reguistro: "+"\n" +
"   \"Nit       :"+txtNit.getText()+"\n" +
"   \"Nombre    :"+txtNombre.getText()+"\n" +
"   \"Direccion :"+txtDireccion.getText()+"\n" +
"   \" Telefono  :"+txtTelefono.getText(),
 "Confirmacion", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
        
    }

    //listado de registros existentes
    public void listaClientes() throws SQLException {
        
        //Se inicia lista de registros
        List<Cliente> lista;
        
        
        try {
            
            //Se crea el modelo de tabla
            DefaultTableModel tClientes = new DefaultTableModel();
            
            //Se crea el encabezado de la tabla
            String[] registro = new String[4];
            tClientes.addColumn("Nit");
            tClientes.addColumn("Nombre");
            tClientes.addColumn("Direccion");
            tClientes.addColumn("Telefono");
            
            //Se obtiene el listado de registros
            lista = cc.listarCliente();
            
            //Se rellena la modelo de tabla con los registros de la lista
            for (Cliente cl : lista) {
                registro[0] = cl.getNit();
                registro[1] = cl.getNombreCliente();
                registro[2] = cl.getDireccionCliente();
                registro[3] = cl.getNombreCliente();
                tClientes.addRow(registro);
            }
            
            //Se envia el modelo de tabla a la tabla del fr¿ormulario
            tbClientes.setModel(tClientes);
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    
    //Elimianr cliente
    public void eliminarCliente(){
        
        try {
            
            //Eliminacion de registro
            cc.eliminarCliente(txtNit.getText().toLowerCase());
            
            //Reinicio del formulario a su estado original
            limpiarCasillas();
            btnEliminar.setEnabled(false);
            btnActualizar.setEnabled(false);
            btnNuevo.setEnabled(true);
            txtNit.setEditable(true);
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }
    
    
    //Accion actualizar cliente
    public void actualizarCliente(){
        try {
            
            //Se construye clase desde los textos
            cliente = new Cliente(txtNit.getText().toLowerCase(), txtNombre.getText().toLowerCase(), txtDireccion.getText().
                    toLowerCase(),txtTelefono.getText().toLowerCase());
            
            //Se actualiza registro
            cc.actualizarCliente(cliente);
            
            //Reinicio del formulario a su estado original
            limpiarCasillas();
            btnEliminar.setEnabled(false);
            btnActualizar.setEnabled(false);
            btnNuevo.setEnabled(true);
            txtNit.setEditable(true);
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }
}
