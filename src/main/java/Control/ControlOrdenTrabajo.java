/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Clases.OrdenTrabajo;
import gestion.GestionOrdenTrabajo;
import gestion.GestionServiciosSolicitados;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author teenc
 */
public class ControlOrdenTrabajo {
    
    GestionOrdenTrabajo got = new GestionOrdenTrabajo();
    GestionServiciosSolicitados gss = new GestionServiciosSolicitados();
        
   public ArrayList listarOrdenTrabajo() throws Exception{
       
       ArrayList lista = null;
        
        try {
            lista = got.listado();
        } catch (SQLException e) {
            System.out.println("Control :"+e);
        }
        return lista;
    }
    
    public OrdenTrabajo buscarOrdenTrabajo(String idOrden){
        
        OrdenTrabajo ot = null;
        try {
            ot = got.buscar(idOrden);
        } catch (Exception e) {
            System.out.println("Control :"+e);
        }
        return ot;
    }
    
    public int actualizarOrdenTrabajo(OrdenTrabajo trabajo,String idServiciosSolicitados){
        
        int res = 0;
        try {
            res = got.actualizar(trabajo,idServiciosSolicitados);
        } catch (SQLException e) {
            System.out.println("Control :"+e);
        }
        return res;
    }
    
    public int nuevoOrdenTrabajo(OrdenTrabajo trabajo){
        
        int res = 0;
        try {
            int idServiciosSolicitados = gss.maximo()+1;
            res = got.nuevo(trabajo,idServiciosSolicitados);
        } catch (SQLException e) {
            System.out.println("Control :"+e);
        }
        return res;
    }
    
     public int eliminarOrdenTrabajo(String idOrdenTradajo){
        
        int res = 0;
        int id = 0;
        
        try{
            id = got.idServiciosSolicitados(idOrdenTradajo);
            gss.eliminar(id);
            got.eliminar(idOrdenTradajo);
        }catch (SQLException e) {
            System.out.println("Control :"+e);
        }
        return res;
    }
}
