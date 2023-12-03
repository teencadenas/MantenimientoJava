/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;

import clases.Servicio;
import conexion.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author teenc
 */
public class GestionServicio {
    
    //Se crea la conexion
    Conexion conn = new Conexion();
    
    //Funcion para listar todos los registros
    public ArrayList<Servicio> listar() throws SQLException{
        
        ArrayList<Servicio> listado = new ArrayList<>();
        
        //Se declara el array para el listado
        try {
            
            //Se crea la consulta
            String consulta = "SELECT * FROM servicio ";
            
            //Se crea conexion
            Connection conx = conn.conexionDB();
            
            //Se prepara, realiza y toma resultado de la consulta
            PreparedStatement pe = conx.prepareStatement(consulta);
            ResultSet res = pe.executeQuery();
            
            //Se asigna a la lista los registros encontrados
            while(res.next()){
                Servicio se = new Servicio(res.getNString(1), res.getNString(2), res.getNString(3));
                listado.add(se);
            }
            
        } catch (SQLException e) {
            
            throw e;
        }
        
        //Se envia resultado
        return listado;
    }
    
    //Funcion para la busqueda de un registro, ingresando el nombre y valor del filtro a aplicar
    public Servicio buscar(String idServicio) throws SQLException{
        
        //Se inicia la clase
        Servicio se = null;
        try {
            
            //Se crea la consulta
            String consulta = "SELECT * FROM servicio WHERE idServicio = ? ";
            
            //Se crea conexion
            Connection conx = conn.conexionDB();
            
            //Se prepara, realiza y toma resultado de la consulta
            PreparedStatement pe = conx.prepareStatement(consulta);
            pe.setString(1, idServicio);
            ResultSet res = pe.executeQuery();
            
            //Asignar el valor  la clase
            while(res.next()){
                se = new Servicio(res.getNString(1), res.getNString(2), res.getNString(3));
            }
        } catch (SQLException e) {
            throw e;
        }
        
        //Se envia resultado
        return se;
    }
    
    //Funcion actualizar registro
    public int actualizar(Servicio servicio) throws SQLException{
        
        //Se declara la variable de respuesta
        int res;
        
        try {
            
            //Se crea la consulta
            String consulta = "UPDATE servicio SET servicio = ? , descripcion = ? "
                    + " WHERE idServicio = ? ";
            
            //Se crea conexion
            Connection conx = conn.conexionDB();
            
            //Se prepara, realiza y toma resultado de la consulta
            PreparedStatement pe = conx.prepareStatement(consulta);
            pe.setString(1, servicio.getNombreServicio());
            pe.setString(2, servicio.getDescripcion());
            pe.setString(3, servicio.getIdServicio());
            
            res = pe.executeUpdate();
           
        } catch (SQLException e) {
            throw e;
        }
        
        //Se envia resultado
        return res;        
    }
    
    //Funcion crear nuevo registo
    public int nuevo(Servicio servicio) throws SQLException{
        
        //Se declara la variable de respuesta
        int res;
        
        try {
            
            //Se crea la consulta
            String consulta = "INSERT INTO `servicio`(`idServicio`, `servicio`, `descripcion`) VALUES (?,?,?)";
            
            //Se crea conexion
            Connection conx = conn.conexionDB();
            
            //Se prepara, realiza y toma resultado de la consulta
            PreparedStatement pe = conx.prepareStatement(consulta);
            pe.setString(1, servicio.getIdServicio());
            pe.setString(2, servicio.getNombreServicio());
            pe.setString(3, servicio.getDescripcion());
            res = pe.executeUpdate();
            
        } catch (SQLException e) {
            throw e;
        }
        
        //Se envia resultado
        return res;
    }
    
    //Funcion eliminar registro
    public int eliminar(String idServicio) throws SQLException{
        
        //Se declara la variable de respuesta
        int res;
        
        try {
            
            //Se crea la consulta
            String consulta = "DELETE FROM servicio WHERE idServicio = ? ";
            
            //Se crea conexion
            Connection conx = conn.conexionDB();
            
            //Se prepara, realiza y toma resultado de la consulta
            PreparedStatement pe = conx.prepareStatement(consulta);
            pe.setString(1, idServicio);
            res = pe.executeUpdate();
            
        } catch (SQLException e) {
            throw e;
        }
        
        //Se envia resultado
        return res;
    }
}
