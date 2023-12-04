/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import clases.Cliente;
import gestion.GestionCliente;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author teenc
 */
public class ControlCliente {

    //Se importan clases requeridas
    GestionCliente gc = new GestionCliente();
    Cliente cliente = null;

    //Creacion lista de registros
    public List<Cliente> listarCliente() throws SQLException {

        //se declara array para el listado
        List<Cliente> lista = null;
        try {

            //se obtienen los registros   
            lista = gc.listado();
        } catch (SQLException ex) {

            Logger.getLogger(ControlCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Se retorna la respuesta
        return lista;
    }

    //funcion buscar registro
    public Cliente buscarCliente(String idCliente) throws Exception {

        try {

            //Se obtiene el registro
            cliente = gc.buscar(idCliente);
        } catch (Exception ex) {

            Logger.getLogger(ControlCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

        //se retorna la respuesta
        return cliente;
    }

    //funcion actualizar cliente
    public int actualizarCliente(Cliente cliente) throws Exception {

        //inicializa respuesta
        int res = 0;

        try {

            //Se genera actualizacion
            res = gc.actualizar(cliente);
        } catch (SQLException ex) {

            Logger.getLogger(ControlCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Se envia respuesta    
        return res;
    }

    //Funcion nuevo cliente
    public int nuevoCliente(Cliente cliente) throws SQLException {

        //Se inicia variable para la respuesta
        int res = 0;

        try {

            //Se genera registro
            res = gc.nuevo(cliente);
        } catch (SQLException ex) {

            Logger.getLogger(ControlCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

        //se envia respuesta
        return res;
    }

    //Funcion eliminar registro
    public int eliminarCliente(String idCliente) {

        //Inicia variable para respuesta
        int res = 0;

        try {

            //Se genera eliminacion del registro
            res = gc.eliminar(idCliente);
        } catch (SQLException ex) {

            Logger.getLogger(ControlCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Se emnvia respuesta
        return res;
    }

}
