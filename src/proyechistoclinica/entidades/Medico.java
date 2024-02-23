
package proyechistoclinica.entidades;

import java.time.LocalDate;


public class Medico {
    //atributos
    private int idMedi;
    private String apellidoMedi;
    private String nombresMedi;
    private String domicilioMedi;
    private String dniMedi;
    private String sexoMedi;
    private LocalDate fechaNacMedi;
    private String telefonoMedi;
    private Especialidad especialidad;
    private boolean estadoMedi;
    //constructor
    public Medico(){}

    public Medico(int idMedi, String apellidoMedi, String nombresMedi, String domicilioMedi, String dniMedi, String sexoMedi, LocalDate fechaNacMedi, String telefonoMedi, Especialidad especialidad, boolean estadoMedi) {
        this.idMedi = idMedi;
        this.apellidoMedi = apellidoMedi;
        this.nombresMedi = nombresMedi;
        this.domicilioMedi = domicilioMedi;
        this.dniMedi = dniMedi;
        this.sexoMedi = sexoMedi;
        this.fechaNacMedi = fechaNacMedi;
        this.telefonoMedi = telefonoMedi;
        this.especialidad = especialidad;
        this.estadoMedi = estadoMedi;
    }

    public Medico(String apellidoMedi, String nombresMedi, String domicilioMedi, String dniMedi, String sexoMedi, LocalDate fechaNacMedi, String telefonoMedi, Especialidad especialidad, boolean estadoMedi) {
        this.apellidoMedi = apellidoMedi;
        this.nombresMedi = nombresMedi;
        this.domicilioMedi = domicilioMedi;
        this.dniMedi = dniMedi;
        this.sexoMedi = sexoMedi;
        this.fechaNacMedi = fechaNacMedi;
        this.telefonoMedi = telefonoMedi;
        this.especialidad = especialidad;
        this.estadoMedi = estadoMedi;
    }
    //metodos getter y setter

    public int getIdMedi() {
        return idMedi;
    }

    public void setIdMedi(int idMedi) {
        this.idMedi = idMedi;
    }

    public String getApellidoMedi() {
        return apellidoMedi;
    }

    public void setApellidoMedi(String apellidoMedi) {
        this.apellidoMedi = apellidoMedi;
    }

    public String getNombresMedi() {
        return nombresMedi;
    }

    public void setNombresMedi(String nombresMedi) {
        this.nombresMedi = nombresMedi;
    }

    public String getDomicilioMedi() {
        return domicilioMedi;
    }

    public void setDomicilioMedi(String domicilioMedi) {
        this.domicilioMedi = domicilioMedi;
    }

    public String getDniMedi() {
        return dniMedi;
    }

    public void setDniMedi(String dniMedi) {
        this.dniMedi = dniMedi;
    }

    public String getSexoMedi() {
        return sexoMedi;
    }

    public void setSexoMedi(String sexoMedi) {
        this.sexoMedi = sexoMedi;
    }

    public LocalDate getFechaNacMedi() {
        return fechaNacMedi;
    }

    public void setFechaNacMedi(LocalDate fechaNacMedi) {
        this.fechaNacMedi = fechaNacMedi;
    }

    public String getTelefonoMedi() {
        return telefonoMedi;
    }

    public void setTelefonoMedi(String telefonoMedi) {
        this.telefonoMedi = telefonoMedi;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public boolean isEstadoMedi() {
        return estadoMedi;
    }

    public void setEstadoMedi(boolean estadoMedi) {
        this.estadoMedi = estadoMedi;
    }

    @Override
    public String toString() {
        return idMedi + "-" + apellidoMedi + "-" + nombresMedi + "-" + domicilioMedi + "-" + dniMedi + "-" + sexoMedi + "-" + fechaNacMedi + "-" + telefonoMedi + "-" + especialidad + "-" + estadoMedi;
    }
    
}
