/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.dam.rental;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

/**
 * FXML Controller class
 *
 * @author NASA
 */
public class RegisterViewController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    public void saveFile(ActionEvent event){
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setContentText("Hola putah");
        
        System.out.println("Entrando en saveFile");
        
    }
        @FXML 
    public void cerrar(ActionEvent e){
        Alert a = new Alert(Alert.AlertType.CONFIRMATION);
        a.setTitle("Confirmación para Cerrar la aplicación");
        a.setHeaderText(null);
        a.setContentText("Seguro que quieres CEERARR???");
        Optional<ButtonType> action = a.showAndWait();
        if(action.get() == ButtonType.OK){
            Platform.exit();
        }
    }
}
