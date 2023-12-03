
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;

import clases.Cliente;
import conexion.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author teenc
 */
public class GestionCliente {
    
    //Se crea la conexion
    Conexion conn = new Conexion();
    
    //Funcion para listar todos los registros
    public List<Cliente> listado() throws SQLException{
        
        //Se declara el array para el listado
        List<Cliente> listado = new ArrayList<>();
                   
        try{       
            
            //Se crea la consulta            
            String consulta = "SELECT * FROM `cliente`";
            
            //Se crea conexion
            Connection conx =  conn.conexionDB();
            
            //Se prepara, realiza y toma resultado de la consulta
            PreparedStatement pe = conx.prepareStatement(consulta);
            ResultSet res = pe.executeQuery();       
            
            //Se asigna a la lista los registros encontrados
            while(res.next()){
                Cliente cl = new Cliente(res.getNString(1), res.getNString(2), res.getNString(3),
                        res.getNString(4));
                listado.add(cl);
            }
                            
       }catch(SQLException ex){
           Logger.getLogger(GestionCliente.class.getName()).log(Level.SEVERE, null, ex);
       }
       
        //Se envia resultado
        return listado;
    }   
    
    //Funcion para la busqueda de un registro, ingresando el nombre y valor del filtro a aplicar
    public Cliente buscar(String idCliente) throws Exception{
       
        //Se inicia la clase
        Cliente cl = null;
        
        try{
            
            //Se crea la consulta
            String consulta = "SELECT * FROM `cliente` WHERE nit = ? ";
            
            //Se crea conexion
            Connection conx = conn.conexionDB();
            
            //Se prepara, realiza y toma resultado de la consulta
            PreparedStatement pe = conx.prepareStatement(consulta);
            pe.setString(1, idCliente);
            ResultSet res = pe.executeQuery();      
                         
            //Asignar el valor  la clase
            while(res.next()){
                cl = new Cliente(res.getString(1), res.getString(2), res.getString(3),
                        res.getString(4));
            }
            
        }catch(SQLException err){            
            
            Logger.getLogger(GestionCliente.class.getName()).log(Level.SEVERE, null, err);
       }
        
        //Se envia resultado
        return cl;        
    }  
    
    //Funcion para ingresar nuevo registro
    public int nuevo(Cliente cliente) throws SQLException{
       
       //Se declara la variable de respuesta
        int res = 0;
       
       try{        
           
           //Se crea la consulta
            String consulta = "INSERT INTO `cliente`(`nit`, `nombre`, `direccion`, `telefono`) VALUES (?,?,?,?)";
            
            //Se crea conexion
            Connection conx = conn.conexionDB();
            
            //Se prepara, realiza y toma resultado de la consulta
            PreparedStatement pe =conx.prepareStatement(consulta);
            pe.setString(1, cliente.getNit());
            pe.setString(2, cliente.getNombreCliente());
            pe.setString(3, cliente.getDireccionCliente());
            pe.setString(4, cliente.getTelefonoCliente());
            res = pe.executeUpdate();         
        
       }catch(SQLException ex){
           
           Logger.getLogger(GestionCliente.class.getName()).log(Level.SEVERE, null, ex);
       }
       
       //Se envia resultado
        return  res;         
    }    
    
    //Funcion para actualizar registro
    public int actualizar(Cliente cliente)throws SQLException{
    
        //Se declara la variable de respuesta
        int res = 0;
        
        try{
            
            //Se crea la consulta
            String consulta = "UPDATE `cliente` SET `nombre` = ? , `direccion` = ? ,`telefono` = ? "
                    + " WHERE  `nit` = ? ";
            
            //Se crea conexion
            Connection conx = conn.conexionDB();
            
            //Se prepara, realiza y toma resultado de la consulta
            PreparedStatement pe = conx.prepareStatement(consulta);
            pe.setString(1, cliente.getNombreCliente());
            pe.setString(2, cliente.getDireccionCliente());
            pe.setString(3, cliente.getTelefonoCliente());
            pe.setString(4, cliente.getNit());
            res = pe.executeUpdate();
            
        }catch(SQLException ex){
            
            Logger.getLogger(GestionCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Se envia resultado
        return  res;
    }
    
    //Funcion para elimiar registro
    public int eliminar(String idCliente)throws SQLException{
        
        //Se declara la variable de respuesta
        int res = 0;
        
        try{
            
            //Se crea la consulta
            String consulta =("DELETE FROM `cliente` WHERE `nit`= ? ");
            
            //Se crea conexion
            Connection conx = conn.conexionDB();
            
            //Se prepara, realiza y toma resultado de la consulta
            PreparedStatement pe = conx.prepareStatement(consulta);
            pe.setString(1, idCliente);
            res = pe.executeUpdate();
            
        }catch(SQLException ex){
            Logger.getLogger(GestionCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Se envia resultado
        return  res;
    }
    
}