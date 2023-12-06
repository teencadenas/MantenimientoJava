/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista;

import clases.Cliente;
import clases.UnidadComercial;
import control.ControlCliente;
import control.ControlUnidadComercial;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author teenc
 */
public class UnidadComercialFrm extends javax.swing.JInternalFrame {

    /**
     * Creates new form UnidadComercialFrm
     */
    //Se importan las clases necesarias
    Cliente cl = null;
    UnidadComercial uc = null;
    ControlUnidadComercial cuc = new ControlUnidadComercial();
    ControlCliente cc = new ControlCliente();

    public UnidadComercialFrm() {
        initComponents();
        //Se realiza la carga de los registros en el combobox 
        cargarDatosCliente();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        cbxCliente = new javax.swing.JComboBox<>();
        lbNombreCliente = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setText("Id Comercio");

        jLabel2.setText("Nombre");

        jLabel3.setText("Direccion");

        jLabel4.setText("Tipo");

        jLabel5.setText("Cliente");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        cbxCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxClienteActionPerformed(evt);
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
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnBuscar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnNuevo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnEliminar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnActualizar))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpiar)
                            .addGap(118, 118, 118)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                            .addComponent(txtNombre)
                            .addComponent(txtDireccion)
                            .addComponent(txtTipo)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(cbxCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(lbNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnBuscar)
                    .addComponent(btnNuevo)
                    .addComponent(btnEliminar)
                    .addComponent(btnActualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLimpiar)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Accion click boton nuevo
    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed

        //Validar casillas vacias
        if (validarCasillasVacias()) {

            JOptionPane.showMessageDialog(null, "Casillas vacias, llene el formulario completo");
        } else {
            try {

                //Se realiza la validacion que el identificador no este repetido     
                cl = cc.buscarCliente(txtId.getText());

                //condicional registro creado
                if (cl == null) {

                    //Confirmacion alerta de consulta
                    int alerta = alertaUnidadComercial("Creara");

                    //Seleccion alerta
                    switch (alerta) {
                        case 0 -> {
                            nuevoUnidadComercial();
                            limpiarCasillas();
                            JOptionPane.showMessageDialog(null, "Se creo el nuevo registro");
                        }
                        case 1 -> {
                            break;
                        }
                        default ->
                            throw new AssertionError();
                    }
                } else {

                    JOptionPane.showMessageDialog(null, "Id ya creado");
                }

            } catch (Exception ex) {

                Logger.getLogger(UnidadComercialFrm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnNuevoActionPerformed

    //Accion click en boton buscar
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        //Verificacion id diligenciado
        if (txtId.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Casillas vacios, llene el formulario completo");
        } else {

            try {

                //Buscar registro
                buscarUnidadComercial();
                if (!buscarUnidadComercial()) {
                    JOptionPane.showMessageDialog(null, "Regiatro no encontrado");
                }else{
                    //Ideditable identificador ni crear nuevo registro
                    txtId.setEnabled(false);
                    btnNuevo.setEnabled(false);
                    btnEliminar.setEnabled(true);
                    btnActualizar.setEnabled(true);
                    cbxCliente.setEnabled(false);
                    
                }
            } catch (HeadlessException ex) {

                Logger.getLogger(UnidadComercialFrm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    //Accion seleccion en combobox cliente para cargar el nombre del cliente seleccionado en combobox
    private void cbxClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxClienteActionPerformed

        //Validar que combobox no este vacio
        if (cbxCliente != null) {

            //Se envia nombre cliente a label
            llenarLabelNombreClientes();
        }
    }//GEN-LAST:event_cbxClienteActionPerformed

    //Accion click boton eliminar
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        //Validar casillas diligenciadas
        if (validarCasillasVacias()) {

            JOptionPane.showMessageDialog(null, "Casillas vacios, llene el formulario completo");
        } else {

            try {

                //Confirmacion de consulta
                int alerta = alertaUnidadComercial("eliminara");

                //Accion segun confirmacion
                switch (alerta) {
                    case 0 -> {

                        //Eliminacion de registro
                        eliminarUnidadComercial();
                        //Restauracion de formulario
                        limpiarCasillas();
                        JOptionPane.showMessageDialog(null, "Se elimino el registro");
                    }
                    case 1 -> {

                        //restaurar formulario
                        limpiarCasillas();
                        break;
                    }
                    default ->
                        throw new AssertionError();
                }
            } catch (HeadlessException ex) {

                Logger.getLogger(UnidadComercialFrm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        //Validar casillas diligenciadas
        if (validarCasillasVacias()) {

            JOptionPane.showMessageDialog(null, "Casillas vacias, llene el formulario completo");
        } else {
            try {

                //Confirmacion de consulta
                int alerta = alertaUnidadComercial("actualizara");

                //Accion segun confirmacion
                switch (alerta) {
                    case 0 -> {

                        //Actualizacion registro y restauracion de formulario
                        actualizarUnidadComercial();
                        limpiarCasillas();
                        JOptionPane.showMessageDialog(null, "Se Actualizo el nuevo registro");
                    }
                    case 1 -> {

                        //Restauracion formulario
                        limpiarCasillas();
                        break;
                    }
                    default ->
                        throw new AssertionError();
                }
            } catch (HeadlessException ex) {

                Logger.getLogger(UnidadComercialFrm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    //Accion click boton limpiar
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarCasillas();
    }//GEN-LAST:event_btnLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cbxCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbNombreCliente;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables

    //Asignacion de registros al combobox clientes
    public void llenarComboBoxIdClientes() throws SQLException {

        try {

            //Se limpia combobox
            cbxCliente.removeAllItems();
            //Se crea listado registros
            List<Cliente> lista = cc.listarCliente();
            //Se envian registros al combobox
            for (Cliente cli : lista) {
                cbxCliente.addItem(cli.getNit());
            }
        } catch (SQLException ex) {

            Logger.getLogger(UnidadComercialFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Funcion enviar colmna regostro segun combobox cliente
    public void llenarLabelNombreClientes() {
        try {

            //VAlidacion combobox diligenciado
            if (cbxCliente.getSelectedItem() != null) {

                //Buscar registro segun selecion combobox
                cl = cc.buscarCliente(cbxCliente.getSelectedItem().toString());
                //Enviar registro a label
                lbNombreCliente.setText(cl.getNombreCliente());
            }
        } catch (Exception ex) {

            Logger.getLogger(UnidadComercialFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Se inicia combobox y label con datos de registros
    public void cargarDatosCliente() {
        try {

            //Se inicia datos del combobox y label
            llenarComboBoxIdClientes();
            llenarLabelNombreClientes();
        } catch (SQLException ex) {

            Logger.getLogger(UnidadComercialFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Se validan casillas vacioas del formulario
    public boolean validarCasillasVacias() {

        return txtDireccion.getText().equals("") || txtId.getText().equals("") || txtNombre.getText().equals("")
                || txtTipo.getText().equals("") || cbxCliente.getSelectedItem().equals("");

    }

    //Se reinicia el formulario
    public void limpiarCasillas() {

        //Se desocupan textos
        txtDireccion.setText("");
        txtId.setText("");
        txtNombre.setText("");
        txtTipo.setText("");
        cbxCliente.setSelectedItem("");
        //Se habilitan casillas y botones
        txtDireccion.setEnabled(true);
        txtId.setEnabled(true);
        txtNombre.setEnabled(true);
        txtTipo.setEnabled(true);
        cbxCliente.setEnabled(true);
        btnActualizar.setEnabled(false);
        btnBuscar.setEnabled(true);
        btnEliminar.setEnabled(false);
        btnNuevo.setEnabled(true);
        cargarDatosCliente();

    }

    //se crea alerta de consulta
    public int alertaUnidadComercial(String accion) {

        return JOptionPane.showConfirmDialog(null,
                "se " + accion + " el registro : " + "\n"
                + "Comercio :" + txtId.getText() + "\n"
                + "Nombre :" + txtNombre.getText() + "\n"
                + "Direccion :" + txtDireccion.getText() + "\n"
                + "Tipo :" + txtTipo.getText() + "\n"
                + "Cliente :" + lbNombreCliente.getText(),
                "Confirmacion", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);

    }

    //Se rea nuevo registro
    public void nuevoUnidadComercial() {

        try {
            //Se la creacion de la clase tomando los valores del formulario
            cl = cc.buscarCliente(cbxCliente.getSelectedItem().toString());
            uc = new UnidadComercial(txtId.getText(), txtNombre.getText(), txtNombre.getText(),
                    txtTipo.getText(), cl);

            //Se genera consulta a la base de datos
            cuc.nuevaUnidadComercial(uc);
        } catch (Exception ex) {

            Logger.getLogger(UnidadComercialFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Se busca registro segun identificador
    public boolean buscarUnidadComercial() {
        try {
            //Se toma identificador para realizar busqueda en base de datos
            uc = cuc.buscarUnidadComercial(txtId.getText());
                if (uc!=null) {
                    //Se asignan valores a las casillas segun registro encontrado
                    txtNombre.setText(uc.getNombreUnidadComercial());
                    txtDireccion.setText(uc.getDireccionUnidadComercial());
                    txtTipo.setText(uc.getTipologia());
                    cbxCliente.removeAllItems();
                    cbxCliente.addItem(uc.getcliente().getNit());
                return true;
                }  
        } catch (HeadlessException ex) {

            Logger.getLogger(UnidadComercialFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    //Se elimina registro segun identificador
    private void eliminarUnidadComercial() {
        try {

            //Se realiza consulta de eliminacion
            cuc.eliminarUnidadComercial(txtId.getText());

        } catch (Exception ex) {

            Logger.getLogger(UnidadComercialFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Se actualiza registro segun identificador
    public void actualizarUnidadComercial() {
        try {

            //Se la creacion de la clase tomando los valores del formulario
            uc = new UnidadComercial(txtId.getText(), txtNombre.getText(), txtNombre.getText(),
                    txtTipo.getText(), cl);

            //Se realiza consulta de actualizacion    
            cuc.actualizarUnidadComercial(uc);
        } catch (Exception ex) {

            Logger.getLogger(UnidadComercialFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}