package proyechistoclinica.accesoADatos;

import proyechistoclinica.entidades.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PacienteData {

    //atributos
    private Connection con = null;

    //constructor
    public PacienteData() {
        this.con = Conexion.getConectar();
    }

    //metodo insertar Paciente a traves de un objecto
    public void insertarPaci(Paciente paciente) {
        String sql = "Insert into pacientes (apellidoPaci,nombresPaci,domicilioPaci,dniPaci,tipoSangrePaci,sexoPaci,fechaNacPaci,telefonoPaci,estadoPaci) values (?,?,?,?,?,?,?,?,1)";
        try {
            //preparo la consulta
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, paciente.getApellidoPaci());
            ps.setString(2, paciente.getNombresPaci());
            ps.setString(3, paciente.getDomicilioPaci());
            ps.setString(4, paciente.getDniPaci());
            ps.setString(5, paciente.getTipoSangrePaci());
            ps.setString(6, paciente.getSexoPaci());
            ps.setDate(7, Date.valueOf(paciente.getFechaNacPaci()));
            ps.setString(8, paciente.getTelefonoPaci());
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Registro cargado con éxito...");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de altas..." + ex.getMessage());
            //Logger.getLogger(PacienteData.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //metodo dar de baja a traves del id
    public void bajasPaci(int vId) {
        String sql = "Update pacientes set estadoPaci=0 where idPaci=?";
        try {
            //preparo la consulta
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, vId);
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Registro dado de baja con éxito...");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de bajas..." + ex.getMessage());
            //Logger.getLogger(PacienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //metodo editar paciente a traves del objecto
    public void editarPaciente(Paciente paciente) {
        String sql = "Update pacientes set apellidoPaci=?,nombresPaci=?,domicilioPaci=?,dniPaci=?,tipoSangrePaci=?,sexoPaci=?,fechaNacPaci=?,telefonoPaci=?,estadoPaci=1 where idPaci=? ";
        try {
            //preparo la consulta
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, paciente.getApellidoPaci());
            ps.setString(2, paciente.getNombresPaci());
            ps.setString(3, paciente.getDomicilioPaci());
            ps.setString(4, paciente.getDniPaci());
            ps.setString(5, paciente.getTipoSangrePaci());
            ps.setString(6, paciente.getSexoPaci());
            ps.setDate(7, Date.valueOf(paciente.getFechaNacPaci()));
            ps.setString(8, paciente.getTelefonoPaci());
            ps.setInt(9, paciente.getIdPaci());
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Registro editado con éxito...");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de edición..." + ex.getMessage());
            Logger.getLogger(PacienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //metodo buscar paciente por DNI
    public Paciente buscarPorDni(String vDni) {
        Paciente paciente = null;
        String sql = "Select * from pacientes where estadoPaci=1 and dniPaci=? and estadoPaci=1";
        try {
            //preparo la consulta
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, vDni);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                paciente = new Paciente();
                paciente.setIdPaci(rs.getInt("idPaci"));
                paciente.setApellidoPaci(rs.getString("apellidoPaci"));
                paciente.setNombresPaci(rs.getString("nombresPaci"));
                paciente.setDomicilioPaci(rs.getString("domicilioPaci"));
                paciente.setDniPaci(rs.getString("dniPaci"));
                paciente.setTipoSangrePaci(rs.getString("tipoSangrePaci"));
                paciente.setSexoPaci(rs.getString("sexoPaci"));
                paciente.setFechaNacPaci(rs.getDate("fechaNacPaci").toLocalDate());
                paciente.setTelefonoPaci(rs.getString("telefonoPaci"));
                paciente.setEstadoPaci(true);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de busqueda por DNI..." + ex.getMessage());
            //Logger.getLogger(PacienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return paciente;
    }

    //metodo buscar por Id
    public Paciente buscarPorId(int vId) {
        Paciente paciente = null;
        String sql = "Select * from pacientes where idPaci=? and estadoPaci=1";
        try {
            //Preparo la consulta
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, vId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                paciente = new Paciente();
                paciente.setIdPaci(rs.getInt("idPaci"));
                paciente.setApellidoPaci(rs.getString("apellidoPaci"));
                paciente.setNombresPaci(rs.getString("nombresPaci"));
                paciente.setDomicilioPaci(rs.getString("domicilioPaci"));
                paciente.setDniPaci(rs.getString("dniPaci"));
                paciente.setTipoSangrePaci(rs.getString("tipoSangrePaci"));
                paciente.setSexoPaci(rs.getString("sexoPaci"));
                paciente.setFechaNacPaci(rs.getDate("fechaNacPaci").toLocalDate());
                paciente.setTelefonoPaci(rs.getString("telefonoPaci"));
                paciente.setEstadoPaci(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PacienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return paciente;
    }

    //metodo listar pacientes activos
    public List<Paciente> listarPacientes() {
        Paciente paciente = null;
        ArrayList<Paciente> listar = new ArrayList();
        String sql = "Select * from pacientes where estadoPaci=1";
        try {
            //Preparo la consulta
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                paciente = new Paciente();
                paciente.setIdPaci(rs.getInt("IdPaci"));
                paciente.setApellidoPaci(rs.getString("apellidoPaci"));
                paciente.setNombresPaci(rs.getString("nombresPaci"));
                paciente.setDomicilioPaci(rs.getString("domicilioPaci"));
                paciente.setDniPaci(rs.getString("dniPaci"));
                paciente.setTipoSangrePaci(rs.getString("tipoSangrePaci"));
                paciente.setSexoPaci(rs.getString("sexoPaci"));
                paciente.setFechaNacPaci(rs.getDate("fechaNacPaci").toLocalDate());
                paciente.setTelefonoPaci(rs.getString("telefonoPaci"));
                paciente.setEstadoPaci(true);
                listar.add(paciente);
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PacienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listar;
    }
    
    //listar pacientes dados de baja
    public List<Paciente> listarBajas(){
         Paciente paciente = null;
        ArrayList<Paciente> listar = new ArrayList();
        String sql = "Select * from pacientes where estadoPaci=0";
        try {
            //Preparo la consulta
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                paciente = new Paciente();
                paciente.setIdPaci(rs.getInt("IdPaci"));
                paciente.setApellidoPaci(rs.getString("apellidoPaci"));
                paciente.setNombresPaci(rs.getString("nombresPaci"));
                paciente.setDomicilioPaci(rs.getString("domicilioPaci"));
                paciente.setDniPaci(rs.getString("dniPaci"));
                paciente.setTipoSangrePaci(rs.getString("tipoSangrePaci"));
                paciente.setSexoPaci(rs.getString("sexoPaci"));
                paciente.setFechaNacPaci(rs.getDate("fechaNacPaci").toLocalDate());
                paciente.setTelefonoPaci(rs.getString("telefonoPaci"));
                paciente.setEstadoPaci(true);
                listar.add(paciente);
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PacienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listar;
    }
    
    

}
