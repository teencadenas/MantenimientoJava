/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author teenc
 */
public class ServiciosRealizados{
   
    private int idServicioRealizado;
    private Empleado empleado;
    private OrdenTrabajoFrm ordenTrabajo;
    private ArrayList<Servicio> servicioRealizados;

    public ServiciosRealizados(int idServicioRealizado, Empleado empleado, OrdenTrabajoFrm ordenTrabajo, ArrayList<Servicio> servicioRealizados) {
        this.idServicioRealizado = idServicioRealizado;
        this.empleado = empleado;
        this.ordenTrabajo = ordenTrabajo;
        this.servicioRealizados = servicioRealizados;
    }

    public ArrayList<Servicio> getServicioRealizados() {
        return servicioRealizados;
    }

    public void setServicioRealizados(ArrayList<Servicio> servicioRealizados) {
        this.servicioRealizados = servicioRealizados;
    }

    public int getIdServicioRealizado() {
        return idServicioRealizado;
    }

    public void setIdServicioRealizado(int idServicioRealizado) {
        this.idServicioRealizado = idServicioRealizado;
    }

    public Empleado getIempleado() {
        return empleado;
    }

    public void setempleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public OrdenTrabajoFrm getordenTrabajo() {
        return ordenTrabajo;
    }

    public void setordenTrabajo(OrdenTrabajoFrm ordenTrabajo) {
        this.ordenTrabajo = ordenTrabajo;
    }
    

    
    
}
