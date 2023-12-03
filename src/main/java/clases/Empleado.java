/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author teenc
 */
public class Empleado extends Persona{
    private String idEmpleado ;
    private String cargo ;
    private String mailEmpresa ;
    private String estado;

    public Empleado(String idEmpleado, String cargo, String mailEmpresa, String estado, String nombre, String apellido, String telefono, String mailPersona, String identificacion) {
        super(nombre, apellido, telefono, mailPersona, identificacion);
        this.idEmpleado = idEmpleado;
        this.cargo = cargo;
        this.mailEmpresa = mailEmpresa;
        this.estado = estado;
    }

    /**
     * @return the idEmpleado
     */
    public String getIdEmpleado() {
        return idEmpleado;
    }

    /**
     * @param idEmpleado the idEmpleado to set
     */
    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the mailEmpresa
     */
    public String getMailEmpresa() {
        return mailEmpresa;
    }

    /**
     * @param mailEmpresa the mailEmpresa to set
     */
    public void setMailEmpresa(String mailEmpresa) {
        this.mailEmpresa = mailEmpresa;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
