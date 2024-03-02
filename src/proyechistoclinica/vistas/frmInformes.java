package proyechistoclinica.vistas;
import proyechistoclinica.entidades.*;
import proyechistoclinica.accesoADatos.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class frmInformes extends javax.swing.JInternalFrame {

    private ReporteData repoData = new ReporteData();
    private HistoriaClinicaData histoData = new HistoriaClinicaData();
    private HistoriaClinica histoSelec;
    public frmInformes() {
        initComponents();
        this.setSize(400, 300);
        this.setResizable(false);
        this.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        jPanelBotones = new javax.swing.JPanel();
        btnListadoHisto = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNomHisto = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        jrHistoriasClinicas = new javax.swing.JRadioButton();

        setClosable(true);
        setTitle("Informes");
        setPreferredSize(new java.awt.Dimension(400, 300));

        jPanelFondo.setBackground(new java.awt.Color(0, 51, 51));
        jPanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelBotones.setBackground(new java.awt.Color(0, 51, 51));
        jPanelBotones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanelBotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnListadoHisto.setBackground(new java.awt.Color(240, 240, 240));
        btnListadoHisto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnListadoHisto.setForeground(new java.awt.Color(0, 0, 0));
        btnListadoHisto.setText("Mostrar");
        btnListadoHisto.setEnabled(false);
        btnListadoHisto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListadoHistoActionPerformed(evt);
            }
        });
        jPanelBotones.add(btnListadoHisto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 55, 230, -1));

        btnCerrar.setBackground(new java.awt.Color(240, 240, 240));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyechistoclinica/imagen/cerrar.png"))); // NOI18N
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanelBotones.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 165, 100, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre Historia Clinica:");
        jPanelBotones.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        txtNomHisto.setEnabled(false);
        jPanelBotones.add(txtNomHisto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 125, 230, 25));

        btnNuevo.setBackground(new java.awt.Color(240, 240, 240));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyechistoclinica/imagen/nuevo.png"))); // NOI18N
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanelBotones.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 165, 100, -1));

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
        jPanelBotones.add(jrHistoriasClinicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 15, -1, -1));

        jPanelFondo.add(jPanelBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 340, 230));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListadoHistoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListadoHistoActionPerformed
        // TODO add your handling code here:
        if (!txtNomHisto.getText().isEmpty()) {
            String vNomHisto = txtNomHisto.getText();
            histoSelec = histoData.buscarPoNombre(vNomHisto);
            if(histoSelec!=null){
                repoData.listarHistoClinica(vNomHisto);
            }else{
                JOptionPane.showMessageDialog(null, "No existe datos cargados...");
            }
            
        }else{
            JOptionPane.showMessageDialog(null,"Favor de ingresar un nombre de hiatoria clinica:...");
            txtNomHisto.requestFocus();
        }


    }//GEN-LAST:event_btnListadoHistoActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        limpiarCampos();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void jrHistoriasClinicasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrHistoriasClinicasMouseClicked
        // TODO add your handling code here:
        if (jrHistoriasClinicas.isSelected()) {
            btnListadoHisto.setEnabled(true);
            txtNomHisto.setEnabled(true);
            
        } else {
            btnListadoHisto.setEnabled(false);
            txtNomHisto.setEnabled(false);
            
        }

    }//GEN-LAST:event_jrHistoriasClinicasMouseClicked

    private void jrHistoriasClinicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrHistoriasClinicasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrHistoriasClinicasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnListadoHisto;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JRadioButton jrHistoriasClinicas;
    private javax.swing.JTextField txtNomHisto;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {
        
        jrHistoriasClinicas.setSelected(false);
       
        btnListadoHisto.setEnabled(false);
        txtNomHisto.setText("");
    }
}
