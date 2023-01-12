package com.dam.rental;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

//Basurilla del font awesome
//import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
//import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
//import de.jensd.fx.glyphs.materialdesignicons.MaterialDesignIcon;
//import de.jensd.fx.glyphs.materialdesignicons.MaterialDesignIconView;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        //scene = new Scene(loadFXML("/views/Login"), 800  , 600);
        scene = new Scene(loadFXML("/views/rentCar"), 800  , 800);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        Locale locale = Locale.getDefault(); // Se carga el idioma configurado por defecto en el dispositivo desde el que se lanza.
        // locale =  Locale.ITALIAN; // Establecemos que el idioma sea el italiano
        // locale =  Locale.US; // Establecemos que el idioma sea inglés de USA
        locale = new Locale.Builder().setLanguage("fr").setRegion("CA").build(); //Mediante Locale.Builder (francés-Canada)
        
        fxmlLoader.setResources(ResourceBundle.getBundle("Bundle/rental", locale)); // -> Agregar la URI para el Bundle
//        URL fxmlLocation = App.class.getResource("/views/Login.fxml");
//        System.out.println("URL "+ fxmlLocation);
//        FXMLLoader fxmlLoader = new FXMLLoader(fxmlLocation);
//        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("/view/rentCar.fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}