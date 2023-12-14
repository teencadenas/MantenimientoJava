/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import clases.Empleado;
import clases.OrdenTrabajo;
import clases.Servicio;
import clases.ServiciosRealizados;
import gestion.GestionEmpleado;
import gestion.GestionServicio;
import gestion.GestionServiciosRealizados;
import gestion.GestionServiciosHasServiciosRealizados;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author teenc
 */
public class ControlServiciosRealizados {

    //Se importan clases 
    GestionServiciosRealizados gsr = new GestionServiciosRealizados();
    GestionServiciosHasServiciosRealizados gshsr = new GestionServiciosHasServiciosRealizados();
    GestionEmpleado ge = new GestionEmpleado();
    ControlOrdenTrabajo cot = new ControlOrdenTrabajo();
    GestionServicio gs = new GestionServicio();

    //Funcion nuevo registro
    public int nuevo(ServiciosRealizados realizados) {

        int res = 0;

        try {

            res += gsr.nuevo(realizados);
            String idServiciosRealizados = gsr.maximoidServicioRealizado();
            res += gshsr.nuevo((List<Servicio>) realizados.getServicioRealizados(), idServiciosRealizados);

        } catch (Exception ex) {

            Logger.getLogger(ControlServiciosRealizados.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }

    //Funcion listar servicios
    public List<List> buscar(String idOrdentrabajo) {

        List<List> lista = new ArrayList<>();

        try {

            lista = gsr.buscar(idOrdentrabajo);

        } catch (Exception ex) {

            Logger.getLogger(ControlServiciosRealizados.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    //Funcion actualizar
    public int actualizar(ServiciosRealizados realizados) {

        int res = 0;

        try {

            res += gsr.actualizar(realizados);
            res += gshsr.actualizar((List<Servicio>) realizados.getServicioRealizados(), realizados.getIdServicioRealizado());

        } catch (Exception ex) {

            Logger.getLogger(ControlServiciosRealizados.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }

    //Funcion eliminar registro
    public int eliminar(String idServiciosRealizados) {

        int res = 0;

        try {

            res += gsr.eliminarSerRea(idServiciosRealizados);

        } catch (Exception ex) {

            Logger.getLogger(ControlServiciosRealizados.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }
}
