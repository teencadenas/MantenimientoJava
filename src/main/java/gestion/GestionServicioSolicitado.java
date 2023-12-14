/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.mariadb.jdbc.Connection;

/**
 *
 * @author teenc
 */
public class GestionServicioSolicitado {

    Conexion cnn = new Conexion();

    public int nuevo(String idServiciosSolicitados) {

        int res = 0;
        String consulta = "INSERT INTO servicios_solicitados(idServiciosSolicitados) VALUES (?)";
        
        try (Connection cnx = (Connection) cnn.conexionDB()) {

            PreparedStatement ps = cnx.prepareStatement(consulta);
            ps.setString(1, idServiciosSolicitados);
            res += ps.executeUpdate();

        } catch (SQLException ex) {

            Logger.getLogger(GestionServicioSolicitado.class.getName()).log(Level.SEVERE, null, ex);
        }

        return res;
    }

}
