/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author teenc
 */
public class UnidadComercial {
    
    private String idUnidadComercial;
    private String nombreUnidadComercial;
    private String direccionUnidadComercial;
    private String tipologia;
    private Cliente cliente;   

    public UnidadComercial(String idInidadComercial, String nombreUnidadComercial, String direccionUnidadComercial, String tipologia, Cliente cliente) {
        this.idUnidadComercial = idInidadComercial;
        this.nombreUnidadComercial = nombreUnidadComercial;
        this.direccionUnidadComercial = direccionUnidadComercial;
        this.tipologia = tipologia;
        this.cliente = cliente;
    }

    public String getIdUnidadComercial() {
        return idUnidadComercial;
    }

    public void setIdUnidadComercial(String idUnidadComercial) {
        this.idUnidadComercial = idUnidadComercial;
    }

    public String getNombreUnidadComercial() {
        return nombreUnidadComercial;
    }

    public void setNombreUnidadComercial(String nombreUnidadComercial) {
        this.nombreUnidadComercial = nombreUnidadComercial;
    }

    public String getDireccionUnidadComercial() {
        return direccionUnidadComercial;
    }

    public void setDireccionUnidadComercial(String direccionUnidadComercial) {
        this.direccionUnidadComercial = direccionUnidadComercial;
    }

    public String getTipologia() {
        return tipologia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    public Cliente getcliente() {
        return cliente;
    }

    public void setcliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
       
}
