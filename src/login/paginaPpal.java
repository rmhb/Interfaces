/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login;

import java.awt.Color;
import javax.swing.JOptionPane;

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
        Capa_Background.add(botonLoginEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 670, 170, 60));

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
                .addContainerGap(1296, Short.MAX_VALUE))
        );
        headerPPanelLayout.setVerticalGroup(
            headerPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cierraLogin)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        Capa_Background.add(headerPPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 70));

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
        JOptionPane.showMessageDialog(this, "Intentto de Login con los datos:\n Usuario: "+ loginUser.getText()+ " Password: "+ String.valueOf(loginPW.getPassword() ));
    }//GEN-LAST:event_botonLoginEntrarActionPerformed

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
            java.util.logging.Logger.getLogger(paginaPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(paginaPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(paginaPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(paginaPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new paginaPpal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Capa_Background;
    private javax.swing.JButton botonLoginEntrar;
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
