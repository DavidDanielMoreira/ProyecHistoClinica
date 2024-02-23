package proyechistoclinica.accesoADatos;

import proyechistoclinica.entidades.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MedicoData {

    //atributos
    private Connection con = null;
    private EspecialidadData espeData = new EspecialidadData();
    private Especialidad espeSelec;

    //constructor
    public MedicoData() {
        this.con = Conexion.getConectar();
    }

    //metodo insertar medico a traves de un objecto
    public void insertarMedico(Medico medico) {
        String sql = "Insert into medicos (apellidoMedi,nombresMedi,domicilioMedi,dniMedi,sexoMedi,fechaNacMedi,telefonoMedi,idEspe,estadoMedi) values (?,?,?,?,?,?,?,?,1)";
        try {
            //preparo la consulta
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, medico.getApellidoMedi());
            ps.setString(2, medico.getNombresMedi());
            ps.setString(3, medico.getDomicilioMedi());
            ps.setString(4, medico.getDniMedi());
            ps.setString(5, medico.getSexoMedi());
            ps.setDate(6, Date.valueOf(medico.getFechaNacMedi()));
            ps.setString(7, medico.getTelefonoMedi());
            ps.setInt(8, medico.getEspecialidad().getIdEspe());
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Registro cargado coin éxito...");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ejecutar el alta...");
            //Logger.getLogger(MedicoData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //metodo bajas medicos a traves del id
    //metodo editar medico a trves de un objecto
    public void editarMedico(Medico medico) {
        String sql = "Update medicos set  apellidoMedi=?,nombresMedi=?, domicilioMedi=?,dniMedi=?, sexoMedi=?,fechaNacMedi=?,telefonoMedi=?,idEspe=?,estadoMedi=1 where idMedi=?";
        try {
            //preparo la consulta
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, medico.getApellidoMedi());
            ps.setString(2, medico.getNombresMedi());
            ps.setString(3, medico.getDomicilioMedi());
            ps.setString(4, medico.getDniMedi());
            ps.setString(5, medico.getSexoMedi());
            ps.setDate(6, Date.valueOf(medico.getFechaNacMedi()));
            ps.setString(7, medico.getTelefonoMedi());
            ps.setInt(8, medico.getEspecialidad().getIdEspe());
            ps.setInt(9, medico.getIdMedi());
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Registro editado con exito...");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ejecutar la edición...");
            Logger.getLogger(MedicoData.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //metodo buscar por id
    public Medico buscarPorId(int vId) {
        Medico medico = null;
        String sql = "Select * from medicos where idMedi=?";
        try {
            //preparo la consulta
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, vId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                medico = new Medico();
                medico.setIdMedi(rs.getInt("idMedi"));
                medico.setApellidoMedi(rs.getString("apellidoMedi"));
                medico.setNombresMedi(rs.getString("nombresMedi"));
                medico.setDomicilioMedi(rs.getString("domicilioMedi"));
                medico.setDniMedi(rs.getString("dniMedi"));
                medico.setSexoMedi(rs.getString("sexoMedi"));
                medico.setFechaNacMedi(rs.getDate("fechaNacMedi").toLocalDate());
                medico.setTelefonoMedi(rs.getString("telefonoMedi"));
                espeSelec = espeData.buscarPorId(rs.getInt("idEspe"));
                medico.setEspecialidad(espeSelec);
                medico.setEstadoMedi(true);
                ps.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(MedicoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return medico;
    }

    //metodo buscar por DNI
    public Medico buscarPorDni(String vDni) {
        Medico medico = null;
        String sql = "Select * from medicos where dniMedi = ?";
        try {
            //Preparo la consulta
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, vDni);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                medico = new Medico();
                medico.setIdMedi(rs.getInt("idMedi"));
                medico.setApellidoMedi(rs.getString("apellidoMedi"));
                medico.setNombresMedi(rs.getString("nombresMedi"));
                medico.setDomicilioMedi(rs.getString("domicilioMedi"));
                medico.setDniMedi(rs.getString("dniMedi"));
                medico.setSexoMedi(rs.getString("sexoMedi"));
                medico.setFechaNacMedi(rs.getDate("fechaNacMedi").toLocalDate());
                medico.setTelefonoMedi(rs.getString("telefonoMedi"));
                espeSelec = espeData.buscarPorId(rs.getInt("idEspe"));
                medico.setEspecialidad(espeSelec);
                medico.setEstadoMedi(true);
                ps.close();

            }
        } catch (SQLException ex) {
            Logger.getLogger(MedicoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return medico;
    }
    
    //metodo listar medicos
    public List<Medico> listarMedi(){
        Medico medico = null;
        ArrayList<Medico> listar = new ArrayList();
        String sql = "Select * from medicos where estadoMedi=1";
        try {
            //Preparo la consulta
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                medico = new Medico();
                medico.setIdMedi(rs.getInt("idMedi"));
                 medico.setApellidoMedi(rs.getString("apellidoMedi"));
                medico.setNombresMedi(rs.getString("nombresMedi"));
                medico.setDomicilioMedi(rs.getString("domicilioMedi"));
                medico.setDniMedi(rs.getString("dniMedi"));
                medico.setSexoMedi(rs.getString("sexoMedi"));
                medico.setFechaNacMedi(rs.getDate("fechaNacMedi").toLocalDate());
                medico.setTelefonoMedi(rs.getString("telefonoMedi"));
                espeSelec = espeData.buscarPorId(rs.getInt("idEspe"));
                medico.setEspecialidad(espeSelec);
                medico.setEstadoMedi(true);
                listar.add(medico);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MedicoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listar;
    }
}
