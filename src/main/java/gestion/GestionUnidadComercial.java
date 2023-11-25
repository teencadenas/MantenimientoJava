/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;

import Clases.Cliente;
import Clases.UnidadComercial;
import Conexion.conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author teenc
 */
public class GestionUnidadComercial {
    
    //Se crea la conexion
    conexion conn = new conexion();
        
    //Funcion para listar todos los registros
    public ArrayList listado() throws SQLException, Exception{
        
        //Se declara el array para el listado
        ArrayList<UnidadComercial> listado = new ArrayList<>();
        GestionCliente gc = new GestionCliente();
        
        try{
            
            //Se crea la consulta
            String consulta = "SELECT * FROM unidad_comercial ";
            
            //Se crea conexion
            Connection conx = conn.conexionDB();        
            
            //Se prepara, realiza y toma resultado de la consulta
            PreparedStatement pe = conx.prepareStatement(consulta);
            ResultSet res = pe.executeQuery();
           
            //Se asigna a la lista los registros encontrados
            while(res.next()){
                Cliente cliente = gc.buscar(res.getString(5));
                UnidadComercial uc = new UnidadComercial(res.getNString(1), res.getNString(2),
                        res.getNString(3), res.getNString(4), cliente);
                listado.add(uc);
            }
                            
       }catch(SQLException err){
           
           throw err;            
       }
       
        //Se envia resultado
        return listado;        
    }   
    
    //Funcion para la busqueda de un registro, ingresando el nombre y valor del filtro a aplicar
    public UnidadComercial buscar(String idUnidad) throws Exception{
        
        //Se inicia la clase
        UnidadComercial uc = null;
        GestionCliente gc = new GestionCliente();
        
        try{
            
            //Se crea la consulta
            String consulta = "SELECT idUnidadComercial , nombre , direccion , tipologia , idCliente FROM unidad_comercial "
                    + " WHERE idUnidadComercial = ? ";
            
            //Se crea conexion
            Connection conx = conn.conexionDB();
            
            //Se prepara, realiza y toma resultado de la consulta
            PreparedStatement pe = conx.prepareStatement(consulta);
            pe.setString(1, idUnidad);
            ResultSet res = pe.executeQuery();
            
            //Asignar el valor  la clase
            while(res.next()){
                Cliente cliente = gc.buscar(res.getString(5));
                uc = new UnidadComercial(res.getNString(1), res.getNString(2),
                    res.getNString(3), res.getNString(4), cliente);
            }
        
           }catch(SQLException er){
               throw er;
           }
        
        //Se envia resultado
        return uc;        
    }  
     
    //Funcion crear nuevo registro
    public int nuevo(UnidadComercial unidad) throws SQLException{
       
       //Se declara la variable de respuesta
       int res;
       
        try{ 
            
            //Se crea la consulta
            String consulta = "INSERT INTO unidad_comercial ( idUnidadComercial , nombre , direccion , tipologia , idCliente ) "
                   + "VALUES ( ? , ? , ? , ? , ? )";
            
            //Se crea conexion
           Connection conx = conn.conexionDB(); 
           
           //Se prepara, realiza y toma resultado de la consulta
           PreparedStatement pe = conx.prepareStatement(consulta);
           pe.setString(1, unidad.getIdUnidadComercial());
           pe.setString(2, unidad.getNombreUnidadComercial());
           pe.setString(3, unidad.getDireccionUnidadComercial());
           pe.setString(4, unidad.getTipologia());
           pe.setString(5, unidad.getcliente().getNit());
           res = pe.executeUpdate();
        
       }catch(SQLException err){
           throw err;
       }
       
        //Se envia resultado
        return  res;         
    }    
    
   //funcion actualizacion de registro
    public int actualizar(UnidadComercial unidad)throws SQLException{
    
        //Se declara la variable de respuesta
        int res;

        try{
            
            //Se crea la consulta
            String consulta = "UPDATE unidad_comercial SET  nombre = ? , direccion = ? , tipologia = ? , idCliente = ? "
                    + " WHERE idUnidadComercial = ? ";
            
            //Se crea conexion
            Connection conx = conn.conexionDB();   
            
            //Se prepara, realiza y toma resultado de la consulta
            PreparedStatement pe = conx.prepareStatement(consulta);
            pe.setString(1, unidad.getNombreUnidadComercial());
            pe.setString(2, unidad.getDireccionUnidadComercial());
            pe.setString(3, unidad.getTipologia());
            pe.setString(4, unidad.getcliente().getNit());
            pe.setString(5, unidad.getIdUnidadComercial());
            res = pe.executeUpdate();
        }catch(SQLException err){
            throw err;
        }
        
        //Se envia resultado
        return  res;
    }
    
    //Funcion eliminar registro
    public int eliminar(String idComercial)throws SQLException{
        
        //Se declara la variable de respuesta
        int res;
        
        try{
            
            //Se crea la consulta
            String consulta = "DELETE FROM unidad_comercial WHERE idUnidadComercial = ? ";
            
            //Se crea conexion
            Connection conx = conn.conexionDB();  
            
            //Se prepara, realiza y toma resultado de la consulta
            PreparedStatement pe = conx.prepareStatement(consulta);
            pe.setString(1, idComercial);
            res = pe.executeUpdate();
           
        }catch(SQLException err){
            throw err;
        }
        
        //Se envia resultado
        return  res;
    }
}
