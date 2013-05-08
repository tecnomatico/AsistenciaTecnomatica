/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.freelancersteam.www.java.tomafoto.vistas.asistencia;

import com.freelancersteam.www.java.tomafoto.dominio.Asistencia;
import com.freelancersteam.www.java.tomafoto.dominio.Empleado;
import com.freelancersteam.www.java.tomafoto.dominio.dao.imp.AsistenciaDaoImp;
import com.freelancersteam.www.java.tomafoto.dominio.dao.imp.EmpleadoDaoImp;
import com.freelancersteam.www.java.tomafoto.estudiandojmf.mensajero;
import com.freelancersteam.www.java.tomafoto.util.FechaUtil;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Leo
 */
public class verAsistencia extends javax.swing.JDialog {

    private int idAsistencia;
    private int legajo;
    Asistencia a;  
    public verAsistencia(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(this);
        this.setVisible(true);
        
    }
    public verAsistencia(java.awt.Frame parent, boolean modal,int idAsistencia,int legajo) {
        super(parent, modal);
        initComponents();
        this.idAsistencia = idAsistencia;
        this.legajo = legajo;
        initComponentesVentana();
        this.setLocationRelativeTo(this);
        this.setVisible(true);
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupCorrecto = new javax.swing.ButtonGroup();
        panel1 = new org.edisoncor.gui.panel.Panel();
        labelMetric1 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric2 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric3 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric4 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric5 = new org.edisoncor.gui.label.LabelMetric();
        cmbEstado = new org.edisoncor.gui.comboBox.ComboBoxRound();
        btnGuardar = new org.edisoncor.gui.button.ButtonIpod();
        btnCancelar = new org.edisoncor.gui.button.ButtonIpod();
        btnReporte = new org.edisoncor.gui.button.ButtonIpod();
        txtEmpleado = new javax.swing.JLabel();
        txtFecha = new javax.swing.JLabel();
        txtHora = new javax.swing.JLabel();
        txtLegajo = new javax.swing.JLabel();
        lblFotoAsistencia = new javax.swing.JLabel();
        lblFotoAlta = new javax.swing.JLabel();
        chkEditar = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        labelMetric6 = new org.edisoncor.gui.label.LabelMetric();
        txtComentario = new org.edisoncor.gui.textField.TextFieldRoundIcon();
        rbtnSi = new javax.swing.JRadioButton();
        rbtnNo = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ASISTENCIA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Calibri", 1, 24), new java.awt.Color(204, 204, 204))); // NOI18N
        panel1.setForeground(new java.awt.Color(204, 204, 204));

        labelMetric1.setText("Legajo");
        labelMetric1.setFont(new java.awt.Font("Arial", 1, 16));

        labelMetric2.setText("Empleado");
        labelMetric2.setFont(new java.awt.Font("Arial", 1, 16));

        labelMetric3.setText("Fecha");
        labelMetric3.setFont(new java.awt.Font("Arial", 1, 16));

        labelMetric4.setText("Hora");
        labelMetric4.setFont(new java.awt.Font("Arial", 1, 16));

        labelMetric5.setText("Estado");
        labelMetric5.setFont(new java.awt.Font("Arial", 1, 16));

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ENTRADA", "SALIDA" }));
        cmbEstado.setEnabled(false);

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/freelancersteam/www/java/tomafoto/images/GUARDAR.jpg"))); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.setAnimacion(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/freelancersteam/www/java/tomafoto/images/Atras.png"))); // NOI18N
        btnCancelar.setText("ATRAS");
        btnCancelar.setAnimacion(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/freelancersteam/www/java/tomafoto/images/Informe.jpg"))); // NOI18N
        btnReporte.setText("REPORTE");
        btnReporte.setAnimacion(false);
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });

        txtEmpleado.setFont(new java.awt.Font("Tahoma", 1, 14));
        txtEmpleado.setForeground(new java.awt.Color(204, 204, 204));

        txtFecha.setFont(new java.awt.Font("Tahoma", 1, 14));
        txtFecha.setForeground(new java.awt.Color(204, 204, 204));

        txtHora.setFont(new java.awt.Font("Tahoma", 1, 14));
        txtHora.setForeground(new java.awt.Color(204, 204, 204));

        txtLegajo.setFont(new java.awt.Font("Tahoma", 1, 14));
        txtLegajo.setForeground(new java.awt.Color(204, 204, 204));

        lblFotoAsistencia.setForeground(new java.awt.Color(204, 204, 204));
        lblFotoAsistencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFotoAsistencia.setText("Foto de Asistencia");
        lblFotoAsistencia.setToolTipText("");
        lblFotoAsistencia.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        lblFotoAlta.setForeground(new java.awt.Color(204, 204, 204));
        lblFotoAlta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFotoAlta.setText("Foto de Alta");
        lblFotoAlta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        chkEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkEditarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Modificar Estado");

        labelMetric6.setText("Comentario");
        labelMetric6.setFont(new java.awt.Font("Arial", 1, 16));

        rbtnSi.setBackground(new java.awt.Color(0, 0, 0));
        btnGroupCorrecto.add(rbtnSi);
        rbtnSi.setFont(new java.awt.Font("Tahoma", 1, 12));
        rbtnSi.setForeground(new java.awt.Color(204, 204, 204));
        rbtnSi.setText("SI");

        rbtnNo.setBackground(new java.awt.Color(0, 0, 0));
        btnGroupCorrecto.add(rbtnNo);
        rbtnNo.setFont(new java.awt.Font("Tahoma", 1, 12));
        rbtnNo.setForeground(new java.awt.Color(204, 204, 204));
        rbtnNo.setText("No");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Coinciden?");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Foto de Alta");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Foto de Asistencia");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(labelMetric5, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(labelMetric1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelMetric2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelMetric6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelMetric3, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtLegajo)
                                        .addGroup(panel1Layout.createSequentialGroup()
                                            .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(8, 8, 8)
                                            .addComponent(chkEditar)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel1))
                                        .addGroup(panel1Layout.createSequentialGroup()
                                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(panel1Layout.createSequentialGroup()
                                                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(30, 30, 30)
                                                    .addComponent(labelMetric4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(txtEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(27, 27, 27)))
                                    .addComponent(txtComentario, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jLabel4))))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFotoAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(99, 99, 99)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(lblFotoAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2))
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rbtnSi)
                                            .addComponent(rbtnNo))))))))
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelMetric5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(chkEditar))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMetric1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMetric2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelMetric3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtHora, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelMetric4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMetric6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComentario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(23, 23, 23)
                        .addComponent(rbtnNo)
                        .addGap(17, 17, 17)
                        .addComponent(rbtnSi))
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblFotoAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblFotoAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void chkEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkEditarActionPerformed
       if (chkEditar.isSelected()) {
           cmbEstado.setEnabled(true);
           btnGuardar.setEnabled(true);
           btnReporte.setEnabled(false);
    }else{
            cmbEstado.setEnabled(false);
       }
}//GEN-LAST:event_chkEditarActionPerformed

private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
      this.dispose();
}//GEN-LAST:event_btnCancelarActionPerformed

private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
     
      a.setEstado(cmbEstado.getSelectedItem().toString());
      if (rbtnSi.isSelected()) {
          a.setCorrecto(true);
      } else {
          a.setCorrecto(true);

      }
      a.setObservacion(txtComentario.getText());
      
      new AsistenciaDaoImp().upDateAsistencia(a);
      mensajero.mensajeInformacionAtualizacionOK(this);

}//GEN-LAST:event_btnGuardarActionPerformed

private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_btnReporteActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(verAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(verAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(verAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(verAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                verAsistencia dialog = new verAsistencia(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonIpod btnCancelar;
    private javax.swing.ButtonGroup btnGroupCorrecto;
    private org.edisoncor.gui.button.ButtonIpod btnGuardar;
    private org.edisoncor.gui.button.ButtonIpod btnReporte;
    private javax.swing.JCheckBox chkEditar;
    private org.edisoncor.gui.comboBox.ComboBoxRound cmbEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private org.edisoncor.gui.label.LabelMetric labelMetric1;
    private org.edisoncor.gui.label.LabelMetric labelMetric2;
    private org.edisoncor.gui.label.LabelMetric labelMetric3;
    private org.edisoncor.gui.label.LabelMetric labelMetric4;
    private org.edisoncor.gui.label.LabelMetric labelMetric5;
    private org.edisoncor.gui.label.LabelMetric labelMetric6;
    private javax.swing.JLabel lblFotoAlta;
    private javax.swing.JLabel lblFotoAsistencia;
    private org.edisoncor.gui.panel.Panel panel1;
    private javax.swing.JRadioButton rbtnNo;
    private javax.swing.JRadioButton rbtnSi;
    private org.edisoncor.gui.textField.TextFieldRoundIcon txtComentario;
    private javax.swing.JLabel txtEmpleado;
    private javax.swing.JLabel txtFecha;
    private javax.swing.JLabel txtHora;
    private javax.swing.JLabel txtLegajo;
    // End of variables declaration//GEN-END:variables

    private void initComponentesVentana() {
         a = new AsistenciaDaoImp().getAsistencia(idAsistencia);
        Empleado e = new EmpleadoDaoImp().getEmpleado(legajo);
        cmbEstado.setSelectedItem(a.getEstado());
        txtEmpleado.setText(e.getApellido()+" "+e.getNombre());
        txtFecha.setText(FechaUtil.getDateDDMMAAAA(a.getFecha()));
        txtHora.setText(FechaUtil.getHora(a.getHora()));
        txtLegajo.setText(String.valueOf(e.getLegajo()));
                //imagen de asistencia

        ImageIcon img = new ImageIcon(a.getImagen());
        adaptarTamaño(lblFotoAsistencia, img.getImage());
        //imagen de alta empleado
        // esta un try xq puede no tener cargado una foto el empleado
        try{
        ImageIcon img2 = new ImageIcon(e.getImagen());
        adaptarTamaño(lblFotoAlta, img2.getImage());
        
        }catch(java.lang.NullPointerException enull){
            lblFotoAlta.setText("No Disponible");
        }
        if (a.getCorrecto()) {
            rbtnSi.setSelected(true);
        } else {
            rbtnNo.setSelected(true);
        }
        //botones
        btnGuardar.setEnabled(false);
        btnReporte.setEnabled(true);
        btnCancelar.setEnabled(true);
    }
    private void adaptarTamaño (JLabel label , Image img){
         Icon iconoAdaptado= new ImageIcon(img.getScaledInstance(label.getWidth(),label.getHeight(),Image.SCALE_DEFAULT)); 
          label.setIcon(iconoAdaptado);//  si manda en pantalla
     }
}
