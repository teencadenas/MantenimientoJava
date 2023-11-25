/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;

import Clases.Servicio;
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
public class GestionServicioHasRealizado {
    
    //Se crea la conexion
    conexion conn = new conexion();
   
    //Funcion para listar los servicios realizados segun id servicio realizados
    
    public ArrayList<Servicio> listaServiciosRealizados(String idServiciosRealizados) throws SQLException{
//        
        ResultSet res = null;
        ArrayList<Servicio> lista = new ArrayList();
        Servicio ser = null;
        GestionServicio gs = new GestionServicio();
//        
        try {
            String consulta = " SELECT idServicios FROM servicios_realizados_has_servicios WHERE idServiciosRealizados = ? ";
            Connection cnx = conn.conexionDB();
            PreparedStatement pr = cnx.prepareStatement(consulta);
            pr.setString(1, idServiciosRealizados);
            res = pr.executeQuery();
            while(res.next()){
                ser = gs.buscar(res.getString(1));
                lista.add(ser);
            }
            
        } catch (SQLException e) {
            throw e;
        }
        return lista;
        
        
    }
    
    public int  nuevoServRea(ArrayList<Servicio> servicios, int idServiciosRealizados) throws Exception{
        
        int res = 0;
        
        try {
            
            String consulta = " INSERT INTO servicios_realizados_has_servicios ( idServicios , idServiciosRealizados ) VALUES ( ? , ? ) ";
            Connection cnx = conn.conexionDB();
            PreparedStatement ps = cnx.prepareStatement(consulta);
            for (Servicio ser : servicios) {
                ps.setString(1, ser.getIdServicio());
                ps.setInt(2, idServiciosRealizados);
                res = ps.executeUpdate();
            }
            
        } catch (SQLException e) {
            throw e;
        }
        return res;
    }
    
//    public int actualizarServReal(ArrayList servicios,String idServiciosRealizados) throws SQLException{
//        
//        int res = 0;
//        try {
//            
//            String consulta = " UPDATE servicios_realizados_has_servicios SET idServicios = ? WHERE idServiciosRealizados = ? ";
//            Connection cnx = conn.conexionDB();
//            PreparedStatement ps = cnx.prepareStatement(consulta);
//            for (Object ser : servicios) {
//                ps.setString(1, ser.toString());
//                ps.setString(2, idServiciosRealizados);
//                res = ps.executeUpdate();
//            }
//            
//        } catch (SQLException e) {
//            throw e;
//        }
//        return res;
//    }
}
