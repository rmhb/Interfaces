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
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javafx.application.Platform;

/**
 * FXML Controller class
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
            /**
             * Class.forName("com.mysql.cj.jdbc.Driver") lo que hace es cargar la clase para poder 
             * tener disponible el Driver JDBC. Cuando llamamos a getConnection con la URL busca dentro de los
             * drivers de base de datos que ya tiene registrados y selecciona el que necesita para acceder
             * a la base de datos (en este caso mysql). 
             * Aunque esto realmente no hacee falta  día de hoy porque lo conectores JDBC 4 ya registran las clases. (Esto es por si alguno lo pone)
             * */
            //Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn;
            // Login con bbagg6@tmall.com   vlVO3U
            try {
                conn = DriverManager.getConnection("jdbc:mysql://super.choto.es:3306/alu_rental", "unalumno", "soyunalumno2022");
                PreparedStatement stmt = conn.prepareStatement("SELECT * FROM personas where email = ?");
                stmt.setString(1, _usu.getText());
                ResultSet rs = stmt.executeQuery();
                if(rs.next()){
                    System.out.println("Nombre y apellidos " + rs.getString(2)+" "+ rs.getString(3));
                    System.out.println("Email " + rs.getString(4));
                    try {
                        App.setRoot("/views/rentCar");
                    } catch (IOException ex) {
                        Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
                    }    
                }else{
                    _error.setText("El usuario no existe");
                }
               
                
                
            } catch (SQLException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
//        } 
//        catch (ClassNotFoundException ex) {
//            ex.printStackTrace();
//        }
//        
       
    }
    @FXML 
    public void cerrar(ActionEvent e){
        Alert a = new Alert(Alert.AlertType.CONFIRMATION);
        a.setTitle(null);
        a.setContentText("Cerrar???");
        Platform.exit();
    }
    @FXML
    public void saveFile(ActionEvent E){
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setTitle(null);
        a.setContentText("Archivo guardado");
    }
    @FXML
    public void loadRegister(){
        try {
            App.setRoot("/views/RegisterView");
        } catch (IOException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
