
package proyechistoclinica.prueba;
import proyechistoclinica.accesoADatos.*;
import java.sql.*;
public class Prueba {
    
    private static Connection con = null;
    private MedicoData mediData = new MedicoData();
    private PacienteData paciData = new PacienteData();
    public static void main (String[] args){
        //con = Conexion.getConectar();
       Prueba prueba = new Prueba();
       prueba.getPrueba();
    }
    
    public void getPrueba(){
        //System.out.println(mediData.listarMedi());
        System.out.println(paciData.listarPacientes());
    }
}
