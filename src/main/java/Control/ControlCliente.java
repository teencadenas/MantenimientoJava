/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Clases.Cliente;
import Vista.crearClienteFrm;
import gestion.GestionCliente;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author teenc
 */
public class ControlCliente {
    
    GestionCliente gc = new GestionCliente();
    Cliente cliente = null;
    
    public ArrayList listarCliente() throws SQLException{
        
        ArrayList lista = null;
        try{
        lista = gc.listado();
        }catch(SQLException e){
            System.out.println("Control "+e);
        }
        
        return lista;
    
    }
    
    public Cliente buscarCliente(String idCliente) throws Exception{
        try{
        cliente = gc.buscar(idCliente);
        }catch(Exception e){
            System.out.println("Control "+e);
        }
        return cliente;
    }
    
    public int actualizarCliente(Cliente cliente) throws Exception{
        
        int res = 0;
            try {
                res = gc.actualizar(cliente);
            } catch (SQLException e) {
                System.out.println("Control "+e);
            }
        
        return res;
    }
    
    public int nuevoCliente(Cliente cliente){
        
        int res = 0;
        
        try {
            res = gc.nuevo(cliente);
        } catch (SQLException e) {
            System.out.println("Control "+e);
        }
        return res;
    }
    
    public int eliminarCliente(String idCliente){
        
        int res = 0;
        try {
            res = gc.eliminar(idCliente);
        } catch (SQLException e) {
            System.out.println("Control "+e);
        }
        
        return res;
    }
    
}
