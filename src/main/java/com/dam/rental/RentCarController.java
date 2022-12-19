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

    private int matriz[][];
    private final int J1 = 1;
    private final int J2 = 2;
    private int player, winner;
    private Integer[] scores;


    

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
        Arrays.fill(scores,0);

    }   

    private boolean  isBoardFull(){
        boolean completo = true;
        for (int i = 0; i < 9; i++) {
            if (labels.get(i).getText().isBlank()){
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
            
            if (labels.get(0+r).getText().contentEquals(labels.get(1+r).getText()) && labels.get(0+r).getText().contentEquals(labels.get(2+r).getText()) && !labels.get(0+r).getText().isBlank() ) {
                lineaWin = r/3;
                if(labels.get(0+r).getText().contentEquals("X"))
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

            if (labels.get(c).getText().contentEquals(labels.get(c+3).getText()) && labels.get(c).getText().contentEquals(labels.get(c+6).getText()) && !labels.get(c).getText().isBlank() ) {
                colWin = c;
                if(labels.get(c).getText().contentEquals("X"))
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

            if (labels.get(0).getText().contentEquals(labels.get(4).getText()) && labels.get(0).getText().contentEquals(labels.get(8).getText()) && !labels.get(0).getText().isBlank() ) {
                diagonalWin = 1;
                if(labels.get(0).getText().contentEquals("X"))
                    winner = J1;
                else
                    winner = J2;
                
            }else if(labels.get(2).getText().contentEquals(labels.get(4).getText()) && labels.get(2).getText().contentEquals(labels.get(6).getText()) && !labels.get(2).getText().isBlank() ) {
                diagonalWin = 2;
                if(labels.get(2).getText().contentEquals("X"))
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
    private int evalua(String ficha, int profundidad ) throws InterruptedException{
// Ficha = 1 si eres el PC ; Ficha = -1 si eres el jugador
// La máxima puntuación que le vamos a dar es la profundidad y la mínima el opuesto : -profundidad. Basicamente en número de jugadas en las que ganamos.
// Como voy a ir actualizando la puntuación y quedandome con la mejor, voy a partir de la peor puntuación posible en este caso -profundidad. Asi tendre que las puntuaciones negativas corresponden con que el usuario ha ganado y las positivas son las que yo he ganado. La mínima sería al revés parte del máximo y me voy queedando con la peor. 
// La minima puntuación la quiero porque al invertir el turno la puntuación del contraio es la inversa de la del turno actual. Si soy el PC para poder ganar me voy a poner en el caso peor y la siguiente jugada del jugador voy a suponer que es la mejor.
        int puntuacion;
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
                if (labels.get(i).getText().isBlank()){
                    labels.get(i).setText(ficha); // Poner ficha para evaluar
                    // System.out.println("EVALUANDO prof= "+profundidad+", casilla= "+i+", ficha= "+ficha);
                    puntuacion = evalua(ficha,profundidad-1);
                    // System.out.println("RESULTADO prof= "+profundidad+", casilla= "+i+", ficha= "+ficha+". PUNT= "+puntuacion);
                    labels.get(i).setText(" "); // Quitar ficha

                    // Si la puntuacion de la casilla actual es mayor que la de todas las anteriores
                    if (puntuacion > maxPuntuacion)  {maxPuntuacion= puntuacion;} // Toma esta puntuaci�n como la mayor de todas
                    // Si la puntuacion de la casilla actual es menor que la de todas las anteriores
                    if (puntuacion < minPuntuacion)  {minPuntuacion= puntuacion;} // Toma esta puntuaci�n como la menor de todas

                    // Deja de evaluar casillas si ha encontrado la mejor de todas las posibles jugadas para el usuario. Si el usuario ya gana no sigo buscando
                    if (ficha=="O")  {stopLooking = (puntuacion==-(profundidad-1));}
                    // Deja de evaluar columnas si ha encontrado la mejor de todas las posibles jugadas para el ordenador. Si el PC ya gana no sigo mirando, ya tengo la mejor.
                    else  {stopLooking = (puntuacion==profundidad-1);} 
                }
                //else {System.out.println("SKIPPING POR CASILLA OCUPADA! prof= "+profundidad+", casilla= "+i+", ficha= "+ficha+". Hay puesta una "+labels.get(i).getText());}
                i++;
            }
           
            // Si los movimientos evaluados son del usuario, devuelve la puntuaci�n menor (la que m�s favorece al usuario).
            if (ficha=="O")  {return minPuntuacion;}
            // Si son del ordenador, devuelve la puntuaci�n m�s favorable a �ste.
            else {return maxPuntuacion;} 
        }
    }

       
    
    @FXML
    public void userClick(MouseEvent event) throws InterruptedException{
        boolean tablas=false, victoria=false, derrota=false;
        
        
        Label label = (Label) event.getSource();
        String botonPulsado = label.getId();
        if (label.getText().isBlank()){
            label.setText("O");
            
            if(weHaveWinner()) {System.out.println("USER WINS"); derrota=true;}
            else if (isBoardFull()) {System.out.println("TABLAS"); tablas=true;}
            if (!(derrota || tablas))
            {
                Arrays.fill(scores,0);
                // Hacemos el primer movimiento del PC.
                for (int i = 0; i < 9; i++) {
                    if (labels.get(i).getText().isBlank())
                     {
                       labels.get(i).setText("X"); // Poner ficha para evaluar
                       scores[i]= evalua("X", 6-1);
                       // si llamo con profundidad= 2-1 => caso base tiene 2 fichas puestas de las 9 posibles
                       // si llamo con profundidad= 3-1 => caso base tiene 3 fichas puestas de las 9 posibles
                       // ...
                       // si llamo con profundidad= 9-1 => caso base tiene 9 fichas puestas de las 9

                       // a partir de profundidad= 7-1 ya es imposible ganarle :)
                       // Probar con la apertura casilla0="O". La máquina solo puede forzar tablas con casilla5="X" (Si no ocupa esa casilla, la ocupa el usuario y lo tiene ganado)

                       //System.out.println("puntuación de la casilla "+i+" es "+ scores[i] );
                       labels.get(i).setText(" "); // Quitar ficha
                       //System.out.println(" Comrpbacion "+ labels.get(i).getText().isBlank());
                     }
                    else {scores[i]=-9999;} //valor exageradamente negativo para indicar que esa casilla está ocupada (=> no es una opción de jugada evaluable!)
                    // otra posibilidad es usar otro array adicional para guardar los índices de las casillas libres
                    // otra posibilidad es usar algún LinkedList, pero para eso hay que conocerlos :)
                     
                }
                
                System.out.println(Arrays.toString(scores));
                int mejor_movimiento= 0;
                for (int casilla = 0; casilla < scores.length; casilla++)
                 {
                   mejor_movimiento= scores[casilla] > scores[mejor_movimiento] ? casilla : mejor_movimiento;
                 }
         
                labels.get(mejor_movimiento).setText("X");
                
                
                if(weHaveWinner()) {System.out.println("COMPUTER WINS"); victoria=true;}
                else if (isBoardFull()) {System.out.println("TABLAS"); tablas=true;}
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
        
        int winnerLine = checkLine();
        int winnerCol = checkCol();
        int winnerDiagonal = checkDiagonal();
//      System.out.println("Linea ganadora "+winnerLine);
//       System.out.println("Columna ganadora "+winnerCol);
//       System.out.println("Diagonal ganadora "+winnerDiagonal);
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
