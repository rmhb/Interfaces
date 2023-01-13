/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.dam.interfacesud6;

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
public class InterfacesUD6Test {
    
    private int a, b,c,d;
    private double a1, b1, c1;
    public InterfacesUD6Test() {
    }
    
    @BeforeAll
    public static void setUpClass() {
              
        
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        a = 35;
        b= 15;
        d=-61;
        a1 = 12.56;
        b1 = -14.11;
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of suma method, of class InterfacesUD6.
     */
    @Test
    public void testSuma() {
        System.out.println("Probando suma");
        InterfacesUD6 instance = new InterfacesUD6();
        int resultadoEsperado = 50;
        int resultadoObtenido = instance.suma(a, b);
        c= resultadoObtenido;
        resultadoObtenido = instance.suma(c, d);
        assertEquals(resultadoEsperado, resultadoObtenido);
        System.out.println("Test suma positivos ok");
        assertEquals(-11, resultadoObtenido);
        System.out.println("Test suma negativo positivo ok");
    }

    /**
     * Test of mayor method, of class InterfacesUD6.
     */
    @Test
    public void testMayor() {
        System.out.println("Probando Mayor");
        InterfacesUD6 instance = new InterfacesUD6();
        boolean expResult = false;
        boolean result = instance.mayor(b1, a1);
        assertEquals(expResult, result);
        System.out.println("Primer Test Pasado");

        expResult = true;
        result = instance.mayor(a1, b1);
        assertEquals(expResult, result);
        System.out.println("Segundo Test Pasado");
        
    }


    /**
     * Test of resta method, of class InterfacesUD6.
     */
    @Test
    public void testResta() {
        System.out.println("resta");

        InterfacesUD6 instance = new InterfacesUD6();
        double expResult = 0.0;
        double result = instance.resta(a1, b1);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of division method, of class InterfacesUD6.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        double a = 0.0;
        double b = 0.0;
        InterfacesUD6 instance = new InterfacesUD6();
        double expResult = 0.0;
        double result = instance.division(a, b);
        assertEquals(expResult, result, 0); // delta es la diferencia máxima permitida.
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of mult method, of class InterfacesUD6.
     */
    @Test
    public void testMult() {
        System.out.println("mult");
        double a = 0.0;
        double b = 0.0;
        InterfacesUD6 instance = new InterfacesUD6();
        double expResult = 0.0;
        double result = instance.mult(a, b);
        assertEquals(expResult, result, 0);
        
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of main method, of class InterfacesUD6.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        InterfacesUD6.main(args);
        // TODO review the generated test code and remove the default call to fail.

    }
    // Para ejecutar el test -> Boton derecho raton sobre este fichero en el panel izquierdo. --> pulsar test. si no aparece la ventana dee test pulsar Window-->IDE Tools->Test Results
    // https://netbeans.apache.org/kb/docs/java/junit-intro.html
}
