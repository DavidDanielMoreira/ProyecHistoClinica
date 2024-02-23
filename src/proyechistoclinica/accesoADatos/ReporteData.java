package proyechistoclinica.accesoADatos;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class ReporteData {

    private Connection con;

    public ReporteData() {
        this.con = Conexion.getConectar();
    }

    //metodo listar Reporte Pacientes
    public void ListarReporte() {
        try {
            //reporte de todos los pacientes ingresados al sistema
            JasperReport reporte = JasperCompileManager.compileReport("reportePacientes.jrxml");
            JasperPrint print = JasperFillManager.fillReport(reporte, null, con);
            JasperViewer.viewReport(print);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //metodo listar reportes de Historias Clinicas
    public void listarHistoClinica(String vNomH) {
        JasperReport reporte = null;
        //String path = "src\\proyechistoclinica\\reporte\\HistoClinica.jasper";
        try {
            //reporte = (JasperReport) JRLoader.loadObjectFromLocation(path);
            reporte = JasperCompileManager.compileReport("src\\proyechistoclinica\\reporte\\HistoClinica.jrxml");
           Map parametro = new HashMap();
           parametro.put("vNomHisto", vNomH);
            JasperPrint jprint = JasperFillManager.fillReport(reporte,parametro, con);
            JasperViewer view = new JasperViewer(jprint, false);
            //cerrar el reporte al presionar el boton x

            //hace visible el reporte
            view.setVisible(true);

        } catch (JRException ex) {
            Logger.getLogger(ReporteData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
