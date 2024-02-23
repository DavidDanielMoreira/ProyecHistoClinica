package proyechistoclinica.vistas;

import proyechistoclinica.entidades.*;
import proyechistoclinica.accesoADatos.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class frmEspecialidades extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();
    private EspecialidadData espeData = new EspecialidadData();
    private ArrayList<Especialidad> listarEspe;
    public frmEspecialidades() {
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
        txtEspec = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtEspec = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnCargar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Especialidades Medicas");

        jPanelFondo.setBackground(new java.awt.Color(0, 51, 51));
        jPanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelDatos.setBackground(new java.awt.Color(0, 51, 51));
        jPanelDatos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanelDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Especialidad:");
        jPanelDatos.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        jPanelDatos.add(txtEspec, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 240, -1));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyechistoclinica/imagen/buscar.png"))); // NOI18N
        jPanelDatos.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 35, 100, -1));

        jtEspec.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id", "Especialidad"
            }
        ));
        jScrollPane1.setViewportView(jtEspec);
        if (jtEspec.getColumnModel().getColumnCount() > 0) {
            jtEspec.getColumnModel().getColumn(0).setMinWidth(30);
            jtEspec.getColumnModel().getColumn(0).setPreferredWidth(30);
            jtEspec.getColumnModel().getColumn(0).setMaxWidth(30);
            jtEspec.getColumnModel().getColumn(1).setMinWidth(200);
            jtEspec.getColumnModel().getColumn(1).setPreferredWidth(200);
            jtEspec.getColumnModel().getColumn(1).setMaxWidth(200);
        }

        jPanelDatos.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 350, 120));

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyechistoclinica/imagen/nuevo.png"))); // NOI18N
        jPanelDatos.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 80, -1));

        btnCargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyechistoclinica/imagen/guardar.png"))); // NOI18N
        jPanelDatos.add(btnCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 80, -1));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyechistoclinica/imagen/eliminar.png"))); // NOI18N
        jPanelDatos.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 80, -1));

        btnCerrar.setBackground(new java.awt.Color(255, 0, 0));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyechistoclinica/imagen/cerrar.png"))); // NOI18N
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanelDatos.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 80, -1));

        jPanelFondo.add(jPanelDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 390, 270));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelDatos;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtEspec;
    private javax.swing.JTextField txtEspec;
    // End of variables declaration//GEN-END:variables
    //metodo crear cabecera
    private void crearCabecera() {
        modelo.addColumn("Id");
        modelo.addColumn("Especialidad");
        jtEspec.setModel(modelo);

        //ocultar una columna de la tabla
        jtEspec.getColumnModel().getColumn(0).setMinWidth(0);
        jtEspec.getColumnModel().getColumn(0).setMaxWidth(0);

        //establecer ancho de la columnas de la tabla
        jtEspec.getColumnModel().getColumn(0).setPreferredWidth(30);
        jtEspec.getColumnModel().getColumn(1).setPreferredWidth(200);
        
        //establecer alto de las columnas de la tabla
        jtEspec.getTableHeader().setPreferredSize(new java.awt.Dimension(0,30));
    }
    
    //metodo cargar tabla
    private void cargarTabla(){
        listarEspe = (ArrayList) espeData.listarEspe();
        if(listarEspe!=null){
           for(Especialidad listar: listarEspe){
               modelo.addRow(new Object[]{listar.getIdEspe(),listar.getNombreEspe()});
           }
        }
    }

}
