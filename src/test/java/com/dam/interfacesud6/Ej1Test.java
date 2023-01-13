/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.dam.interfacesud6;

import static java.time.Duration.ofMinutes;
import static java.time.Duration.ofSeconds;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author NASA
 */
public class Ej1Test {
    
    public Ej1Test() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of encuentraMaximo method, of class Ej1.
     */
    @Test
    public void testEncuentraMaximo() {
        System.out.println("Probando encuentraMaximo");
        int[] miArray = {1,3,12,-2} ;
        int esperado = 12;
        int resultado = Ej1.encuentraMaximo(miArray);
        assertEquals(esperado, resultado);
        System.out.println("Segunda prueba pasada - Valores positivos");

        assertEquals(-2, Ej1.encuentraMaximo(new int[]{-15,-22,-2,-1100}));
        System.out.println("Primera prueba pasada - Valores negativos");
    }
    /***
     * Test para calculaAlCubo
     */
    @Test
    public void testcalculaAlCubo(){
        System.out.println("Probando calculaAlCubo");
        //Si ejecutamos un test y una assertion falla, ya deja de ejecutar el resto. Podemos haceer que se ejecuten varias así:
        assertAll("calculaAlCubo", 
            () ->   assertEquals(27, Ej1.calculaAlCubo(3)),
            () ->  assertEquals(-27, Ej1.calculaAlCubo(-3))
            );
        assertEquals(27, Ej1.calculaAlCubo(3));
        System.out.println("Pasado test 3 al cubo");
        assertEquals(-27, Ej1.calculaAlCubo(-3));
        System.out.println("Pasado test -3 al cubo");
    }
    
    /***
     * Test para invertirPalabra
     */
    @Test
    public void invertirPalabra(){
        System.out.println("Probando invertirPalabra");
        
        assertAll("invertirPalabra", 
            () ->  assertEquals("asor",Ej1.invertirPalabra("rosa")),
            () ->  assertEquals("... omall em",Ej1.invertirPalabra("Me llamo ..."))
            
            );
        // Si queremos indicar un time out
        assertTimeout(ofSeconds(1), () -> Ej1.invertirPalabra("rosa"));
        System.out.println("Prueba pasada");
    }
    //https://www.vogella.com/tutorials/JUnit/article.html
    //https://www.baeldung.com/junit-5
    
}
