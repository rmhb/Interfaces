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
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of suma method, of class InterfacesUD6.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        int a = 35;
        int b = 15;
        InterfacesUD6 instance = new InterfacesUD6();
        int expResult = 40;
        int result = instance.suma(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of mayor method, of class InterfacesUD6.
     */
    @Test
    public void testMayor() {
        System.out.println("mayor");
        double a = -12.5;
        double b = 12.5;
        InterfacesUD6 instance = new InterfacesUD6();
        boolean expResult = false;
        boolean result = instance.mayor(a, b);
        assertEquals(expResult, result);
        System.out.println("Primer Test Pasado");
        a = 14;
        b= 13.99;
        expResult = true;
        result = instance.mayor(a, b);
        assertEquals(expResult, result);
        System.out.println("Segundo Test Pasado");
        // TODO review the generated test code and remove the default call to fail.

    }


    /**
     * Test of resta method, of class InterfacesUD6.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        double a = 0.0;
        double b = 0.0;
        InterfacesUD6 instance = new InterfacesUD6();
        double expResult = 0.0;
        double result = instance.resta(a, b);
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
