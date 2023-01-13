/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.dam.raya_al;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
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
public class PrimaryControllerTest {
    
    public PrimaryControllerTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }

    
     /**
     * Test of testcheckCol method, of class PrimaryController.
     */
    @Test
    public void testcheckCol() {
        System.out.println("checkCol");
        int expected = 0;
        PrimaryController obj = new PrimaryController();
        //obj.rellenarTableroValores();        
        obj.genArrayLabels();
        

        int actual = obj.checkCol();
        System.out.println("Valor actual "+actual);
        assertEquals(expected, actual);

        fail("The test case is a prototype.");
    }
}
