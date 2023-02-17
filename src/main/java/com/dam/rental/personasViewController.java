/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.dam.rental;

import com.dam.rental.Models.ConectarDB;
import com.dam.rental.Models.Persona;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author NASA
 */
public class personasViewController implements Initializable {

    @FXML
    private TableView _tablaPersonas;
    @FXML
    private TableColumn _colNombre, _colApellidos, _colCorreo, _colsexo, _colAvatar, _colPW;
    @FXML
    private TextField _newNombre, _newApellido, _newEmail, _newAvatar;
    @FXML
    private ComboBox _sexo;
    @FXML
    private PasswordField _newPW;

    private ObservableList<Persona> personas;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ConectarDB.conectar();
        rellenarComboSexo();
        personas = FXCollections.observableArrayList();
        // Asociacion entre la columna de la tabla y el atributo name de la clase persona.Nombre del atributo del modelo
        this._colNombre.setCellValueFactory(new PropertyValueFactory("name"));
        this._colCorreo.setCellValueFactory(new PropertyValueFactory("email"));
        this._colApellidos.setCellValueFactory(new PropertyValueFactory("surname"));
        this._colsexo.setCellValueFactory(new PropertyValueFactory("gender"));
        this._colAvatar.setCellValueFactory(new PropertyValueFactory("avatar"));
        this._colPW.setCellValueFactory(new PropertyValueFactory("password"));



//        //https://ourcodeworld.co/articulos/leer/836/como-trabajar-con-json-facilmente-en-java
//        
//         JSONObject myObject = new JSONObject();
//
//        // Cadenas de texto básicas
//        myObject.put("name", "Carlos");
//        myObject.put("last_name", "Carlos");
//        
//        // Valores primitivos
//        myObject.put("age", new Integer(21));
//        myObject.put("bank_account_balance", new Double(20.2));
//        myObject.put("is_developer", new Boolean(true));
//        
//        // Matrices
//        double[] myList = {1.9, 2.9, 3.4, 3.5};
//        myObject.put("number_list", myList);
//        
//        // Objeto dentro de objeto
//        JSONObject subdata = new JSONObject();
//        myObject.put("extra_data", subdata);
//
//        // Generar cadena de texto JSON
//        System.out.print(myObject);
//        System.out.println("Ande toy -->  "+ Locale.getDefault() );
//        Locale.setDefault(Locale.UK); System.out.println("Ande toy -->  "+ Locale.getDefault() );
////        _col_id.setCellValueFactory(new PropertyValueFactory("bla"));
//////        this._col_id.setCellValueFactory(new PropertyValueFactory("Id"));
////        this._col_nombre.setCellValueFactory(new PropertyValueFactory("Nombre"));
////        this._col_ape.setCellValueFactory(new PropertyValueFactory("Apellidos"));
////        this._col_marca.setCellValueFactory(new PropertyValueFactory("Marca"));
////        this._col_modelo.setCellValueFactory(new PropertyValueFactory("Modelo"));
////        this._col_f.setCellValueFactory(new PropertyValueFactory("Fecha"));
//        
//        
//        // Alquiler al = new Alquiler(_col_id,_col_marca, _col_modelo, _col_nombre, _col_ape, _col_f );
//        // ObservableList<Alquiler> items = al.getAlquileres();
//        ObservableList<Alquiler> items = Alquiler.getAlquileres();
//        this._tabla_rental.setItems(items);
    }

    private void rellenarComboSexo() {
        // Se puede hacere también con consulta.
//        ObservableList<String> sexos = FXCollections.observableArrayList("Mujer", "Hombre", "Indefinido");
//        _sexo.getItems().addAll(sexos);
        _sexo.getItems().addAll("Mujer", "Hombre", "Indefinido");
    }

    @FXML
    public void saveFile(ActionEvent event) {
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setContentText("Hola putah");

        System.out.println("Entrando en saveFile");

    }

    @FXML
    public void cerrar(ActionEvent e) {
        Alert a = new Alert(Alert.AlertType.CONFIRMATION);
        a.setTitle("Confirmación para Cerrar la aplicación");
        a.setHeaderText(null);
        a.setContentText("Seguro que quieres CEERARR???");
        Optional<ButtonType> action = a.showAndWait();
        if (action.get() == ButtonType.OK) {
            Platform.exit();
        }
    }

    @FXML
    public void _agregar(ActionEvent e) {
         Persona p = new Persona(_newNombre.getText(), _newApellido.getText(), _newEmail.getText(), (String) _sexo.getSelectionModel().getSelectedItem(), _newAvatar.getText(), _newPW.getText() );
        
        System.out.println("Nueva Persona: \n "
                + "Nombre: " + p.getName() + "\n"
                + " Apellido: " + p.getSurname() + "\n"
                + " Email: " + p.getEmail() + "\n"
                + " Sexo: " + p.getGender()+ "\n"
        );
        
        System.out.println("Recuperando datos de la DB....");
        personas = ConectarDB.obtenerPersonas();
        _tablaPersonas.setItems(personas);
        System.out.println("Resultado " + personas.toString());
        System.out.println(personas.get(0).toString());
        if(!this.personas.contains(p)){
            this.personas.add(p);
            this._tablaPersonas.setItems(personas);
        }else{
            System.out.println("La persona ya está en Base de Datos ");
        }
    }
    @FXML
    public void _rowSeleccionada(MouseEvent Event){
        Persona p = (Persona) this._tablaPersonas.getSelectionModel().getSelectedItem();
        if(p!=null){
            _newNombre.setText(p.getName());
            _newApellido.setText(p.getSurname());
            _newEmail.setText(p.getEmail());
            _newAvatar.setText(p.getAvatar());
            _newPW.setText(p.getPassword());
            _sexo.getSelectionModel().select(p.getGender());
            System.out.println("Persona seleccionada ");
        }
        
    }
}
