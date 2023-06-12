package com.gf.entities;

public class Trabajadores {

    private String dniTrabajador = "";
    private double idTrabajador = 0;
    private String nombreTrabajador = "";
    private String apellidosTrabajador = "";
    private String rolTrabajador = "";
    private double sueldoTrabajador = 0;
    private String ccTrabajador = "";
    private String direccionTrabajador = "";
    private double ssTrabajador =0;

    public Trabajadores() {
    }

    public Trabajadores(String dniTrabajador, double idTrabajador, String nombreTrabajador,
                        String apellidosTrabajador, String rolTrabajador, double sueldoTrabajador,
                        String ccTrabajador, String direccionTrabajador, double ssTrabajador){
        this.dniTrabajador=dniTrabajador;
        this.idTrabajador=idTrabajador;
        this.nombreTrabajador=nombreTrabajador;
        this.apellidosTrabajador=apellidosTrabajador;
        this.rolTrabajador=rolTrabajador;
        this.sueldoTrabajador=sueldoTrabajador;
        this.ccTrabajador=ccTrabajador;
        this.direccionTrabajador=direccionTrabajador;
        this.ssTrabajador=ssTrabajador;
    }

    
    
    public String getDniTrabajador() {
        return dniTrabajador;
    }

    public void setDniTrabajador(String dniTrabajador) {
        this.dniTrabajador = dniTrabajador;
    }

    public double getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(double idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    public String getNombreTrabajador() {
        return nombreTrabajador;
    }

    public void setNombreTrabajador(String nombreTrabajador) {
        this.nombreTrabajador = nombreTrabajador;
    }

    public String getApellidosTrabajador() {
        return apellidosTrabajador;
    }

    public void setApellidosTrabajador(String apellidosTrabajador) {
        this.apellidosTrabajador = apellidosTrabajador;
    }

    public String getRolTrabajador() {
        return rolTrabajador;
    }

    public void setRolTrabajador(String rolTrabajador) {
        this.rolTrabajador = rolTrabajador;
    }

    public double getSueldoTrabajador() {
        return sueldoTrabajador;
    }

    public void setSueldoTrabajador(double sueldoTrabajador) {
        this.sueldoTrabajador = sueldoTrabajador;
    }

    public String getCcTrabajador() {
        return ccTrabajador;
    }

    public void setCcTrabajador(String ccTrabajador) {
        this.ccTrabajador = ccTrabajador;
    }

    public String getDireccionTrabajador() {
        return direccionTrabajador;
    }

    public void setDireccionTrabajador(String direccionTrabajador) {
        this.direccionTrabajador = direccionTrabajador;
    }

    public double getSsTrabajador() {
        return ssTrabajador;
    }

    public void setSsTrabajador(double ssTrabajador) {
        this.ssTrabajador = ssTrabajador;
    }

    
    

}
