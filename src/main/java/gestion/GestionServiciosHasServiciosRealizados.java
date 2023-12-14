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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author teenc
 */
public class GestionServiciosHasServiciosRealizados {

    //Se importa las clases necesarias
    Conexion cnn = new Conexion();

    //Funcion nuevo registro
    public int nuevo(List<Servicio> lista, String idServiciosRealizados) {

        //Se declara variable para respuesta
        int res = 0;
        //Se declara consulta
        String consulta = "INSERT INTO servicios_realizados_has_servicios ( idServicios, idServiciosRealizados) "
                + "VALUES ( ?, ?)";

        //Se declara conexion
        try (Connection cnx = cnn.conexionDB()) {

            //Se prepara consulta
            PreparedStatement ps = cnx.prepareStatement(consulta);

            for (Servicio servicio : lista) {
                ps.setString(1, servicio.getIdServicio());
                ps.setString(2, idServiciosRealizados);
                res = ps.executeUpdate();
            }

        } catch (Exception ex) {

            Logger.getLogger(GestionServiciosHasServiciosRealizados.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;

    }

    //Funcion buscar registro
    public List<String> buscar(String idServiciosRealizados) {

        //Se declaran variables 
        List<String> lista = new ArrayList<>();
        //Se declara consulta
        String consulta = "SELECT idServicios FROM servicios_realizados_has_servicios "
                + "WHERE idServiciosRealizados = ?";

        //Se realiza conexxion
        try (Connection cnx = cnn.conexionDB()) {
            //Se prepara consulta
            PreparedStatement ps = cnx.prepareStatement(consulta);
            ps.setString(1, idServiciosRealizados);
            ResultSet res = ps.executeQuery();
            while (res.next()) {
                lista.add(res.getString(1));

            }

        } catch (Exception ex) {

            Logger.getLogger(GestionServiciosHasServiciosRealizados.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    //Funcion eliminar registro
    public int eliminar(String idServiciosRealizados) {

        //Se declara veriables
        int res = 0;
        //Se declara consulta
        String consulta = "DELETE FROM servicios_realizados_has_servicios WHERE idServiciosRealizados = ?";

        //Se realiza conexion
        try (Connection cnx = cnn.conexionDB()) {
            //Se prepara consulta
            PreparedStatement ps = cnx.prepareStatement(consulta);
            ps.setString(1, idServiciosRealizados);
            res = ps.executeUpdate();

        } catch (Exception ex) {

            Logger.getLogger(GestionServiciosHasServiciosRealizados.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }

    //Funcion de actualizacon consulta
    public int actualizar(List<Servicio> lista, String idServiciosRealizados) {

        //Se declara variables
        int res = 0;

        try {
            //Se realiza consultas
            this.eliminar(idServiciosRealizados);
            this.nuevo(lista, idServiciosRealizados);

        } catch (Exception ex) {

            Logger.getLogger(GestionServiciosHasServiciosRealizados.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }

}
