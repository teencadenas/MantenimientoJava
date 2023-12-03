/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import clases.ServiciosRealizados;
import gestion.GestionServiciosRealizados;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author teenc
 */
public class ControlServiciosRealizados {
    
    
    
   GestionServiciosRealizados gsr = new GestionServiciosRealizados();
        
    public int nuevoServicioRealisado(ServiciosRealizados realizado){
    
        int res = 0;
        
        try {
            
            
            res = gsr.nuevoSerRea(realizado);           
        } catch (Exception e) {
            
            
            System.out.println("Control :"+e);
        }
       return res;
    }    
    
//    public int actualizarServiciosRealizadosListadoRealizados(ServiciosRealizados realizados){
//        
//        int res = 0;
//        int resL = 0;
//        try {
//            res = gsr.actualizarSerRea(realizados);
//        } catch (Exception e) {
//            System.err.println("Control : "+e);
//        }
//        
//        return res+resL;
//    }
    
    public int eliminarServicoRealizadoListadoServicio(String idOrdenTrabajo){
        
        int res = 0;
        try {
            res = gsr.eliminarSerRea(idOrdenTrabajo);
        } catch (Exception e) {
            System.out.println("Control "+e);
        }
        return res;
    }
    
    public ServiciosRealizados buscarServiciosRealizadosListadoServicios(String idOrdenTrabajo){
        
        ServiciosRealizados sr = null;
        
        try {
            sr = gsr.buscarSerRea(idOrdenTrabajo);
        } catch (Exception e) {
            System.out.println("Control :"+e);
        }
        
        return sr;
    }
    
//    public ArrayList listarServiciosRealizadosListaServicios(){
//        
//        ArrayList lista = new ArrayList();
//        try {
//            lista = gsr.listaSerRea();
//        } catch (Exception e) {
//            System.out.println("Control :"+e);
//        }
//        return lista;
//    }

    public int maximo(){
        
        int max = 0;
        try {
            max = gsr.maximo();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
       return max;
    }

}
