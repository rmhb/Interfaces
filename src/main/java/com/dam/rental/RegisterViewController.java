/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.dam.rental;

import com.dam.rental.Models.Alquiler;
import java.net.URL;
import java.util.Locale;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author NASA
 */
public class RegisterViewController implements Initializable {
    @FXML
    private TableView _tabla_rental;
    @FXML
    private TableColumn _col_nombre, _col_ape, _col_marca, _col_modelo;
    @FXML
    private TableColumn _col_id ;
    @FXML
    private TableColumn _col_f ;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("Ande toy -->  "+ Locale.getDefault() );
        Locale.setDefault(Locale.UK); System.out.println("Ande toy -->  "+ Locale.getDefault() );
//        _col_id.setCellValueFactory(new PropertyValueFactory("bla"));
////        this._col_id.setCellValueFactory(new PropertyValueFactory("Id"));
//        this._col_nombre.setCellValueFactory(new PropertyValueFactory("Nombre"));
//        this._col_ape.setCellValueFactory(new PropertyValueFactory("Apellidos"));
//        this._col_marca.setCellValueFactory(new PropertyValueFactory("Marca"));
//        this._col_modelo.setCellValueFactory(new PropertyValueFactory("Modelo"));
//        this._col_f.setCellValueFactory(new PropertyValueFactory("Fecha"));
        
        
        // Alquiler al = new Alquiler(_col_id,_col_marca, _col_modelo, _col_nombre, _col_ape, _col_f );
        // ObservableList<Alquiler> items = al.getAlquileres();
        ObservableList<Alquiler> items = Alquiler.getAlquileres();
        this._tabla_rental.setItems(items);
        
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
