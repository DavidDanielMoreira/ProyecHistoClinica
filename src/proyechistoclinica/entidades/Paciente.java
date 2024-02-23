
package proyechistoclinica.entidades;

import java.time.LocalDate;


public class Paciente {
    //atributos
    private int idPaci;
    private String apellidoPaci;
    private String nombresPaci;
    private String dniPaci;
    private String tipoSangrePaci;
    private String sexoPaci;
    private String domicilioPaci;
    private LocalDate fechaNacPaci;
    private String telefonoPaci;
    private Boolean estadoPaci;
    //constructor
    public Paciente(){}

    public Paciente(int idPaci, String apellidoPaci, String nombresPaci,String domicilioPaci,String dniPaci,String tipoSangrePaci, String sexoPaci, LocalDate fechaNacPaci, String telefonoPaci, Boolean estadoPaci) {
        this.idPaci = idPaci;
        this.apellidoPaci = apellidoPaci;
        this.nombresPaci = nombresPaci;
         this.domicilioPaci = domicilioPaci;
        this.dniPaci = dniPaci;
        this.tipoSangrePaci = tipoSangrePaci;
        this.sexoPaci = sexoPaci;
        this.fechaNacPaci = fechaNacPaci;
        this.telefonoPaci = telefonoPaci;
        this.estadoPaci = estadoPaci;
    }

    public Paciente(String apellidoPaci, String nombresPaci,String domicilioPaci,String dniPaci,String tipoSangrePaci, String sexoPaci, LocalDate fechaNacPaci, String telefonoPaci, Boolean estadoPaci) {
        this.apellidoPaci = apellidoPaci;
        this.nombresPaci = nombresPaci;
        this.domicilioPaci = domicilioPaci;
        this.dniPaci = dniPaci;
        this.tipoSangrePaci = tipoSangrePaci;
        this.sexoPaci = sexoPaci;
        this.fechaNacPaci = fechaNacPaci;
        this.telefonoPaci = telefonoPaci;
        this.estadoPaci = estadoPaci;
    }

    public int getIdPaci() {
        return idPaci;
    }

    public void setIdPaci(int idPaci) {
        this.idPaci = idPaci;
    }

    public String getApellidoPaci() {
        return apellidoPaci;
    }

    public void setApellidoPaci(String apellidoPaci) {
        this.apellidoPaci = apellidoPaci;
    }

    public String getNombresPaci() {
        return nombresPaci;
    }

    public void setNombresPaci(String nombresPaci) {
        this.nombresPaci = nombresPaci;
    }

    public String getDniPaci() {
        return dniPaci;
    }

    public void setDniPaci(String dniPaci) {
        this.dniPaci = dniPaci;
    }

    public String getTipoSangrePaci() {
        return tipoSangrePaci;
    }

    public void setTipoSangrePaci(String tipoSangrePaci) {
        this.tipoSangrePaci = tipoSangrePaci;
    }

    public String getSexoPaci() {
        return sexoPaci;
    }

    public void setSexoPaci(String sexoPaci) {
        this.sexoPaci = sexoPaci;
    }

    public String getDomicilioPaci() {
        return domicilioPaci;
    }

    public void setDomicilioPaci(String domicilioPaci) {
        this.domicilioPaci = domicilioPaci;
    }

    public LocalDate getFechaNacPaci() {
        return fechaNacPaci;
    }

    public void setFechaNacPaci(LocalDate fechaNacPaci) {
        this.fechaNacPaci = fechaNacPaci;
    }

    public String getTelefonoPaci() {
        return telefonoPaci;
    }

    public void setTelefonoPaci(String telefonoPaci) {
        this.telefonoPaci = telefonoPaci;
    }

    public Boolean getEstadoPaci() {
        return estadoPaci;
    }

    public void setEstadoPaci(Boolean estadoPaci) {
        this.estadoPaci = estadoPaci;
    }

    @Override
    public String toString() {
        return idPaci + "-" + apellidoPaci + "-" + nombresPaci + "-" + dniPaci + "-" + tipoSangrePaci + "-" + sexoPaci + "-" + domicilioPaci + "-" + fechaNacPaci + "-" + telefonoPaci + "-" + estadoPaci;
    }
    
    
}
