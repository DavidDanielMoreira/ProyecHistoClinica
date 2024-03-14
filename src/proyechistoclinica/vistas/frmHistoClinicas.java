package proyechistoclinica.vistas;

import proyechistoclinica.entidades.*;
import proyechistoclinica.accesoADatos.*;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.awt.Image;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class frmHistoClinicas extends javax.swing.JInternalFrame {

    private PacienteData paciData = new PacienteData();
    private MedicoData mediData = new MedicoData();
    private HistoriaClinicaData histoData = new HistoriaClinicaData();
    private HistoriaClinica histoSelec;
    private Paciente paciSelec;
    private Medico mediSelec;
    private Medico datosMedi;
    private ArrayList<Medico> listarMedicos;
    private ArrayList<Medico> listaMedico;
    private LocalDate vFecha = LocalDate.now(); //fecha actual 
    private boolean nHistoClinica;
    private boolean eHistoClinica;
    private boolean bHistoClinica;

    public frmHistoClinicas() {
        initComponents();
        formatoFecha();
        cargarComboMedi();
        txtNomPaci.setEnabled(false);
        txtApePaci.setEnabled(false);
        txtDniPaci.setEnabled(false);
        txtNomHisto.setEnabled(false);
        txtIdPaci.setVisible(false);
        txtIdHisto.setVisible(false);
        txtFechaHisto.setVisible(false);
        btnBuscarPaci.setEnabled(false);
        btnBuscarHisto.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnCargar.setEnabled(false);

        //jlFecha.setText(vFecha.toString());
        //colocar icono en el formulario
        //setIconImage(new ImageIcon(getClass().getResource("../proyechistoclinica/imagen/logoForm.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        jPanelPaci = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtDniPaci = new javax.swing.JTextField();
        jlFecha = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtApePaci = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNomPaci = new javax.swing.JTextField();
        btnBuscarPaci = new javax.swing.JButton();
        btnPacientes = new javax.swing.JButton();
        txtIdPaci = new javax.swing.JTextField();
        jPanelHistoClinica = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtNomHisto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbMedicos = new javax.swing.JComboBox<>();
        btnBuscarHisto = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTratHisto = new javax.swing.JTextArea();
        btnNuevo = new javax.swing.JButton();
        btnCargar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        txtIdHisto = new javax.swing.JTextField();
        txtFechaHisto = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jpOpcion = new javax.swing.JPanel();
        jrNuevaHisto = new javax.swing.JRadioButton();
        jrEditHistoClinica = new javax.swing.JRadioButton();
        jrBajasHistoClinica = new javax.swing.JRadioButton();

        setClosable(true);
        setTitle("Historia Clinicas");
        setPreferredSize(new java.awt.Dimension(700, 530));

        jPanelFondo.setBackground(new java.awt.Color(0, 51, 51));
        jPanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelPaci.setBackground(new java.awt.Color(0, 51, 51));
        jPanelPaci.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanelPaci.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingrese el DNI:");
        jPanelPaci.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        txtDniPaci.setBackground(new java.awt.Color(99, 99, 99));
        txtDniPaci.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        txtDniPaci.setForeground(new java.awt.Color(0, 0, 0));
        txtDniPaci.setEnabled(false);
        txtDniPaci.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniPaciKeyTyped(evt);
            }
        });
        jPanelPaci.add(txtDniPaci, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 25, 200, 25));

        jlFecha.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jlFecha.setForeground(new java.awt.Color(255, 255, 255));
        jlFecha.setText("jLabel2");
        jPanelPaci.add(jlFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 100, 30));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Apellido:");
        jPanelPaci.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        txtApePaci.setEditable(false);
        txtApePaci.setBackground(new java.awt.Color(99, 99, 99));
        txtApePaci.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        txtApePaci.setForeground(new java.awt.Color(0, 0, 0));
        txtApePaci.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApePaciKeyTyped(evt);
            }
        });
        jPanelPaci.add(txtApePaci, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 75, 280, 25));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombres:");
        jPanelPaci.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, -1));

        txtNomPaci.setEditable(false);
        txtNomPaci.setBackground(new java.awt.Color(99, 99, 99));
        txtNomPaci.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        txtNomPaci.setForeground(new java.awt.Color(0, 0, 0));
        jPanelPaci.add(txtNomPaci, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 75, 280, 25));

        btnBuscarPaci.setBackground(new java.awt.Color(16, 41, 156));
        btnBuscarPaci.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnBuscarPaci.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarPaci.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyechistoclinica/imagen/lupaColor.png"))); // NOI18N
        btnBuscarPaci.setText("Buscar");
        btnBuscarPaci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPaciActionPerformed(evt);
            }
        });
        jPanelPaci.add(btnBuscarPaci, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 130, 40));

        btnPacientes.setBackground(new java.awt.Color(16, 41, 153));
        btnPacientes.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnPacientes.setForeground(new java.awt.Color(255, 255, 255));
        btnPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyechistoclinica/imagen/gUsuaMarron.png"))); // NOI18N
        btnPacientes.setText("Pacientes");
        btnPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPacientesActionPerformed(evt);
            }
        });
        jPanelPaci.add(btnPacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 130, -1));

        txtIdPaci.setEditable(false);
        txtIdPaci.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        txtIdPaci.setForeground(new java.awt.Color(0, 0, 0));
        jPanelPaci.add(txtIdPaci, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 75, 30, 25));

        jPanelFondo.add(jPanelPaci, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 650, 120));

        jPanelHistoClinica.setBackground(new java.awt.Color(0, 51, 51));
        jPanelHistoClinica.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanelHistoClinica.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre:");
        jPanelHistoClinica.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        txtNomHisto.setBackground(new java.awt.Color(99, 99, 99));
        txtNomHisto.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        txtNomHisto.setForeground(new java.awt.Color(0, 0, 0));
        txtNomHisto.setEnabled(false);
        txtNomHisto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomHistoKeyTyped(evt);
            }
        });
        jPanelHistoClinica.add(txtNomHisto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 25, 200, 25));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Profesional:");
        jPanelHistoClinica.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, -1));

        cmbMedicos.setBackground(new java.awt.Color(99, 99, 99));
        cmbMedicos.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        cmbMedicos.setForeground(new java.awt.Color(0, 0, 0));
        cmbMedicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbMedicosMouseClicked(evt);
            }
        });
        cmbMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMedicosActionPerformed(evt);
            }
        });
        jPanelHistoClinica.add(cmbMedicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 25, 180, 25));

        btnBuscarHisto.setBackground(new java.awt.Color(16, 41, 156));
        btnBuscarHisto.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnBuscarHisto.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarHisto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyechistoclinica/imagen/lupaColor.png"))); // NOI18N
        btnBuscarHisto.setText("Buscar");
        btnBuscarHisto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarHistoActionPerformed(evt);
            }
        });
        jPanelHistoClinica.add(btnBuscarHisto, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 150, 40));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tratamiento:");
        jPanelHistoClinica.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        txtTratHisto.setBackground(new java.awt.Color(255, 255, 255));
        txtTratHisto.setColumns(20);
        txtTratHisto.setFont(new java.awt.Font("Arial Narrow", 1, 13)); // NOI18N
        txtTratHisto.setForeground(new java.awt.Color(0, 0, 0));
        txtTratHisto.setRows(5);
        jScrollPane1.setViewportView(txtTratHisto);

        jPanelHistoClinica.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 600, 120));

        btnNuevo.setBackground(new java.awt.Color(16, 41, 156));
        btnNuevo.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyechistoclinica/imagen/nuevMarron.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanelHistoClinica.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 110, 40));

        btnCargar.setBackground(new java.awt.Color(16, 41, 156));
        btnCargar.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnCargar.setForeground(new java.awt.Color(255, 255, 255));
        btnCargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyechistoclinica/imagen/disquMarron.png"))); // NOI18N
        btnCargar.setText("Guardar");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });
        jPanelHistoClinica.add(btnCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 110, 40));

        btnEliminar.setBackground(new java.awt.Color(16, 41, 156));
        btnEliminar.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyechistoclinica/imagen/elimiMarron.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanelHistoClinica.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 110, 40));

        btnCerrar.setBackground(new java.awt.Color(16, 41, 156));
        btnCerrar.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyechistoclinica/imagen/cerraMarron.png"))); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanelHistoClinica.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 110, 40));
        jPanelHistoClinica.add(txtIdHisto, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 40, 20));
        jPanelHistoClinica.add(txtFechaHisto, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 70, 20));

        jRadioButton1.setBackground(new java.awt.Color(0, 51, 51));
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Estado");
        jPanelHistoClinica.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, -1, -1));

        jPanelFondo.add(jPanelHistoClinica, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 650, 270));

        jpOpcion.setBackground(new java.awt.Color(0, 51, 51));
        jpOpcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jpOpcion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jrNuevaHisto.setBackground(new java.awt.Color(0, 51, 51));
        jrNuevaHisto.setForeground(new java.awt.Color(255, 255, 255));
        jrNuevaHisto.setText("Nueva Historia Clinica");
        jrNuevaHisto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrNuevaHistoMouseClicked(evt);
            }
        });
        jrNuevaHisto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrNuevaHistoActionPerformed(evt);
            }
        });
        jpOpcion.add(jrNuevaHisto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jrEditHistoClinica.setBackground(new java.awt.Color(0, 51, 51));
        jrEditHistoClinica.setForeground(new java.awt.Color(255, 255, 255));
        jrEditHistoClinica.setText("Editar Historia Clinica");
        jrEditHistoClinica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrEditHistoClinicaMouseClicked(evt);
            }
        });
        jrEditHistoClinica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrEditHistoClinicaActionPerformed(evt);
            }
        });
        jpOpcion.add(jrEditHistoClinica, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        jrBajasHistoClinica.setBackground(new java.awt.Color(0, 51, 51));
        jrBajasHistoClinica.setForeground(new java.awt.Color(255, 255, 255));
        jrBajasHistoClinica.setText("Bajas Historia Clinica");
        jrBajasHistoClinica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrBajasHistoClinicaMouseClicked(evt);
            }
        });
        jrBajasHistoClinica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrBajasHistoClinicaActionPerformed(evt);
            }
        });
        jpOpcion.add(jrBajasHistoClinica, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, -1));

        jPanelFondo.add(jpOpcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 650, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarPaciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPaciActionPerformed
        // TODO add your handling code here:
        if (!txtDniPaci.getText().isEmpty()) {
            buscPorDni();
        } else {
            JOptionPane.showMessageDialog(null, "Favor de ingresar un DNI:...");
            txtDniPaci.requestFocus();
        }
    }//GEN-LAST:event_btnBuscarPaciActionPerformed

    private void btnBuscarHistoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarHistoActionPerformed
        // TODO add your handling code here:
        if (!txtNomHisto.getText().isEmpty()) {
            buscPorNombre();
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingesar un nombre:...");
            txtNomHisto.requestFocus();
        }
    }//GEN-LAST:event_btnBuscarHistoActionPerformed

    private void txtNomHistoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomHistoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
        if (txtNomHisto.getText().length() >= 8) {
            JOptionPane.showMessageDialog(null, "Máximo 8 caracteres...");
            evt.consume();
        }
    }//GEN-LAST:event_txtNomHistoKeyTyped

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        // TODO add your handling code here:
        int opcion;
        if (!txtNomHisto.getText().isEmpty() && !txtNomPaci.getText().isEmpty()) {
            if (histoSelec == null) {
                opcion = JOptionPane.showConfirmDialog(null, "¿Confirma el alta del registro?", "ALTAS HISTORIA CLINICA", JOptionPane.OK_CANCEL_OPTION);
                if (opcion == 0) {
                    inserHisto();
                    limpiarCampos();
                } else {
                    JOptionPane.showMessageDialog(null, "No se realizo ningun alta de registro...");
                    limpiarCampos();
                }

            } else {
                opcion = JOptionPane.showConfirmDialog(null, "¿Confirma la edición del registro?", "EDITAR HISTORIA CLINICA", JOptionPane.OK_CANCEL_OPTION);
                if (opcion == 0) {
                    editHisto();
                    limpiarCampos();
                } else {
                    JOptionPane.showMessageDialog(null, "No se realizo ninguna edición de registro...");
                    limpiarCampos();
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Faltan datos cargar...");
        }
    }//GEN-LAST:event_btnCargarActionPerformed

    private void cmbMedicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbMedicosMouseClicked
        // TODO add your handling code here:
        mediSelec = (Medico) cmbMedicos.getSelectedItem();

    }//GEN-LAST:event_cmbMedicosMouseClicked

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        limpiarCampos();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void txtDniPaciKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniPaciKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
        if (txtDniPaci.getText().length() >= 8) {
            JOptionPane.showMessageDialog(null, "Maximo ocho caracteres....");
        }

    }//GEN-LAST:event_txtDniPaciKeyTyped

    private void txtApePaciKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApePaciKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApePaciKeyTyped

    private void btnPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPacientesActionPerformed
        // TODO add your handling code here:
        frmPacientes fPaci = new frmPacientes();
        frmMenuPrincipal.escritorio.add(fPaci);
        fPaci.toFront();
        fPaci.setVisible(true);
        this.dispose(); //cierra el formulario frmHistoClinicas
    }//GEN-LAST:event_btnPacientesActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        if (!txtIdHisto.getText().isEmpty() && !txtNomHisto.getText().isEmpty()) {
            int opcion = JOptionPane.showConfirmDialog(null, "¿Confirma la baja del registro?", "BAJAS HISTORIA CLINICA", JOptionPane.OK_CANCEL_OPTION);
            if (opcion == 0) {
                bajaHisto();
                limpiarCampos();
            } else {
                JOptionPane.showMessageDialog(null, "No se realizo ninguna baja...");
                limpiarCampos();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Faltan datos completar...");

        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jrNuevaHistoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrNuevaHistoMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jrNuevaHistoMouseClicked

    private void jrEditHistoClinicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrEditHistoClinicaActionPerformed
        // TODO add your handling code here:
        if (jrEditHistoClinica.isSelected()) {
            editarHistoriaClinica();
        }
    }//GEN-LAST:event_jrEditHistoClinicaActionPerformed

    private void jrBajasHistoClinicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrBajasHistoClinicaMouseClicked
        // TODO add your handling code here:


    }//GEN-LAST:event_jrBajasHistoClinicaMouseClicked

    private void jrEditHistoClinicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrEditHistoClinicaMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jrEditHistoClinicaMouseClicked

    private void jrNuevaHistoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrNuevaHistoActionPerformed
        // TODO add your handling code here:
        if (jrNuevaHisto.isSelected()) {
            nuevaHistoriaClinica();
        }
    }//GEN-LAST:event_jrNuevaHistoActionPerformed

    private void jrBajasHistoClinicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrBajasHistoClinicaActionPerformed
        // TODO add your handling code here:
        if (jrBajasHistoClinica.isSelected()) {
            bajasHistoriaClinica();
        }
    }//GEN-LAST:event_jrBajasHistoClinicaActionPerformed

    private void cmbMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMedicosActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_cmbMedicosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarHisto;
    private javax.swing.JButton btnBuscarPaci;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnPacientes;
    private javax.swing.JComboBox<Medico> cmbMedicos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JPanel jPanelHistoClinica;
    private javax.swing.JPanel jPanelPaci;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlFecha;
    private javax.swing.JPanel jpOpcion;
    private javax.swing.JRadioButton jrBajasHistoClinica;
    private javax.swing.JRadioButton jrEditHistoClinica;
    private javax.swing.JRadioButton jrNuevaHisto;
    private javax.swing.JTextField txtApePaci;
    private javax.swing.JTextField txtDniPaci;
    private javax.swing.JTextField txtFechaHisto;
    private javax.swing.JTextField txtIdHisto;
    private javax.swing.JTextField txtIdPaci;
    private javax.swing.JTextField txtNomHisto;
    private javax.swing.JTextField txtNomPaci;
    private javax.swing.JTextArea txtTratHisto;
    // End of variables declaration//GEN-END:variables

    //metodo insertar Historia Clinica
    private void inserHisto() {
        String vNomHisto = txtNomHisto.getText();
        String vTratHisto = txtTratHisto.getText();
        int vIdPaci = Integer.parseInt(txtIdPaci.getText());
        //datosMedi = (Medico) mediData.listarMedi();
        datosMedico();
        //creo el objecto
        HistoriaClinica histoClinica = new HistoriaClinica(vFecha, vNomHisto, paciSelec, datosMedi, vTratHisto, vFecha, true);
        //llamo al metodo insertarHistoriaClinica
        histoData.insertarHistoClinica(histoClinica);
    }

    //metodo editar HistoriaClinica a traves de un objecto
    private void editHisto() {
        int vIdHisto = Integer.parseInt(txtIdHisto.getText());
        String vNomHisto = txtNomHisto.getText();
        LocalDate vFecha = LocalDate.parse(txtFechaHisto.getText());
        int vIdPaci = Integer.parseInt(txtIdPaci.getText());
        String vTratHisto = txtTratHisto.getText();
        //creo el objecto 
        HistoriaClinica hclinica = new HistoriaClinica(vIdHisto, vFecha, vNomHisto, histoSelec.getPaciente(), mediSelec, vTratHisto, vFecha, true);
        histoData.editarHistoClinica(hclinica);

    }

    //metodo buscar por DNI
    private void buscPorDni() {
        String vDni = txtDniPaci.getText();
        paciSelec = paciData.buscarPorDni(vDni);
        histoSelec = histoData.buscarPoNombre(vDni);
        if (histoSelec != null) {
            JOptionPane.showMessageDialog(null, "El paciente ya posee una historia clinica....");
            limpiarCampos();
        } else {
            if (paciSelec != null) {
                txtIdPaci.setText(String.valueOf(paciSelec.getIdPaci()));
                txtApePaci.setText(paciSelec.getApellidoPaci());
                txtNomPaci.setText(paciSelec.getNombresPaci());
                txtNomHisto.setText(paciSelec.getDniPaci());
            } else {
                JOptionPane.showMessageDialog(null, "No existe ningún paciente con ese DNI..." + vDni);
                txtDniPaci.setText("");
                txtDniPaci.requestFocus();
                limpiarCampos();
            }
        }

    }

    //metodo cargar combo Medicos
    private void cargarComboMedi() {
        listarMedicos = (ArrayList) mediData.listarMedi();
        if (listarMedicos != null) {
            for (Medico listar : listarMedicos) {
                cmbMedicos.addItem(listar);
            }
        }
    }

    private void datosMedico() {
        listaMedico = (ArrayList) mediData.listarMedi();
        for (Medico lista : listaMedico) {
            datosMedi = lista;
        }
    }

    //buscar historia clinica por nombre
    private void buscPorNombre() {
        String vNom = txtNomHisto.getText();
        int vIdPaci;
        histoSelec = histoData.buscarPoNombre(vNom);
        if (histoSelec != null) {
            txtIdHisto.setText(String.valueOf(histoSelec.getIdHist()));
            txtFechaHisto.setText(String.valueOf(histoSelec.getFechaHist()));
            txtTratHisto.setText(histoSelec.getTratamientoHist());
            //txtIdPaci.setText(String.valueOf(histoSelec.getPaciente().getIdPaci()));
            //datos del paciente
            vIdPaci = histoSelec.getPaciente().getIdPaci();
            paciSelec = paciData.buscarPorId(vIdPaci);
            txtDniPaci.setText(histoSelec.getPaciente().getDniPaci());
            txtIdPaci.setText(String.valueOf((histoSelec.getPaciente().getIdPaci())));
            txtApePaci.setText(histoSelec.getPaciente().getApellidoPaci());
            txtNomPaci.setText(histoSelec.getPaciente().getNombresPaci());
        } else {
            JOptionPane.showMessageDialog(null, "No existe ninguna historia clinica con ese nombre.." + vNom);
            limpiarCampos();
        }
    }

    //metodo dar formato a la fecha
    private void formatoFecha() {
        DateTimeFormatter forma = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formaFecha = vFecha.format(forma);
        jlFecha.setText(formaFecha);
    }

    //metodo limpiar campos
    private void limpiarCampos() {
        txtIdPaci.setText("");
        txtDniPaci.setText("");
        txtNomPaci.setText("");
        txtApePaci.setText("");
        txtIdHisto.setText("");
        txtFechaHisto.setText("");
        txtNomHisto.setText("");
        txtTratHisto.setText("");
        txtDniPaci.requestFocus();
        jrNuevaHisto.setSelected(false);
        jrEditHistoClinica.setSelected(false);
        jrBajasHistoClinica.setSelected(false);
    }

    //metodo dar de baja Historia clinica a traves del id
    private void bajaHisto() {
        int vId = Integer.parseInt(txtIdHisto.getText());
        histoData.bajasHistoriaClinica(vId);
    }

    //metodo habilitar campos para nueva Historia clinica
    private void nuevaHistoriaClinica() {
        txtDniPaci.setEnabled(true);
        btnBuscarPaci.setEnabled(true);
        btnBuscarHisto.setEnabled(true); //habilita el boton para buscar si existe la historia clinica
        btnCargar.setEnabled(true);
        btnEliminar.setEnabled(false);
        txtNomHisto.setEnabled(true);
        btnBuscarHisto.setEnabled(false);
        jrEditHistoClinica.setSelected(false);
        jrBajasHistoClinica.setSelected(false);
        txtDniPaci.setText("");
        txtApePaci.setText("");
        txtNomPaci.setText("");
        txtNomHisto.setText("");
        txtTratHisto.setText("");
        txtIdPaci.setText("");
        txtIdHisto.setText("");
        txtFechaHisto.setText("");
        txtDniPaci.requestFocus();

    }

    //meetodo habilitar campos para editar Hitoria clinica
    private void editarHistoriaClinica() {
        txtDniPaci.setEnabled(false);
        txtNomHisto.setEnabled(true);
        btnBuscarPaci.setEnabled(false);
        btnBuscarHisto.setEnabled(true);
        btnCargar.setEnabled(true);
        btnEliminar.setEnabled(false);
        txtNomHisto.requestFocus();
        jrNuevaHisto.setSelected(false);
        jrBajasHistoClinica.setSelected(false);
        txtDniPaci.setText("");
        txtApePaci.setText("");
        txtNomPaci.setText("");
        txtNomHisto.setText("");
        txtTratHisto.setText("");
        txtIdPaci.setText("");
        txtIdHisto.setText("");
        txtFechaHisto.setText("");
        txtNomHisto.requestFocus();
    }

    //metodo habilitar campos para dar de baja Historia clinica
    private void bajasHistoriaClinica() {
        txtDniPaci.setEnabled(false);
        txtNomHisto.setEnabled(true);
        btnBuscarPaci.setEnabled(false);
        btnBuscarHisto.setEnabled(true);
        txtNomHisto.requestFocus();
        btnEliminar.setEnabled(true);
        btnCargar.setEnabled(false);
        jrNuevaHisto.setSelected(false);
        jrEditHistoClinica.setSelected(false);
        txtDniPaci.setText("");
        txtApePaci.setText("");
        txtNomPaci.setText("");
        txtNomHisto.setText("");
        txtTratHisto.setText("");
        txtIdPaci.setText("");
        txtIdHisto.setText("");
        txtFechaHisto.setText("");
        txtNomHisto.requestFocus();

    }
}
