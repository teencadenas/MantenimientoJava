/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;

import clases.ServiciosRealizados;
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
public class GestionServiciosRealizados {

    //Se inicia para conexion 
    Conexion conn = new Conexion();

//    Funcion para listar registros
    public List<String> lista(String idServiciosRealizados) throws Exception {

        //Se crea Listadpo para asignar resultado
        List<String> lista = new ArrayList<>(3);

        //Se realiza conexion
        try (Connection cnx = conn.conexionDB()) {

            //Se crea consulta y conexion
            String consulta = " SELECT idOrdenTrabajo, idEmpleado FROM servicios_realizados "
                    + "WHERE  idServiciosRealizados = ? ";

            //Se realiza consulta y se toma la respuesta
            PreparedStatement ps = cnx.prepareStatement(consulta);
            ps.setString(1, idServiciosRealizados);
            ResultSet res = ps.executeQuery();

            //Manejo de la respuesta
            while (res.next()) {
                lista.add(res.getString(1));
                lista.add(res.getString(2));
            }

        } catch (SQLException ex) {

            Logger.getLogger(GestionServiciosRealizados.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Se devuelve la respuesta
        return lista;
    }

    //Funcion para crear nuevo registro
    public int nuevo(ServiciosRealizados realizado) throws Exception {

        //Se crea variable para respuesta
        int res = 0;

        //Se realiza conexion
        try (Connection cnx = conn.conexionDB()) {

//            Se genera consulta y conexion
            String consulta = " INSERT INTO servicios_realizados ( idServiciosRealizados , idEmpleado , idOrdenTrabajo ) VALUES ( ? , ? , ? ) ";

            //Se prepara consulta y se toma resultado
            PreparedStatement ps = cnx.prepareStatement(consulta);
            ps.setString(1, "");
            ps.setString(2, realizado.getIempleado().getIdEmpleado());
            ps.setString(3, realizado.getordenTrabajo().getIdOrdenTrabajo());
            res += ps.executeUpdate();

        } catch (SQLException ex) {

            Logger.getLogger(GestionServiciosRealizados.class.getName()).log(Level.SEVERE, null, ex);
        }

//       //Se devuelve la respuesta
        return res;
    }

    //Funcion para buscar registro 
    public List<List> buscar(String idOrdenTrabajo) throws Exception {

        List<List> subLista = new ArrayList<>();

        //Se realiza conexion
        try (Connection cnx = conn.conexionDB()) {

            //Se crean consulta y conexion
            String consultaReal = " SELECT servicios_realizados.idEmpleado, servicios_realizados_has_servicios.idServicios "
                    + "FROM servicios_realizados INNER JOIN servicios_realizados_has_servicios "
                    + "ON servicios_realizados.idServiciosRealizados = servicios_realizados_has_servicios.idServiciosRealizados "
                    + "WHERE servicios_realizados.idOrdenTrabajo = ? ";

            //Se prepara la consulta y conexion
            PreparedStatement ps = cnx.prepareStatement(consultaReal);
            ps.setString(1, idOrdenTrabajo);
            ResultSet res = ps.executeQuery();
            while (res.next()) {
                List<String> lista = new ArrayList<>();
                lista.add(res.getString(1));
                lista.add(res.getString(2));
                subLista.add(lista);
            }

        } catch (SQLException ex) {

            Logger.getLogger(GestionServiciosRealizados.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Se devuelve el resultado
        return subLista;
    }

    //Funcion para eliminar registro
    public int eliminarSerRea(String idServiciosRealizados) {

        //Se declara variable para respuesta
        int res = 0;

        //Se realiza conexion
        try (Connection cnx = conn.conexionDB()) {

            //Se crea consulta y conexion
            String consulta = "DELETE FROM servicios_realizados WHERE idOrdenTrabajo = ? ";

            //Se prepara consulta y conexion
            PreparedStatement ps = cnx.prepareStatement(consulta);
            ps.setString(1, idServiciosRealizados);
            res = ps.executeUpdate();
        } catch (SQLException ex) {

            Logger.getLogger(GestionServiciosRealizados.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Se devuelve resultado
        return res;
    }

    public int actualizar(ServiciosRealizados realizado) {

        int res = 1;
        String consulta = "UPDATE servicios_realizados SET idOrdenTrabajo = ?, idEmpleado = ?' "
                + "WHERE idServiciosRealizados = ?";

        //Se realiza conexion
        try (Connection cnx = conn.conexionDB()) {
            PreparedStatement ps = cnx.prepareStatement(consulta);
            ps.setString(1, realizado.getordenTrabajo().getIdOrdenTrabajo());
            ps.setString(2, realizado.getIempleado().getIdEmpleado());
            ps.setString(3, realizado.getIdServicioRealizado());
            res = ps.executeUpdate();

        } catch (Exception ex) {

            Logger.getLogger(GestionServiciosRealizados.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }

    public String maximoidServicioRealizado() {

        String res = null;
        String consulta = "SELECT MAX(idServiciosRealizados) FROM servicios_realizados";

        //Se realiza conexion
        try (Connection cnx = conn.conexionDB()) {
            PreparedStatement ps = cnx.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                res = rs.getString(1);
            }

        } catch (Exception ex) {

            Logger.getLogger(GestionServiciosRealizados.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }
}
