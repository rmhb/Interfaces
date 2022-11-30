/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.dam.rental;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

/**
 * FXML Controller class
 *
 * @author NASA
 */
public class RentCarController implements Initializable {
    @FXML
    Label _label1,_label2, _label3, _label4, _label5, _label6, _label7, _label8, _label9;
      // Probar con bbagg6@tmall.com   vlVO3U
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    private String[] getActualState(){
        String[] tablero = new String[9];
        List<Label> labels = new ArrayList<Label>();
        labels.add(_label1);
        labels.add(_label2);
        labels.add(_label3);
        labels.add(_label4);
        labels.add(_label5);
        labels.add(_label6);
        labels.add(_label7);
        labels.add(_label8);
        labels.add(_label9);
                    
        for (int i = 0; i < 9; i++) {
            tablero[i] = labels.get(i).getText();
        }
        return tablero;
    }
    
    private int checkLine(String[] tablero){
        int lineaWin = -1;
        for (int r = 0; r < 9; r+=3) {
//            System.out.println("VAlor r "+r);

            if (tablero[0+r].contentEquals(tablero[1+r]) && tablero[0+r].contentEquals(tablero[2+r]) ) {
                lineaWin = r/3;
//                System.out.println("Encontrada linea "+lineaWin);
                break;
            }
        }
        return lineaWin;
    }
    private int checkCol(String[] tablero){
        int colWin = -1;
        for (int c = 0; c < 3; c++) {
//            System.out.println("VAlor r "+c);

            if (tablero[c].contentEquals(tablero[c+3]) && tablero[c].contentEquals(tablero[c+6]) ) {
                colWin = c;
//                System.out.println("Encontrada Columna "+colWin);
                break;
            }
        }
        return colWin;
    }
    private int checkDiagonal(String[] tablero){
        int diagonalWin = -1;
        for (int c = 0; c < 3; c++) {
//            System.out.println("VAlor r "+c);

            if (tablero[0].contentEquals(tablero[4]) && tablero[0].contentEquals(tablero[8]) ) {
                diagonalWin = 1;
            }else if(tablero[2].contentEquals(tablero[4]) && tablero[2].contentEquals(tablero[6]) ) {
                diagonalWin = 2;
            }
        }
        return diagonalWin;
    }
    
    @FXML
    public void checkWin(MouseEvent event){
        
//        Label label = (Label) event.getSource();
//        String botonPulsado = label.getId();
//        System.out.println(label.getText());
//        System.out.println(label.getTextFill());
//        label.setTextFill(Color.RED);
        String[] mitab = getActualState();
  
        int winnerLine = checkLine(mitab);
        System.out.println("Linea ganadora "+winnerLine);
        int winnerCol = checkCol(mitab);
        System.out.println("Columna ganadora "+winnerCol);
        int winnerDiagonal = checkCol(mitab);
        System.out.println("Diagonal ganadora "+winnerDiagonal);
        
        // TEngo que ejecutar con callable o algo del estilo que me permite devolver resultados. 
        // ExecutorService exService = Executors.newCachedThreadPool();
//        exService.execute(checkLine(mitab));
//        exService.execute(new Clientte(bufferCompartido));
//        exService.shutdown();
//        try{
//            exService.awaitTermination(1, TimeUnit.MINUTES);
//        }catch(InterruptedException e){
//            e.printStackTrace();
//        } 
        
    }
    
}
