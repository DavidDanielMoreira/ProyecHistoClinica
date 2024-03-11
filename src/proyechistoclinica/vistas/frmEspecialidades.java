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

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Especialidad:");
        jPanelDatos.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 25, -1, -1));

        txtEspec.setBackground(new java.awt.Color(99, 99, 99));
        txtEspec.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        txtEspec.setForeground(new java.awt.Color(255, 255, 255));
        jPanelDatos.add(txtEspec, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 300, 25));

        btnBuscar.setBackground(new java.awt.Color(16, 41, 153));
        btnBuscar.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyechistoclinica/imagen/lupaColor.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        jPanelDatos.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 100, 40));

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

        jPanelDatos.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 380, 120));

        btnNuevo.setBackground(new java.awt.Color(16, 41, 153));
        btnNuevo.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyechistoclinica/imagen/nuevMarron.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        jPanelDatos.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 110, 40));

        btnCargar.setBackground(new java.awt.Color(16, 41, 110));
        btnCargar.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnCargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyechistoclinica/imagen/disquMarron.png"))); // NOI18N
        btnCargar.setText("Guardar");
        jPanelDatos.add(btnCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 110, 40));

        btnEliminar.setBackground(new java.awt.Color(16, 41, 110));
        btnEliminar.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyechistoclinica/imagen/elimiMarron.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        jPanelDatos.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 110, 40));

        btnCerrar.setBackground(new java.awt.Color(16, 41, 153));
        btnCerrar.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyechistoclinica/imagen/cerraMarron.png"))); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.setToolTipText("");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanelDatos.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 110, 40));

        jPanelFondo.add(jPanelDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 550, 270));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
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
