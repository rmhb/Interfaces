package com.dam.interfacesud8;

import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.embed.swing.SwingNode;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebHistory;
import javafx.scene.web.WebView;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import javax.help.HelpSetException;

public class PrimaryController implements Initializable {

    @FXML
    AnchorPane _anchorPanel;
//    @FXML
//    SwingNode _swingNodee;
    private WebEngine engine;
    private WebHistory history;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //SwingNode sN = new SwingNode();
//        createSwingContent(_swingNodee);
        
    }

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    private void cargarAyuda() {
        try {
            // Carga el fichero de ayuda
            File ourFile = new File(getClass().getClassLoader().getResource("/help/heelp.hs").getFile());
            URL hsURL = ourFile.toURI().toURL();

            // Crea el HelpSet y el HelpBroker
            HelpSet helpset = new HelpSet(getClass().getClassLoader(), hsURL);
            HelpBroker hb = helpset.createHelpBroker();

            // Pone ayuda a item de menu al pulsar F1. mntmIndice es el JMenuitem
//            hb.enableHelpOnButton(_menuAyuda, "id_main", helpset); //Ayuda cuando pulsamos un botón
//            hb.enableHelpKey(_vbox.getParent(), "id_main", helpset);
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        } catch (HelpSetException ex) {
            ex.printStackTrace();
        }
    }

//    private void createSwingContent(final SwingNode swingNode) {
//        SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                swingNode.setContent(new JButton("Click me!"));
//            }
//        });
//    }

    @FXML
    public void _botonAyuda() {
        Stage sthelp = new Stage();
        WebView wv = new WebView();
        
        AnchorPane ap = new AnchorPane(wv);
        Scene help = new Scene(ap);
        Scene help2;
        try {
            help2 = new Scene(new FXMLLoader(App.class.getResource( "secondary.fxml")).load(), 640, 480);
             sthelp.setScene(help2);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        
        
       
        sthelp.setTitle("Veentana dee ayuda");
         javafx.geometry.Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
        sthelp.setX((primScreenBounds.getWidth() - sthelp.getWidth()) / 2);
        sthelp.setY((primScreenBounds.getHeight() - sthelp.getHeight()) / 2);

        sthelp.setWidth(600);
        sthelp.setHeight(500);
        sthelp.show();
        engine = wv.getEngine();
        loadPage();

    }
    public void loadPage(){
        URL url = getClass().getResource("/help/index.html");
        
        System.out.println("paht "+" "+url);
        String us = url.toExternalForm();
        engine.load(us);
    }
    public void back(){
        history = engine.getHistory();
        ObservableList<WebHistory.Entry> entradas = history.getEntries();
        history.go(-1);
    }
       public void forward(){
        history = engine.getHistory();
        ObservableList<WebHistory.Entry> entradas = history.getEntries();
        history.go(+1);
    }
    
       // https://www.youtube.com/watch?v=96r3olimdkA
}
