/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import clases.UnidadComercial;
import gestion.GestionUnidadComercial;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author teenc
 */
public class ControlUnidadComercial {
    
    GestionUnidadComercial guc = new GestionUnidadComercial();
    
    public ArrayList listarUnidadComercial() throws Exception{
        
        ArrayList lista = null;
        try {
            lista = guc.listado();
        } catch (SQLException e) {
            System.out.println("Control "+e);
        }
        return lista;
    }
    
    public UnidadComercial buscarUnidadComercial(String idUnidad){
        
        UnidadComercial unidad = null;
        try {
            unidad = guc.buscar(idUnidad);
        } catch (Exception e) {
            System.out.println("Control "+e);
        }
        return unidad;
    }
    
    public int actualizarUnidadComercial(UnidadComercial unidad){
        
        int res = 0;
        
        try {
            res = guc.actualizar(unidad);
        } catch (SQLException e) {
            System.out.println("Control "+e);
        }
        return res;
    }
    
    public int nuevaUnidadComercial(UnidadComercial unidad){
        
        int res = 0;
        
        try {
            res = guc.nuevo(unidad);
        } catch (SQLException e) {
            System.out.println("Control "+e);
        }
        return res;
    }
    
    public int eliminarUnidadComercial(String idUnidad){
        
        int res = 0;
        
        try {
            res = guc.eliminar(idUnidad);
        } catch (SQLException e) {
            System.out.println("Control "+e);
        }
        return res;
    }
}
