package proyechistoclinica.vistas;

import proyechistoclinica.entidades.*;
import proyechistoclinica.accesoADatos.*;
import java.sql.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class frmMedicos extends javax.swing.JInternalFrame {

    private MedicoData mediData = new MedicoData();
    private EspecialidadData espeData = new EspecialidadData();
    private Especialidad espeSelec;
    private ArrayList<Especialidad> listarEspe;
    private Medico mediSelec;
    private LocalDate vFecha;
    private String vSexo;

    public frmMedicos() {
        initComponents();
        this.setSize(650, 450);
        this.setResizable(false);
        this.repaint();
        txtId.setVisible(false);
        cargarCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        jPanelDatos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtApe = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cmbSexo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jdFecha = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cmbEspec = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jrEst = new javax.swing.JRadioButton();
        btnNuevo = new javax.swing.JButton();
        btnCargar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Médicos");

        jPanelFondo.setBackground(new java.awt.Color(0, 51, 51));
        jPanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelDatos.setBackground(new java.awt.Color(0, 51, 51));
        jPanelDatos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanelDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Apellido:");
        jPanelDatos.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 35, -1, -1));
        jPanelDatos.add(txtApe, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 200, 25));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombres:");
        jPanelDatos.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 35, -1, -1));
        jPanelDatos.add(txtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 200, 25));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Domicilio:");
        jPanelDatos.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));
        jPanelDatos.add(txtDom, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 95, 410, 25));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DNI:");
        jPanelDatos.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 125, -1, -1));

        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });
        jPanelDatos.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 200, 25));

        btnBuscar.setBackground(new java.awt.Color(240, 240, 240));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyechistoclinica/imagen/buscar.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanelDatos.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 200, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sexo:");
        jPanelDatos.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "M", "F" }));
        cmbSexo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbSexoMouseClicked(evt);
            }
        });
        jPanelDatos.add(cmbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 205, 70, 25));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fecha Nacimiento:");
        jPanelDatos.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        jdFecha.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdFechaPropertyChange(evt);
            }
        });
        jPanelDatos.add(jdFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 205, 150, 25));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Télefono:");
        jPanelDatos.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, -1));
        jPanelDatos.add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 205, 170, 25));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Especialidad:");
        jPanelDatos.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        cmbEspec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbEspecMouseClicked(evt);
            }
        });
        jPanelDatos.add(cmbEspec, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 255, 230, 25));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Estado:");
        jPanelDatos.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, -1, -1));

        jrEst.setSelected(true);
        jPanelDatos.add(jrEst, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 255, -1, 25));

        btnNuevo.setBackground(new java.awt.Color(240, 240, 240));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyechistoclinica/imagen/nuevo.png"))); // NOI18N
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanelDatos.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 100, -1));

        btnCargar.setBackground(new java.awt.Color(240, 240, 240));
        btnCargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyechistoclinica/imagen/guardar.png"))); // NOI18N
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });
        jPanelDatos.add(btnCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 100, -1));

        btnEliminar.setBackground(new java.awt.Color(240, 240, 240));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyechistoclinica/imagen/eliminar.png"))); // NOI18N
        jPanelDatos.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 100, -1));

        btnCerrar.setBackground(new java.awt.Color(240, 240, 240));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyechistoclinica/imagen/cerrar.png"))); // NOI18N
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanelDatos.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 100, -1));
        jPanelDatos.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 255, 40, 25));

        jPanelFondo.add(jPanelDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 510, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void jdFechaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdFechaPropertyChange
        // TODO add your handling code here:
        if (jdFecha.getDate() != null) {
            vFecha = jdFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        }
    }//GEN-LAST:event_jdFechaPropertyChange

    private void cmbEspecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbEspecMouseClicked
        // TODO add your handling code here:
        espeSelec = (Especialidad) cmbEspec.getSelectedItem();
    }//GEN-LAST:event_cmbEspecMouseClicked

    private void cmbSexoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbSexoMouseClicked
        // TODO add your handling code here:
        vSexo = (String) cmbSexo.getSelectedItem();
    }//GEN-LAST:event_cmbSexoMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        if (!txtDni.getText().isEmpty()) {
            buscPorDni();
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar un DNI...");
            txtDni.requestFocus();
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        // TODO add your handling code here:
        if (!txtApe.getText().isEmpty() && !txtNom.getText().isEmpty() && vSexo != null) {
            if (mediSelec == null) {
                int opcion = JOptionPane.showConfirmDialog(this, "¿Confirma el alta del registro?", "ALTAS MEDICOS", JOptionPane.OK_CANCEL_OPTION);
                if (opcion == 0) {
                    insertMedico();
                } else {
                    JOptionPane.showMessageDialog(this, "No se realizo ningúun alta...");
                }
            } else {
                int opcion = JOptionPane.showConfirmDialog(this, "¿Confirma la edición del registro?", "EDITAR MEDICOS", JOptionPane.OK_CANCEL_OPTION);
                if (opcion == 0) {
                    editMedico();
                } else {
                    JOptionPane.showMessageDialog(this, "No se realizo ningúna edición de registro...");
                }

            }

        } else {
            JOptionPane.showMessageDialog(null, "Faltan datos completar...");
        }


    }//GEN-LAST:event_btnCargarActionPerformed

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            //JOptionPane.showMessageDialog(null, "Solo se permiten ingresar números...");
            evt.consume();
        }

        if (txtDni.getText().length() >= 8) {
            JOptionPane.showMessageDialog(null, "Maximo 8 caracteres...");
            evt.consume();
        }
    }//GEN-LAST:event_txtDniKeyTyped

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        limpiarCampos();
    }//GEN-LAST:event_btnNuevoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<Especialidad> cmbEspec;
    private javax.swing.JComboBox<String> cmbSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelDatos;
    private javax.swing.JPanel jPanelFondo;
    private com.toedter.calendar.JDateChooser jdFecha;
    private javax.swing.JRadioButton jrEst;
    private javax.swing.JTextField txtApe;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtDom;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
    //metodo cargar combo Especialidades
    private void cargarCombo() {
        listarEspe = (ArrayList) espeData.listarEspe();
        if (listarEspe != null) {
            for (Especialidad listar : listarEspe) {
                cmbEspec.addItem(listar);
            }
        }
    }

    //metodo insertar medico
    private void insertMedico() {
        String vApe = txtApe.getText();
        String vNom = txtNom.getText();
        String vDom = txtDom.getText();
        String vDni = txtDni.getText();
        String vTel = txtTel.getText();
        //creo el objecto
        Medico medico = new Medico(vApe, vNom, vDom, vDni, vSexo, vFecha, vTel, espeSelec, true);
        mediData.insertarMedico(medico);
    }

    //metodo editar medico a traves de un objecto
    private void editMedico() {
        int vId = Integer.parseInt(txtId.getText());
        String vApe = txtApe.getText();
        String vNom = txtNom.getText();
        String vDom = txtDom.getText();
        String vDni = txtDni.getText();
        String vTel = txtTel.getText();
        //creo el objecto Medico
        Medico medico = new Medico(vId, vApe, vNom, vDom, vDni, vSexo, vFecha, vTel, espeSelec, true);
        mediData.editarMedico(medico);

    }

    //metodo buscar por DNI
    private void buscPorDni() {
        String vDni = txtDni.getText();
        mediSelec = mediData.buscarPorDni(vDni);
        if (mediSelec != null) {
            txtId.setText(String.valueOf(mediSelec.getIdMedi()));
            txtApe.setText(mediSelec.getApellidoMedi());
            txtNom.setText(mediSelec.getNombresMedi());
            txtDom.setText(mediSelec.getDomicilioMedi());
            txtTel.setText(mediSelec.getTelefonoMedi());
        } else {
            JOptionPane.showMessageDialog(null, "no éxiste ningún medico con ese DNI.." + vDni);
        }
    }
    
    //metodo limpiar campos
    private void limpiarCampos(){
        txtId.setText("");
        txtApe.setText("");
        txtNom.setText("");
        txtDom.setText("");
        txtDni.setText("");
        txtTel.setText("");
        //reinicio el combo
        cmbEspec.setSelectedIndex(0);
        txtApe.requestFocus();
    }

}
