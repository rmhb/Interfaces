package com.dam.rental;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

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
        scene = new Scene(loadFXML("/views/Login"), 800  , 600);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
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