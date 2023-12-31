/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;

import clases.Empleado;
import conexion.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import vista.PrincipalFrm;

/**
 *
 * @author teenc
 */
public class GestionEmpleado {

    //Se crea la conexion
    Conexion conn = new Conexion();

    //Funcion para listar todos los registros
    public List<Empleado> listado() throws SQLException {

        //Se declara el array para el listado
        ArrayList<Empleado> listado = new ArrayList<>();

        //Se crea conexion
        try (Connection conx = conn.conexionDB()) {

            //Se crea la consulta
            String consulta = "SELECT persona.identificacion, persona.nombre, persona.apellido, persona.telefono, persona.mailPersona,"
                    + "empleado.idEmpleado, empleado.cargo, empleado.mailEmpresa, empleado.estado FROM persona INNER JOIN empleado "
                    + "ON persona.identificacion = empleado.identificacion";

            //Se prepara, realiza y toma resultado de la consulta
            PreparedStatement pe = conx.prepareStatement(consulta);
            ResultSet res = pe.executeQuery();

            //Se asigna a la lista los registros encontrados
            while (res.next()) {
                Empleado em = new Empleado(res.getNString(6), res.getNString(7), res.getNString(8),
                        res.getNString(9), res.getNString(2), res.getNString(3),
                        res.getNString(4), res.getNString(5), res.getNString(1));
                listado.add(em);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PrincipalFrm.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Se envia resultado
        return listado;
    }

    //Funcion para la busqueda de un registro, ingresando el nombre y valor del filtro a aplicar
    public Empleado buscar(String identificacion) throws Exception {

        //Se inicia la clase
        Empleado em = null;

        //Se crea conexion
        try (Connection conx = conn.conexionDB();) {

            String consultaP = " SELECT identificacion , nombre , apellido , telefono , mailPersona FROM persona WHERE identificacion = ? ";
            String consultaEm = " SELECT idEmpleado , cargo , mailEmpresa , estado , identificacion FROM empleado WHERE identificacion = ? ";
            PreparedStatement pe = conx.prepareStatement(consultaP);
            PreparedStatement pem = conx.prepareStatement(consultaEm);
            pe.setString(1, identificacion);
            pem.setString(1, identificacion);
            ResultSet res = pe.executeQuery();
            ResultSet rem = pem.executeQuery();

//          //Construccion de la clase
            while (res.next() && rem.next()) {
                em = new Empleado(rem.getString(1), rem.getString(2), rem.getString(3),
                        rem.getString(4), res.getString(2), res.getString(3),
                        res.getString(4), res.getString(5), res.getString(1));
            }

        } catch (SQLException ex) {

            Logger.getLogger(PrincipalFrm.class.getName()).log(Level.SEVERE, null, ex);

        }

        //Se envia resultado
        return em;
    }

    //Funcion crear nuevo registro
    public int nuevo(Empleado empleado) throws SQLException {

        //Se declara la variable de respuesta
        int resP = 0;
        int resE = 0;

        try {

            //Se crea la consulta
            String consultaP = "INSERT INTO `persona`(`identificacion`, `nombre`, `apellido`, `telefono`, `mailPersona`) VALUES"
                    + " (?,?,?,?,?)";

            //Se crea la consulta
            String consultaE = "INSERT INTO `empleado`(`cargo`, `mailEmpresa`, `estado`, `identificacion`) VALUES"
                    + " (?,?,?,?)";

            //Se crea conexion
            Connection conx = conn.conexionDB();

            //Se prepara, realiza y toma resultado de la consulta
            PreparedStatement peP = conx.prepareStatement(consultaP);
            peP.setString(1, empleado.getIdentificacionPersona());
            peP.setString(2, empleado.getNombrePersona());
            peP.setString(3, empleado.getApellido());
            peP.setString(4, empleado.getTelefonoPersona());
            peP.setString(5, empleado.getMailPersona());

            PreparedStatement peE = conx.prepareStatement(consultaE);
            peE.setString(1, empleado.getCargo());
            peE.setString(2, empleado.getMailEmpresa());
            peE.setString(3, empleado.getEstado());
            peE.setString(4, empleado.getIdentificacionPersona());

            resP = peP.executeUpdate();
            resE = peE.executeUpdate();

        } catch (SQLException ex) {

            Logger.getLogger(PrincipalFrm.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Se envia resultado
        if ((resP + resE) == 2) {
            return resP;
        } else {
            return 0;
        }
    }

    //Funcion actualizar registro
    public int actualizar(Empleado empleado) throws SQLException {

        //Se declara la variable de respuesta
        int resP = 0;
        int resE = 0;

        //Se crea conexion
        try (Connection conx = conn.conexionDB()) {

            //Se crea la consulta
            String consultaP = "UPDATE `persona` SET `nombre`= ? ,`apellido`= ? , `telefono`= ? ,`mailPersona`= ? WHERE `identificacion`= ? ";
            String consultaE = "UPDATE `empleado` SET `idEmpleado`= ? ,`cargo`= ? ,`mailEmpresa`= ? ,"
                    + "`estado`= ? WHERE `identificacion`= ? ";

            //Se prepara, realiza y toma resultado de la consulta
            PreparedStatement peP = conx.prepareStatement(consultaP);
            PreparedStatement peE = conx.prepareStatement(consultaE);
            peP.setString(1, empleado.getNombrePersona());
            peP.setString(2, empleado.getApellido());
            peP.setString(3, empleado.getTelefonoPersona());
            peP.setString(4, empleado.getMailPersona());
            peP.setString(5, empleado.getIdentificacionPersona());

            peE.setString(1, empleado.getIdEmpleado());
            peE.setString(2, empleado.getCargo());
            peE.setString(3, empleado.getMailEmpresa());
            peE.setString(4, empleado.getEstado());
            peE.setString(5, empleado.getIdentificacionPersona());

            resP = peP.executeUpdate();
            resE = peE.executeUpdate();

        } catch (SQLException ex) {

            Logger.getLogger(PrincipalFrm.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Se envia resultado
        if ((resP + resE) == 2) {
            return resP;
        } else {
            return 0;
        }
    }

    //Funcion eliminar registro
    public int eliminar(String idempleado) throws SQLException {

        //Se declara la variable de respuesta
        int resP = 0;
        int resE = 0;

        try {

            //Se crea la consulta
            String consultaP = "DELETE FROM persona WHERE `persona`.`identificacion` = ? ";

            //Se crea la consulta
            String consultaE = " DELETE FROM empleado WHERE `empleado`.`identificacion` =  ? ";

            //Se crea conexion
            Connection conx = conn.conexionDB();

            //Se prepara, realiza y toma resultado de la consulta
            PreparedStatement peP = conx.prepareStatement(consultaP);
            PreparedStatement peE = conx.prepareStatement(consultaE);
            peP.setString(1, idempleado);
            peE.setString(1, idempleado);
            resP = peP.executeUpdate();
            resE = peE.executeUpdate();

        } catch (SQLException ex) {

            Logger.getLogger(PrincipalFrm.class.getName()).log(Level.SEVERE, null, ex);
        }

//        Se envia resultado
        if ((resP + resE) == 2) {
            return resP;
        } else {
            return resP;
        }
    }

    public List<String> buscarPorIdEmpleado(String idEmpleado) {

        List<String> lista = new ArrayList<>();
        String consulta = "SELECT persona.nombre, persona.apellido, empleado.cargo "
                + "FROM persona INNER JOIN empleado ON persona.identificacion = empleado.identificacion WHERE empleado.idEmpleado = ?";

        try (Connection cnx = conn.conexionDB()) {
            PreparedStatement ps = cnx.prepareStatement(consulta);
            ps.setString(1, idEmpleado);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                lista.add(rs.getString(1));
                lista.add(rs.getString(2));
                lista.add(rs.getString(3));
            }

        } catch (Exception ex) {

            Logger.getLogger(GestionEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
}
