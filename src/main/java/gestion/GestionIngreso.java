/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import conexion.Conexion;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import vista.PrincipalFrm;

/**
 *
 * @author teenc
 */
public class GestionIngreso {

    Conexion conn = new Conexion();

    public List<String> validarIngreso(String usuario, String contrasena) {

        ArrayList<String> lista = new ArrayList<>();

        //Se realiza conexion
        try (Connection cnx = conn.conexionDB()) {

            //Se crea la consulta y la conexion con la base de datos
            String consulta = "SELECT cargo , estado FROM empleado WHERE mailEmpresa = ? AND identificacion = ? ";

            //Se prepara las declaraciones y respuesta de la base de datos
            PreparedStatement ps = cnx.prepareStatement(consulta);
            ps.setString(1, usuario);
            ps.setString(2, contrasena);
            ResultSet res = ps.executeQuery();
            while (res.next()) {
                String rol = res.getString(1);
                String estado = res.getString(2);
                lista.add(rol);
                lista.add(estado);

            }
        } catch (SQLException ex) {

            Logger.getLogger(PrincipalFrm.class.getName()).log(Level.SEVERE, null, ex);
        }

        // se retorna respuesta 
        return lista;
    }
}
