/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import gestion.GestionIngreso;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author teenc
 */
public class ControlIngreso {

    GestionIngreso ge = new GestionIngreso();

    //Funcion listarIngreso
    public List<String> validarIngreso(String usuario, String contrasena) {

        ArrayList<String> lista = new ArrayList<>();
        try {
            lista = (ArrayList<String>) ge.validarIngreso(usuario, contrasena);
        } catch (Exception ex) {

            Logger.getLogger(ControlIngreso.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

}
