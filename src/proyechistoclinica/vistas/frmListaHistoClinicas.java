package proyechistoclinica.vistas;

import java.awt.Color;
import java.awt.Font;
import proyechistoclinica.entidades.*;
import proyechistoclinica.accesoADatos.*;
import java.sql.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmListaHistoClinicas extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();

    private HistoriaClinicaData histoData = new HistoriaClinicaData();
    private PacienteData paciData = new PacienteData();
    private MedicoData mediData = new MedicoData();
    private Paciente paciSelec;
    private Medico mediSelec;
    private ArrayList<HistoriaClinica> listarHisto;
    private DateTimeFormatter forma = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //formato para que se muestre la fecha ej: 12/01/2024

    public frmListaHistoClinicas() {
        initComponents();
        crearCabecera();
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        jPanelDatos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtHistoClinicas = new javax.swing.JTable();
        btnCerrar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Historias Clinicas");

        jPanelFondo.setBackground(new java.awt.Color(0, 51, 51));
        jPanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelDatos.setBackground(new java.awt.Color(0, 51, 51));
        jPanelDatos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanelDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingrese el nombre:");
        jPanelDatos.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        txtNom.setBackground(new java.awt.Color(99, 99, 99));
        txtNom.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        txtNom.setForeground(new java.awt.Color(255, 255, 255));
        txtNom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtNomMouseReleased(evt);
            }
        });
        txtNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomKeyTyped(evt);
            }
        });
        jPanelDatos.add(txtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 310, 25));

        jtHistoClinicas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Fecha", "Nombre", "Apellido", "Nombres", "DNI", "Ultima Visita"
            }
        ));
        jScrollPane1.setViewportView(jtHistoClinicas);
        if (jtHistoClinicas.getColumnModel().getColumnCount() > 0) {
            jtHistoClinicas.getColumnModel().getColumn(0).setMinWidth(30);
            jtHistoClinicas.getColumnModel().getColumn(0).setPreferredWidth(30);
            jtHistoClinicas.getColumnModel().getColumn(0).setMaxWidth(30);
            jtHistoClinicas.getColumnModel().getColumn(1).setMinWidth(60);
            jtHistoClinicas.getColumnModel().getColumn(1).setPreferredWidth(60);
            jtHistoClinicas.getColumnModel().getColumn(1).setMaxWidth(60);
            jtHistoClinicas.getColumnModel().getColumn(2).setMinWidth(80);
            jtHistoClinicas.getColumnModel().getColumn(2).setPreferredWidth(80);
            jtHistoClinicas.getColumnModel().getColumn(2).setMaxWidth(80);
            jtHistoClinicas.getColumnModel().getColumn(3).setMinWidth(100);
            jtHistoClinicas.getColumnModel().getColumn(3).setPreferredWidth(100);
            jtHistoClinicas.getColumnModel().getColumn(3).setMaxWidth(100);
            jtHistoClinicas.getColumnModel().getColumn(4).setMinWidth(150);
            jtHistoClinicas.getColumnModel().getColumn(4).setPreferredWidth(150);
            jtHistoClinicas.getColumnModel().getColumn(4).setMaxWidth(150);
            jtHistoClinicas.getColumnModel().getColumn(5).setMinWidth(80);
            jtHistoClinicas.getColumnModel().getColumn(5).setPreferredWidth(80);
            jtHistoClinicas.getColumnModel().getColumn(5).setMaxWidth(80);
            jtHistoClinicas.getColumnModel().getColumn(6).setMinWidth(60);
            jtHistoClinicas.getColumnModel().getColumn(6).setPreferredWidth(60);
            jtHistoClinicas.getColumnModel().getColumn(6).setMaxWidth(60);
        }

        jPanelDatos.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 620, 160));

        btnCerrar.setBackground(new java.awt.Color(16, 41, 153));
        btnCerrar.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyechistoclinica/imagen/cerraMarron.png"))); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanelDatos.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 310, 40));

        jPanelFondo.add(jPanelDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 670, 310));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void txtNomMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNomMouseReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_txtNomMouseReleased

    private void txtNomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            //JOptionPane.showMessageDialog(null, "Ingreso un valor no valido, solo numeros se permiten...");
            evt.consume();
        }

        if (txtNom.getText().length() >= 8) {
            JOptionPane.showMessageDialog(null, "Maximo 8 caracteres se pueden ingresar");
            evt.consume();
        }
    }//GEN-LAST:event_txtNomKeyTyped

    private void txtNomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomKeyReleased
        // TODO add your handling code here:
        limpiarTabla();
        buscHistoClinicaPorNomnbre();
    }//GEN-LAST:event_txtNomKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelDatos;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtHistoClinicas;
    private javax.swing.JTextField txtNom;
    // End of variables declaration//GEN-END:variables
    //metodo crear cabecera
    private void crearCabecera() {
        modelo.addColumn("Id");
        modelo.addColumn("Fecha");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombres");
        modelo.addColumn("DNI");
        modelo.addColumn("Ultima Visita");
        jtHistoClinicas.setModel(modelo);

        //establecer ancho de las columnas de la tabla
        jtHistoClinicas.getColumnModel().getColumn(0).setPreferredWidth(20);
        jtHistoClinicas.getColumnModel().getColumn(1).setPreferredWidth(80);
        jtHistoClinicas.getColumnModel().getColumn(2).setPreferredWidth(70);
        jtHistoClinicas.getColumnModel().getColumn(3).setPreferredWidth(100);
        jtHistoClinicas.getColumnModel().getColumn(4).setPreferredWidth(80);
        jtHistoClinicas.getColumnModel().getColumn(5).setPreferredWidth(80);
        
        //establecer alto de columnas
        jtHistoClinicas.getTableHeader().setPreferredSize(new java.awt.Dimension(0,25));
        
        jtHistoClinicas.getTableHeader().setFont(new Font("Arial Narrow",1,16)); //cambiar tipo fuente
        jtHistoClinicas.getTableHeader().setBackground(Color.green); //color de fondo de la cabecera
        jtHistoClinicas.getTableHeader().setForeground(Color.BLUE); //color de la letra cabecera
    }

    //metodo cargar tabla
    private void cargarTabla() {
        listarHisto = (ArrayList) histoData.listarHistoClinicas();
        if (listarHisto != null) {
            for (HistoriaClinica listar : listarHisto) {
                modelo.addRow(new Object[]{listar.getIdHist(), listar.getFechaHist().format(forma), listar.getNombreHist(), listar.getPaciente().getApellidoPaci(), listar.getPaciente().getNombresPaci(), listar.getPaciente().getDniPaci(),listar.getFechaHistUlt().format(forma)});
            }
        }
    }

    //metodo buscar HistoriaClinica
    private void buscHistoClinicaPorNomnbre() {
        for (HistoriaClinica listar : listarHisto) {
            if (listar.getNombreHist().startsWith(txtNom.getText())) {
                modelo.addRow(new Object[]{listar.getIdHist(), listar.getFechaHist(), listar.getNombreHist(), listar.getPaciente().getApellidoPaci(), listar.getPaciente().getNombresPaci(), listar.getPaciente().getDniPaci(),listar.getFechaHistUlt().format(forma)});
            }
        }
    }

    //metodo limpiar tabla
    private void limpiarTabla() {
        int cFilas = jtHistoClinicas.getRowCount() - 1;
        for (int f = cFilas; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }
}
