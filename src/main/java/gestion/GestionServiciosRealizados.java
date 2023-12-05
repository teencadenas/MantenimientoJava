/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;

import clases.Empleado;
import clases.OrdenTrabajoFrm;
import clases.Servicio;
import clases.ServiciosRealizados;
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
public class GestionServiciosRealizados {
    
    //Se inicia para conexion 
    Conexion conn = new Conexion();
    
//    Funcion para listar registros
    public ArrayList<ServiciosRealizados> listaSerRea(int idServiciosRealizados) throws Exception{
        
        //Se crea Listadpo para asignar resultado
        ArrayList<ServiciosRealizados> listaRealizados = new ArrayList();
        ArrayList<Servicio> listaServicios = new ArrayList();
        GestionServicio gs = new GestionServicio();
        GestionOrdenTrabajo got = new GestionOrdenTrabajo();
        GestionEmpleado ge = new GestionEmpleado();
        
        try {
                        
            //Se crea consulta y conexion
            String Consulta = " SELECT idOrdenTrabajo , idEmpleado FROM servicios_realizados"
                    + " WHERE idServiciosRealizados = ? ";
            Connection cnx = conn.conexionDB();
            
            //Se realiza consulta y se toma la respuesta
            PreparedStatement ps = cnx.prepareStatement(Consulta);
            ps.setInt(1, idServiciosRealizados);
            ResultSet res = ps.executeQuery();
            
            //Manejo de la respuesta
            while(res.next()){
                
                //Se realiza busqueda de ot 
                OrdenTrabajoFrm ot = got.buscar(res.getString(3));
                
                //Se realiza la busqueda del objeto empleado
                Empleado em = ge.buscar(res.getString(2));
                
                //Se crea la clase servicios Realizados
                ServiciosRealizados sr = new ServiciosRealizados (idServiciosRealizados, em,
                        ot, listaServicios);
                listaRealizados.add(sr);
            }
            
        } catch (SQLException e) {
            System.out.println("Control :"+e);
        }
        
        //Se devuelve la respuesta
        return listaRealizados;
    }
    
    //Funcion para crear nuevo registro
    public int nuevoSerRea(ServiciosRealizados realizado) throws Exception{
        
        //Se crea variable para respuesta
        GestionServicioHasRealizado gshr = new GestionServicioHasRealizado();
        int res = 0;
        
        try {
            
//            Se genera consulta y conexion
            String consulta = " INSERT INTO servicios_realizados ( idServiciosRealizados , idEmpleado , idOrdenTrabajo ) VALUES ( ? , ? , ? ) ";
            Connection cnx = conn.conexionDB();
            
            try{
            //Se prepara consulta y se toma resultado
            PreparedStatement ps = cnx.prepareStatement(consulta);
            ps.setInt(1, realizado.getIdServicioRealizado());
            ps.setString(2, realizado.getIempleado().getIdEmpleado());
            ps.setString(3, realizado.getordenTrabajo().getIdOrdenTrabajo());
            res = ps.executeUpdate();            
            }catch(SQLException e){
                throw e;
            }
            
            res =+ gshr.nuevoServRea(realizado.getServicioRealizados(), realizado.getIdServicioRealizado());
            
        } catch (SQLException e) {
            System.out.println("Control :"+e);
        }
        
//        Se devuelve la respuesta
        return res;
    }
    
    //Funcion para buscar registro 
    public ServiciosRealizados buscarSerRea(String idOrdenTrabajo) throws Exception{
        
        //Se crean relacion con dependencias necesarias
        ArrayList<Servicio> listaServicios = new ArrayList();
        GestionOrdenTrabajo got = new GestionOrdenTrabajo();
        GestionEmpleado ge = new GestionEmpleado();
        ServiciosRealizados sr = null;
        GestionServicioHasRealizado gshr = new GestionServicioHasRealizado();
        
        try {
            
            //Se crean consulta y conexion
            String consultaReal = " SELECT idServiciosRealizados , idEmpleado FROM servicios_realizados WHERE idOrdenTrabajo = ? ";
            Connection cnx = conn.conexionDB();
            
            //Se prepara la consulta y conexion
            PreparedStatement ps = cnx.prepareStatement(consultaReal);
            ps.setString(1, idOrdenTrabajo);
            ResultSet res = ps.executeQuery();
            while(res.next()){
                
                //Se realiza busqueda de ot 
                OrdenTrabajoFrm ot = got.buscar(idOrdenTrabajo);
                
                //Se realiza la busqueda del objeto empleado
                Empleado em = ge.buscar(res.getString(2));
                
                //Busqueda listado servicio
                listaServicios = gshr.listaServiciosRealizados(res.getString(1));
                
                //Se crea la clase servicios Realizados
                sr = new ServiciosRealizados(res.getInt(1), em,
                        ot, listaServicios);
            }
            
        } catch (SQLException e) {
            System.out.println("Control :"+e);
        }
        
        //Se devuelve el resultado
        return sr;
    }
    
//    //Fubbcion actualizar registro
//    public int actualizarSerRea(ServiciosRealizados realizados) throws Exception{
//        
//        //Se crean relacion con dependencias necesarias
//        
//        int res = 0;
//        GestionServicioHasRealizado gshr = new GestionServicioHasRealizado();
//        ServiciosRealizados sr = null;
//                
//        try {
//            
//            try{
//            //Se crean consulta y conexion
//            String consultaReal = " UPDATE servicios_realizados SET idEmpleado = ? , idOrdenTrabajo = ? WHERE idServiciosRealizados = ? ";
//            Connection cnx = conn.conexionDB();
//            
//            //Se prepara la consulta y conexion
//            PreparedStatement ps = cnx.prepareStatement(consultaReal);
//            ps.setString(1, realizados.getIempleado().getIdEmpleado());
//            ps.setString(2, realizados.getordenTrabajo().getIdOrdenTrabajo());
//            ps.setString(3, realizados.getIdServicioRealizado());
//            res = ps.executeUpdate();
//            }catch(SQLException e){
//                throw e;
//            }
//            
//            res =+ gshr.actualizarServReal(realizados.getServicioRealizados(), realizados.getIdServicioRealizado());
//            
//        } catch (SQLException e) {
//            System.out.println("Control :"+e);
//        }
//        
//        //Se devuelve el resultado
//        return res;
//    }
    
    //Funcion para eliminar registro
    public int eliminarSerRea(String idOrdenTrabajo){
        
        //Se declara variable para respuesta
        int res = 0;
                
        try {
            
            //Se crea consulta y conexion
            String consulta = "DELETE FROM servicios_realizados WHERE idOrdenTrabajo = ? ";
            Connection cnx = conn.conexionDB();
            
            //Se prepara consulta y conexion
            PreparedStatement ps = cnx.prepareStatement(consulta);
            ps.setString(1, idOrdenTrabajo);
            res = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Control :"+e);
        }
        
        //Se devuelve resultado
        return res;
    }
    
    public int maximo() throws SQLException{
        
        //Se inicia la variable de repuesta
        ResultSet res;
            int max = 0;
        try {
            
            //Se crea consulta 
            String consulta = " SELECT MAX(idServiciosRealizados) FROM servicios_realizados; ";
            Connection cnx = conn.conexionDB();
            
            //Se envian parametros, realiza consulta y devuelve resultado
            PreparedStatement ps = cnx.prepareStatement(consulta);
            res = ps.executeQuery();
            while(res.next()){
                max = res.getInt(1);
            }
        } catch (SQLException e) {
            throw e;
        }
        
         //Se envia respuesta
        return max;
    }    
}
