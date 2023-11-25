/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author teenc
 */
public class Persona {
    
    private String nombrePersona ;
    private String apellido ;
    private String telefonoPersona ;
    private String mailPersona ;
    private String identificacionPersona ;

    public Persona(String nombre, String apellido, String telefono, String mailPersona, String identificacion) {
        this.nombrePersona = nombre;
        this.apellido = apellido;
        this.telefonoPersona = telefono;
        this.mailPersona = mailPersona;
        this.identificacionPersona = identificacion;
    }

    /**
     * @return the nombrePersona
     */
    public String getNombrePersona() {
        return nombrePersona;
    }

    /**
     * @param nombrePersona the nombrePersona to set
     */
    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the telefonoPersona
     */
    public String getTelefonoPersona() {
        return telefonoPersona;
    }

    /**
     * @param telefonoPersona the telefonoPersona to set
     */
    public void setTelefonoPersona(String telefonoPersona) {
        this.telefonoPersona = telefonoPersona;
    }

    /**
     * @return the mailPersona
     */
    public String getMailPersona() {
        return mailPersona;
    }

    /**
     * @param mailPersona the mailPersona to set
     */
    public void setMailPersona(String mailPersona) {
        this.mailPersona = mailPersona;
    }

    /**
     * @return the identificacionPersona
     */
    public String getIdentificacionPersona() {
        return identificacionPersona;
    }

    /**
     * @param identificacionPersona the identificacionPersona to set
     */
    public void setIdentificacionPersona(String identificacionPersona) {
        this.identificacionPersona = identificacionPersona;
    }
    
}
