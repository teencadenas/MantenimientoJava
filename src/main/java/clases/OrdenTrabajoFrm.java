package clases;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class OrdenTrabajoFrm {
    
    private String idOrdenTrabajo;
    private String estado;
    private UnidadComercial unidadCo;
    private Date fechaSolicitud;
    private Date fechaCierre;
    private List<Servicio> serviciosSolicitados;

    public OrdenTrabajoFrm(String idOrdenTrabajo, String estado, UnidadComercial unidadCo, Date fechaSolicitud, Date fechaCierre, List serviciosSolicitados) {
        this.idOrdenTrabajo = idOrdenTrabajo;
        this.estado = estado;
        this.unidadCo = unidadCo;
        this.fechaSolicitud = fechaSolicitud;
        this.fechaCierre = fechaCierre;
        this.serviciosSolicitados = serviciosSolicitados;
    }

    public String getIdOrdenTrabajo() {
        return idOrdenTrabajo;
    }

    public void setIdOrdenTrabajo(String idOrdenTrabajo) {
        this.idOrdenTrabajo = idOrdenTrabajo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public UnidadComercial getUnidadCo() {
        return unidadCo;
    }

    public void setUnidadCo(UnidadComercial unidadCo) {
        this.unidadCo = unidadCo;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public Date getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(Date fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public List<Servicio> getidServiciosSolicitados() {
        return serviciosSolicitados;
    }

    public void setIdServiciosSolicitados(List<Servicio> serviciosSolicitados) {
        this.serviciosSolicitados = serviciosSolicitados;
    }

    
}    