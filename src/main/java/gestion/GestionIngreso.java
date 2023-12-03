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
import javax.swing.JOptionPane;

import conexion.Conexion;

/**
 *
 * @author teenc
 */
public class GestionIngreso {
    
    Conexion conn = new Conexion();
    
    public ArrayList<String> validarIngreso(String usuario,String contrasena){
        
        ArrayList<String> lista = new ArrayList<>();
        try {
            
            //Se crea la consulta y la conexion con la base de datos
            String consulta = "SELECT cargo , estado FROM empleado WHERE mailEmpresa = ? AND identificacion = ? ";
            Connection cnx = conn.conexionDB();
            
            //Se prepara las declaraciones y respuesta de la base de datos
            PreparedStatement ps = cnx.prepareStatement(consulta);
            ps.setString(1, usuario);
            ps.setString(2, contrasena);
            ResultSet res = ps.executeQuery();
            while (res.next()) {
                String Rol = res.getString(1);
                String estado = res.getString(2);
                lista.add(Rol);
                lista.add(estado);
                
            }
        } catch (SQLException e) {
            System.out.println("Gestion "+e);
        }
        
        // se retorna respuesta 
        return lista;
        }
    
    
    
}
