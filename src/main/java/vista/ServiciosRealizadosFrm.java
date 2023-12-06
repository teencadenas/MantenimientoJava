/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista;

import clases.Empleado;
import clases.OrdenTrabajoFrm;
import clases.Servicio;
import clases.ServiciosRealizados;
import control.ControlEmpleado;
import control.ControlOrdenTrabajo;
import control.ControlServicio;
import control.ControlServiciosRealizados;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author teenc
 */
public class ServiciosRealizadosFrm extends javax.swing.JInternalFrame {

    /**
     * Creates new form ServiciosRealizadosFrm
     */
    ControlEmpleado ce = new ControlEmpleado();
    ControlOrdenTrabajo cot = new ControlOrdenTrabajo();
    ControlServicio cs = new ControlServicio();
    ControlServiciosRealizados csr = new ControlServiciosRealizados();
    DefaultTableModel tablaServicio;
    Servicio s = null;
    OrdenTrabajoFrm ot = null;
    Empleado em = null;
    ServiciosRealizados sr = null;
    ArrayList<Servicio> lista = new ArrayList<>();

    public ServiciosRealizadosFrm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSerRealizados = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cbxServicios = new javax.swing.JComboBox<>();
        lblServicios = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnAgrgar = new javax.swing.JButton();
        cbxEmpleado = new javax.swing.JComboBox<>();
        cbxOrdenTrabajo = new javax.swing.JComboBox<>();
        lblNombreEmpleado = new javax.swing.JLabel();
        lblComercioCliente = new javax.swing.JLabel();

        setClosable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setText("Empleado");

        jLabel2.setText("Orden trabajo");

        jScrollPane1.setViewportView(tbSerRealizados);

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

        jLabel3.setText("ServicioRealizado");

        cbxServicios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxServiciosActionPerformed(evt);
            }
        });

        lblServicios.setText("jLabel4");

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnAgrgar.setText("Agregar");
        btnAgrgar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgrgarActionPerformed(evt);
            }
        });

        cbxEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEmpleadoActionPerformed(evt);
            }
        });

        cbxOrdenTrabajo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxOrdenTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxOrdenTrabajoActionPerformed(evt);
            }
        });

        lblNombreEmpleado.setText("jLabel5");

        lblComercioCliente.setText("jLabel5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(277, 277, 277)
                                .addComponent(lblServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnBuscar)
                                .addGap(67, 67, 67)
                                .addComponent(btnNuevo)
                                .addGap(59, 59, 59)
                                .addComponent(btnEliminar)
                                .addGap(118, 118, 118))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbxServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxEmpleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxOrdenTrabajo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblNombreEmpleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblComercioCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnLimpiar)
                                    .addComponent(btnAgrgar))
                                .addGap(18, 18, 18)))))
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbxEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreEmpleado))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbxOrdenTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblComercioCliente))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAgrgar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpiar)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbxServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblServicios))
                        .addGap(34, 34, 34)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btnNuevo)
                    .addComponent(btnEliminar))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        listarEmpleados();
        listarOrden();
        listaServicios();
    }//GEN-LAST:event_formInternalFrameOpened

    private void cbxEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEmpleadoActionPerformed
        nombreEmpleadoLbl();
    }//GEN-LAST:event_cbxEmpleadoActionPerformed

    private void cbxOrdenTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxOrdenTrabajoActionPerformed
        lblComercioCliente();
    }//GEN-LAST:event_cbxOrdenTrabajoActionPerformed

    private void cbxServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxServiciosActionPerformed
        nombreServicio();
    }//GEN-LAST:event_cbxServiciosActionPerformed

    private void btnAgrgarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgrgarActionPerformed
        try {
            s = cs.buscarServicio(cbxServicios.getSelectedItem().toString());
            lista.add(s);
            cargarTablaServicios(lista);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnAgrgarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarTabla();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscarServicioRealizados();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        int max = csr.maximo();
        nuevoServicioRealizado(max + 1);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        csr.eliminarServicoRealizadoListadoServicio(cbxOrdenTrabajo.getSelectedItem().toString());
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgrgar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cbxEmpleado;
    private javax.swing.JComboBox<String> cbxOrdenTrabajo;
    private javax.swing.JComboBox<String> cbxServicios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblComercioCliente;
    private javax.swing.JLabel lblNombreEmpleado;
    private javax.swing.JLabel lblServicios;
    private javax.swing.JTable tbSerRealizados;
    // End of variables declaration//GEN-END:variables

    public void listarEmpleados() {
        try {

            cbxEmpleado.removeAllItems();
            ArrayList<Empleado> listaEmp = ce.listarEmpleados();
            for (Empleado emp : listaEmp) {
                cbxEmpleado.addItem(emp.getIdentificacionPersona());
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void nombreEmpleadoLbl() {
        try {
            if (cbxEmpleado.getSelectedItem() != null) {
                em = ce.buscarEmpleado(cbxEmpleado.getSelectedItem().toString());
                lblNombreEmpleado.setText(em.getNombrePersona().toUpperCase() + " " + em.getApellido().toUpperCase());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void listarOrden() {
        try {
            cbxOrdenTrabajo.removeAllItems();
            List<OrdenTrabajoFrm> listaOrden = cot.listarOrdenTrabajo();
            for (OrdenTrabajoFrm oTr : listaOrden) {
                cbxOrdenTrabajo.addItem(oTr.getIdOrdenTrabajo());
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void lblComercioCliente() {
        try {
            if (cbxOrdenTrabajo.getSelectedItem() != null) {
                ot = cot.buscarOrdenTrabajo(cbxOrdenTrabajo.getSelectedItem().toString());
                lblComercioCliente.setText(ot.getUnidadCo().getNombreUnidadComercial().toUpperCase() + " "
                        + "" + ot.getUnidadCo().getcliente().getNombreCliente().toUpperCase());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void listaServicios() {
        try {
            cbxServicios.removeAllItems();
            List<Servicio> listaSer = cs.listaServicios();
            for (Servicio ser : listaSer) {
                cbxServicios.addItem(ser.getIdServicio());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void nombreServicio() {
        try {
            if (cbxServicios.getSelectedItem() != null) {
                s = cs.buscarServicio(cbxServicios.getSelectedItem().toString());
                lblServicios.setText(s.getNombreServicio().toUpperCase());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void listaServiciosRealizados() {
        try {
            s = cs.buscarServicio(cbxServicios.getSelectedItem().toString());
            lista.add(s);
            cargarTablaServicios(lista);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void cargarTablaServicios(List<Servicio> lista) {
        try {
            tablaServicio = new DefaultTableModel();
            String[] registro = new String[3];
            tablaServicio.addColumn("Id Servicio");
            tablaServicio.addColumn("Nombre");
            tablaServicio.addColumn("Descripcion");
            for (Servicio ser : lista) {
                registro[0] = ser.getIdServicio();
                registro[1] = ser.getNombreServicio();
                registro[2] = ser.getDescripcion();
                tablaServicio.addRow(registro);
            }
            tbSerRealizados.setModel(tablaServicio);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void limpiarTabla() {
        try {
            if (tablaServicio != null) {
                tbSerRealizados.getModel();
                tablaServicio.setRowCount(0);
                lista.clear();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void buscarServicioRealizados() {
        try {
            limpiarTabla();
            tablaServicio = new DefaultTableModel();
            sr = csr.buscarServiciosRealizadosListadoServicios(cbxOrdenTrabajo.getSelectedItem().toString());
            em = ce.buscarEmpleado(cbxEmpleado.getSelectedItem().toString());
            cbxEmpleado.setSelectedItem(em.getIdEmpleado());
            lblNombreEmpleado.setText(em.getNombrePersona() + " " + em.getApellido());
            cbxOrdenTrabajo.setSelectedItem(sr.getordenTrabajo().getIdOrdenTrabajo());
            lblComercioCliente.setText(sr.getordenTrabajo().getUnidadCo().getNombreUnidadComercial() + " " + sr.getordenTrabajo().getUnidadCo().getcliente().getNombreCliente());
            List<Servicio> listaSR;
            String[] registro = new String[3];
            tablaServicio.addColumn("Id Servicio");
            tablaServicio.addColumn("Servicio");
            tablaServicio.addColumn("Descripcion");
            listaSR = ot.getidServiciosSolicitados();
            for (Servicio sv : listaSR) {
                registro[0] = sv.getIdServicio();
                registro[1] = sv.getNombreServicio();
                registro[2] = sv.getDescripcion();
                tablaServicio.addRow(registro);
            }
            tbSerRealizados.setModel(tablaServicio);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public List<Servicio> listarSerRealNuevo() {
        List<Servicio> listaSR = new ArrayList<>();
        try {
            int rows = tablaServicio.getRowCount();
            for (int i = 0; i < rows; i++) {
                String idServicio = String.valueOf(tbSerRealizados.getValueAt(i, 0));
                String nombre = String.valueOf(tbSerRealizados.getValueAt(i, 1));
                String descripcion = String.valueOf(tbSerRealizados.getValueAt(i, 2));
                Servicio ser = new Servicio(idServicio, nombre, descripcion);
                listaSR.add(ser);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return listaSR;
    }

    private void nuevoServicioRealizado(int idServicioRealizado) {
        try {
            em = ce.buscarEmpleado(cbxEmpleado.getSelectedItem().toString());
            ot = cot.buscarOrdenTrabajo(cbxOrdenTrabajo.getSelectedItem().toString());
            List<Servicio> listars = listarSerRealNuevo();
            sr = new ServiciosRealizados(idServicioRealizado, em, ot, (ArrayList<Servicio>) listars);
            csr.nuevoServicioRealisado(sr);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}