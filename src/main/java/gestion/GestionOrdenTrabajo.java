
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;

import clases.OrdenTrabajo;
import clases.Servicio;
import clases.UnidadComercial;
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
public class GestionOrdenTrabajo {
    
    //Se crea la conexion
    Conexion conn = new Conexion();
    
    //Funcion para listar todos los registros
    public ArrayList<OrdenTrabajo> listado() throws Exception{
        
        //Se declara el array para el listado
        ArrayList<OrdenTrabajo> listado = new ArrayList<>();
        
        try{       
            
            //Se crea la consulta            
            String consulta = "SELECT * FROM orden_trabajo ";            
            
            //Se crea conexion
            Connection conx = conn.conexionDB();
            
            //Se prepara, realiza y toma resultado de la consulta
            PreparedStatement pe = conx.prepareStatement(consulta);
            ResultSet res = pe.executeQuery();       
            
            //Se asigna a la lista los registros encontrados
            while(res.next()){
                //Se realiza busqueda de servicios solicitados
                GestionServiciosSolicitados gss = new GestionServiciosSolicitados();
                ArrayList<Servicio> listaSer = new ArrayList();
                listaSer = gss.listar(res.getString(6));
                //Se realiza busqueda de la unidad comercial 
                GestionUnidadComercial guc = new GestionUnidadComercial();
                UnidadComercial uc  = guc.buscar(res.getString(3));
                //Se asigna valor a la clase orden trabajo
                OrdenTrabajo ot = new OrdenTrabajo(res.getString(1), res.getString(2),
                        uc, res.getString(4), 
                        res.getString(5),listaSer);
                
                //Se crea listado de ordenes trabajo
                listado.add(ot);
            }
                            
       }catch(SQLException err){
           
           throw err;
       }
       
        //Se envia resultado
        return listado;
    }   
    
    //Funcion para la busqueda de un registro, por id 
    public OrdenTrabajo buscar(String idOrdenTrabajo) throws Exception{
       
        //Se inicia la clase
        OrdenTrabajo ot = null;        
               
        try{
            
            //Se crea la consulta
            String consulta = "SELECT * FROM orden_trabajo WHERE idOrdentrabajo = ? ";
            
            //Se crea conexion
            Connection conx = conn.conexionDB();
            
            //Se prepara, realiza y toma resultado de la consulta
            PreparedStatement pe =conx.prepareStatement(consulta);
            pe.setString(1, idOrdenTrabajo);
            ResultSet res = pe.executeQuery();                  
        
            //Asignar el valor  la clase
            while(res.next()){
                //Se realiza busqueda de servicios solicitados
                GestionServiciosSolicitados gss = new GestionServiciosSolicitados();
                ArrayList listaSer = new ArrayList();
                listaSer = gss.listar(res.getString(6));
                //Se realiza busqueda de la unidad comercial 
                GestionUnidadComercial guc = new GestionUnidadComercial();
                UnidadComercial uc  = guc.buscar(res.getString(3));
                //Se asigna valor a la clase orden trabajo
                ot = new OrdenTrabajo(res.getString(1), res.getString(2),
                        uc, res.getString(4), res.getString(5),
                        listaSer);
            }    
        }catch(SQLException err){
            throw err;
       }
        
        //Se envia resultado
        return ot;        
    }  
     
    //funcion crear nuevo registr
   public int nuevo(OrdenTrabajo trabajo, int idServiciosSolicitados) throws SQLException{
       
       //Se declara la variable de respuesta
        int res;
        GestionServiciosSolicitados gss = new GestionServiciosSolicitados();
        
       try{     
           try {
            
            //Se importan los valores necesarios  
            res =+ gss.nuevo(trabajo.getidServiciosSolicitados(),idServiciosSolicitados);
            
           } catch (SQLException e) {
               throw e;
           }
           
           try{
               
           //Se crea la consulta
            String consulta = "INSERT INTO orden_trabajo ( idOrdenTrabajo , estado , id_Unidad_Comercial , fechaSolicitud , fechaCierre ,"
                    + " idserviciosSolicitados ) VALUES ( ? , ? , ? , ? , ? , ? )";
            
            //Se crea conexion
            Connection conx = conn.conexionDB();
            
            //Se prepara, realiza y toma resultado de la consulta
            PreparedStatement pe =conx.prepareStatement(consulta);
            pe.setString(1, trabajo.getIdOrdenTrabajo());
            pe.setString(2, trabajo.getEstado());
            pe.setString(3, trabajo.getUnidadCo().getIdUnidadComercial());
            pe.setString(4, trabajo.getFechaSolicitud());
            pe.setString(5, trabajo.getFechaCierre());
            pe.setInt(6, idServiciosSolicitados);
            res =+ pe.executeUpdate(); 
            
           }catch(SQLException e){
               throw e;
           }
            
       }catch(SQLException err){
           throw err;
       }
       
       //Se envia resultado
        return  res;         
    }    
    
   //Funcion actualizar registro
    public int actualizar(OrdenTrabajo trabajo,String idServiciosSolicitados)throws SQLException{
    
        //Se declara la variable de respuesta
        int res;
        
        try{
            
            //Se crea la consulta
            String consulta = "UPDATE orden_trabajo SET estado = ? , id_Unidad_Comercial = ? , fechaSolicitud = ? ,"
                    + " fechaCierre = ? WHERE idOrdenTrabajo = ? ";
            
            //Se crea conexion
            Connection conx = conn.conexionDB();
            
            //Se prepara, realiza y toma resultado de la consulta
            PreparedStatement pe = conx.prepareStatement(consulta);
            pe.setString(1, trabajo.getEstado());
            pe.setString(2, trabajo.getUnidadCo().getIdUnidadComercial());
            pe.setString(3, trabajo.getFechaSolicitud());
            pe.setString(4, trabajo.getFechaCierre());
            pe.setString(5, trabajo.getIdOrdenTrabajo());
            res =+ pe.executeUpdate();
            //Se realiza la Actualiza en la tabla de servicios y aux.
            GestionServiciosSolicitados gss = new GestionServiciosSolicitados();
            res =+ gss.actualizar(trabajo.getidServiciosSolicitados(), idServiciosSolicitados);
        
        }catch(SQLException err){
            throw err;
        }

        //Se envia resultado
        return  res;
    }
    
    //Funcion eliminar registro
    public int eliminar(String idOrdenTrabajo)throws SQLException{
        
        //Se declara la variable de respuesta
        int res = 0;
        
        try{
            
            //Se crea la consulta
            String consulta =(" DELETE FROM orden_trabajo WHERE idOrdenTrabajo = ? ");
            
            //Se crea conexion
            Connection conx = conn.conexionDB();
            
            //Se prepara, realiza y toma resultado de la consulta
            PreparedStatement pe = conx.prepareStatement(consulta);
            pe.setString(1, idOrdenTrabajo);
            res = pe.executeUpdate();
            
        }catch(SQLException err){
            throw err;
        }
        
        //Se envia resultado
        return  res;
    }
    
    public int idServiciosSolicitados(String idOrden) throws SQLException{
        
        //se declara variable de respuesta
        int id = 0;
        
        try {
            
            //Se realiza conexion
            Connection cnx = conn.conexionDB();
            
            //se realiza consulta
            String consulta = "SELECT idServiciosSolicitados FROM orden_trabajo WHERE idOrdenTrabajo = ? ";
            
            //Se prepara la consulta, variables y respuesta
            PreparedStatement ps = cnx.prepareStatement(consulta);
            ps.setString(1, idOrden);
            ResultSet res = ps.executeQuery();
            while(res.next()){
                id = res.getInt(1);
            }    
        } catch (SQLException e) {
          throw e;
        }
        
        //Se devuelve respuesta
        return id;
    }
    
}
