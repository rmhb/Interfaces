/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dam.rental.Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author NASA
 */
public class ConectarDB {
    private static final String HOST = "super.choto.es:3306";
    private static final String  USER = "unalumno";
    private static final String PW = "soyunalumno2022";
    private static final String DBNAME = "alu_rental";
    public static Connection con;
            
    public static void conectar(){
        con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://"+HOST+"/"+DBNAME,USER,PW);
        } catch (SQLException ex) {
            Logger.getLogger(ConectarDB.class.getName()).log(Level.SEVERE, "Problema al realizar la conexión con la base de datos.", ex);
        }
    }   
    public static void cerrar(ResultSet rs, PreparedStatement st){
        try {
            if(rs!=null) rs.close();
            if(st!=null) st.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConectarDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static ObservableList<Persona> obtenerPersonas(){
        String sql = "SELECT * FROM personas";
        ResultSet rs = null;
        ObservableList<Persona> filas =  FXCollections.observableArrayList();
        ArrayList<String> f = null;
        PreparedStatement stmt = null;
        Persona p;
        
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            ResultSetMetaData  meta = rs.getMetaData();     
            f = new ArrayList<>(meta.getColumnCount());
            int i;
            while(rs.next()){
                i=1;
                while(i <= meta.getColumnCount()){
                    f.add(rs.getString(i++));
                }
                 p = new Persona( f.get(1).toString(), f.get(2).toString(), 
                         f.get(3).toString(), f.get(4).toString(), f.get(5).toString(), f.get(6).toString());
                 f.clear();
                 filas.add(p);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ConectarDB.class.getName()).log(Level.SEVERE, "Error al realizar la consulta", ex);
        }finally{
            cerrar(rs,stmt);
        }
        return filas;
    }
    
    
}
