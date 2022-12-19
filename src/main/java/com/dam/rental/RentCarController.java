/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.dam.rental;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author NASA
 */
public class RentCarController implements Initializable {
    @FXML
    Label _label1,_label2, _label3, _label4, _label5, _label6, _label7, _label8, _label9;
      // Probar con bbagg6@tmall.com   vlVO3U
    List<Label> labels;
    String[] tablero;
    private final int J1 = 1;
    private final int J2 = 2;
    private int player, winner;
    private Integer[] scores;
    private Integer[] casillaEstaLibre;

    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.player;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RentCarController other = (RentCarController) obj;
        return this.player == other.player;
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tablero = new String[9];
        labels = new ArrayList<Label>();
        labels.add(_label1);
        labels.add(_label2);
        labels.add(_label3);
        labels.add(_label4);
        labels.add(_label5);
        labels.add(_label6);
        labels.add(_label7);
        labels.add(_label8);
        labels.add(_label9);
        player = 0;
        winner = 0;
        scores = new Integer[9];
        casillaEstaLibre = new Integer[9];
        Arrays.fill(scores,0);
        Arrays.fill(casillaEstaLibre,1);       
    }   
       private String[] getActualState(){           
        for (int i = 0; i < 9; i++) {
            tablero[i] = labels.get(i).getText();
        }
        return tablero;
    }
    private boolean  isBoardFull(){
        boolean completo = true;
        for (int i = 0; i < 9; i++) {
            if (tablero[i].isBlank()){
                completo = false;
                break;
            }
        }
        return completo;
    }
    
    private int checkLine(){
        int lineaWin = -1;
        for (int r = 0; r < 9; r+=3) {
//            System.out.println("VAlor r "+r);
            
            if (tablero[0+r].contentEquals(tablero[1+r]) && tablero[0+r].contentEquals(tablero[2+r]) && !tablero[r].isBlank() ) {
                lineaWin = r/3;
                if(tablero[0].contentEquals("X"))
                    winner = J1;
                else
                    winner = J2;
                break;
            }
        }
        return lineaWin;
    }
    private int checkCol(){
        int colWin = -1;
        for (int c = 0; c < 3; c++) {
//            System.out.println("VAlor r "+c);

            if (tablero[c].contentEquals(tablero[c+3]) && tablero[c].contentEquals(tablero[c+6]) && !tablero[c].isBlank() ) {
                colWin = c;
                if(tablero[c].contentEquals("X"))
                    winner = J1;
                else
                    winner = J2;
                break;
            }
        }
        return colWin;
    }
    private int checkDiagonal(){
        int diagonalWin = -1;
        for (int c = 0; c < 3; c++) {
//            System.out.println("VAlor r "+c);

            if (tablero[0].contentEquals(tablero[4]) && tablero[0].contentEquals(tablero[8]) && !tablero[0].isBlank() ) {
                diagonalWin = 1;
                if(!tablero[0].contentEquals("X"))
                    winner = J2;
                else
                    winner = J1;
                
            }else if(tablero[2].contentEquals(tablero[4]) && tablero[2].contentEquals(tablero[6]) && !tablero[2].isBlank() ) {
                diagonalWin = 2;
                if(tablero[2].contentEquals("X"))
                    winner = J1;
                else
                    winner = J2;
            }
        }
        
        return diagonalWin;
    }
    /**
     * Casilla es una de las posiciiones libres del array tablaro a probar a poner una ficha
     * Ficha va a reprsentar la alternancia entre las X y las O
     * profuncidad... cuanto nos queda para acabar, es decir cuanta recursividad hemos tenido qeu agotar para ganar. Profundidad 9 porque tengo 9 casillas
     */
    private int evalua(String ficha, int profundidad ){
// Ficha = 1 si eres el PC ; Ficha = -1 si eres el jugador
// La máxima puntuación que le vamos a dar es la profundidad y la mínima el opuesto : -profundidad. Basicamente en número de jugadas en las que ganamos.
// Como voy a ir actualizando la puntuación y quedandome con la mejor, voy a partir de la peor puntuación posible en este caso -profundidad. Asi tendre que las puntuaciones negativas corresponden con que el usuario ha ganado y las positivas son las que yo he ganado. La mínima sería al revés parte del máximo y me voy queedando con la peor. 
// La minima puntuación la quiero porque al invertir el turno la puntuación del contraio es la inversa de la del turno actual. Si soy el PC para poder ganar me voy a poner en el caso peor y la siguiente jugada del jugador voy a suponer que es la mejor.
        int puntuacion = 0;
        int maxPuntuacion = -profundidad;
        int minPuntuacion = profundidad;
        boolean stopLooking = false;
        if(weHaveWinner()){
            if(ficha == "X")
                return profundidad; // El winner es el pc
            else
                return -profundidad; /// El winner es el usuario
        }
        else if(this.isBoardFull() || profundidad == 1)
        {
             //  System.out.println("TABLAS");
             return 0; // Caso de tablas  
        }
           
        else
        {
             // iNVERSION DE FICHA.
            if( ficha == "X") ficha = "O";
            else ficha = "X";
            
            int i = 0;
            while(!stopLooking && i<9){
                //System.out.println("Tablero is blanck check i= " +i+" "+ tablero[i].isBlank());
                if (tablero[i].isBlank()){
                    labels.get(i).setText(ficha); // Poner ficha para evaluar
                    //System.out.println("He puesto ficha "+ficha+" en posicion "+ i + " en profundidad " + profundidad);
                    puntuacion = evalua(ficha,profundidad-1);
                    labels.get(i).setText(""); // Quitar ficha
                    
                    // Si la puntuacion de la casilla actual es mayor que la de todas las anteriores
                    if (puntuacion > maxPuntuacion)  {maxPuntuacion= puntuacion;} // Toma esta puntuaci�n como la mayor de todas
                    // Si la puntuacion de la casilla actual es menor que la de todas las anteriores
                    if (puntuacion < minPuntuacion)  {minPuntuacion= puntuacion;} // Toma esta puntuaci�n como la menor de todas

                    // Deja de evaluar casillas si ha encontrado la mejor de todas las posibles jugadas para el usuario. Si el usuario ya gana no sigo buscando
                    if (ficha=="O")  {stopLooking = (puntuacion==-(profundidad-1));}
                    // Deja de evaluar columnas si ha encontrado la mejor de todas las posibles jugadas para el ordenador. Si el PC ya gana no sigo mirando, ya tengo la mejor.
                    else  {stopLooking = (puntuacion==profundidad-1);} 
                }
                i++;
            }
           
            // Si los movimientos evaluados son del usuario, devuelve la puntuaci�n menor (la que m�s favorece al usuario).
            if (ficha=="O")  {return minPuntuacion;}
            // Si son del ordenador, devuelve la puntuaci�n m�s favorable a �ste.
            else {return maxPuntuacion;} 
        }
    }

    @Override
    public String toString() {
        return "RentCarController{" + "tablero=" + tablero + '}';
    }
    
    
    
    @FXML
    public void userClick(MouseEvent event){
        Label label = (Label) event.getSource();
        String botonPulsado = label.getId();
        if (label.getText().isBlank()){
            label.setText("O");
            if(weHaveWinner()){
                System.out.println("El usuario ha ganado");
            }
            else if (isBoardFull()){
                System.out.println("Tenemos tablas");
            }
            else{
                
                Arrays.fill(scores,0);
                Arrays.fill(casillaEstaLibre,1);  
                // Hacemos el primer movimiento del PC.
                for (int i = 0; i < 9; i++) {
                    if (labels.get(i).getText().isBlank())
                     {
                       labels.get(i).setText("X"); // Poner ficha para evaluar                       
                       scores[i]= evalua("X", 5-1);
                       System.out.println("puntuación de la casilla "+i+" es "+ scores[i] );
                       labels.get(i).setText(""); // Quitar ficha
                         //System.out.println(" Comrpbacion "+ labels.get(i).getText().isBlank());
                     }
                    else {casillaEstaLibre[i]=0;}
                     
                }
                
                int primeraCasillaLibre=0;
                while (casillaEstaLibre[primeraCasillaLibre]==0)
                 {
                   primeraCasillaLibre++;    
                 }
                
                int mejorCasilla=primeraCasillaLibre;         
                for (int casilla = 0; casilla < scores.length; casilla++)
                 {
                   if (casillaEstaLibre[casilla]==1)
                    {
                      mejorCasilla= scores[casilla] > scores[mejorCasilla] ? casilla : mejorCasilla;
                    }
                 }
         
                labels.get(mejorCasilla).setText("X");
            }
            
        }
    }
    
    private boolean weHaveWinner(){
        
//        Label label = (Label) event.getSource();
//        String botonPulsado = label.getId();
//        System.out.println(label.getText());
//        System.out.println(label.getTextFill());
//        label.setTextFill(Color.RED);
        boolean isWinner = false;        
        tablero = getActualState();
        
        int winnerLine = checkLine();
        int winnerCol = checkCol();
        int winnerDiagonal = checkDiagonal();
//      System.out.println("Linea ganadora "+winnerLine);
//        System.out.println("Columna ganadora "+winnerCol);
//        System.out.println("Diagonal ganadora "+winnerDiagonal);
        if(winnerLine != -1 || winnerCol !=-1 || winnerDiagonal !=-1){
            isWinner = true;
        }

        return isWinner;
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
