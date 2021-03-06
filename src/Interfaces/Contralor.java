/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import VOTO.V_Estudiante;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Tecnico Superior
 */
public class Contralor extends javax.swing.JFrame {
 private final V_Estudiante VP;
 
    public Contralor() {
        initComponents();
        this.setLocationRelativeTo(null);
        try {
            this.setIconImage(new ImageIcon(getClass().getResource("/Recursos/icono6.png")).getImage());
        } catch (Exception e) {
        }
        BTcandidato1.setVisible(false);
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
        jButton1 = new javax.swing.JButton();
        BTcandidato2 = new javax.swing.JButton();
        BTcandidato3 = new javax.swing.JButton();
        Label_candidato1 = new javax.swing.JLabel();
        Label_Gradocandidato1 = new javax.swing.JLabel();
        Label_candidato2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Label_Gradocandidato2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BTVotoenblanco = new javax.swing.JButton();
        Label_Votoenblanco = new javax.swing.JLabel();
        Label_Fondo = new javax.swing.JLabel();
        BTcandidato1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ITEC Votaciones / Contralor");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Siguiente");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 870, -1, -1));

        BTcandidato2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personeria/INTERFACES/BTContralorTarde.png"))); // NOI18N
        BTcandidato2.setBorderPainted(false);
        BTcandidato2.setContentAreaFilled(false);
        BTcandidato2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTcandidato2.setFocusPainted(false);
        BTcandidato2.setFocusable(false);
        BTcandidato2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/personeria/INTERFACES/BTContralorTardeX.png"))); // NOI18N
        BTcandidato2.setRequestFocusEnabled(false);
        BTcandidato2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTcandidato2ActionPerformed(evt);
            }
        });
        jPanel1.add(BTcandidato2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 190, 190));

        BTcandidato3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personeria/INTERFACES/ContralorMa??ana.png"))); // NOI18N
        BTcandidato3.setBorderPainted(false);
        BTcandidato3.setContentAreaFilled(false);
        BTcandidato3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTcandidato3.setFocusPainted(false);
        BTcandidato3.setFocusable(false);
        BTcandidato3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/personeria/INTERFACES/XContralorMa??ana.png"))); // NOI18N
        BTcandidato3.setRequestFocusEnabled(false);
        BTcandidato3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTcandidato3ActionPerformed(evt);
            }
        });
        jPanel1.add(BTcandidato3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 190, 190));

        Label_candidato1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Label_candidato1.setForeground(new java.awt.Color(102, 102, 102));
        Label_candidato1.setText("STIVEN ALEXANDER GONZALES RESTREPO");
        Label_candidato1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(Label_candidato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 520, -1));

        Label_Gradocandidato1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Label_Gradocandidato1.setText("1005");
        jPanel1.add(Label_Gradocandidato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 80, -1));

        Label_candidato2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Label_candidato2.setForeground(new java.awt.Color(102, 102, 102));
        Label_candidato2.setText(" BECKHAN ANDRES TRUJILLO ARIZA");
        jPanel1.add(Label_candidato2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 450, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ELIGE TU CONTRALOR");
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 780, -1));

        Label_Gradocandidato2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Label_Gradocandidato2.setText("1003");
        jPanel1.add(Label_Gradocandidato2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, 80, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Presiona la foto del candidato que deseas que sea elegido, solo tienes una oportunidad, pi??nsalo bien");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 1210, 40));

        BTVotoenblanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personeria/INTERFACES/VOTO EN BLANCO 23.png"))); // NOI18N
        BTVotoenblanco.setBorder(null);
        BTVotoenblanco.setContentAreaFilled(false);
        BTVotoenblanco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTVotoenblanco.setDefaultCapable(false);
        BTVotoenblanco.setFocusable(false);
        BTVotoenblanco.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/personeria/INTERFACES/XVotoblanco.png"))); // NOI18N
        BTVotoenblanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTVotoenblancoActionPerformed(evt);
            }
        });
        jPanel1.add(BTVotoenblanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 520, 190, 180));

        Label_Votoenblanco.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Label_Votoenblanco.setText("VOTO EN BLANCO");
        jPanel1.add(Label_Votoenblanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 590, -1, -1));

        Label_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personeria/INTERFACES/Fondo950X100 CONTRALOR.png"))); // NOI18N
        jPanel1.add(Label_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 960));

        BTcandidato1.setBackground(new java.awt.Color(255, 255, 255));
        BTcandidato1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personeria/INTERFACES/BTSelecccion.png"))); // NOI18N
        BTcandidato1.setBorderPainted(false);
        BTcandidato1.setContentAreaFilled(false);
        BTcandidato1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTcandidato1.setDefaultCapable(false);
        BTcandidato1.setFocusPainted(false);
        BTcandidato1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/personeria/INTERFACES/BTIngresar_1.png"))); // NOI18N
        BTcandidato1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTcandidato1ActionPerformed(evt);
            }
        });
        jPanel1.add(BTcandidato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 180, 180));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTcandidato2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTcandidato2ActionPerformed
String id= SlectEstudiante.ide1;

int resp = JOptionPane.showConfirmDialog(null, "Est?? seguro de votar por "+Label_candidato1.getText()+"?");
if (resp==0) {
VP.ActualizarDatos(id, "1");
VP.Voto(id, "4");
BTcandidato2.setEnabled(false);
BTcandidato3.setEnabled(false);
BTVotoenblanco.setEnabled(false);
JOptionPane.showMessageDialog(null,"Voto Realizado");


    this.setVisible(false);
    FIN reiniciar = new FIN();
    
    reiniciar.setVisible(true);
    
}    }//GEN-LAST:event_BTcandidato2ActionPerformed

    private void BTcandidato1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTcandidato1ActionPerformed
String id= SlectEstudiante.ide1;

int resp = JOptionPane.showConfirmDialog(null, "Est?? seguro de votar por "+Label_candidato1.getText()+"?");
if (resp==0) {
VP.ActualizarDatos(id, "1");
VP.Voto(id, "4");
BTcandidato1.setEnabled(false);
BTcandidato1.setEnabled(false);
BTVotoenblanco.setEnabled(false);
JOptionPane.showMessageDialog(null,"Voto Realizado");
    this.setVisible(false);
    FIN reiniciar = new FIN();
    
    reiniciar.setVisible(true);
    
}
    }//GEN-LAST:event_BTcandidato1ActionPerformed

    private void BTVotoenblancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTVotoenblancoActionPerformed
String id= SlectEstudiante.ide1;

int resp = JOptionPane.showConfirmDialog(null, "Est?? seguro de votar por "+Label_Votoenblanco.getText()+"?");
if (resp==0) {
VP.ActualizarDatos(id, "1");
VP.Voto(id, "7");
BTcandidato2.setEnabled(false);
BTcandidato3.setEnabled(false);
BTVotoenblanco.setEnabled(false);
JOptionPane.showMessageDialog(null,"Voto Realizado");

    this.setVisible(false);
    FIN reiniciar = new FIN();
    
    reiniciar.setVisible(true);
    
}    }//GEN-LAST:event_BTVotoenblancoActionPerformed

    private void BTcandidato3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTcandidato3ActionPerformed
String id= SlectEstudiante.ide1;

int resp = JOptionPane.showConfirmDialog(null, "Est?? seguro de votar por "+Label_candidato2.getText()+"?");
if (resp==0) {
VP.ActualizarDatos(id, "1");
VP.Voto(id, "5");
BTcandidato2.setEnabled(false);
BTcandidato3.setEnabled(false);
BTVotoenblanco.setEnabled(false);
JOptionPane.showMessageDialog(null,"Voto Realizado");

    this.setVisible(false);
    FIN reiniciar = new FIN();
    
    reiniciar.setVisible(true); }
        }//GEN-LAST:event_BTcandidato3ActionPerformed

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
            java.util.logging.Logger.getLogger(Contralor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Contralor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Contralor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Contralor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Contralor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTVotoenblanco;
    private javax.swing.JButton BTcandidato1;
    private javax.swing.JButton BTcandidato2;
    private javax.swing.JButton BTcandidato3;
    private javax.swing.JLabel Label_Fondo;
    private javax.swing.JLabel Label_Gradocandidato1;
    private javax.swing.JLabel Label_Gradocandidato2;
    private javax.swing.JLabel Label_Votoenblanco;
    private javax.swing.JLabel Label_candidato1;
    private javax.swing.JLabel Label_candidato2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
