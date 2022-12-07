/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dam.rental.Models;

import com.dam.rental.App;
import com.dam.rental.LoginController;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author NASA
 */
public class Vehiculos {
    private int id;
    private String marca;
    private String modelo;
    private String antiguedad;
    private String chasis;
    private String color;
    private int plazas;

    public Vehiculos(int id, String marca, String modelo, String antiguedad, String chasis, String color, int plazas) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.antiguedad = antiguedad;
        this.chasis = chasis;
        this.color = color;
        this.plazas = plazas;
    }
    public ObservableList<Vehiculos> getVehiculos(){
        int id = 0;
        String marca = "";
        String modelo = "";
        String fechaFab = "";
        String chasis = "";
        String color = "";
        int plazas = 0;
        
        ObservableList<Vehiculos> brum = FXCollections.observableArrayList();
        Connection conn;
            // Login con bbagg6@tmall.com   vlVO3U
            try {
                conn = DriverManager.getConnection("jdbc:mysql://super.choto.es:3306/alu_rental", "unalumno", "soyunalumno2022");
                PreparedStatement stmt = conn.prepareStatement("SELECT * FROM coche ORDER BY 2");
                ResultSet rs = stmt.executeQuery();
                
                while(rs.next()){
                    id = rs.getInt(1);
                    marca = rs.getString(2);
                    modelo = rs.getString(3);
                    fechaFab = rs.getString(4);
                    chasis = rs.getString(5);
                    color = rs.getString(6);
                    plazas = rs.getInt(7);
                    Vehiculos vh = new Vehiculos (id, marca, modelo, fechaFab, chasis, color, plazas);
                    brum.add(vh);
                }
               
            } catch (SQLException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
            return brum;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + this.id;
        hash = 47 * hash + Objects.hashCode(this.marca);
        hash = 47 * hash + Objects.hashCode(this.modelo);
        hash = 47 * hash + Objects.hashCode(this.antiguedad);
        hash = 47 * hash + Objects.hashCode(this.chasis);
        hash = 47 * hash + Objects.hashCode(this.color);
        hash = 47 * hash + this.plazas;
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
        final Vehiculos other = (Vehiculos) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.plazas != other.plazas) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        if (!Objects.equals(this.antiguedad, other.antiguedad)) {
            return false;
        }
        if (!Objects.equals(this.chasis, other.chasis)) {
            return false;
        }
        return Objects.equals(this.color, other.color);
    }

    @Override
    public String toString() {
        return "Vehiculos{" + "id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", antiguedad=" + antiguedad + ", chasis=" + chasis + ", color=" + color + ", plazas=" + plazas + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(String antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }
    
 
    
    
    

}
