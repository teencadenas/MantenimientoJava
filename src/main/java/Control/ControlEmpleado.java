/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Clases.Empleado;
import gestion.GestionEmpleado;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author teenc
 */
public class ControlEmpleado {
    
    
    GestionEmpleado ge = new GestionEmpleado();
    ArrayList lista;
    public ArrayList listarEmpleados(){
        
        try {
            lista = ge.listado();
        } catch (SQLException e) {
            System.out.println("Control :"+e);
        }
        return lista;
    }
    
    public Empleado buscarEmpleado(String identificacion){
        
        Empleado empleado = null;
        try {
            empleado = ge.buscar(identificacion);
        } catch (Exception e) {
            System.out.println("Control :"+e);
        }
        return empleado;
    }
    
    public int nuevoEmpleado(Empleado empleado){
        
        int res = 0;
        try {
            res = ge.nuevo(empleado);
        } catch (SQLException e) {
            System.out.println("Control :"+e);
        }
        return res;
    }
    
    public int actualizarEmpleado(Empleado empleado){
        
        int res = 0;
        try {
            res = ge.actualizar(empleado);
        } catch (SQLException e) {
            System.out.println("Control :"+e);
        }
        return res;
    }
    
    public int eliminarEmpleado(String idEmpleado){
        
        int res = 0;
        try {
            res = ge.eliminar(idEmpleado);
        } catch (SQLException e) {
            System.out.println("Control :"+e);
        }
        return res;
    }
}
