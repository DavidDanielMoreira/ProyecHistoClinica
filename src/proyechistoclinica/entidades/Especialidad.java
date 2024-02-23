
package proyechistoclinica.entidades;


public class Especialidad {
    //atributos
    private int idEspe;
    private String nombreEspe;
    //constructor
    public Especialidad(){}

    public Especialidad(int idEspe, String nombreEspe) {
        this.idEspe = idEspe;
        this.nombreEspe = nombreEspe;
    }

    public Especialidad(String nombreEspe) {
        this.nombreEspe = nombreEspe;
    }
    //metodos getter and setter

    public int getIdEspe() {
        return idEspe;
    }

    public void setIdEspe(int idEspe) {
        this.idEspe = idEspe;
    }

    public String getNombreEspe() {
        return nombreEspe;
    }

    public void setNombreEspe(String nombreEspe) {
        this.nombreEspe = nombreEspe;
    }

    @Override
    public String toString() {
        return idEspe + "-" + nombreEspe;
    }
    
}
