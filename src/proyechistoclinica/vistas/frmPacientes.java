package proyechistoclinica.vistas;

import proyechistoclinica.entidades.*;
import proyechistoclinica.accesoADatos.*;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;

public class frmPacientes extends javax.swing.JInternalFrame {

    private PacienteData paciData = new PacienteData();
    private HistoriaClinicaData histoData = new HistoriaClinicaData();
    private HistoriaClinica histoSelec;

    private Paciente paciSelec;
    private LocalDate vFecha;
    private String vTSangre;
    private String vSexo;
    private boolean nPaciente = false;
    private boolean ePaciente = false;
    private boolean bPaciente = false;

    public frmPacientes() {
        initComponents();
        this.setSize(650,500);
        this.setResizable(false);
        this.repaint();
        txtId.setVisible(false);
        btnCargar.setEnabled(false);
        btnEliminar.setEnabled(false);
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
        jLabel5 = new javax.swing.JLabel();
        cmbTipoSangre = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cmbSexo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jdFecha = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jrEst = new javax.swing.JRadioButton();
        btnBuscar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnCargar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        jPanelOpciones = new javax.swing.JPanel();
        jrNuevoPaci = new javax.swing.JRadioButton();
        jrEditarPaci = new javax.swing.JRadioButton();
        jrEliminarPaci = new javax.swing.JRadioButton();

        setClosable(true);
        setTitle("Pacientes");
        setPreferredSize(new java.awt.Dimension(650, 500));

        jPanelFondo.setBackground(new java.awt.Color(0, 51, 51));
        jPanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelDatos.setBackground(new java.awt.Color(0, 51, 51));
        jPanelDatos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanelDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Apellido:");
        jPanelDatos.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        txtApe.setBackground(new java.awt.Color(99, 99, 99));
        txtApe.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        txtApe.setForeground(new java.awt.Color(0, 0, 0));
        txtApe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApeKeyTyped(evt);
            }
        });
        jPanelDatos.add(txtApe, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 35, 200, 25));

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombres:");
        jPanelDatos.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        txtNom.setBackground(new java.awt.Color(99, 99, 99));
        txtNom.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        txtNom.setForeground(new java.awt.Color(0, 0, 0));
        txtNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomKeyTyped(evt);
            }
        });
        jPanelDatos.add(txtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 35, 200, 25));

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Domicilio:");
        jPanelDatos.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        txtDom.setBackground(new java.awt.Color(99, 99, 99));
        txtDom.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        txtDom.setForeground(new java.awt.Color(0, 0, 0));
        jPanelDatos.add(txtDom, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 85, 410, 25));

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DNI:");
        jPanelDatos.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        txtDni.setBackground(new java.awt.Color(99, 99, 99));
        txtDni.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        txtDni.setForeground(new java.awt.Color(0, 0, 0));
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDniKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });
        jPanelDatos.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 135, 200, 25));

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tipo Sangre:");
        jPanelDatos.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        cmbTipoSangre.setBackground(new java.awt.Color(99, 99, 99));
        cmbTipoSangre.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        cmbTipoSangre.setForeground(new java.awt.Color(0, 0, 0));
        cmbTipoSangre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "A+", "A-", "B+", "B-", "AB+", "AB-", "0+", "0-" }));
        cmbTipoSangre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbTipoSangreMouseClicked(evt);
            }
        });
        jPanelDatos.add(cmbTipoSangre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 195, 110, 25));

        jLabel6.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sexo:");
        jPanelDatos.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        cmbSexo.setBackground(new java.awt.Color(99, 99, 99));
        cmbSexo.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        cmbSexo.setForeground(new java.awt.Color(0, 0, 0));
        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "M", "F" }));
        cmbSexo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbSexoMouseClicked(evt);
            }
        });
        jPanelDatos.add(cmbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 195, 70, 25));

        jLabel7.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fecha Nacimiento:");
        jPanelDatos.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, -1, -1));

        jdFecha.setBackground(new java.awt.Color(99, 99, 99));
        jdFecha.setForeground(new java.awt.Color(255, 255, 255));
        jdFecha.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdFechaPropertyChange(evt);
            }
        });
        jPanelDatos.add(jdFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 195, 200, -1));

        jLabel8.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Télefono:");
        jPanelDatos.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        txtTel.setBackground(new java.awt.Color(99, 99, 99));
        txtTel.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        txtTel.setForeground(new java.awt.Color(0, 0, 0));
        txtTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelKeyTyped(evt);
            }
        });
        jPanelDatos.add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 245, 200, 25));

        jLabel9.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Estado:");
        jPanelDatos.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, -1));

        jrEst.setSelected(true);
        jPanelDatos.add(jrEst, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 245, 25, -1));

        btnBuscar.setBackground(new java.awt.Color(16, 41, 153));
        btnBuscar.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyechistoclinica/imagen/lupaColor.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanelDatos.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 200, -1));

        btnNuevo.setBackground(new java.awt.Color(16, 41, 153));
        btnNuevo.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyechistoclinica/imagen/nuevMarron.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanelDatos.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 110, 40));

        btnCargar.setBackground(new java.awt.Color(16, 41, 153));
        btnCargar.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnCargar.setForeground(new java.awt.Color(255, 255, 255));
        btnCargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyechistoclinica/imagen/disquMarron.png"))); // NOI18N
        btnCargar.setText("Guardar");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });
        jPanelDatos.add(btnCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 110, 40));

        btnEliminar.setBackground(new java.awt.Color(16, 41, 153));
        btnEliminar.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyechistoclinica/imagen/elimiMarron.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanelDatos.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 110, 40));

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
        jPanelDatos.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 110, 40));

        txtId.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        txtId.setForeground(new java.awt.Color(0, 0, 0));
        jPanelDatos.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 245, 30, 25));

        jPanelFondo.add(jPanelDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 550, 350));

        jPanelOpciones.setBackground(new java.awt.Color(0, 51, 51));
        jPanelOpciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanelOpciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jrNuevoPaci.setBackground(new java.awt.Color(0, 51, 51));
        jrNuevoPaci.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jrNuevoPaci.setForeground(new java.awt.Color(255, 255, 255));
        jrNuevoPaci.setText("Nuevo Paciente");
        jrNuevoPaci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrNuevoPaciActionPerformed(evt);
            }
        });
        jPanelOpciones.add(jrNuevoPaci, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 15, -1, -1));

        jrEditarPaci.setBackground(new java.awt.Color(0, 51, 51));
        jrEditarPaci.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jrEditarPaci.setForeground(new java.awt.Color(255, 255, 255));
        jrEditarPaci.setText("Editar Paciente");
        jrEditarPaci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrEditarPaciActionPerformed(evt);
            }
        });
        jPanelOpciones.add(jrEditarPaci, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 15, -1, -1));

        jrEliminarPaci.setBackground(new java.awt.Color(0, 51, 51));
        jrEliminarPaci.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jrEliminarPaci.setForeground(new java.awt.Color(255, 255, 255));
        jrEliminarPaci.setText("Bajas Paciente");
        jrEliminarPaci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrEliminarPaciActionPerformed(evt);
            }
        });
        jPanelOpciones.add(jrEliminarPaci, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 15, -1, -1));

        jPanelFondo.add(jPanelOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 550, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jdFechaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdFechaPropertyChange
        // TODO add your handling code here:
        if (jdFecha.getDate() != null) {
            vFecha = jdFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        }
    }//GEN-LAST:event_jdFechaPropertyChange

    private void cmbTipoSangreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbTipoSangreMouseClicked
        // TODO add your handling code here:
        vTSangre = (String) cmbTipoSangre.getSelectedItem();
    }//GEN-LAST:event_cmbTipoSangreMouseClicked

    private void cmbSexoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbSexoMouseClicked
        // TODO add your handling code here:
        vSexo = (String) cmbSexo.getSelectedItem();
    }//GEN-LAST:event_cmbSexoMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        if (!txtDni.getText().isEmpty()) {
            buscPorDni();
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese un DNI...");
            txtDni.requestFocus();
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

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

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        // TODO add your handling code here:

        if ((!txtApe.getText().isEmpty()) && !txtNom.getText().isEmpty() && !txtDni.getText().isEmpty()) {
            paciSelec = paciData.buscarPorDni(txtDni.getText());
            if (paciSelec == null && nPaciente == true) {
                int opcion = JOptionPane.showConfirmDialog(null, "¿Confirma el alta del registro?", "ALTAS REGISTRO", JOptionPane.OK_CANCEL_OPTION);
                if (opcion == 0) {
                    insertPaci();
                    limpiarCampos();
                } else {
                    JOptionPane.showMessageDialog(null, "No se realizo ninguna alta....");
                    limpiarCampos();
                }
            }
            if (paciSelec != null && ePaciente == true && vFecha!=null) {
                int opcion = JOptionPane.showConfirmDialog(null, "¿Confirma la edición del registro?", "EDITAR REGISTRO", JOptionPane.OK_CANCEL_OPTION);
                if (opcion == 0) {
                    editPaci();
                    limpiarCampos();
                } else {
                    JOptionPane.showMessageDialog(null, "No se realizo ninguna edición....");
                    limpiarCampos();
                }
            }
            if (paciSelec != null && nPaciente == true) {
                JOptionPane.showMessageDialog(null, "El Dni se encuentra cargado y pertence a " + paciSelec.getApellidoPaci() + " - " + paciSelec.getNombresPaci());
                limpiarCampos();
                txtApe.requestFocus();;
            }

        } else {
            JOptionPane.showMessageDialog(null, "Faltan datos...");
            txtApe.requestFocus();
        }


    }//GEN-LAST:event_btnCargarActionPerformed

    private void txtApeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApeKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            //JOptionPane.showMessageDialog(null, "Ingreso un valor no permitido solamente caracteres...");
            evt.consume();
        }
    }//GEN-LAST:event_txtApeKeyTyped

    private void txtNomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            //JOptionPane.showMessageDialog(null, "Ingreso un valor no permitido solamente caracteres...");
            evt.consume();
        }
    }//GEN-LAST:event_txtNomKeyTyped

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        //metodo bajas pacientes
        //antes de elimnar el paciente comprueba que no tenga una historia clinica
        String vNomHisto = txtDni.getText();
        histoSelec = (HistoriaClinica) histoData.buscarPoNombre(vNomHisto);
        if (histoSelec != null) {
            JOptionPane.showMessageDialog(null, "El paciente que desea eliminar posee una historia clinica tiene que dar de baja la historia clinica");
            limpiarCampos();
        } else {
            if (jrEst.isSelected() && paciSelec != null) {
                int opcion = JOptionPane.showConfirmDialog(this, "¿Confirma la baja del paciente?" + paciSelec.getDniPaci(), "BAJAS PACIENTES", JOptionPane.OK_CANCEL_OPTION);
                if (opcion == 0) {
                    bajasPaci();
                    limpiarCampos();
                } else {
                    JOptionPane.showMessageDialog(this, "No se realizo ninguna baja...");
                    limpiarCampos();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Faltan datos...");
            }
        }


    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        limpiarCampos();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void txtDniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_txtDniKeyReleased

    private void jrNuevoPaciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrNuevoPaciActionPerformed
        // TODO add your handling code here:
        if (jrNuevoPaci.isSelected()) {
            nuevoPaciente();
        }

    }//GEN-LAST:event_jrNuevoPaciActionPerformed

    private void jrEditarPaciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrEditarPaciActionPerformed
        // TODO add your handling code here:
        if (jrEditarPaci.isSelected()) {
            editarPaciente();
        }

    }//GEN-LAST:event_jrEditarPaciActionPerformed

    private void jrEliminarPaciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrEliminarPaciActionPerformed
        // TODO add your handling code here:
        if (jrEliminarPaci.isSelected()) {
            bajaPaciente();
        }
    }//GEN-LAST:event_jrEliminarPaciActionPerformed

    private void txtTelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
        if (txtTel.getText().length() >= 30) {
            JOptionPane.showMessageDialog(null, "Maximo 30 caracteres");
        }
    }//GEN-LAST:event_txtTelKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cmbSexo;
    private javax.swing.JComboBox<String> cmbTipoSangre;
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
    private javax.swing.JPanel jPanelOpciones;
    private com.toedter.calendar.JDateChooser jdFecha;
    private javax.swing.JRadioButton jrEditarPaci;
    private javax.swing.JRadioButton jrEliminarPaci;
    private javax.swing.JRadioButton jrEst;
    private javax.swing.JRadioButton jrNuevoPaci;
    private javax.swing.JTextField txtApe;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtDom;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables

    //metodo insertar Paciente a traves de un objecto
    private void insertPaci() {

        String vApe = txtApe.getText();
        String vNom = txtNom.getText();
        String vDom = txtDom.getText();
        String vDni = txtDni.getText();
        String vTel = txtTel.getText();
        //creo el objecto Paciente
        Paciente paci = new Paciente(vApe, vNom, vDom, vDni, vTSangre, vSexo, vFecha, vTel, true);
        paciData.insertarPaci(paci);

    }

    //metodo buscar por DNI
    private void buscPorDni() {
        String vDni = txtDni.getText();
        paciSelec = paciData.buscarPorDni(vDni);
        if (paciSelec != null) {
            txtId.setText(String.valueOf(paciSelec.getIdPaci()));
            txtApe.setText(paciSelec.getApellidoPaci());
            txtNom.setText(paciSelec.getNombresPaci());
            txtDom.setText(paciSelec.getDomicilioPaci());
            txtTel.setText(paciSelec.getTelefonoPaci());
        } else {
            JOptionPane.showMessageDialog(this, "No hay datos cargados con ese DNI:" + vDni);
        }

    }

    //metodo editar registro a traves de un objecto
    private void editPaci() {
        int vId = Integer.parseInt(txtId.getText());
        String vApe = txtApe.getText();
        String vNom = txtNom.getText();
        String vDom = txtDom.getText();
        String vDni = txtDni.getText();
        String vTel = txtTel.getText();
        //creo el objecto Paciente
        Paciente paci = new Paciente(vId, vApe, vNom, vDom, vDni, vTSangre, vSexo, vFecha, vTel, true);
        paciData.editarPaciente(paci);
    }

    //metodo limpiar campos
    private void limpiarCampos() {
        txtId.setText("");
        txtApe.setText("");
        txtNom.setText("");
        txtDom.setText("");
        txtDni.setText("");
        cmbTipoSangre.setSelectedIndex(0);
        cmbSexo.setSelectedIndex(0);
        txtTel.setText("");
        txtApe.requestFocus();
        nPaciente = false;
        ePaciente = false;
        bPaciente = false;
        jrNuevoPaci.setSelected(false);
        jrEditarPaci.setSelected(false);
        jrEliminarPaci.setSelected(false);
        //resetear jdFecha
        jdFecha.setCalendar(null);
    }

    //metodo habilitar para cargar nuevo Paciente
    private void nuevoPaciente() {
        nPaciente = true;
        btnCargar.setEnabled(true);
        btnEliminar.setEnabled(false);
        jrEditarPaci.setSelected(false);
        jrEliminarPaci.setSelected(false);
        txtId.setText("");
        txtApe.setText("");
        txtNom.setText("");
        txtDni.setText("");
        txtDom.setText("");
        txtTel.setText("");
        cmbTipoSangre.setSelectedIndex(0);
        cmbSexo.setSelectedIndex(0);
        jdFecha.setCalendar(null);
        txtApe.requestFocus();

    }

    //metodo habilitar para editar Paciente
    private void editarPaciente() {
        ePaciente = true;
        btnCargar.setEnabled(true);
        btnEliminar.setEnabled(false);
        jrNuevoPaci.setSelected(false);
        jrEliminarPaci.setSelected(false);
        txtId.setText("");
        txtApe.setText("");
        txtNom.setText("");
        txtDom.setText("");
        txtDni.setText("");
        txtTel.setText("");
        cmbTipoSangre.setSelectedIndex(0);
        cmbSexo.setSelectedIndex(0);
        jdFecha.setCalendar(null);
        txtDni.requestFocus();
    }

    //metodo habilitar para dar de baja Paciente
    private void bajaPaciente() {
        bPaciente = true;
        btnEliminar.setEnabled(true);
        btnCargar.setEnabled(false);
        jrNuevoPaci.setSelected(false);
        jrEditarPaci.setSelected(false);
        txtId.setText("");
        txtApe.setText("");
        txtNom.setText("");
        txtDom.setText("");
        txtDni.setText("");
        txtTel.setText("");
        cmbTipoSangre.setSelectedIndex(0);
        cmbSexo.setSelectedIndex(0);
        jdFecha.setCalendar(null);
        txtDni.requestFocus();
    }

    //metodo eliminar pacientae a traves del id
    private void bajasPaci() {
        int vId = Integer.parseInt(txtId.getText());
        paciData.bajasPaci(vId);
    }
}
