/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import clases.Empleado;
import gestion.GestionEmpleado;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author teenc
 */
public class ControlEmpleado {

    GestionEmpleado ge = new GestionEmpleado();
    ArrayList<Empleado> lista;

    //Funcion listar 
    public List<Empleado> listarEmpleados() {

        try {
            //Se realiza listado
            lista = (ArrayList<Empleado>) ge.listado();

        } catch (SQLException ex) {

            Logger.getLogger(ControlEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    //Funcion buscar empleado
    public Empleado buscarEmpleado(String identificacion) {

        Empleado empleado = null;
        try {

            empleado = ge.buscar(identificacion);
        } catch (Exception ex) {

            Logger.getLogger(ControlEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return empleado;
    }

    //Funcion nuevo registro
    public int nuevoEmpleado(Empleado empleado) {

        int res = 0;

        try {

            res = ge.nuevo(empleado);
        } catch (SQLException ex) {

            Logger.getLogger(ControlEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }

    //Funcion actualizacion
    public int actualizarEmpleado(Empleado empleado) {

        int res = 0;
        try {

            res = ge.actualizar(empleado);
        } catch (SQLException ex) {

            Logger.getLogger(ControlEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }

    //Funcion eliminar registro
    public int eliminarEmpleado(String idEmpleado) {

        int res = 0;
        try {

            res = ge.eliminar(idEmpleado);
        } catch (SQLException ex) {

            Logger.getLogger(ControlEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }

    //Funcion buscar por idempleado
    public List<String> buscarPorIdEmpleado(String idEmpleado) {

        List<String> lista = new ArrayList<>();
        try {

            lista = ge.buscarPorIdEmpleado(idEmpleado);
        } catch (Exception ex) {

            Logger.getLogger(ControlEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
}
