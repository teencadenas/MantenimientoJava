/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import clases.OrdenTrabajoFrm;
import gestion.GestionOrdenTrabajo;
import gestion.GestionServiciosSolicitados;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author teenc
 */
public class ControlOrdenTrabajo {

    GestionOrdenTrabajo got = new GestionOrdenTrabajo();
    GestionServiciosSolicitados gss = new GestionServiciosSolicitados();

    public List<OrdenTrabajoFrm> listarOrdenTrabajo() throws Exception {

        List<OrdenTrabajoFrm> lista = null;

        try {
            lista = got.listado();
        } catch (SQLException ex) {
            Logger.getLogger(GestionOrdenTrabajo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    public OrdenTrabajoFrm buscarOrdenTrabajo(String idOrden) {

        OrdenTrabajoFrm ot = null;
        try {
            ot = got.buscar(idOrden);
        } catch (Exception ex) {
            Logger.getLogger(GestionOrdenTrabajo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ot;
    }

    public int actualizarOrdenTrabajo(OrdenTrabajoFrm trabajo, String idServiciosSolicitados) {

        int res = 0;
        try {
            res = got.actualizar(trabajo, idServiciosSolicitados);
        } catch (SQLException ex) {
            Logger.getLogger(GestionOrdenTrabajo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }

    public int nuevoOrdenTrabajo(OrdenTrabajoFrm trabajo) {

        int res = 0;
        try {
            int idServiciosSolicitados = gss.maximo() + 1;
            res = got.nuevo(trabajo, idServiciosSolicitados);
        } catch (SQLException ex) {
            Logger.getLogger(GestionOrdenTrabajo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }

    public int eliminarOrdenTrabajo(String idOrdenTradajo) {

        int res = 0;
        int id = 0;

        try {
            id = got.idServiciosSolicitados(idOrdenTradajo);
            gss.eliminar(id);
            got.eliminar(idOrdenTradajo);
        } catch (SQLException ex) {
            Logger.getLogger(GestionOrdenTrabajo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }
}
