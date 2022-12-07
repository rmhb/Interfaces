/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dam.rental.Models;

import com.dam.rental.LoginController;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author NASA
 */
public class Alquiler {
    private int id_al;
    private String marca_al;
    private String modelo_al;
    private String nombre_al;
    private String apellido_al;
    private LocalDate fecha_al;  

    public  Alquiler(int id_al, String marca_al, String modelo_al, LocalDate fecha_al, String nombre_al, String apellido_al) {
        this.id_al = id_al;
        this.marca_al = marca_al;
        this.modelo_al = modelo_al;
        this.nombre_al = nombre_al;
        this.apellido_al = apellido_al;
        this.fecha_al = fecha_al;
    }
    
    
    public static ObservableList<Alquiler> getAlquileres(){
        int id = 0;
        String marca = "";
        String modelo = "";
        LocalDate fecha;
        String nombre = "";
        String Apellidos = "";
        
        
        ObservableList<Alquiler> brum = FXCollections.observableArrayList();
        Connection conn;
            // Login con bbagg6@tmall.com   vlVO3U
            try {
                conn = DriverManager.getConnection("jdbc:mysql://super.choto.es:3306/alu_rental", "unalumno", "soyunalumno2022");
                PreparedStatement stmt = conn.prepareStatement("SELECT r.id, c.marca, c.modelo, r.fecha, p.name, p.surname FROM coche as c, rental as r, personas as p WHERE c.id = r.car AND p.id=r.person");
                ResultSet rs = stmt.executeQuery();
                
                while(rs.next()){
                    id = rs.getInt(1);
                    marca = rs.getString(2);
                    modelo = rs.getString(3);
                    fecha = rs.getDate(4).toLocalDate();
                    nombre = rs.getString(5);
                    Apellidos = rs.getString(6);
                    
                    Alquiler vh = new Alquiler (id, marca, modelo, fecha, nombre, Apellidos);
                    brum.add(vh);
                }
               
            } catch (SQLException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
            return brum;
    }

    
}
