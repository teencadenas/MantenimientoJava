/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author teenc
 */
public class Conexion {

    public static Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    Connection conectar = null;
    
   private final String sURL = "jdbc:mariadb://127.0.0.1:3306/serviciomantenimiento";     
   private final String usuario = "root";
   private final String clave = "";    
   
   public Connection conexionDB(){ 

        try{            
            conectar = DriverManager.getConnection(sURL,usuario,clave);
            System.out.println("conectado");
        }catch(SQLException error){
            System.out.println("error: "+error);
        }
        return conectar;
   }
  
}



