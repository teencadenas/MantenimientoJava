/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import clases.UnidadComercial;
import gestion.GestionUnidadComercial;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author teenc
 */
public class ControlUnidadComercial {

    //Se importan clases requeridas
    GestionUnidadComercial guc = new GestionUnidadComercial();

    //Funcion listar registros
    public List<UnidadComercial> listarUnidadComercial() throws Exception {

        //Se crea el arreglo para los registros
        List<UnidadComercial> lista = null;
        try {

            //Se realiza consulta en base de datos
            lista = guc.listado();
        } catch (SQLException ex) {

            Logger.getLogger(ControlUnidadComercial.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Se devuelve listado registros
        return lista;
    }

    //Se realiza busqueda de registro
    public UnidadComercial buscarUnidadComercial(String idUnidad) {

        //Se crea clase para recoger infomrmacion de la base de datos
        UnidadComercial unidad = null;
        try {

            //Se realiza consulta en base de datos
            unidad = guc.buscar(idUnidad);
        } catch (Exception ex) {

            Logger.getLogger(ControlUnidadComercial.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Se envia respuesta 
        return unidad;
    }

    //Funcion para actualizar registros
    public int actualizarUnidadComercial(UnidadComercial unidad) {

        //Se inicia la variable para el restuldos
        int res = 0;

        try {

            //Se realiza la consulta a la base de datos
            res = guc.actualizar(unidad);
        } catch (SQLException ex) {

            Logger.getLogger(ControlUnidadComercial.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }

    //Funcion crear registro
    public int nuevaUnidadComercial(UnidadComercial unidad) {

        //Se inicia variable para respuesta
        int res = 0;

        try {

            //Se realiza la consulta a la base de datos
            res = guc.nuevo(unidad);
        } catch (SQLException ex) {

            Logger.getLogger(ControlUnidadComercial.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }

    //Funcion eliminar registro
    public int eliminarUnidadComercial(String idUnidad) {

        //Variable para asignar respuesta
        int res = 0;

        try {

            //Se realiza consulta base de datos
            res = guc.eliminar(idUnidad);
        } catch (SQLException ex) {

            Logger.getLogger(ControlUnidadComercial.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }
}
