/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista;

import clases.OrdenTrabajo;
import clases.Servicio;
import clases.UnidadComercial;
import control.ControlOrdenTrabajo;
import control.ControlServicio;
import control.ControlUnidadComercial;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author teenc
 */
public class OrdenTrabajoFrm extends javax.swing.JInternalFrame {

    ControlServicio cs = new ControlServicio();
    ControlUnidadComercial cuc = new ControlUnidadComercial();
    ControlOrdenTrabajo cot = new ControlOrdenTrabajo();
    DefaultTableModel tablaServ;
    Servicio s = null;
    UnidadComercial uc = null;
    OrdenTrabajo ot = null;
    ArrayList<Servicio> lista = new ArrayList<>();

    /**
     * Creates new form ordentrabajoFrm
     */

    public OrdenTrabajoFrm() {
        initComponents();
        listaServicios();
        listaComercio();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabalServicio = new javax.swing.JTable();
        txtNumOrden = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        cbxIdComercio = new javax.swing.JComboBox<>();
        cbxIdServicio = new javax.swing.JComboBox<>();
        btnAgrgarServ = new javax.swing.JButton();
        datCreacion = new com.toedter.calendar.JDateChooser();
        dateCierre = new com.toedter.calendar.JDateChooser();
        lblNombreComercio = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnNuevaOrden = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblNombreServi = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setClosable(true);

        jLabel1.setText("N orden");

        jLabel2.setText("Estado");

        jLabel3.setText("Comercio");

        jLabel4.setText("Fecha Solicitud");

        jLabel5.setText("Fecha Vencimiento");

        jLabel6.setText("Servicios");

        jScrollPane3.setViewportView(tabalServicio);

        txtEstado.setEditable(false);
        txtEstado.setText("Abierto");

        cbxIdComercio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxIdComercio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxIdComercioActionPerformed(evt);
            }
        });

        cbxIdServicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxIdServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxIdServicioActionPerformed(evt);
            }
        });

        btnAgrgarServ.setText("Agregar");
        btnAgrgarServ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgrgarServActionPerformed(evt);
            }
        });

        lblNombreComercio.setText("jLabel7");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnNuevaOrden.setText("Nuevo");
        btnNuevaOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaOrdenActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        lblNombreServi.setText("jLabel8");

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
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxIdServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNombreServi, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAgrgarServ)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLimpiar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNumOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(datCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dateCierre, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbxIdComercio, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblNombreComercio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(btnBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(btnNuevaOrden)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNumOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbxIdComercio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreComercio))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(datCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(dateCierre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbxIdServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreServi)
                    .addComponent(btnLimpiar)
                    .addComponent(btnAgrgarServ))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btnNuevaOrden)
                    .addComponent(btnEliminar))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Accion clic en combobox id servicio cargar lista de registros en servicio
    private void cbxIdServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxIdServicioActionPerformed
        cargarNombreServicio();
    }//GEN-LAST:event_cbxIdServicioActionPerformed

    //Accion clic en boton agregar
    private void btnAgrgarServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgrgarServActionPerformed
        try {
            s = cs.buscarServicio(cbxIdServicio.getSelectedItem().toString().toLowerCase());
            lista.add(s);
            serviciosSolicitados(lista);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnAgrgarServActionPerformed

    //Accion clic boton limiar
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        vaciarTabla();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    //Accion cargar listado de unidades comerciales en cbx id comercio
    private void cbxIdComercioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxIdComercioActionPerformed
        cargarnombreUnidadComercial();
    }//GEN-LAST:event_cbxIdComercioActionPerformed

    //Accion clic boton buscar
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscarOt();
    }//GEN-LAST:event_btnBuscarActionPerformed

    //Accion clic boton nuevo
    private void btnNuevaOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaOrdenActionPerformed
        nuevaOrden();
    }//GEN-LAST:event_btnNuevaOrdenActionPerformed

    //Accion clic boton eliminar
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        cot.eliminarOrdenTrabajo(txtNumOrden.getText());
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgrgarServ;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnNuevaOrden;
    private javax.swing.JComboBox<String> cbxIdComercio;
    private javax.swing.JComboBox<String> cbxIdServicio;
    private com.toedter.calendar.JDateChooser datCreacion;
    private com.toedter.calendar.JDateChooser dateCierre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblNombreComercio;
    private javax.swing.JLabel lblNombreServi;
    private javax.swing.JTable tabalServicio;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtNumOrden;
    // End of variables declaration//GEN-END:variables

    public void serviciosSolicitados(List<Servicio> solicitados) {

        try {

            //Se crea modelo tabla con registros
            tablaServ = new DefaultTableModel();

            //Se crea encabezado de la tabla
            String[] registro = new String[3];
            tablaServ.addColumn("Id Servicio");
            tablaServ.addColumn("Nombre");
            tablaServ.addColumn("Discripcion");

            //Se cargan los registros en el modelo tabla
            for (Servicio s : solicitados) {
                registro[0] = s.getIdServicio();
                registro[1] = s.getNombreServicio();
                registro[2] = s.getDescripcion();

                //Se adicionan filas necesarias para cargar registros
                tablaServ.addRow(registro);
            }

            //Se carga el modelo tabla a la tabla del formulario
            tabalServicio.setModel(tablaServ);
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    //Se crea lista de servicio a combobox
    public void listaServicios() {
        try {

            //Se carga el combobox de listado servicio
            cbxIdServicio.removeAllItems();

            //Se crea listado servicio
            ArrayList<Servicio> lista = cs.listaServicios();

            //Se cargan los registros al combobox
            for (Servicio se : lista) {

                cbxIdServicio.addItem(se.getIdServicio().toLowerCase());
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.getMessage() + " cbx ");
        }
    }

    //Cargar label de nombre servicio segun id seleccionado en combobox id servicio
    private void cargarNombreServicio() {
        try {

            //Validar casilla vacias de combobox id servicio
            if (cbxIdServicio.getSelectedItem() != null) {

                //Solicitud de buscar el servcio 
                s = cs.buscarServicio(cbxIdServicio.getSelectedItem().toString().toLowerCase());

                //Cargar nombre en label
                lblNombreServi.setText(s.getNombreServicio().toUpperCase());
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.getMessage() + " lb ");
        }
    }

    //Vaciar la tabla de servicios de la orden
    public void vaciarTabla() {
        try {

            //Condicional de tabla vacia
            if (tablaServ != null) {

                //Vaciado de la tabla en el form
                tabalServicio.getModel();
                tablaServ.setRowCount(0);
                lista.clear();
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    //Cargar nombre dde unidad comercial en label segun id de unidad comercial del combobox id unidad comercial
    private void cargarnombreUnidadComercial() {
        try {

            //Conbicional de combobox id unidad comercial este diligenciado
            if (cbxIdComercio.getSelectedItem() != null) {

                //Solicitud buscar unidad comercial
                uc = cuc.buscarUnidadComercial(cbxIdComercio.getSelectedItem().toString().toLowerCase());

                //cargar nombre de unidad comercial en label
                lblNombreComercio.setText(uc.getNombreUnidadComercial().toLowerCase());
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.getMessage() + " lb ");
        }
    }

    //Listar uniades comerciales en combobox unidad comercial
    public void listaComercio() {
        try {

            //Se limpia el combobox unidad comercial
            cbxIdComercio.removeAllItems();

            //Se crea listado de unicades comerciales
            ArrayList<UnidadComercial> lista = cuc.listarUnidadComercial();

            //cargan los registros al combobox
            for (UnidadComercial uc : lista) {
                cbxIdComercio.addItem(uc.getIdUnidadComercial().toLowerCase());
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.getMessage() + " cbx ");
        }
    }

    //Buscar registro 
    private void buscarOt() {
        try {

            //Se retiran los registros guardados en la tabla del formulario
            vaciarTabla();

            //Se crea el modelo de tabla
            tablaServ = new DefaultTableModel();

            //Se busca la orden de trabajo seleccionada
            ot = cot.buscarOrdenTrabajo(txtNumOrden.getText().toLowerCase());

            //Se envian los registros encontrados a la respectiva casilla
            txtNumOrden.setText(ot.getIdOrdenTrabajo());
            txtEstado.setText(ot.getEstado());
            cbxIdComercio.setSelectedItem(ot.getUnidadCo().getIdUnidadComercial().toLowerCase());
            lblNombreComercio.setText(ot.getUnidadCo().getNombreUnidadComercial().toLowerCase());
//            datCreacion.setDate(ot.getFechaSolicitud());
//            dateCierre.setDate(ot.getFechaCierre());

            //Se listan os servicios solicitados para la orden de trabajo
            ArrayList<Servicio> listaS;

            //Se crea el encabezado de la tabla de servicios solicitados
            String[] registro = new String[3];
            tablaServ.addColumn("Id Servicio");
            tablaServ.addColumn("Servicio");
            tablaServ.addColumn("Descripcion");

            //se toma la lista de servicios solicitados
            listaS = ot.getidServiciosSolicitados();

            //Se envian los registros a el modelo de tabla
            for (Servicio sv : listaS) {
                registro[0] = sv.getIdServicio();
                registro[1] = sv.getNombreServicio();
                registro[2] = sv.getDescripcion();

                //Se crea nueva fila en el modelo tabla necesario para los registros encontrados
                tablaServ.addRow(registro);
            }

            //Se envia el modelo de tabla creado a la tabla del formulario
            tabalServicio.setModel(tablaServ);
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    //Se crea el listado de los servicios ccreados para un nuevo registro de orden trabajo
    private List<Servicio> listaServNuevo() {

        //Se crea la lista para los servicios
        List<Servicio> listServ = new ArrayList<>();

        try {

            //Se cuenta el numero de registros
            int rows = tablaServ.getRowCount();

            //Se toma los registros de la tabla para crear la clase servicio
            for (int i = 0; i < rows; i++) {
                String idServicio = String.valueOf(tabalServicio.getValueAt(i, 0));
                String nombre = String.valueOf(tabalServicio.getValueAt(i, 1));
                String descripcion = String.valueOf(tabalServicio.getValueAt(i, 2));

                //Crea clase servicio
                Servicio s = new Servicio(idServicio, nombre, descripcion);

                //se agrega el registro a la lista de registros
                listServ.add(s);
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        //Se envia como respuesta la lista de registros
        return listServ;

    }

    //Funcion crear nuevo registro
    public void nuevaOrden() {
        try {

            //Se inicia lista para guardar registros
            List<Servicio> liSe = listaServNuevo();

            //se toman los datos para crear la clase ordentrabajo
            String idOrden = txtNumOrden.getText().toLowerCase();
            String estado = txtEstado.getText().toLowerCase();
            String fSolicitud = "";
            String fCierre = "";

            //Se busca la unidad comercial relacionada a la orden
            uc = cuc.buscarUnidadComercial(cbxIdComercio.getSelectedItem().toString().toLowerCase());

            //Se crea la clase orden trabajo
            ot = new OrdenTrabajo(idOrden, estado, uc, fSolicitud,
                    fCierre, liSe);

            //Se realiza creacion del nuevo registro en base de datos
            cot.nuevoOrdenTrabajo(ot);
        } catch (Exception e) {

            JOptionPane.showConfirmDialog(null, e.getMessage());
        }
    }

    public boolean validarCasillasDesocupadas() {

        //Validacion de casillas vacias
        return txtEstado.getText().equals("") || txtNumOrden.getText().equals("") || cbxIdComercio.getSelectedItem().equals("")
                || cbxIdServicio.getSelectedItem().equals("") || datCreacion.toString().equals("") || dateCierre.toString().equals("");
    }

    //Funcion restablecer valores del form
    public void limpiarCasillas() {
        txtEstado.setText("");
        txtNumOrden.setText("");
        cbxIdComercio.setSelectedItem("");
        cbxIdServicio.setSelectedItem("");
//        datCreacion;
//        dateCierre;

    }

    //Alerta de cambios en registros
    public int alertaOt(String accion) {

        //Alerta con los datos del registro a alterar
        return JOptionPane.showConfirmDialog(null,
                "Se " + accion + " el registro: "
                + "Numero Orden: " + txtNumOrden.getText()
                + "Estado: " + txtEstado.getText()
                + "Comercio: " + lblNombreComercio.getText()
                + "Creado el: " + datCreacion.getDateFormatString()
                + "Cierre: " + dateCierre.getDateFormatString(),
                "Confirmacion", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);

    }

}