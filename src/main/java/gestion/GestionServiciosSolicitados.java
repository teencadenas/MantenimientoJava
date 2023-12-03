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
public class GestionServiciosSolicitados {
    
    //Crear nueva conexion
    Conexion conn = new Conexion();
    
    //Funcion listar los registros guardados
    public ArrayList listar(String idServiciosSolicitados) throws SQLException{
        
        //Se declara array para almacenar valores
        ArrayList<Servicio> lista = new ArrayList();        
        
        try {
            
            //Se crea consulta a la base de datos y respectiva conexion
            String consulta = " SELECT idServicios FROM servicios_solicitados_has_servicios WHERE idServiciosSolicitados = ? ";
            Connection cnx = conn.conexionDB();
            
            //Se prepara las consultas y se toma los resultados 
            PreparedStatement ps = cnx.prepareStatement(consulta);
            ps.setString(1, idServiciosSolicitados);
            ResultSet res = ps.executeQuery();
            while(res.next()){
                GestionServicio gs = new GestionServicio();
                Servicio s =  gs.buscar(res.getString(1));                
                lista.add(s);                
            }
          
        } catch (SQLException e) {
            throw e;
        }
        
        //Se devuelve resultado
        return lista;
    }
    
    //Funcion para crear nuevo registro
    public int nuevo(ArrayList<Servicio> listado, int idServiciosSolicitados) throws SQLException{
            
            //Se crea variable para tomar valor de respuesta
            int res = 0;
            Servicio s = null;
            
            try {
                
                //Se crea la conexxion
                Connection cnx = conn.conexionDB();       
                               
                try{
                 
                //Cramos consulta y conexion 
                String consultaS = " INSERT INTO servicios_solicitados ( idServiciosSolicitados ) VALUES ( ? ) ";
                    
                //Se prepara la consulta y se toma respuesta en tabla de servicios
                PreparedStatement prS = cnx.prepareStatement(consultaS);
                prS.setInt(1, idServiciosSolicitados);
                res =+ prS.executeUpdate();
                
                }catch(SQLException e){
                    throw e;
                }
                
                try{
                
                //Se redacta consulta    
                String consulta = " INSERT INTO servicios_solicitados_has_servicios ( idServiciosSolicitados , idServicios )"
                        + " VALUES ( ? , ? )";
                
                //Se prepara la consulta y se envia respuesta en tabla de servicios
                PreparedStatement pr = cnx.prepareStatement(consulta);          
                    for (Servicio x : listado) {
                        pr.setInt(1, idServiciosSolicitados);
                        pr.setString(2,x.getIdServicio());
                        res = pr.executeUpdate();
                    }
                }catch(SQLException e){
                    throw e;
                }
                
            } catch (SQLException e) {
                throw e;
            }
            
//            Se devuelve la respuesta
            return res;
        }
    
    //Funcion para actualizar registros
    public int actualizar(ArrayList listado,String idServiciosSolicitados) throws SQLException{
        
        //Se declara variable para la respuesta
        int res = 0;
        Servicio s = null;
        
        try {
            
            //Se cran la consulta y conexion
            String consulta = " UPDATE servicios_solicitados_has_servicios SET idServicios = ? WHERE idServiciosSolicitados = ? ";
            Connection cnx = conn.conexionDB();
            
            //se prepara la cinsulta y se toma el resultado
            PreparedStatement pr = cnx.prepareStatement(consulta);
                for (Object x : listado) {
                    s = (Servicio) x;
                    pr.setString(1, s.getIdServicio());
                    pr.setString(2,idServiciosSolicitados);
                    res = pr.executeUpdate();
                }
                        
        } catch (SQLException e) {
            throw e;
        }
        
        //Se devuelve la respuesta
        return res;
    }
    
    public int maximo() throws SQLException{
        
        //Se inicia la variable de repuesta
        
        ResultSet res;
            int max = 0;
        try {
            
            //Se crea consulta 
            String consulta = "SELECT MAX(idServiciosSolicitados) FROM servicios_solicitados; ";
            Connection cnx = conn.conexionDB();
            
            PreparedStatement ps = cnx.prepareStatement(consulta);
            res = ps.executeQuery();
            while(res.next()){
                max = res.getInt(1);
            }
        } catch (SQLException e) {
            throw e;
        }
        return max;
       
    }
    //Funcion para eliminar registro
    public int eliminar(int id) throws SQLException{
        
        //Se crea variable para asignar respuesta
        int res = 0;
        
        try {
            
            //Se genera consulta y conexion
            String consulta = " DELETE FROM servicios_solicitados WHERE idServiciosSolicitados = ? ";
            Connection cnx = conn.conexionDB();
            
            //Se prepara consulta y se toma la respuesta 
            PreparedStatement pr = cnx.prepareStatement(consulta);
            pr.setInt(1, id);
            res = pr.executeUpdate();
            
        } catch (SQLException e) {
            throw e;
        }
        
        //Se devuelve la respuesta
        return res;
    }
    
   
}
