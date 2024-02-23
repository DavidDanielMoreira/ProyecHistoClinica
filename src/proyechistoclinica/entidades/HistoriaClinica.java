
package proyechistoclinica.entidades;

import java.time.LocalDate;


public class HistoriaClinica {
    //atributos
    private int idHist;
    private LocalDate fechaHist;
    private String nombreHist;      //DNI del paciente
    private Paciente paciente;
    private Medico medico;
    private String tratamientoHist;
    private LocalDate fechaHistUlt;     //Cada vez que se actualiza una historia clinica se guarda la fecha.
    private boolean estadoHist;
    //constructor
    public HistoriaClinica(){}

    public HistoriaClinica(int idHist, LocalDate fechaHist, String nombreHist, Paciente paciente, Medico medico, String tratamientoHist,LocalDate fechaHistUlt, boolean estadoHist) {
        this.idHist = idHist;
        this.fechaHist = fechaHist;
        this.nombreHist = nombreHist;
        this.paciente = paciente;
        this.medico = medico;
        this.tratamientoHist = tratamientoHist;
        this.fechaHistUlt = fechaHistUlt;
        this.estadoHist = estadoHist;
    }

    public HistoriaClinica(LocalDate fechaHist, String nombreHist, Paciente paciente, Medico medico, String tratamientoHist,LocalDate fechaHistUlt,boolean estadoHist) {
        this.fechaHist = fechaHist;
        this.nombreHist = nombreHist;
        this.paciente = paciente;
        this.medico = medico;
        this.tratamientoHist = tratamientoHist;
        this.fechaHistUlt = fechaHistUlt;
        this.estadoHist = estadoHist;
    }
    //metodos getter y setter

    public int getIdHist() {
        return idHist;
    }

    public void setIdHist(int idHist) {
        this.idHist = idHist;
    }

    public LocalDate getFechaHist() {
        return fechaHist;
    }

    public void setFechaHist(LocalDate fechaHist) {
        this.fechaHist = fechaHist;
    }

    public String getNombreHist() {
        return nombreHist;
    }

    public void setNombreHist(String nombreHist) {
        this.nombreHist = nombreHist;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getTratamientoHist() {
        return tratamientoHist;
    }

    public void setTratamientoHist(String tratamientoHist) {
        this.tratamientoHist = tratamientoHist;
    }

    public LocalDate getFechaHistUlt() {
        return fechaHistUlt;
    }

    public void setFechaHistUlt(LocalDate fechaHistUlt) {
        this.fechaHistUlt = fechaHistUlt;
    }
    

    public boolean isEstadoHist() {
        return estadoHist;
    }

    public void setEstadoHist(boolean estadoHist) {
        this.estadoHist = estadoHist;
    }

    @Override
    public String toString() {
        return idHist + "-" + fechaHist + "-" + nombreHist + "-" + paciente + "-" + medico + "-" + tratamientoHist + "-"+ fechaHistUlt+ "-" + estadoHist;
    }
    
    
}
