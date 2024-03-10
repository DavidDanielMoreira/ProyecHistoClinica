package proyechistoclinica.vistas;

import java.awt.Color;
import java.awt.Font;
import proyechistoclinica.entidades.*;
import proyechistoclinica.accesoADatos.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmListaBajasPacientes extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();
    private PacienteData paciData = new PacienteData();
    private ArrayList<Paciente> listarPaci;

    public frmListaBajasPacientes() {
        initComponents();
        this.setSize(700, 450);
        this.setResizable(false);
        this.setTitle("Listado bajas pacientes");
        this.repaint();
        crearCabecera();
        cargarTabla();
        txtDni.setEnabled(false);
        txtApe.setEnabled(false);
        jrDni.setSelected(false);
        jrApe.setSelected(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        jPanelDatos = new javax.swing.JPanel();
        jrApe = new javax.swing.JRadioButton();
        jrDni = new javax.swing.JRadioButton();
        txtApe = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPacientes = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(700, 450));

        jPanelFondo.setBackground(new java.awt.Color(0, 51, 51));
        jPanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelDatos.setBackground(new java.awt.Color(0, 51, 51));
        jPanelDatos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanelDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jrApe.setBackground(new java.awt.Color(0, 51, 51));
        jrApe.setForeground(new java.awt.Color(255, 255, 255));
        jrApe.setText("Buscar por Apellido:");
        jrApe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrApeActionPerformed(evt);
            }
        });
        jPanelDatos.add(jrApe, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 15, -1, -1));

        jrDni.setBackground(new java.awt.Color(0, 51, 51));
        jrDni.setForeground(new java.awt.Color(255, 255, 255));
        jrDni.setText("Buscar por DNI:");
        jrDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrDniActionPerformed(evt);
            }
        });
        jPanelDatos.add(jrDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 15, -1, -1));

        txtApe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApeKeyReleased(evt);
            }
        });
        jPanelDatos.add(txtApe, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 45, 200, 25));

        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDniKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });
        jPanelDatos.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 45, 200, 25));

        jtPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Apellido", "Nombres", "Domicilio", "DNI"
            }
        ));
        jScrollPane1.setViewportView(jtPacientes);

        jPanelDatos.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 600, 170));

        jButton1.setBackground(new java.awt.Color(16, 41, 153));
        jButton1.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyechistoclinica/imagen/cerraMarron.png"))); // NOI18N
        jButton1.setText("Cerrar");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanelDatos.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 110, 40));

        jButton2.setBackground(new java.awt.Color(16, 41, 153));
        jButton2.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyechistoclinica/imagen/nuevMarron.png"))); // NOI18N
        jButton2.setText("Nuevo");
        jPanelDatos.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 110, 40));

        jButton3.setBackground(new java.awt.Color(16, 41, 153));
        jButton3.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyechistoclinica/imagen/disquMarron.png"))); // NOI18N
        jButton3.setText("Guardar");
        jPanelDatos.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 110, 40));

        jPanelFondo.add(jPanelDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 640, 340));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
        if (txtDni.getText().length() >= 8) {
            JOptionPane.showMessageDialog(null, "Maximo 8 caracteres");
        }
    }//GEN-LAST:event_txtDniKeyTyped

    private void txtDniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyReleased
        // TODO add your handling code here:
        limpiarTabla();
        for (Paciente paci : listarPaci) {
            if (paci.getDniPaci().startsWith(txtDni.getText())) {
                modelo.addRow(new Object[]{paci.getIdPaci(), paci.getApellidoPaci(), paci.getNombresPaci(), paci.getDomicilioPaci(), paci.getDniPaci(), paci.getTipoSangrePaci(), paci.getSexoPaci(), paci.getFechaNacPaci(), paci.getTelefonoPaci()});
            }
        }
    }//GEN-LAST:event_txtDniKeyReleased

    private void jrDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrDniActionPerformed
        // TODO add your handling code here:
        if (jrDni.isSelected()) {
            txtDni.setEnabled(true);
            txtDni.requestFocus();
            txtApe.setEnabled(false);
            jrApe.setSelected(false);
        }
    }//GEN-LAST:event_jrDniActionPerformed

    private void jrApeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrApeActionPerformed
        // TODO add your handling code here:
        if (jrApe.isSelected()) {
            txtApe.setEnabled(true);
            txtApe.requestFocus();
            jrDni.setSelected(false);
            txtDni.setEnabled(false);
        }
    }//GEN-LAST:event_jrApeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtApeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApeKeyReleased
        // TODO add your handling code here:
        limpiarTabla();
        for(Paciente paci: listarPaci){
            if(paci.getApellidoPaci().startsWith(txtApe.getText())){
                 modelo.addRow(new Object[]{paci.getIdPaci(), paci.getApellidoPaci(), paci.getNombresPaci(), paci.getDomicilioPaci(), paci.getDniPaci(), paci.getTipoSangrePaci(), paci.getSexoPaci(), paci.getFechaNacPaci(), paci.getTelefonoPaci()});
            }
        }
    }//GEN-LAST:event_txtApeKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanelDatos;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jrApe;
    private javax.swing.JRadioButton jrDni;
    private javax.swing.JTable jtPacientes;
    private javax.swing.JTextField txtApe;
    private javax.swing.JTextField txtDni;
    // End of variables declaration//GEN-END:variables
     //metodo crear cabecera
    private void crearCabecera() {
        modelo.addColumn("Id");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombres");
        modelo.addColumn("Domicilio");
        modelo.addColumn("DNI");
        jtPacientes.setModel(modelo);
        //establecer ancho de las columnas de la tabla
        jtPacientes.getColumnModel().getColumn(0).setPreferredWidth(40);
        jtPacientes.getColumnModel().getColumn(1).setPreferredWidth(90);
        jtPacientes.getColumnModel().getColumn(2).setPreferredWidth(120);
        jtPacientes.getColumnModel().getColumn(3).setPreferredWidth(210);
        jtPacientes.getColumnModel().getColumn(4).setPreferredWidth(90);

        //establecer alto de la cabecera de la tabla
        jtPacientes.getTableHeader().setPreferredSize(new java.awt.Dimension(0, 25));
        jtPacientes.getTableHeader().setFont(new Font("Arial Narrow", 1, 16)); //cambiar tipo fuente
        jtPacientes.getTableHeader().setBackground(Color.green); //color de fondo de la cabecera
        jtPacientes.getTableHeader().setForeground(Color.BLUE); //color de la letra cabecera

    }

    //metodo cargar tabla de pacientes dados de bajas
    private void cargarTabla() {
        listarPaci = (ArrayList) paciData.listarBajas();
        if (listarPaci != null) {
            for (Paciente listar : listarPaci) {
                modelo.addRow(new Object[]{listar.getIdPaci(), listar.getApellidoPaci(), listar.getNombresPaci(), listar.getDomicilioPaci(), listar.getDniPaci(), listar.getTipoSangrePaci(), listar.getSexoPaci(), listar.getFechaNacPaci(), listar.getTelefonoPaci()});
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay datos...");
        }
    }

    //metodo limpiarTabla
    private void limpiarTabla() {
        int cFilas = jtPacientes.getRowCount() - 1;
        for (int f = cFilas; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }
}
