/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.dam.rental;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
//import java.sql.*;
//import java.util.logging.Level;
//import java.util.logging.Logger;

/**
 * FXML Controller class
 *
 * @author NASA
 */
public class LoginController implements Initializable {

    @FXML
    TextField _usu;
    @FXML
    PasswordField _pw;
    @FXML
    Label _error;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    public void checkUser(ActionEvent event){
        System.out.println("Entrando en checkUser");
        System.out.println("Email introducido "+_usu.getText());
        
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection conn;
//            try {
//                conn = DriverManager.getConnection("jdbc:mariadb://super.choto.es:3306/alu_rental", "unalumno", "soyunalumno2022");
//                PreparedStatement stmt = conn.prepareStatement("SELECT * FROM personas where email = ?");
//                stmt.setString(1, _usu.getText());
//                ResultSet rs = stmt.executeQuery();
//                rs.first();
//                System.out.println("Nombre " + rs.getString(2));
//                System.out.println("Email " + rs.getString(3));
//            } catch (SQLException ex) {
//                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        } catch (ClassNotFoundException ex) {
//            ex.printStackTrace();
//        }
        
       
    }
}
