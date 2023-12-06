/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import clases.Servicio;
import gestion.GestionServicio;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author teenc
 */
public class ControlServicio {

    GestionServicio gs = new GestionServicio();
    Servicio servicio = null;

    //Funcion listar servcios
    public List<Servicio> listaServicios() {

        //Se crea array para respuesta
        List<Servicio> lista = new ArrayList<>();

        try {

            //Se crea la lista de registro
            lista = gs.listar();
        } catch (SQLException ex) {

            Logger.getLogger(ControlServicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;

    }

    //Funcion buscar registro
    public Servicio buscarServicio(String idServicio) {

        try {

            //Consulta buscar registro
            servicio = gs.buscar(idServicio);
        } catch (SQLException ex) {

            Logger.getLogger(ControlServicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return servicio;
    }

    //Funcion actualizar servicio
    public int actualizarServicio(Servicio servicio) {

        //Se inicia variable para respuesta 
        int res = 0;

        try {

            //Se realiza consulta
            res = gs.actualizar(servicio);
        } catch (SQLException ex) {

            Logger.getLogger(ControlServicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }

    //Funcion crear servicio
    public int nuevoServicio(Servicio servicio) {

        //Iniciar variable para respuesta
        int res = 0;

        try {

            //Se realiza consulta
            res = gs.nuevo(servicio);
        } catch (SQLException ex) {

            Logger.getLogger(ControlServicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }

    //Funcion eliminar consulta
    public int eliminarServicio(String idServicio) {

        //Iniciar variable
        int res = 0;

        try {

            //Se realiza consulta
            res = gs.eliminar(idServicio);
        } catch (SQLException ex) {

            Logger.getLogger(ControlServicio.class.getName()).log(Level.SEVERE, null, ex);
        }

        return res;
    }
}
