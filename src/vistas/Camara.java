/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Camara.java
 *
 * Created on 11/06/2010, 11:53:04 PM
 */

package vistas;

/**
 *
 * @author Cmop
 */
import Util.DetalleReporte;
import Util.FechaUtil;
import Util.ReporteAsitenciaJRDataSource;
import Util.TablaUtil;

import dominio.Asistencia;
import dominio.Empleado;
import dominio.OrdenarAsistenciaPorId;
import dominio.dao.AsistenciaDao;
import dominio.dao.EmpleadoDao;
import dominio.dao.imp.AsistenciaDaoImp;
import dominio.dao.imp.EmpleadoDaoImp;
import estudiandojmf.eventos;
import estudiandojmf.jDispositivos;
import estudiandojmf.miPlayer;
import java.awt.Image;
import java.awt.image.RenderedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.media.Player;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.swing.JRViewer;


public class Camara extends javax.swing.JFrame
{Set<Asistencia> conjunto;
    
    private Player p1;
    private DefaultTableModel modelo;
    /** Creates new form Camara */
    public Camara(){
        initComponents();
        initComponents2();
 
    }

    public Player getPlayer()
    {
        return p1;
    }
    public void setPlayer(Player pin)
    {
        p1=pin;
    }
    public JPanel getCamara()
    {
        return panelCam;
    }

    private void initComponents2()
    {
        //registramos los Oyentes de eventos
        eventos e=new eventos(this);
        addWindowListener(e);
        jmCArchivo.addActionListener(e);
        jmCBD.addActionListener(e);
        jmSalir.addActionListener(e);
        jmAcerca.addActionListener(e);
        //Cargamos en el menu los Dispositivos detectados
        jDispositivos.menuDispositivos(this,jmDispositivos);
        setLocationRelativeTo(this); //centramos el formulario
    }


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRectTranslucidoComplete2 = new org.edisoncor.gui.panel.PanelRectTranslucidoComplete();
        panelCam = new javax.swing.JPanel();
        lbllFotoUser = new javax.swing.JLabel();
        clockDigital2 = new org.edisoncor.gui.varios.ClockDigital();
        clockFace2 = new org.edisoncor.gui.varios.ClockFace();
        btnIngresar = new org.edisoncor.gui.button.ButtonIpod();
        lblFecha = new org.edisoncor.gui.label.LabelCustom();
        cmbElegir = new org.edisoncor.gui.comboBox.ComboBoxRound();
        labelMetric1 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric2 = new org.edisoncor.gui.label.LabelMetric();
        txtLegajo = new org.edisoncor.gui.textField.TextFieldRectIcon();
        txtClave = new org.edisoncor.gui.textField.TextFieldRectIcon();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuLogin = new javax.swing.JMenuItem();
        mnuPersonal = new javax.swing.JMenuItem();
        mnuListado = new javax.swing.JMenuItem();
        jmCapturar = new javax.swing.JMenu();
        jmCArchivo = new javax.swing.JMenuItem();
        jmCBD = new javax.swing.JMenuItem();
        jmDispositivos = new javax.swing.JMenu();
        jmOtros = new javax.swing.JMenu();
        jmSalir = new javax.swing.JMenuItem();
        jmAcerca = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Toma una Foto");
        setMinimumSize(new java.awt.Dimension(500, 500));
        setResizable(false);

        panelRectTranslucidoComplete2.setFocusable(false);
        panelRectTranslucidoComplete2.setOpaque(false);
        panelRectTranslucidoComplete2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelCam.setBackground(new java.awt.Color(0, 0, 0));
        panelCam.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelCam.setLayout(new java.awt.BorderLayout());
        panelRectTranslucidoComplete2.add(panelCam, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 250, 230));
        panelRectTranslucidoComplete2.add(lbllFotoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 130, 110));

        clockDigital2.setBackground(new java.awt.Color(255, 255, 255));
        clockDigital2.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        panelRectTranslucidoComplete2.add(clockDigital2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 113, 42));

        javax.swing.GroupLayout clockFace2Layout = new javax.swing.GroupLayout(clockFace2);
        clockFace2.setLayout(clockFace2Layout);
        clockFace2Layout.setHorizontalGroup(
            clockFace2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
        );
        clockFace2Layout.setVerticalGroup(
            clockFace2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 123, Short.MAX_VALUE)
        );

        panelRectTranslucidoComplete2.add(clockFace2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 116, 123));

        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.jpg"))); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        panelRectTranslucidoComplete2.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 80, 80));

        lblFecha.setBackground(new java.awt.Color(255, 255, 255));
        lblFecha.setForeground(new java.awt.Color(0, 0, 0));
        lblFecha.setText("Martes 12, de Marzo de 2013");
        lblFecha.setBorde(true);
        lblFecha.setColorDeSombra(new java.awt.Color(255, 255, 255));
        lblFecha.setForma(org.edisoncor.gui.label.LabelCustom.Forma.BOTTOM);
        panelRectTranslucidoComplete2.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 460, 34));

        cmbElegir.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elegir", "Entrada", "Salida", " " }));
        cmbElegir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbElegirActionPerformed(evt);
            }
        });
        panelRectTranslucidoComplete2.add(cmbElegir, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 140, -1));

        labelMetric1.setText("Legajo");
        panelRectTranslucidoComplete2.add(labelMetric1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        labelMetric2.setText("Clave");
        panelRectTranslucidoComplete2.add(labelMetric2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));
        panelRectTranslucidoComplete2.add(txtLegajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));
        panelRectTranslucidoComplete2.add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, -1, -1));

        jMenu1.setText("Archivo");

        mnuLogin.setText("Login");
        mnuLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuLoginActionPerformed(evt);
            }
        });
        jMenu1.add(mnuLogin);

        mnuPersonal.setText("ABM Personal");
        mnuPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPersonalActionPerformed(evt);
            }
        });
        jMenu1.add(mnuPersonal);

        mnuListado.setText("Listado de Registros");
        mnuListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuListadoActionPerformed(evt);
            }
        });
        jMenu1.add(mnuListado);

        jMenuBar1.add(jMenu1);

        jmCapturar.setText("Capturar");

        jmCArchivo.setText("En Archivo");
        jmCArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCArchivoActionPerformed(evt);
            }
        });
        jmCapturar.add(jmCArchivo);

        jmCBD.setText("En Base de Datos");
        jmCBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCBDActionPerformed(evt);
            }
        });
        jmCapturar.add(jmCBD);

        jMenuBar1.add(jmCapturar);

        jmDispositivos.setText("Dispositivos");
        jMenuBar1.add(jmDispositivos);

        jmOtros.setText("Otros");

        jmSalir.setText("Salir");
        jmOtros.add(jmSalir);

        jmAcerca.setText("Acerca");
        jmOtros.add(jmAcerca);

        jMenuBar1.add(jmOtros);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRectTranslucidoComplete2, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRectTranslucidoComplete2, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jmCArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCArchivoActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jmCArchivoActionPerformed

private void cmbElegirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbElegirActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_cmbElegirActionPerformed

private void jmCBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCBDActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jmCBDActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // validar el empleado
   EmpleadoDao empleados = new EmpleadoDaoImp();
   List<Empleado> lisaEmpleado = empleados.listarEmpleado();
   boolean encontrado = false;
   Empleado e = null ;
   for ( Empleado empleado : lisaEmpleado) {
       if (empleado.getLegajo()==Integer.parseInt(txtLegajo.getText())) {
           encontrado = true;
           e =empleado;
           break;
       }
   } 
       if (encontrado) {
          // mostrar en el labelEmpleado su nombre 
          // lblEmpleado.setText("Bienvenido : "+e.getNombre()); 
          // capturo la imagen y la muestro en el lbl
          Image img =  miPlayer.capturaFoto(this.getPlayer());
          Icon iconoAdaptado= new ImageIcon(img.getScaledInstance(lbllFotoUser.getWidth(),lbllFotoUser.getHeight(),Image.SCALE_DEFAULT)); 
          lbllFotoUser.setIcon(iconoAdaptado);//  si manda en pantalla
          // hay que convertir la imagen a byte[] por medio de un puente 
          // crear la imagen en src y de ahi lo paso a  archivo y luego a byte
          miPlayer.guardaImagenEnFichero(img, new File("src/imagTester"));
          // capturo la imagen guardada en el src y lo llevo a la bd
          File file = new File("src/imagTester");
          byte[] imgByte = new byte[(int) file.length()];
           try {
	        FileInputStream fileInputStream = new FileInputStream(file);
	        //convert file into array of bytes
	        fileInputStream.read(imgByte);
	        fileInputStream.close();
        } catch (Exception ex) {
	        ex.printStackTrace();
        }
           
           String elegir = (String)cmbElegir.getSelectedItem();
          // creoo un objeto asistencia
           Asistencia asistencia =  new Asistencia(elegir,imgByte ,new Date(), new Date());
           asistencia.setEmpleado(e);
           //agrego en la bd
           AsistenciaDao asistencias = new AsistenciaDaoImp();
           asistencias.addAsistencia(asistencia);
          
           // Ingreso mal los datos de autenticacion 
          }else{
           JOptionPane.showMessageDialog(this, "Error de validacion , ingrese de nuevo sus datos","Error",JOptionPane.ERROR_MESSAGE);
           txtLegajo.setText("");
           txtClave.setText("");
           cmbElegir.setSelectedItem("Elegir");
       }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void mnuLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuLoginActionPerformed
        Login login = new Login(this, true);
    }//GEN-LAST:event_mnuLoginActionPerformed

    private void mnuPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPersonalActionPerformed
        Personal personal = new Personal(this, true);
    }//GEN-LAST:event_mnuPersonalActionPerformed

    private void mnuListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuListadoActionPerformed
        ListadoPersonal listado = new ListadoPersonal(this, true);
       
    }//GEN-LAST:event_mnuListadoActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                    new Camara().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonIpod btnIngresar;
    private org.edisoncor.gui.varios.ClockDigital clockDigital2;
    private org.edisoncor.gui.varios.ClockFace clockFace2;
    private org.edisoncor.gui.comboBox.ComboBoxRound cmbElegir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmAcerca;
    private javax.swing.JMenuItem jmCArchivo;
    private javax.swing.JMenuItem jmCBD;
    private javax.swing.JMenu jmCapturar;
    private javax.swing.JMenu jmDispositivos;
    private javax.swing.JMenu jmOtros;
    private javax.swing.JMenuItem jmSalir;
    private org.edisoncor.gui.label.LabelMetric labelMetric1;
    private org.edisoncor.gui.label.LabelMetric labelMetric2;
    private org.edisoncor.gui.label.LabelCustom lblFecha;
    private javax.swing.JLabel lbllFotoUser;
    private javax.swing.JMenuItem mnuListado;
    private javax.swing.JMenuItem mnuLogin;
    private javax.swing.JMenuItem mnuPersonal;
    private javax.swing.JPanel panelCam;
    private org.edisoncor.gui.panel.PanelRectTranslucidoComplete panelRectTranslucidoComplete2;
    private org.edisoncor.gui.textField.TextFieldRectIcon txtClave;
    private org.edisoncor.gui.textField.TextFieldRectIcon txtLegajo;
    // End of variables declaration//GEN-END:variables

}
