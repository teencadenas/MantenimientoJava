/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import clases.OrdenTrabajo;
import clases.Servicio;
import clases.UnidadComercial;
import gestion.GestionOrdenTrabajo;
import gestion.GestionServiciosHasServiciosSolicitados;
import gestion.GestionServicioSolicitado;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author teenc
 */
public class ControlOrdenTrabajo {

    //Se importan las clases necesariaS
    ControlServicio cs = new ControlServicio();
    ControlUnidadComercial cuc = new ControlUnidadComercial();
    GestionServicioSolicitado ss = new GestionServicioSolicitado();
    GestionServiciosHasServiciosSolicitados gshs = new GestionServiciosHasServiciosSolicitados();
    GestionOrdenTrabajo got = new GestionOrdenTrabajo();

    //Funcion nuevo registro
    public int nuevo(OrdenTrabajo orden) {

        //se inicia respuesta
        int res = 0;
        //Se crea lista de datos del registro
        List<String> list = new ArrayList<>();

        try {

            //Se crea el registro en tabla orden trabajo
            res += got.nuevo(orden);
            //Se identifica id se listado servicios relacionados y se toma el dato
            list = got.buscar(orden.getIdOrdenTrabajo());
            String idServiciosSolicitados = list.get(5);
            //se crea el listado de registros relacionados en tabla servicios solicitados
            res += ss.nuevo(idServiciosSolicitados);
            //y servicios has servicios solicitados
            res += gshs.nuevo(idServiciosSolicitados, orden.getidServiciosSolicitados());
//            
        } catch (NumberFormatException ex) {

            Logger.getLogger(ControlOrdenTrabajo.class.getName()).log(Level.SEVERE, null, ex);
        }

        //respuesta
        return res;
    }

    //Funcion buscar registro
    public OrdenTrabajo buscar(String idOrden) {

        //Se crean los arreglos para recibir los datos de las tablas orden trabajo
        List<String> listaOrden = new ArrayList<>();
        //y Servicios solicitados has servicios solicitados
        List<String> listaServicios = new ArrayList<>();
        //y listado se registros de tipo clase 
        List<Servicio> lisSer = new ArrayList<>();
        //Se inician las clases necesarias
        OrdenTrabajo ot = null;
        Servicio ser = null;
        UnidadComercial uc = null;

        try {
            //Se realizan las consultas 
            listaOrden = got.buscar(idOrden);
            if (!listaOrden.isEmpty()) {
                String idServiciosSolicitados = listaOrden.get(4);
                listaServicios = gshs.buscar(idServiciosSolicitados);
                uc = cuc.buscarUnidadComercial(listaOrden.get(1));
                for (String id : listaServicios) {
                    ser = cs.buscarServicio(id);
                    lisSer.add(ser);
                }

                //Se crea la clase
                ot = new OrdenTrabajo(idOrden, listaOrden.get(0), uc, listaOrden.get(2), listaOrden.get(3),
                        lisSer);
            }
        } catch (HeadlessException ex) {

            Logger.getLogger(ControlOrdenTrabajo.class.getName()).log(Level.SEVERE, null, ex);
        }

        return ot;
    }

    //Funcion actualizar registro registro
    public int actualizar(OrdenTrabajo orden) {

        //Se crea arreglo para regsitros a actualizar
        List<String> listaOt = new ArrayList<>();
        //Se inicia respuesta
        int res = 0;

        try {

            //Se actualiza tabla orden trabajo
            res += got.actualizar(orden);
            //Se toma identificador 
            listaOt = got.buscar(orden.getIdOrdenTrabajo());
            //y se actualiza tabla servicios solicitados has servicios solicitados
            res += gshs.actualizar(orden.getidServiciosSolicitados(), listaOt.get(4));

        } catch (Exception ex) {

            Logger.getLogger(ControlOrdenTrabajo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }

    //Funcion para eliminar registro
    public int eliminar(String idOrden) {

        //Se inicia respuesta
        int res = 0;

        try {

            //Se realiza consulta
            res += got.eliminar(idOrden);

        } catch (Exception ex) {

            Logger.getLogger(ControlOrdenTrabajo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }

    public List<String> listarOrdenes() {

        List<String> lista = new ArrayList<>();
        try {

            lista = got.listar();

        } catch (Exception ex) {

            Logger.getLogger(ControlOrdenTrabajo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

}
