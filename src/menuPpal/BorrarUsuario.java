/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package menuPpal;

import db.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.*;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.client.result.ResultSetMetaData;

/**
 *
 * @author NASA
 */
public class BorrarUsuario extends javax.swing.JFrame {

    List<Map<String, String>> list_usu ;
    List<Map<String, String>> list_ani ;
    /**
     * Creates new form EditUser
     */
    public BorrarUsuario() {
        initComponents();
        cargaCombo();
    }

    public void cargaCombo(){
        System.out.println("Entrando en carga combo");
        Conexion miConexion = new Conexion("localhost","3306","javanet","javanet","1234qwerty");
        Connection conDB = miConexion.makeConnect();
        String sql_usu = "SELECT * FROM usuario";
//        String sql_ani = "SELECT * FROM animal";
        try(PreparedStatement stmt = conDB.prepareStatement(sql_usu)){
            ResultSet rs = stmt.executeQuery();
            list_usu = new ArrayList<Map<String, String>>();
            ResultSetMetaData meta = (ResultSetMetaData) rs.getMetaData();
            while (rs.next()) {
                Map map = new HashMap(); // Por si no lo saben HashMap implementa la interfaz Map. Nos sirve para almacenar tanto los elementos key como los valores. También existe TreeMap pero es más lenta... por si quieren investigarla
                for (int i = 1; i <= meta.getColumnCount(); i++) {
                    String key = meta.getColumnName(i);
                    String value = rs.getString(key);
                    map.put(key, value);
                }
                // Esto sería una forma de añadir los usuarios conforme creamos el array list, pero si después hacemos lo del setModel no hace falta
//                usu.addItem(rs.getString(3));
                list_usu.add(map);
            }
            String[] usuariosDB = new String[list_usu.size()];
            for(int i = 0; i<list_usu.size(); i++){
                usuariosDB[i] = list_usu.get(i).get("username");
            }
            
            usu.setModel(new javax.swing.DefaultComboBoxModel<>(usuariosDB));
            
            //user.setSelectedIndex(0);
            // Ejemplos acceso a hashMap list
//            System.out.println(list); // Es un array de objetos, con indices numéricos
//            System.out.println(list.get(0)); // Es el primer objeto con clave, valor)
//            System.out.println(list.get(0).get("Nombre")); // Es la clave nombre del primer objeto del array

            
        } catch (SQLException sqle) { 
          System.out.println("Error en la ejecución:" + sqle.getErrorCode() + " " + sqle.getMessage());    
        }
//        try(PreparedStatement stmt = conDB.prepareStatement(sql_ani)){
//            ResultSet rs = stmt.executeQuery();
//            list_ani = new ArrayList<Map<String, String>>();
//            ResultSetMetaData meta = (ResultSetMetaData) rs.getMetaData();
//            while (rs.next()) {
//                Map map = new HashMap(); // Por si no lo saben HashMap implementa la interfaz Map. Nos sirve para almacenar tanto los elementos key como los valores. También existe TreeMap pero es más lenta... por si quieren investigarla
//                for (int i = 1; i <= meta.getColumnCount(); i++) {
//                    String key = meta.getColumnName(i);
//                    String value = rs.getString(key);
//                    map.put(key, value);
//                }
//                // Esto sería una forma de añadir los usuarios conforme creamos el array list, pero si después hacemos lo del setModel no hace falta
////                usu.addItem(rs.getString(3));
//                list_ani.add(map);
//            }
//            String[] animalesDB = new String[list_ani.size()];
//            for(int i = 0; i<list_ani.size(); i++){
//                animalesDB[i] = list_ani.get(i).get("nombre")+" -> "+list_ani.get(i).get("Raza") +" "+list_ani.get(i).get("SubRaza");
//            }
//            
//            ani.setModel(new javax.swing.DefaultComboBoxModel<>(animalesDB));
//            
//            //user.setSelectedIndex(0);
//            // Ejemplos acceso a hashMap list
////            System.out.println(list); // Es un array de objetos, con indices numéricos
////            System.out.println(list.get(0)); // Es el primer objeto con clave, valor)
////            System.out.println(list.get(0).get("Nombre")); // Es la clave nombre del primer objeto del array
//
//            
//        } catch (SQLException sqle) { 
//          System.out.println("Error en la ejecución:" + sqle.getErrorCode() + " " + sqle.getMessage());    
//        }
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
        jLabel1 = new javax.swing.JLabel();
        usu = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(1, 2, 50, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Usuario");
        jPanel1.add(jLabel1);

        usu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        usu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));
        usu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuActionPerformed(evt);
            }
        });
        jPanel1.add(usu);

        jPanel2.setLayout(new java.awt.GridLayout(1, 2, 20, 0));

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 60)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Añadir Tarea");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(236, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(230, 230, 230)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void usuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuActionPerformed
//        int selectedIndex = usu.getSelectedIndex();
//        jTextField3.setText(list.get(selectedIndex).get("Nombre"));
        
    
    }//GEN-LAST:event_usuActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
            
            
            int selectedIndex = usu.getSelectedIndex();
            String userSys = list_usu.get(selectedIndex).get("id");
//            int selectedIndex_ani = ani.getSelectedIndex();
//            String aniSys = list_usu.get(selectedIndex_ani).get("id");
            System.out.println(userSys + " usuario Sys");
            Conexion miConexion = new Conexion("localhost","3306","javanet","javanet","1234qwerty");
            Connection conDB = miConexion.makeConnect();
            String sql_tarea = "DELETE FROM tarea WHERE usuario = ? ";
            String sql_usuario = "DELETE FROM usuario WHERE nombre = ? ";
            try (PreparedStatement stmt__tarea = conDB.prepareStatement(sql_tarea); PreparedStatement stmt_usuario = conDB.prepareStatement(sql_usuario)) {
            // Ejecutamos Query
               stmt__tarea.setString(1, userSys);
               stmt_usuario.setString(1, userSys );
               
               conDB.setAutoCommit(false);
               int filaTarea = stmt__tarea.executeUpdate();
               int filaUsuario = stmt_usuario.executeUpdate();
               
               if(filaTarea >=1 && filaUsuario==1){
                conDB.commit();    
               }
               else{conDB.rollback();
                   System.out.println("Rollbacking");}
               
               
               miConexion.closeConnect(conDB);
               this.dispose();

            }

            catch (SQLException sqle) {
                
                if(conDB !=null){
                    try{
                        System.out.println("Error en la ejecución... haciendo rollback. El error fue :" + sqle.getErrorCode() + " " + sqle.getMessage());            
                        conDB.rollback();
                    } catch (SQLException e) {
                        System.out.println("Error en la ejecución.. :" + e.getErrorCode() + " " + e.getMessage()); 
                    }
                }

            }
            
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(BorrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BorrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BorrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BorrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BorrarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> usu;
    // End of variables declaration//GEN-END:variables
}
