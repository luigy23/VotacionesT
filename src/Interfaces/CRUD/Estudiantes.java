/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.CRUD;

import ConexionSQL.conexion;
import Datos.Estudiante;
import Datos.Salon;
import Interfaces.INICIO;
import Textos.Textos;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.runtime.Debug.id;

/**
 *
 * @author IE TECNICO SUPERIOR (Luigy Leonardo)
 */
public class Estudiantes extends javax.swing.JFrame {
    conexion conn;
    private Estudiante CP;
  
    public Estudiantes() {
        initComponents();
        CP= new Estudiante();// se crea un objeto de la clase Estudiante
        combobox(); //inicia combobox
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jp_Ingreso = new javax.swing.JPanel();
        Label_ID = new javax.swing.JLabel();
        Label_nombre = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        Tf_Nombre = new javax.swing.JTextField();
        Label_Grado = new javax.swing.JLabel();
        TF_Codigo = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        CB_Salon = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        Label_id = new javax.swing.JLabel();
        Tf_ID = new javax.swing.JTextField();
        BTN_inicio = new javax.swing.JButton();
        BTN_Añadir = new javax.swing.JButton();
        BTN_Actualizar = new javax.swing.JButton();
        Btn_Buscar = new javax.swing.JButton();
        Btn_Eliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Jp_Ingreso.setBackground(new java.awt.Color(255, 255, 255));
        Jp_Ingreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label_ID.setBackground(new java.awt.Color(2, 79, 7));
        Label_ID.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Label_ID.setForeground(new java.awt.Color(238, 112, 82));
        Label_ID.setText("Codigo:");
        Jp_Ingreso.add(Label_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, 30));

        Label_nombre.setBackground(new java.awt.Color(2, 79, 7));
        Label_nombre.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Label_nombre.setForeground(new java.awt.Color(238, 112, 82));
        Label_nombre.setText("Apellidos & Nombres:");
        Jp_Ingreso.add(Label_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));
        Jp_Ingreso.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 390, 20));

        Tf_Nombre.setFont(new java.awt.Font("Casper", 0, 18)); // NOI18N
        Tf_Nombre.setForeground(new java.awt.Color(153, 153, 153));
        Tf_Nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Tf_Nombre.setBorder(null);
        Tf_Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Tf_NombreKeyTyped(evt);
            }
        });
        Jp_Ingreso.add(Tf_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 390, 20));

        Label_Grado.setBackground(new java.awt.Color(2, 79, 7));
        Label_Grado.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Label_Grado.setForeground(new java.awt.Color(238, 112, 82));
        Label_Grado.setText("Salon:");
        Jp_Ingreso.add(Label_Grado, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, 30));

        TF_Codigo.setFont(new java.awt.Font("Casper", 0, 18)); // NOI18N
        TF_Codigo.setForeground(new java.awt.Color(153, 153, 153));
        TF_Codigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TF_Codigo.setBorder(null);
        TF_Codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_CodigoActionPerformed(evt);
            }
        });
        TF_Codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TF_CodigoKeyTyped(evt);
            }
        });
        Jp_Ingreso.add(TF_Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 180, 20));
        Jp_Ingreso.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 180, 10));

        CB_Salon.setEditable(true);
        CB_Salon.setFont(new java.awt.Font("Casper", 1, 18)); // NOI18N
        CB_Salon.setForeground(new java.awt.Color(102, 102, 102));
        CB_Salon.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar" }));
        CB_Salon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_SalonActionPerformed(evt);
            }
        });
        Jp_Ingreso.add(CB_Salon, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 190, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Logo T.png"))); // NOI18N
        Jp_Ingreso.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 110));
        Jp_Ingreso.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 610, 30));
        Jp_Ingreso.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 180, 20));

        Label_id.setBackground(new java.awt.Color(2, 79, 7));
        Label_id.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Label_id.setForeground(new java.awt.Color(238, 112, 82));
        Label_id.setText("id");
        Jp_Ingreso.add(Label_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, -1, 30));

        Tf_ID.setFont(new java.awt.Font("Casper", 0, 18)); // NOI18N
        Tf_ID.setForeground(new java.awt.Color(153, 153, 153));
        Tf_ID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Tf_ID.setBorder(null);
        Tf_ID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Tf_IDKeyTyped(evt);
            }
        });
        Jp_Ingreso.add(Tf_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 180, 20));

        BTN_inicio.setText("INICIO");
        BTN_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_inicioActionPerformed(evt);
            }
        });
        Jp_Ingreso.add(BTN_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 550, -1, -1));

        BTN_Añadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personeria/INTERFACES/BTAgregar.png"))); // NOI18N
        BTN_Añadir.setBorderPainted(false);
        BTN_Añadir.setOpaque(false);
        BTN_Añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_AñadirActionPerformed(evt);
            }
        });
        Jp_Ingreso.add(BTN_Añadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 70, 70));

        BTN_Actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personeria/INTERFACES/BTActualizar.png"))); // NOI18N
        BTN_Actualizar.setBorderPainted(false);
        BTN_Actualizar.setOpaque(false);
        BTN_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ActualizarActionPerformed(evt);
            }
        });
        Jp_Ingreso.add(BTN_Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 70, 70));

        Btn_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personeria/INTERFACES/BTBusqueda.png"))); // NOI18N
        Btn_Buscar.setBorderPainted(false);
        Btn_Buscar.setOpaque(false);
        Btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BuscarActionPerformed(evt);
            }
        });
        Jp_Ingreso.add(Btn_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 70, 60));

        Btn_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personeria/INTERFACES/BTBorrar.png"))); // NOI18N
        Btn_Eliminar.setToolTipText("");
        Btn_Eliminar.setBorderPainted(false);
        Btn_Eliminar.setOpaque(false);
        Btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EliminarActionPerformed(evt);
            }
        });
        Jp_Ingreso.add(Btn_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 70, 60));

        jLabel1.setFont(new java.awt.Font("Casper", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Consulta");
        Jp_Ingreso.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, -1, -1));

        jLabel2.setFont(new java.awt.Font("Casper", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Crear");
        Jp_Ingreso.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        jLabel3.setFont(new java.awt.Font("Casper", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Modificar");
        Jp_Ingreso.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, -1, -1));

        jLabel4.setFont(new java.awt.Font("Casper", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Eliminar");
        Jp_Ingreso.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, -1, -1));

        getContentPane().add(Jp_Ingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents
        private  void combobox(){ //trae los datos de sql a el combo box salon
            Salon SP = new Salon(); //se crea un objeto de la clase salon
            for (int i = 1; i< 50 ; i++) { //ejecuta los siguente 50 veces
            SP.ObtenerSalon(i);  //e obtiene el salon
            CB_Salon.addItem(SP.obtenerTextInfo("Descripción")); //agrega el salon al combobox
                
        }
    }
        
    //evento de solo numeros en el TF codigo
    private void TF_CodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_CodigoKeyTyped
    Textos t = new Textos();
    t.Snumeros(evt);
    }//GEN-LAST:event_TF_CodigoKeyTyped
//eveno de solo letras en TF nombre
    private void Tf_NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Tf_NombreKeyTyped

    Textos t = new Textos();
    t.Sletras(evt);

        
    }//GEN-LAST:event_Tf_NombreKeyTyped

    private void TF_CodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_CodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_CodigoActionPerformed

    private void CB_SalonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_SalonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_SalonActionPerformed

    private void Tf_IDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Tf_IDKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Tf_IDKeyTyped

    private void BTN_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_inicioActionPerformed
        //al oprimir nos devuelve al inicio
        
        INICIO in = new INICIO(); //cre al inicio
        in.setVisible(true); //muestra la ventana inicio
        this.setVisible(false); //oculta l ventana aactual (nuevo estudiante)


    }//GEN-LAST:event_BTN_inicioActionPerformed

    private void BTN_AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_AñadirActionPerformed
        conn = new conexion ();
        Connection reg = conn.getConnection();
      
        String Nombre = Tf_Nombre.getText(); //se guarda en una variable lo que esté escribto n el tf nombre
        String ApellidoNombre= Nombre; //traspasamos los datos de Bombre a esta vriable
        int Salon = CB_Salon.getSelectedIndex() ; //se obtiene el index del Combobox salon  a la variable Salon
        int CodigoEstudiante= Integer.parseInt(TF_Codigo.getText()); //se obtiene el codigo del estuiante
       
       String JN="Seleccionar";
       
CP.InsertarDatos(ApellidoNombre, Salon, CodigoEstudiante);  //se envian los datos recogidos en las variables
/*
   CP.InsertarDatos(ApellidoNombre, Salon, CodigoEstudiante);         }//GEN-LAST:event_BTN_AñadirActionPerformed
*/
       
    }
    private void BTN_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ActualizarActionPerformed
    
    String Nombre = Tf_Nombre.getText();
    
        String ApellidoNombre= Nombre;
        int Salon = CB_Salon.getSelectedIndex() ; //GUARDA DATO EN VARIABLE
        int CodigoEstudiante= Integer.parseInt(TF_Codigo.getText());//TRANSFORMA DATO STRING EN INT Y LO GUARA EN VARIABLE
        CP.ActualizarDatos(Tf_ID.getText(), ApellidoNombre, Salon, CodigoEstudiante);//envia datos al meotodo actualizar
         CP.ObtenerDatos(Tf_ID.getText()); //se obtiene los datos del la id del estudiante
         AjustarD();
         
         /*
         AjustarD();         AjustarD();    }//GEN-LAST:event_BTN_ActualizarActionPerformed
*/
    }
    
    private void Btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BuscarActionPerformed
        CP.ObtenerDatos(Tf_ID.getText());
        
        AjustarD(); //se ajustan los campos con los nombres el codigo y el salon
            }//GEN-LAST:event_Btn_BuscarActionPerformed

    private void Btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EliminarActionPerformed
//nos abre una ventana de confirmacion para confirmar la eliminacion
        int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro?", "Alerta!", JOptionPane.YES_NO_OPTION);
       
        if (resp == JOptionPane.YES_OPTION) { //si la respuesta es si se ejecuta esto:
          CP.EliminarDatos(Tf_ID.getText()); //elimina los datos de la id escrita
          Limpiar(); //coloca las casillas vacias
        }
    }//GEN-LAST:event_Btn_EliminarActionPerformed
    public void AjustarD (){
        //este metodo se usar despues de obtener datos de una id
        
        Tf_Nombre.setText(CP.obtenerTextInfo("ApellidoNombre"));
        TF_Codigo.setText(CP.obtenerTextInfo("CodigoEstudiante"));
        
        CB_Salon.setSelectedIndex(CP.obtenerIntInfo("IDSalón"));
        
    }
    public void Limpiar (){
            
        Tf_Nombre.setText("");
        
        
        CB_Salon.setSelectedItem(0);


    
    }    
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
            java.util.logging.Logger.getLogger(Estudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estudiantes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Actualizar;
    private javax.swing.JButton BTN_Añadir;
    private javax.swing.JButton BTN_inicio;
    private javax.swing.JButton Btn_Buscar;
    private javax.swing.JButton Btn_Eliminar;
    private javax.swing.JComboBox CB_Salon;
    private javax.swing.JPanel Jp_Ingreso;
    private javax.swing.JLabel Label_Grado;
    private javax.swing.JLabel Label_ID;
    private javax.swing.JLabel Label_id;
    private javax.swing.JLabel Label_nombre;
    private javax.swing.JTextField TF_Codigo;
    private javax.swing.JTextField Tf_ID;
    private javax.swing.JTextField Tf_Nombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    // End of variables declaration//GEN-END:variables

    private static class con {

        private static Connection getConnection() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public con() {
        }
    }
}
