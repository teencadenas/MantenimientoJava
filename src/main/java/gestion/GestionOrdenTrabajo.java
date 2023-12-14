/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;

import clases.OrdenTrabajo;
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
public class GestionOrdenTrabajo {

    Conexion cnn = new Conexion();

    public int nuevo(OrdenTrabajo orden) {

        int res = 0;

        String consulta = "INSERT INTO orden_trabajo(idOrdenTrabajo, estado, idUnidadComercial, fechaSolicitud, fechaCierre,idServiciosSolicitados) "
                + "VALUES (?,?,?,?,?,?)";

        try (Connection cnx = (Connection) cnn.conexionDB()) {

            PreparedStatement ps = cnx.prepareStatement(consulta);
            ps.setString(1, orden.getIdOrdenTrabajo());
            ps.setString(2, orden.getEstado());
            ps.setString(3, orden.getUnidadCo().getIdUnidadComercial());
            ps.setString(4, orden.getFechaSolicitud());
            ps.setString(5, orden.getFechaCierre());
            ps.setString(6, "");
            res += ps.executeUpdate();

        } catch (Exception ex) {

            Logger.getLogger(GestionOrdenTrabajo.class.getName()).log(Level.SEVERE, null, ex);
        }

        return res;
    }

    public List<String> buscar(String idOrden) {

        ArrayList<String> lista = new ArrayList<>(5);
        String consulta = " SELECT estado, idUnidadComercial, fechaSolicitud, fechaCierre, idServiciosSolicitados "
                + "FROM orden_trabajo WHERE idOrdenTrabajo = ?";

        try (Connection cnx = (Connection) cnn.conexionDB()) {

            PreparedStatement ps = cnx.prepareStatement(consulta);
            ps.setString(1, idOrden);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                lista.add(rs.getString(1));
                lista.add(rs.getString(2));
                lista.add(rs.getString(3));
                lista.add(rs.getString(4));
                lista.add(rs.getString(5));
            }
        } catch (Exception ex) {

            Logger.getLogger(GestionOrdenTrabajo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    public int eliminar(String idOrden) {

        int res = 0;
        String consulta = " DELETE FROM orden_trabajo WHERE idOrdenTrabajo = ? ";

        try (Connection cnx = (Connection) cnn.conexionDB()) {

            PreparedStatement ps = cnx.prepareStatement(consulta);
            ps.setString(1, idOrden);
            res = ps.executeUpdate();

        } catch (Exception ex) {

            Logger.getLogger(GestionOrdenTrabajo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }

    public int actualizar(OrdenTrabajo orden) {

        int res = 0;
        String consulta = "UPDATE orden_trabajo SET estado = ? , idUnidadComercial = ?, fechaSolicitud = ? , fechaCierre = ? "
                + "WHERE idOrdenTrabajo = ?";

        try (Connection cnx = (Connection) cnn.conexionDB()) {

            PreparedStatement ps = cnx.prepareStatement(consulta);
            ps.setString(1, orden.getEstado());
            ps.setString(2, orden.getUnidadCo().getIdUnidadComercial());
            ps.setString(3, orden.getFechaSolicitud());
            ps.setString(4, orden.getFechaCierre());
            ps.setString(5, orden.getIdOrdenTrabajo());
            res = ps.executeUpdate();

        } catch (Exception ex) {

            Logger.getLogger(GestionOrdenTrabajo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }

    public List<String> listar() {

        List<String> lista = new ArrayList<>();
        String consulta = "SELECT idOrdenTrabajo FROM orden_trabajo";
        try (Connection cnx = (Connection) cnn.conexionDB()) {
            PreparedStatement ps = cnx.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                lista.add(rs.getString(1));
            }

        } catch (Exception ex) {

            Logger.getLogger(GestionOrdenTrabajo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
}
