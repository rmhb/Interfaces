/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.dam.rental;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn;
            // Probar con bbagg6@tmall.com   vlVO3U
            try {
                conn = DriverManager.getConnection("jdbc:mysql://super.choto.es:3306/alu_rental", "unalumno", "soyunalumno2022");
                PreparedStatement stmt = conn.prepareStatement("SELECT * FROM personas where email = ?");
                stmt.setString(1, _usu.getText());
                ResultSet rs = stmt.executeQuery();
                rs.next();
                System.out.println("Nombre y apellidos " + rs.getString(2)+" "+ rs.getString(3));
                System.out.println("Email " + rs.getString(4));
                try {
                    App.setRoot("/views/rentCar");
                } catch (IOException ex) {
                    Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        
       
    }
}
