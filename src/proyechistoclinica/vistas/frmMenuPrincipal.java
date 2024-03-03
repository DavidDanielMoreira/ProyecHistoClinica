
package proyechistoclinica.vistas;

 import javax.swing.ImageIcon;
public class frmMenuPrincipal extends javax.swing.JFrame {

    
    public frmMenuPrincipal() {
        initComponents();
        this.setSize(930,600);  //tamaño fijo
        this.setResizable(false);   //usuario no puede modificar el tamaño 
        this.setLocationRelativeTo(null); //centrado
        this.repaint();  //aplica los cambios
        //cambiar icono formulario
        setIconImage(new ImageIcon(getClass().getResource("/proyechistoclinica/imagen/logoForm.png")).getImage());
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");
        setPreferredSize(new java.awt.Dimension(900, 700));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 663, Short.MAX_VALUE)
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyechistoclinica/imagen/usuarios-alt.png"))); // NOI18N
        jMenu1.setText(" Pacientes");
        jMenu1.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N

        jMenu7.setText("Pacientes");
        jMenu7.setPreferredSize(new java.awt.Dimension(95, 25));

        jMenuItem1.setText("Mantenimiento");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem1);

        jMenuItem2.setText("Listado");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem2);

        jMenu1.add(jMenu7);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyechistoclinica/imagen/medicos.png"))); // NOI18N
        jMenu2.setText(" Médicos");
        jMenu2.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jMenu2.setPreferredSize(new java.awt.Dimension(95, 30));

        jMenuItem5.setText("Formulario");
        jMenuItem5.setPreferredSize(new java.awt.Dimension(80, 25));
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyechistoclinica/imagen/especialidad.png"))); // NOI18N
        jMenu3.setText(" Especialidades");
        jMenu3.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jMenu3.setPreferredSize(new java.awt.Dimension(130, 35));

        jMenuItem4.setText("Formulario");
        jMenuItem4.setPreferredSize(new java.awt.Dimension(95, 25));
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyechistoclinica/imagen/historiaClinica.png"))); // NOI18N
        jMenu4.setText(" Historias Clínicas");
        jMenu4.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N

        jMenuItem6.setText("Mantenimiento");
        jMenuItem6.setPreferredSize(new java.awt.Dimension(95, 25));
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuItem8.setText("Listado");
        jMenuItem8.setPreferredSize(new java.awt.Dimension(95, 25));
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyechistoclinica/imagen/informe.png"))); // NOI18N
        jMenu5.setText(" Informes");
        jMenu5.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N

        jMenuItem3.setText("Informes");
        jMenuItem3.setPreferredSize(new java.awt.Dimension(95, 25));
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem3);

        jMenuBar1.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyechistoclinica/imagen/recuperar.png"))); // NOI18N
        jMenu6.setText(" Recuperar");
        jMenu6.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N

        jMenuItem7.setText("Pacientes");
        jMenuItem7.setPreferredSize(new java.awt.Dimension(95, 25));
        jMenu6.add(jMenuItem7);

        jMenuBar1.add(jMenu6);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyechistoclinica/imagen/salir.png"))); // NOI18N
        jMenu8.setText(" Salir");
        jMenu8.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jMenu8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu8MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        frmPacientes fPaci = new frmPacientes();
        fPaci.setVisible(true);
        escritorio.add(fPaci);
        escritorio.moveToFront(fPaci);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        frmInformes fInf = new frmInformes();
        fInf.setVisible(true);
        escritorio.add(fInf);
        escritorio.moveToFront(fInf);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
         escritorio.removeAll();
         escritorio.repaint();
         frmEspecialidades fEspec = new frmEspecialidades();
         fEspec.setVisible(true);
         escritorio.add(fEspec);
         escritorio.moveToFront(fEspec);
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
         escritorio.removeAll();
         escritorio.repaint();
         frmMedicos fMedi = new frmMedicos();
         fMedi.setVisible(true);
         escritorio.add(fMedi);
         escritorio.moveToFront(fMedi);
         
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        frmHistoClinicas fHisto = new frmHistoClinicas();
        fHisto.setVisible(true);
        escritorio.add(fHisto);
        escritorio.moveToFront(fHisto);
        
        
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        frmListaPacientes fList = new frmListaPacientes();
        fList.setVisible(true);
        escritorio.add(fList);
        escritorio.moveToFront(fList);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenu8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu8MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenu8MouseClicked

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        frmListaHistoClinicas  fLisHisto = new frmListaHistoClinicas();
        fLisHisto.setVisible(true);
        escritorio.add(fLisHisto);
        escritorio.moveToFront(fLisHisto);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    // End of variables declaration//GEN-END:variables
}
