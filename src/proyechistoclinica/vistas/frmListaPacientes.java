
package proyechistoclinica.vistas;

import proyechistoclinica.entidades.*;
import proyechistoclinica.accesoADatos.*;
import java.sql.*;
import java.util.ArrayList;
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

        setClosable(true);
        setTitle("Listados Pacientes");
        setPreferredSize(new java.awt.Dimension(650, 400));

        jPanelFondo.setBackground(new java.awt.Color(0, 51, 51));
        jPanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelDatos.setBackground(new java.awt.Color(0, 51, 51));
        jPanelDatos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanelDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingrese el Dni:");
        jPanelDatos.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDniKeyReleased(evt);
            }
        });
        jPanelDatos.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 540, -1));

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
        }

        jPanelDatos.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 540, 180));

        btnCerrar.setBackground(new java.awt.Color(255, 0, 0));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyechistoclinica/imagen/cerrar.png"))); // NOI18N
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanelDatos.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 540, -1));

        jLabel2.setText("Total de pacientes activos:");
        jPanelDatos.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, -1, -1));
        jPanelDatos.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 255, 60, -1));

        jPanelFondo.add(jPanelDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 580, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
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
         buscPaci();
    }//GEN-LAST:event_txtDniKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanelDatos;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtPacientes;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
    //metodo crear cabecera
    private void crearCabecera(){
        modelo.addColumn("Id");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombres");
        modelo.addColumn("Domicilio");
        modelo.addColumn("DNI");
        jtPacientes.setModel(modelo);
        //establecer ancho de las columnas de la tabla
        jtPacientes.getColumnModel().getColumn(0).setPreferredWidth(40);
        jtPacientes.getColumnModel().getColumn(1).setPreferredWidth(100);
        jtPacientes.getColumnModel().getColumn(2).setPreferredWidth(150);
        jtPacientes.getColumnModel().getColumn(3).setPreferredWidth(250);
        jtPacientes.getColumnModel().getColumn(4).setPreferredWidth(100);
        
        //establecer alto de la cabecera de la tabla
        jtPacientes.getTableHeader().setPreferredSize(new java.awt.Dimension(0,30));
    }
    
    //metodo cargar tabla
    private void cargarTabla(){
        listarPaci = (ArrayList) paciData.listarPacientes();
        if(listarPaci!=null){
            for(Paciente listar: listarPaci){
                modelo.addRow(new Object[]{listar.getIdPaci(),listar.getApellidoPaci(),listar.getNombresPaci(),listar.getDomicilioPaci(),listar.getDniPaci()});
            }
        }
    }
    
    //metodo buscar paciente
    private void buscPaci(){
        for(Paciente buscPaci: listarPaci){
            if(buscPaci.getDniPaci().startsWith(txtDni.getText())){
                modelo.addRow(new Object[]{buscPaci.getIdPaci(),buscPaci.getApellidoPaci(),buscPaci.getNombresPaci(),buscPaci.getDomicilioPaci(),buscPaci.getDniPaci()});
            }
        }
    }
    
    //metodo limpiarTabla
    private void limpiarTabla(){
        int cFilas = jtPacientes.getRowCount()-1;
        for(int f= cFilas; f>=0; f--){
            modelo.removeRow(f);
        }
    }
    
    private void totalActivos(){
        int cTotal = jtPacientes.getRowCount();
        txtTotal.setText(String.valueOf(cTotal));
    }
}
