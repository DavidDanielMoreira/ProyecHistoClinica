package proyechistoclinica.accesoADatos;

import proyechistoclinica.entidades.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class HistoriaClinicaData {

    //atributos
    private Connection con = null;
    private PacienteData paciData = new PacienteData();
    private MedicoData mediData = new MedicoData();
    private Paciente paciSelec;
    private Medico mediSelec;

    //constructor
    public HistoriaClinicaData() {
        this.con = Conexion.getConectar();
    }

    //metodo insertar Historia Clinica a traves de un objecto
    public void insertarHistoClinica(HistoriaClinica historiaClinica) {
        String sql = "Insert into hclinicas (fechaHist,nombreHist,idPaci,idMedi,tratamientoHist,fechaHistUlt,estadoHist) values (?,?,?,?,?,?,1)";
        try {
            //Preparo la consulta
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(historiaClinica.getFechaHist()));
            ps.setString(2, historiaClinica.getNombreHist());
            ps.setInt(3, historiaClinica.getPaciente().getIdPaci());
            ps.setInt(4, historiaClinica.getMedico().getIdMedi());
            ps.setString(5, historiaClinica.getTratamientoHist());
            ps.setDate(6, Date.valueOf(historiaClinica.getFechaHistUlt()));
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Registro cargado con éxito...");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ejecturar el alta..." + ex.getMessage());
            //Logger.getLogger(HistoriaClinicaData.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //metodo buscar Historia Clinica por Nombre
    public HistoriaClinica buscarPoNombre(String vNom) {
        HistoriaClinica historiaClinica = null;
        String sql = "Select * from hclinicas where nombreHist=? and estadoHist=1";
        try {
            //Preparo la consulta
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, vNom);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                historiaClinica = new HistoriaClinica();
                historiaClinica.setIdHist(rs.getInt("idHist"));
                historiaClinica.setFechaHist(rs.getDate("fechaHist").toLocalDate());
                historiaClinica.setNombreHist(rs.getString("nombreHist"));
                paciSelec = paciData.buscarPorId(rs.getInt("idPaci"));
                historiaClinica.setPaciente(paciSelec);
                mediSelec = mediData.buscarPorId(rs.getInt("idMedi"));
                historiaClinica.setMedico(mediSelec);
                historiaClinica.setTratamientoHist(rs.getString("TratamientoHist"));
                historiaClinica.setEstadoHist(true);
                ps.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(HistoriaClinicaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return historiaClinica;
    }

    //metodo editar Historia Clinica por id
    public void editarHistoClinica(HistoriaClinica historiaClinica) {
        String sql = "Update hclinicas set tratamientoHist=?,fechaHistUlt=? where idHist=?";
        try {
            //Preparo la consulta
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, historiaClinica.getTratamientoHist());
            ps.setDate(2, Date.valueOf(historiaClinica.getFechaHistUlt()));
            ps.setInt(3, historiaClinica.getIdHist());
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Registro editado con exito...");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al ejecutar la edición..."+ex.getMessage());
            //Logger.getLogger(HistoriaClinicaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //metodo listar Historia clinica por nombre activas
    public List<HistoriaClinica> listarHistoClinicas(){
        HistoriaClinica historiaClinica = null;
        ArrayList<HistoriaClinica> listar = new ArrayList();
        String sql = "Select h.idHist,h.fechaHist,h.nombreHist,h.idPaci,h.idMedi,h.tratamientoHist,h.fechaHistUlt,p.apellidoPaci,p.nombresPaci,p.dniPaci from hclinicas h inner join pacientes p on h.idPaci=p.idPaci where h.estadoHist=1";
        try {
            //preparo la consulta
            PreparedStatement ps = con.prepareStatement(sql);
            //ps.setString(1, vNom);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                historiaClinica = new HistoriaClinica();
                historiaClinica.setIdHist(rs.getInt("idHist"));
                historiaClinica.setFechaHist(rs.getDate("fechaHist").toLocalDate());
                historiaClinica.setNombreHist(rs.getString("nombreHist"));
                paciSelec = paciData.buscarPorId(rs.getInt("idPaci"));
                historiaClinica.setPaciente(paciSelec);
                mediSelec = mediData.buscarPorId(rs.getInt("IdMedi"));
                historiaClinica.setMedico(mediSelec);
                historiaClinica.setTratamientoHist(rs.getString("tratamientoHist"));
                historiaClinica.setFechaHistUlt(rs.getDate("fechaHistUlt").toLocalDate());
                historiaClinica.setEstadoHist(true);
                listar.add(historiaClinica);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al listar:..."+ ex.getMessage());
            //Logger.getLogger(HistoriaClinicaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listar;
    }
    
    //listar historias clinicas finalizadas
    public List<HistoriaClinica> listarHistoClinicasFinal(){
        HistoriaClinica historiaClinica = null;
        ArrayList<HistoriaClinica> listar = new ArrayList();
        String sql = "Select h.idHist,h.fechaHist,h.nombreHist,h.idPaci,h.idMedi,h.tratamientoHist,h.fechaHistUlt,p.apellidoPaci,p.nombresPaci,p.dniPaci from hclinicas h inner join pacientes p on h.idPaci=p.idPaci where h.estadoHist=0";
         try {
            //preparo la consulta
            PreparedStatement ps = con.prepareStatement(sql);
            //ps.setString(1, vNom);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                historiaClinica = new HistoriaClinica();
                historiaClinica.setIdHist(rs.getInt("idHist"));
                historiaClinica.setFechaHist(rs.getDate("fechaHist").toLocalDate());
                historiaClinica.setNombreHist(rs.getString("nombreHist"));
                paciSelec = paciData.buscarPorId(rs.getInt("idPaci"));
                historiaClinica.setPaciente(paciSelec);
                mediSelec = mediData.buscarPorId(rs.getInt("IdMedi"));
                historiaClinica.setMedico(mediSelec);
                historiaClinica.setTratamientoHist(rs.getString("tratamientoHist"));
                historiaClinica.setFechaHistUlt(rs.getDate("fechaHistUlt").toLocalDate());
                historiaClinica.setEstadoHist(true);
                listar.add(historiaClinica);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al listar:..."+ ex.getMessage());
            //Logger.getLogger(HistoriaClinicaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listar;
        
    }
    
    

}
