package com.dam.raya_al;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class PrimaryController  implements Initializable {
    
    @FXML
    Label _label1,_label2, _label3, _label4, _label5, _label6, _label7, _label8, _label9, _sms;
      // Probar con bbagg6@tmall.com   vlVO3U
    List<Label> labels;

    
    private final int J1 = 1;
    private final int J2 = 2;
    private int player, winner;
    private Integer[] scores;


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
        final PrimaryController other = (PrimaryController) obj;
        return this.player == other.player;
    }
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

/***
 * Este metodo comprueba si el tablero esta completo. Si esta completo devuleve TRUE
 */
    private boolean  isBoardFull(){

    }
 
/***
 * Este método comprueba si hay una línea con tres en raya. En caso afirmativo devuelve el numero de linea que tiene el tres en raya.
 */
     private int checkLine(){
      
    }
 
/***
 * Este método comprueba si hay una columna con tres en raya. En caso afirmativo devuelve el numero de columna que tiene el tres en raya.
 */
    
    private int checkCol(){

    }
    
    
/***
 * Este método comprueba si hay una de las diagonales con tres en raya. En caso afirmativo devuelve el numero de diagonal que tiene el tres en raya.
 */
 
    private int checkDiagonal(){
        
    }
    
    

   /**
    * Este metodo se encarga de resetear el tablero a blanco cuando se pulsa el boton reset
    */
       
    @FXML
    private void resetBoard(){

    }
    
    /**
     * Metodo que se desencadena al hacer el usuario click sobre una de las casilla del tres en raya
     */
    @FXML
    public void userClick(MouseEvent event) throws InterruptedException{
        
        
        // Obtener la label pulsada y comprobar si esta en blanco. En caso de que este en blanco colocar una O que representa al usuario.
        
        
        // Comprobar si el usuario ha ganado al colocar la ficha. Escribir mensaje en label _sms
        
        // De lo contrario comprobar si tenemos tablas, es decir, si el tablero está completo.  Escribir mensaje en label _sms
        
        // De lo contrario reiniciar a cero el array de scores. Hacer un bucle que recorra todas las casillas.
            //Si una casilla está libre se coloca una X y se evalua. Una vez evaluado debemos quitar la ficha que pusimos, es decir, la X.
            // A las casillas que ya tienen algo escrito (una X o una O) se le asigna una score negativo grande, por ejemplo, -9999
            
            // Actualizar el indice de casilla con el mejor movimiento. 
            
            // Comprobar si el PC ha ganado al colocar la ficha. Escribir mensaje en label _sms
        
             // De lo contrario comprobar si tenemos tablas, es decir, si el tablero está completo.  Escribir mensaje en label _sms
            
           
    }
    /**
     * Este metodo devuelve true si ha habido un tres en raya.
     */
    private boolean weHaveWinner(){
        
    }
    
     /**
     * Este metodo va a ser el que implemente la recursividad y evalue las posibilidades. 
     * Ficha va a reprsentar la alternancia entre las X y las O. Para ello, si la ficha vale 1 equivale a que el PC está poniendo ficha (X) y si ficha vale -1 es el usuario el que pone ficha (O).
     * Profundidad representa el número de niveles de recursivdad que queremos darle a nuestro programa. Por ejemplo, si ponemos recursividad 9, vería todas las posibles jugadas.
     */
     private int evalua(String ficha, int profundidad ) throws InterruptedException{

        
        // Comprobar si hay ganador, en caso afirmativo devolver profundidad o -profundidad dependiendo de si es la ficha del pc o del usuario.
        // Comprobar si el tablero está lleno o la profundidad es 1, en cuyo caso devolvemos 0 que representa las tablas.
        // Si no ocurren ninguna de las anteriores, ponemos ficha para el siguiente turno, es decir, debemos invertir la ficha.
        // Recorrer todas las i en busca de una casilla vacia y poner ficha y volver a evaluarla decrementando la profundidad.
        

    }
}