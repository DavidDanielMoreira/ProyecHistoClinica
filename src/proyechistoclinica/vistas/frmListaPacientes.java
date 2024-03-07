package proyechistoclinica.vistas;

import java.awt.Color;
import java.awt.Font;
import proyechistoclinica.entidades.*;
import proyechistoclinica.accesoADatos.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmListaPacientes extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();
    private PacienteData paciData = new PacienteData();
    private ArrayList<Paciente> listarPaci;

    public frmListaPacientes() {
        initComponents();
        crearCabecera();
        cargarTabla();
        totalActivos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        jPanelDatos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPacientes = new javax.swing.JTable();
        btnCerrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApe = new javax.swing.JTextField();
        jrDni = new javax.swing.JRadioButton();
        jrApe = new javax.swing.JRadioButton();

        setClosable(true);
        setTitle("Listados Pacientes");
        setPreferredSize(new java.awt.Dimension(700, 450));

        jPanelFondo.setBackground(new java.awt.Color(0, 51, 51));
        jPanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelDatos.setBackground(new java.awt.Color(0, 51, 51));
        jPanelDatos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanelDatos.setPreferredSize(new java.awt.Dimension(550, 370));
        jPanelDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingrese el Dni:");
        jPanelDatos.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        txtDni.setEnabled(false);
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDniKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });
        jPanelDatos.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 250, 25));

        jtPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Apellido", "Nombres", "Domicilio", "DNI", "Télefono"
            }
        ));
        jScrollPane1.setViewportView(jtPacientes);
        if (jtPacientes.getColumnModel().getColumnCount() > 0) {
            jtPacientes.getColumnModel().getColumn(0).setMinWidth(30);
            jtPacientes.getColumnModel().getColumn(0).setPreferredWidth(30);
            jtPacientes.getColumnModel().getColumn(0).setMaxWidth(30);
            jtPacientes.getColumnModel().getColumn(1).setMinWidth(60);
            jtPacientes.getColumnModel().getColumn(1).setPreferredWidth(60);
            jtPacientes.getColumnModel().getColumn(1).setMaxWidth(60);
            jtPacientes.getColumnModel().getColumn(2).setMinWidth(100);
            jtPacientes.getColumnModel().getColumn(2).setPreferredWidth(100);
            jtPacientes.getColumnModel().getColumn(2).setMaxWidth(100);
            jtPacientes.getColumnModel().getColumn(3).setMinWidth(250);
            jtPacientes.getColumnModel().getColumn(3).setPreferredWidth(250);
            jtPacientes.getColumnModel().getColumn(3).setMaxWidth(250);
            jtPacientes.getColumnModel().getColumn(4).setMinWidth(60);
            jtPacientes.getColumnModel().getColumn(4).setPreferredWidth(60);
            jtPacientes.getColumnModel().getColumn(4).setMaxWidth(60);
            jtPacientes.getColumnModel().getColumn(5).setMinWidth(100);
            jtPacientes.getColumnModel().getColumn(5).setPreferredWidth(100);
            jtPacientes.getColumnModel().getColumn(5).setMaxWidth(100);
        }

        jPanelDatos.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 600, 180));

        btnCerrar.setBackground(new java.awt.Color(240, 240, 240));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyechistoclinica/imagen/cerrar.png"))); // NOI18N
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanelDatos.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 330, 540, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Total de pacientes activos:");
        jPanelDatos.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, -1, -1));
        jPanelDatos.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 295, 60, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ingrese el apellido:");
        jPanelDatos.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, -1, -1));

        txtApe.setEnabled(false);
        txtApe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApeKeyTyped(evt);
            }
        });
        jPanelDatos.add(txtApe, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 250, 25));

        jrDni.setBackground(new java.awt.Color(0, 51, 51));
        jrDni.setForeground(new java.awt.Color(255, 255, 255));
        jrDni.setText("Buscar por DNI:");
        jrDni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrDniMouseClicked(evt);
            }
        });
        jPanelDatos.add(jrDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jrApe.setBackground(new java.awt.Color(0, 51, 51));
        jrApe.setForeground(new java.awt.Color(255, 255, 255));
        jrApe.setText("Buscar por apellido:");
        jrApe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrApeMouseClicked(evt);
            }
        });
        jPanelDatos.add(jrApe, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        jPanelFondo.add(jPanelDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 640, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
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

    private void txtDniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyReleased
        // TODO add your handling code here:
        limpiarTabla();
        buscPaciPorDni();
    }//GEN-LAST:event_txtDniKeyReleased

    private void jrDniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrDniMouseClicked
        // TODO add your handling code here:
        if (jrDni.isSelected()) {
            txtDni.setEnabled(true);
            txtDni.requestFocus();
            txtApe.setEnabled(false);
            jrApe.setSelected(false);
            txtApe.setText("");
            limpiarTabla();
            cargarTabla();
        }
    }//GEN-LAST:event_jrDniMouseClicked

    private void jrApeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrApeMouseClicked
        // TODO add your handling code here:
        if (jrApe.isSelected()) {
            txtApe.setEnabled(true);
            txtApe.requestFocus();
            txtDni.setEnabled(false);
            jrDni.setSelected(false);
            txtDni.setText("");
            limpiarTabla();
            cargarTabla();
        }
    }//GEN-LAST:event_jrApeMouseClicked

    private void txtApeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApeKeyReleased
        // TODO add your handling code here:
        limpiarTabla();
        buscPorApe();
    }//GEN-LAST:event_txtApeKeyReleased

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
        
        if(txtDni.getText().length()>=8){
            JOptionPane.showMessageDialog(null,"Maximo 8 caractres...");
            evt.consume();
        }
    }//GEN-LAST:event_txtDniKeyTyped

    private void txtApeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApeKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtApeKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanelDatos;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jrApe;
    private javax.swing.JRadioButton jrDni;
    private javax.swing.JTable jtPacientes;
    private javax.swing.JTextField txtApe;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
    //metodo crear cabecera
    private void crearCabecera() {
        modelo.addColumn("Id");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombres");
        modelo.addColumn("Domicilio");
        modelo.addColumn("DNI");
        modelo.addColumn("Télefono");
        jtPacientes.setModel(modelo);
        //establecer ancho de las columnas de la tabla
        jtPacientes.getColumnModel().getColumn(0).setPreferredWidth(40);
        jtPacientes.getColumnModel().getColumn(1).setPreferredWidth(90);
        jtPacientes.getColumnModel().getColumn(2).setPreferredWidth(120);
        jtPacientes.getColumnModel().getColumn(3).setPreferredWidth(210);
        jtPacientes.getColumnModel().getColumn(4).setPreferredWidth(90);
        jtPacientes.getColumnModel().getColumn(5).setPreferredWidth(150);

        //establecer alto de la cabecera de la tabla
        jtPacientes.getTableHeader().setPreferredSize(new java.awt.Dimension(0, 25));
        jtPacientes.getTableHeader().setFont(new Font("Arial Narrow",1,16)); //cambiar tipo fuente
        jtPacientes.getTableHeader().setBackground(Color.green); //color de fondo de la cabecera
        jtPacientes.getTableHeader().setForeground(Color.BLUE); //color de la letra cabecera
        
    }

    //metodo cargar tabla
    private void cargarTabla() {
        listarPaci = (ArrayList) paciData.listarPacientes();
        if (listarPaci != null) {
            for (Paciente listar : listarPaci) {
                modelo.addRow(new Object[]{listar.getIdPaci(), listar.getApellidoPaci(), listar.getNombresPaci(), listar.getDomicilioPaci(), listar.getDniPaci(), listar.getTelefonoPaci()});
            }
        }
    }

    //metodo buscar paciente
    private void buscPaciPorDni() {
        for (Paciente buscPaci : listarPaci) {
            if (buscPaci.getDniPaci().startsWith(txtDni.getText())) {
                modelo.addRow(new Object[]{buscPaci.getIdPaci(), buscPaci.getApellidoPaci(), buscPaci.getNombresPaci(), buscPaci.getDomicilioPaci(), buscPaci.getDniPaci(),buscPaci.getTelefonoPaci()});
            }
        }
    }

    //metodo buscar Paciente por Apellido
    private void buscPorApe() {
        for (Paciente buscPaci : listarPaci) {
            if (buscPaci.getApellidoPaci().startsWith(txtApe.getText())) {
                modelo.addRow(new Object[]{buscPaci.getIdPaci(), buscPaci.getApellidoPaci(), buscPaci.getNombresPaci(), buscPaci.getDomicilioPaci(), buscPaci.getDniPaci(), buscPaci.getTelefonoPaci()});
            }
        }
    }

    //metodo limpiarTabla
    private void limpiarTabla() {
        int cFilas = jtPacientes.getRowCount() - 1;
        for (int f = cFilas; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

    private void totalActivos() {
        int cTotal = jtPacientes.getRowCount();
        txtTotal.setText(String.valueOf(cTotal));
    }
}
