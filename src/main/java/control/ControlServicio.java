/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import clases.Servicio;
import gestion.GestionServicio;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author teenc
 */
public class ControlServicio {
    
    GestionServicio gs = new GestionServicio();
    Servicio servicio = null;
    
    public ArrayList listaServicios(){
        
        ArrayList lista = null;
        
        try {
            lista = gs.listar();
        } catch (SQLException e) {
            System.out.println("Control :"+e);
        }
        return lista;
        
    }
    
    public Servicio buscarServicio(String idServicio){
        
        
        try {
            servicio = gs.buscar(idServicio);
        } catch (SQLException e) {
            System.out.println("Control :"+e);
        }
        return servicio;
    }
    
    public int actualizarServicio(Servicio servicio){
        
        int res  = 0;
        try {
            res = gs.actualizar(servicio);
        } catch (SQLException e) {
            System.out.println("Control :"+e);
        }
        return res;
    }
    
    public int nuevoServicio(Servicio servicio){
     
       int res = 0;
       
        try {
            res = gs.nuevo(servicio);
        } catch (SQLException e) {
            System.out.println("Control :"+e);
        }
        return res;
    }
    
    public int eliminarServicio(String idServicio){
        
        int res = 0;
        
        try {
            res = gs.eliminar(idServicio);
        } catch (SQLException e) {
            System.out.println("Control :"+e);
        }
        return res;
    }
}
