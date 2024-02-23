package proyechistoclinica.accesoADatos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {

    //atributos
    private static String url = "jdbc:mariadb://localhost/bdhclinica";
    private static String user = "root";
    private static String pass = "";
    private static Connection conexion = null;

    //constructor privado para que no se instancie ningún objectodel tipo Conexion
    private Conexion() {
    }

    //metodo estatico para estatablecer la conexión a la base de datos
    public static Connection getConectar() {
        if (conexion == null) {
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                conexion = DriverManager.getConnection(url, user, pass);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar los driver..." + ex.getMessage());
                //Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar la base de datos..." + ex.getMessage());
                //Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return conexion;
    }
}
