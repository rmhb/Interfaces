/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.dam.rental;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author NASA
 */
public class LoadGifController implements Initializable {

    @FXML ImageView _img;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Login con bbagg6@tmall.com   vlVO3U
           
//           // Image j = new Image(getClass().getResourceAsStream("/package/resource.gif"));
//            Image i = new Image(new File("src//main//resources//media//4HZ.gif").toURI().toString());
//             System.out.println("Dir "+getClass().getResource("media/4HZ.gif").toURI().toString());
//            Image i1;
//        try {
//            i1 = new Image(getClass().getResource("media/4HZ.gif").toURI().toString());
//           
//        } catch (URISyntaxException ex) {
//            Logger.getLogger(LoadGifController.class.getName()).log(Level.SEVERE, null, ex);
//        }
////            
////            System.out.println(new File("src//main//resources//media//4HZ.gif").toURI().toString());
////            System.out.println("Mi direccion "+ getClass().getResourceAsStream("media/4HZ.gif"));
//            _img.setImage(i1);
////            new Thread(()->{
////                _img.setImage(i);
////            }).start();

        Timeline timeLine = new Timeline();
        Duration frameGap = Duration.millis(2000);
        Duration frameTime = Duration.ZERO ;

    }    
    
}
