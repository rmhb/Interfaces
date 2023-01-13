/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dam.interfacesud6;

import java.util.StringTokenizer;

/**
 *
 * @author NASA
 */
public class Ej1 {
    /***
     * Encontrar el máximo de un array
     */
    public static int encuentraMaximo (int miArray[]){
//        int maximo = 0;
        // Gracias a la prueba fallida podemos comprobar que inicializar el maximo a cero no es una bueena idea porque si tenemos valores negativos 0 siempre es mayor. 
        // Lo suyo es hacer:
         int maximo = miArray[0];
        for (int i = 0; i < miArray.length; i++) 
            maximo = maximo < miArray[i] ? miArray[i]:maximo;
        
        return maximo;
    }
    // Continuar con estos ejemplos: 
    public static int calculaAlCubo(int n){
        return n*n*n;
    }
    
    public static String invertirPalabra(String cadena){
        StringBuilder resultado = new StringBuilder();
        StringTokenizer st = new StringTokenizer(cadena, " ");
        // El tokenizer separa la frase en palabras, usando como delimitador el espacio " " 
        while(st.hasMoreTokens()){
            StringBuilder sb = new StringBuilder();
            sb.append(st.nextToken());
            sb.reverse(); // Cada palabra se almacena en sb y se le da la vuelta
            resultado.append(sb); // se almacena la palabra en resultado y se separa con espacio. 
            resultado.append(" ");
        }
        return resultado.toString();
    }
}
