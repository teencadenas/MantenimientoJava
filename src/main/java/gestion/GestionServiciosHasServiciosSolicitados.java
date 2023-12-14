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
public class GestionServiciosHasServiciosSolicitados {

    Conexion cnn = new Conexion();

    public int nuevo(String idServiciosSolicitados, List<Servicio> lista) {

        int res = 0;
        String consulta = "INSERT INTO servicios_solicitados_has_servicios(idServiciosSolicitados, idServicios) VALUES (?,?)";

        try (Connection cnx = (Connection) cnn.conexionDB()) {

            PreparedStatement ps = cnx.prepareStatement(consulta);
            for (Servicio servicio : lista) {
                ps.setString(1, idServiciosSolicitados);
                ps.setString(2, servicio.getIdServicio());
                res += ps.executeUpdate();
            }
        } catch (Exception ex) {

            Logger.getLogger(GestionServiciosHasServiciosSolicitados.class.getName()).log(Level.SEVERE, null, ex);
        }

        return res;
    }

    public List<String> buscar(String idServiciosSolicitados) {

        ArrayList<String> listado = new ArrayList<>();
        String consulta = "SELECT idServicios FROM servicios_solicitados_has_servicios WHERE idServiciosSolicitados = ?";

        try (Connection cnx = (Connection) cnn.conexionDB()) {

            PreparedStatement ps = cnx.prepareStatement(consulta);
            ps.setString(1, idServiciosSolicitados);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                listado.add(rs.getString(1));
            }

        } catch (Exception ex) {

            Logger.getLogger(GestionServiciosHasServiciosSolicitados.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listado;
    }

    public int eliminar(String idServiciosSolicitados) {

        int res = 0;
        String consulta = "DELETE FROM servicios_solicitados_has_servicios WHERE idServiciosSolicitados = ?";
        
        try (Connection cnx = (Connection) cnn.conexionDB()) {

            PreparedStatement ps = cnx.prepareStatement(consulta);
            ps.setString(1, idServiciosSolicitados);
            res = ps.executeUpdate();

        } catch (Exception ex) {

            Logger.getLogger(GestionServiciosHasServiciosSolicitados.class.getName()).log(Level.SEVERE, null, ex);

        }
        return res;
    }

    public int actualizar(List<Servicio> lista, String idServiciosSolicitados) {

        int res = 1;

        try {

            this.eliminar(idServiciosSolicitados);
            this.nuevo(idServiciosSolicitados, lista);

        } catch (Exception ex) {

            Logger.getLogger(GestionServiciosHasServiciosSolicitados.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }
    
}
