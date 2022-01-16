/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import ConexionSQL.conexion;
import Datos.Estudiante;
import VOTO.MReport;
import VOTO.V_Estudiante;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author EMPRESA
 */
public class Reporte extends javax.swing.JFrame {

    private V_Estudiante VP;
    conexion conn;
    public Reporte() {
        initComponents(); 
        this.setLocationRelativeTo(null);
        VP= new V_Estudiante();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        INICIO = new javax.swing.JButton();
        BTN_GenerarPDF = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ITEC Votaciones / Reportes");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        INICIO.setText("Inicio");
        INICIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INICIOActionPerformed(evt);
            }
        });
        jPanel1.add(INICIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        BTN_GenerarPDF.setText("Generar Reporte PDF");
        BTN_GenerarPDF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_GenerarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_GenerarPDFActionPerformed(evt);
            }
        });
        jPanel1.add(BTN_GenerarPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 170, 50));

        jLabel1.setFont(new java.awt.Font("Casper", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("En el Escritorio con los resultados de la votación.");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 340, 40));

        jLabel2.setFont(new java.awt.Font("Casper", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Cuando des click en Generar reporte. se Creará un Arhivo PDF");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 410, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void INICIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INICIOActionPerformed
        
        INICIO Home = new INICIO();
        Home.setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_INICIOActionPerformed

    private void BTN_GenerarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_GenerarPDFActionPerformed
        conn = new conexion (); //se crea la conexion a la base de datos
    MReport Reporte= new MReport(); //se crea un objto de la libreria de Mreport
        Estudiante EP = new Estudiante(); //se creea un objeto de la clase Estudiante
        
        
        Document documento = new Document(); //Objeto Documento
       

        
        try {
            String ruta = System.getProperty("user.home"); //Asignación de ruta (en este caso le decimos que escoja el usuario actual)
            PdfWriter.getInstance(documento, new FileOutputStream(ruta+"/Desktop/Reporte_Votos.pdf")); //Se crea el pdf en la ruta
            documento.open(); // Se abre el pdf para comenzar a editar
            
            PdfPTable tabla = new PdfPTable(3); // Se crea una tabla y se le añaden el numero de columnas en este caso 3
            tabla.addCell("CANDIDATO"); // se agregan las primeras celdas
            tabla.addCell("VOTOS");
            tabla.addCell("CARGO");
            for (int i = 1; i < 8; i++) {
                Reporte.candidatos(i);//obtiene datos del candidato
                String idcandidado= Reporte.obtenerTextInfo("IDEstudiante"); //trae el iddeestudiante del candidato
                System.out.println("idcandidato"+idcandidado);
                EP.ObtenerDatos(idcandidado); //obtiene datos del estudiante (candidato)
                tabla.addCell(EP.obtenerTextInfo("ApellidoNombre")); //se agrega una celda a la tabla con el nombre del candidato
                Reporte.CONTARVOTOS(i); //se cuentan los votos del candidato
                String CantVotos =   Reporte.obtenerTextInfo("rowcount"); //se guardan la cantidad de votos en una variable
                tabla.addCell(CantVotos);     //se agrega otra celda con el numero de votos del candidato                
                Reporte.candidatos(i); //obtiene info del candidato
                tabla.addCell(Reporte.obtenerTextInfo("IDCargo")); //se agrega una celda con el cargo 
            }
                documento.add(tabla); // Se agrega la Tabla al documento 
                documento.close();//Se guarda y Se cierra
            JOptionPane.showMessageDialog(null, "reporte creado"); //muestra una ventana de confirmacion
        } catch (FileNotFoundException | DocumentException | HeadlessException e) {
        }
    }//GEN-LAST:event_BTN_GenerarPDFActionPerformed

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
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reporte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_GenerarPDF;
    private javax.swing.JButton INICIO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
