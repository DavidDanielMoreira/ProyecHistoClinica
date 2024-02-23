
package proyechistoclinica.accesoADatos;

import proyechistoclinica.entidades.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
public class EspecialidadData {
    //atributos
    private Connection con = null;
    //constructor
    public EspecialidadData(){
        this.con = Conexion.getConectar();
    }
    
    //metodo insertar Especialidad a traves de un objecto
    public void insertarEspec (Especialidad especialidad){
        String sql = "Insert into especialidades (nombreEspe) values (?)";
        try {
            //preparo la consulta
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, especialidad.getNombreEspe());
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Registro dado de alta con éxito...");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ejecutar el alta..."+ex.getMessage());
            //Logger.getLogger(EspecialidadData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    //listado de especialidades
    public List<Especialidad> listarEspe(){
        Especialidad especialidad = null;
        ArrayList<Especialidad> listar = new ArrayList();
        String sql = "Select * from especialidades";
        try {
            //preparo la consulta
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                especialidad = new Especialidad();
                especialidad.setIdEspe(rs.getInt("IdEspe"));
                especialidad.setNombreEspe(rs.getString("nombreEspe"));
                listar.add(especialidad);
            }
            ps.close();
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al listar especialidades..."+ex.getMessage());
            //Logger.getLogger(EspecialidadData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listar;
    }
    
    //metodo buscar especialidades por id
    public Especialidad buscarPorId(int vId){
        Especialidad especialidad = null;
        String sql = "Select * from especialidades where idEspe=?";
        try {
            //preparo la consulta
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, vId);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                especialidad = new Especialidad();
                especialidad.setIdEspe(rs.getInt("idEspe"));
                especialidad.setNombreEspe(rs.getString("nombreEspe"));
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(EspecialidadData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return especialidad;
    }
    
}
