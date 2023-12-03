/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import gestion.GestionIngreso;
import java.util.ArrayList;

/**
 *
 * @author teenc
 */
public class ControlIngreso {
    
    GestionIngreso ge = new GestionIngreso();
    
    public ArrayList<String> validarIngreso(String usuario,String contrasena){
        
        ArrayList<String> lista = new ArrayList<>();
        try {
            lista = ge.validarIngreso(usuario,contrasena);
        } catch (Exception e) {
            System.out.println("Control "+e);
        }
        return lista;
    }
    
}
