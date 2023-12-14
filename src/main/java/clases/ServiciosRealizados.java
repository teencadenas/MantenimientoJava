/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.List;

/**
 *
 * @author teenc
 */
public class ServiciosRealizados {

    private String idServicioRealizado;
    private Empleado empleado;
    private OrdenTrabajo ordenTrabajo;
    private List<Servicio> servicioRealizados;

    public ServiciosRealizados(String idServicioRealizado, Empleado empleado, OrdenTrabajo ordenTrabajo, List<Servicio> servicioRealizados) {
        this.idServicioRealizado = idServicioRealizado;
        this.empleado = empleado;
        this.ordenTrabajo = ordenTrabajo;
        this.servicioRealizados = servicioRealizados;
    }

    public List<Servicio> getServicioRealizados() {
        return servicioRealizados;
    }

    public void setServicioRealizados(List<Servicio> servicioRealizados) {
        this.servicioRealizados = servicioRealizados;
    }

    public String getIdServicioRealizado() {
        return idServicioRealizado;
    }

    public void setIdServicioRealizado(String idServicioRealizado) {
        this.idServicioRealizado = idServicioRealizado;
    }

    public Empleado getIempleado() {
        return empleado;
    }

    public void setempleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public OrdenTrabajo getordenTrabajo() {
        return ordenTrabajo;
    }

    public void setordenTrabajo(OrdenTrabajo ordenTrabajo) {
        this.ordenTrabajo = ordenTrabajo;
    }

}
