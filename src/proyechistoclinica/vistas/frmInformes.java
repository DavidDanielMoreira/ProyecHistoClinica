package proyechistoclinica.vistas;

import proyechistoclinica.accesoADatos.*;
import java.sql.*;

public class frmInformes extends javax.swing.JInternalFrame {

    private ReporteData repoData = new ReporteData();

    public frmInformes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        jPanelBotones = new javax.swing.JPanel();
        btnListadoPaci = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnListadoHisto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNomHisto = new javax.swing.JTextField();
        jrPacientes = new javax.swing.JRadioButton();
        btnNuevo = new javax.swing.JButton();
        jrHistoriasClinicas = new javax.swing.JRadioButton();

        setClosable(true);
        setTitle("Informes");

        jPanelFondo.setBackground(new java.awt.Color(0, 51, 51));
        jPanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelBotones.setBackground(new java.awt.Color(0, 51, 51));
        jPanelBotones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanelBotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnListadoPaci.setText("Listado");
        btnListadoPaci.setEnabled(false);
        btnListadoPaci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListadoPaciActionPerformed(evt);
            }
        });
        jPanelBotones.add(btnListadoPaci, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 100, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pacientes:");
        jPanelBotones.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        btnListadoHisto.setText("Listado");
        btnListadoHisto.setEnabled(false);
        btnListadoHisto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListadoHistoActionPerformed(evt);
            }
        });
        jPanelBotones.add(btnListadoHisto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Historia Clinicas:");
        jPanelBotones.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyechistoclinica/imagen/cerrar.png"))); // NOI18N
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanelBotones.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 100, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre Historia Clinica:");
        jPanelBotones.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        txtNomHisto.setEnabled(false);
        jPanelBotones.add(txtNomHisto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 190, -1));

        jrPacientes.setBackground(new java.awt.Color(0, 51, 51));
        jrPacientes.setForeground(new java.awt.Color(255, 255, 255));
        jrPacientes.setText("Pacientes:");
        jrPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrPacientesMouseClicked(evt);
            }
        });
        jPanelBotones.add(jrPacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyechistoclinica/imagen/nuevo.png"))); // NOI18N
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanelBotones.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 100, -1));

        jrHistoriasClinicas.setBackground(new java.awt.Color(0, 51, 51));
        jrHistoriasClinicas.setForeground(new java.awt.Color(255, 255, 255));
        jrHistoriasClinicas.setText("Historia Clinicas:");
        jrHistoriasClinicas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrHistoriasClinicasMouseClicked(evt);
            }
        });
        jrHistoriasClinicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrHistoriasClinicasActionPerformed(evt);
            }
        });
        jPanelBotones.add(jrHistoriasClinicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        jPanelFondo.add(jPanelBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 360, 230));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListadoPaciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListadoPaciActionPerformed
        // TODO add your handling code here:
        repoData.ListarReporte();

    }//GEN-LAST:event_btnListadoPaciActionPerformed

    private void btnListadoHistoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListadoHistoActionPerformed
        // TODO add your handling code here:
        String vNomHisto = txtNomHisto.getText();
        repoData.listarHistoClinica(vNomHisto);

    }//GEN-LAST:event_btnListadoHistoActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void jrPacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrPacientesMouseClicked
        // TODO add your handling code here:
        if (jrPacientes.isSelected()) {
            btnListadoPaci.setEnabled(true);
            btnListadoHisto.setEnabled(false);
            txtNomHisto.setEnabled(false);
        } else {
            btnListadoPaci.setEnabled(false);
            btnListadoHisto.setEnabled(false);
            txtNomHisto.setEnabled(false);
        }

    }//GEN-LAST:event_jrPacientesMouseClicked

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        limpiarCampos();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void jrHistoriasClinicasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrHistoriasClinicasMouseClicked
        // TODO add your handling code here:
        if (jrHistoriasClinicas.isSelected()) {
            btnListadoHisto.setEnabled(true);
            txtNomHisto.setEnabled(true);
            btnListadoPaci.setEnabled(false);
        } else {
            btnListadoHisto.setEnabled(false);
            txtNomHisto.setEnabled(false);
            btnListadoPaci.setEnabled(false);
        }

    }//GEN-LAST:event_jrHistoriasClinicasMouseClicked

    private void jrHistoriasClinicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrHistoriasClinicasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrHistoriasClinicasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnListadoHisto;
    private javax.swing.JButton btnListadoPaci;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JRadioButton jrHistoriasClinicas;
    private javax.swing.JRadioButton jrPacientes;
    private javax.swing.JTextField txtNomHisto;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {
        jrPacientes.setSelected(false);
        jrHistoriasClinicas.setSelected(false);
        btnListadoPaci.setEnabled(false);
        btnListadoHisto.setEnabled(false);
        txtNomHisto.setText("");
    }
}
