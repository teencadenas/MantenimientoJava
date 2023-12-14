package clases;

import java.util.List;

public class OrdenTrabajo {

    private String idOrdenTrabajo;
    private String estado;
    private UnidadComercial unidadCo;
    private String fechaSolicitud;
    private String fechaCierre;
    private List<Servicio> serviciosSolicitados;

    public OrdenTrabajo(String idOrdenTrabajo, String estado, UnidadComercial unidadCo, String fechaSolicitud, String fechaCierre, List<Servicio> serviciosSolicitados) {
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

    public String getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(String fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public String getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(String fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public List<Servicio> getidServiciosSolicitados() {
        return serviciosSolicitados;
    }

    public void setIdServiciosSolicitados(List<Servicio> serviciosSolicitados) {
        this.serviciosSolicitados = serviciosSolicitados;
    }

}
