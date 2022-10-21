/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login;

import db.Conexion;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.Map;

/**
 *
 * @author NASA
 */
public class paginaPpal extends javax.swing.JFrame {

    // Para poder mover la ventana, dado que nos hemos cargado la ventana con undecorated, tendremos que calcular la posición del ratón y generar eventos de ratón que muevan nuestra ventana..
    int xMouse, yMouse;
    // CUando se presiona el bottón del ratón se mira la posición X e Y con el metodo  private void headerPPanelMousePressed. Después generamos evento de arrastrar raton MouseMotion-> Dragged  que genera el ´método private void headerPPanelMouseDragged
    // En private void headerPPanelMouseDragged tendremos que calcular la posición de arrastrado respecto de la dimensión de nuestra ventana.
    
    /**
     * Creates new form paginaPpal
     */
    public paginaPpal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Capa_Background = new javax.swing.JPanel();
        loginUser = new javax.swing.JTextField();
        nameEmpresa = new javax.swing.JLabel();
        logoWelcome = new javax.swing.JLabel();
        imgFondoWelcome = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        loginPW = new javax.swing.JPasswordField();
        botonLoginEntrar = new javax.swing.JButton();
        headerPPanel = new javax.swing.JPanel();
        cierraLogin = new javax.swing.JLabel();
        botonLoginEntrar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        Capa_Background.setBackground(new java.awt.Color(255, 255, 255));
        Capa_Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginUser.setBackground(new java.awt.Color(255, 255, 255));
        loginUser.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        loginUser.setText("Tu usuario");
        loginUser.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        Capa_Background.add(loginUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 330, 40));

        nameEmpresa.setFont(new java.awt.Font("SimSun-ExtB", 1, 48)); // NOI18N
        nameEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        nameEmpresa.setText("ZOO 2 DAM");
        Capa_Background.add(nameEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 450, 290, 50));

        logoWelcome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        Capa_Background.add(logoWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 1000, 230));

        imgFondoWelcome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo.jpg"))); // NOI18N
        Capa_Background.add(imgFondoWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 650, 800));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Sitka Small", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("USUARIO");
        Capa_Background.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 300, 50));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Sitka Heading", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("INICIAR SESIÓN");
        Capa_Background.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 300, 50));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Sitka Small", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("CONTRASEÑA");
        Capa_Background.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 300, 50));

        loginPW.setBackground(new java.awt.Color(255, 255, 255));
        loginPW.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        loginPW.setText("jPasswordField1");
        loginPW.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        Capa_Background.add(loginPW, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, 330, 40));

        botonLoginEntrar.setBackground(new java.awt.Color(140, 200, 0));
        botonLoginEntrar.setFont(new java.awt.Font("SimSun", 0, 36)); // NOI18N
        botonLoginEntrar.setForeground(new java.awt.Color(255, 255, 255));
        botonLoginEntrar.setText("ENTRAR");
        botonLoginEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonLoginEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLoginEntrarActionPerformed(evt);
            }
        });
        Capa_Background.add(botonLoginEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 670, 250, 60));

        headerPPanel.setBackground(new java.awt.Color(255, 255, 255));
        headerPPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerPPanelMouseDragged(evt);
            }
        });
        headerPPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerPPanelMousePressed(evt);
            }
        });

        cierraLogin.setFont(new java.awt.Font("SimSun", 0, 48)); // NOI18N
        cierraLogin.setForeground(new java.awt.Color(0, 0, 0));
        cierraLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cierraLogin.setText("X");
        cierraLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cierraLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cierraLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cierraLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cierraLoginMouseExited(evt);
            }
        });

        javax.swing.GroupLayout headerPPanelLayout = new javax.swing.GroupLayout(headerPPanel);
        headerPPanel.setLayout(headerPPanelLayout);
        headerPPanelLayout.setHorizontalGroup(
            headerPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cierraLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1296, 1296, 1296))
        );
        headerPPanelLayout.setVerticalGroup(
            headerPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cierraLogin)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        Capa_Background.add(headerPPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 70));

        botonLoginEntrar1.setBackground(new java.awt.Color(140, 200, 0));
        botonLoginEntrar1.setFont(new java.awt.Font("SimSun", 0, 36)); // NOI18N
        botonLoginEntrar1.setForeground(new java.awt.Color(255, 255, 255));
        botonLoginEntrar1.setText("REGISTRO");
        botonLoginEntrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonLoginEntrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLoginEntrar1ActionPerformed(evt);
            }
        });
        Capa_Background.add(botonLoginEntrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 670, 260, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Capa_Background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Capa_Background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cierraLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cierraLoginMouseClicked
        System.exit(0);
    }//GEN-LAST:event_cierraLoginMouseClicked

    private void headerPPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerPPanelMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerPPanelMousePressed

    private void headerPPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerPPanelMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_headerPPanelMouseDragged

    private void cierraLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cierraLoginMouseEntered
        cierraLogin.setForeground(Color.red);   
    }//GEN-LAST:event_cierraLoginMouseEntered

    private void cierraLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cierraLoginMouseExited
        cierraLogin.setForeground(Color.black);
    }//GEN-LAST:event_cierraLoginMouseExited

    private void botonLoginEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLoginEntrarActionPerformed
        
        Conexion miConexion = new Conexion("localhost","3306","javanet","javanet","1234qwerty");
        Connection conDB = miConexion.makeConnect();
        
//        ACLARACIONES GENERALES A LA HORA DE UTILIZAR CONSULTAS
//        * ResultSet executeQuery(): Devuelve un conjunto de resultados, es decir, este metodo lo utilizamos cuando esperamos que la consulta devuelva filas (consultas con SELECT).
//        * int executeUpdate(): Solo podemos introducir consultas de tipo DDL (INSERT; UPDATE; DELETE) 
//        * boolean execute(): Executes the SQL statement in this Prepared Statement object, which may be any kind of SQL statement.
       
        // Ejemplo 1 sin consultas preparadas. Se espera que devuelva filas dado que es un SELECT:
        
        String consulta= "SELECT * FROM usuario";
        try(Statement st=conDB.createStatement()){
            
            ResultSet rs=st.executeQuery(consulta);
            System.out.println("Imprimiendo ejemplo 1");
            while(rs.next())
            {
                System.out.println( rs.getString(2)); //También podríamos haber usado el nombre de la columna, por ejemplo: rs.getString("nombre");
            }
        } catch (SQLException sqle) { 
          System.out.println("Error en la ejecución:" + sqle.getErrorCode() + " " + sqle.getMessage());    
        }
        
        // Ejemplo 2 con consultas preparadas. Con consultas preparadas se pasan los parámetros mediante interrogaciones. En este ejemplo al ser un SELECT sin parámetros no se ven las interrogaciones
        System.out.println("Imprimiendo ejemplo 2");
        try (PreparedStatement stmt = conDB.prepareStatement("SELECT * FROM usuario")) {
            ResultSet rs = stmt.executeQuery();
            // Recorremos el resultado
            System.out.println("Nombre  Apellidos   Contraseña  user ");
            while (rs.next())    
                System.out.println (rs.getString("Nombre")+"    "+rs.getString("Surname")+"    "+rs.getString("pw")+"    "+rs.getString("username") );
            // También podríamos recoger las columnas por su indice:
//          System.out.println (rs.getString(2)); 
//          System.out.println (rs.getString(3));
//          System.out.println (rs.getString(4));
        } catch (SQLException sqle) { 
          System.out.println("Error en la ejecución: " + sqle.getErrorCode() + ": " + sqle.getMessage());    
        }
        
        // Ejemplo 3. Con consultas preparadas, pero imprimiendo tanto los nombres de las columnas como su valor.
        System.out.println("Imprimiendo ejemplo 3");
        try(PreparedStatement stmt = conDB.prepareStatement("SELECT * FROM usuario")){
            ResultSet resultSet = stmt.executeQuery();
            // ResultSetMetaData -> An object that can be used to get information about the types and properties of the columns in a ResultSet object
            ResultSetMetaData rsmd = resultSet.getMetaData();
            int columnsNumber = rsmd.getColumnCount();
            while (resultSet.next()) {
                for (int i = 1; i <= columnsNumber; i++) {
                    if (i > 1) System.out.print("       ");
                    String columnValue = resultSet.getString(i);
                    System.out.print( rsmd.getColumnName(i)+": "+ columnValue );
                }
                System.out.println("");
            }
        } catch (SQLException sqle) { 
          System.out.println("Error en la ejecución: " + sqle.getErrorCode() + ": " + sqle.getMessage());    
        }
       // Ejemplo 4 con consultas preparadas. En este caso si utilizamos los parametros. 
        System.out.println("Imprimiendo ejemplo 4... Controla usuario y contraseña");
        String sql = "SELECT * FROM usuario WHERE username = ? and pw = ?";
        try (PreparedStatement stmt = conDB.prepareStatement(sql)) {
            stmt.setString(1, loginUser.getText());
            stmt.setString(2,  String.valueOf(loginPW.getPassword()));
            ResultSet rs = stmt.executeQuery();
            // Recorremos el resultado
            
            if(rs.next()){
                 miConexion.closeConnect(conDB);
                 JOptionPane.showMessageDialog(this, "Login con exito:\n Usuario: "+ loginUser.getText()+ " Password: "+ String.valueOf(loginPW.getPassword() ));
                new menuPpal.menu().setVisible(true);
                dispose();
            }
            else{
                JOptionPane.showMessageDialog(this, "Usuario o contraseña no válidos");
            }
          
        } catch (SQLException sqle) { 
          System.out.println("Error en la ejecución: " + sqle.getErrorCode() + ": " + sqle.getMessage());    
        }        
    }//GEN-LAST:event_botonLoginEntrarActionPerformed

    private void botonLoginEntrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLoginEntrar1ActionPerformed
        // TODO add your handling code here:
       new Registro(null,true).show() ;
    }//GEN-LAST:event_botonLoginEntrar1ActionPerformed
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(paginaPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(paginaPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(paginaPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(paginaPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new paginaPpal().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Capa_Background;
    private javax.swing.JButton botonLoginEntrar;
    private javax.swing.JButton botonLoginEntrar1;
    private javax.swing.JLabel cierraLogin;
    private javax.swing.JPanel headerPPanel;
    private javax.swing.JLabel imgFondoWelcome;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField loginPW;
    private javax.swing.JTextField loginUser;
    private javax.swing.JLabel logoWelcome;
    private javax.swing.JLabel nameEmpresa;
    // End of variables declaration//GEN-END:variables
}
