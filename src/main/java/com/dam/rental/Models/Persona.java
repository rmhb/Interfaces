/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dam.rental.Models;

import java.util.Objects;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author NASA
 */
public class Persona {
    //IntegerProperty id = new SimpleStringProperty();
    StringProperty name = new SimpleStringProperty();
    StringProperty surname = new SimpleStringProperty();
    StringProperty email = new SimpleStringProperty();
    StringProperty gender = new SimpleStringProperty();
    StringProperty avatar = new SimpleStringProperty();
    StringProperty password = new SimpleStringProperty();
    
    String nombre;
    String apellido;

    public Persona( String name, String surname, String email, String gender, String avatar, String password) {
      //  this.id.set(id);
        this.name.set(name);
        this.surname.set(surname);
        this.email.set(email);
        this.gender.set(gender);
        this.avatar.set(avatar);
        this.password.set(password);
    }
    public Persona(String name, String surname, String email) {
        this.name.setValue(name);
        this.surname.setValue(surname);
        this.email.setValue(email);
    }
    
    public Persona(String nombre, String apellidos){
        this.nombre = nombre;
        this.apellido = apellidos;
    }

    public String getName() {
        return this.name.get();
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getSurname() {
       return this.surname.get();
    }

    public void setSurname(String surname) {
         this.surname.set(surname);
    }

    public String getEmail() {
        return this.email.get();
    }

    public void setEmail(String email) {
        this.email.setValue(email);
    }

    public String getGender() {
        return this.gender.get();
    }

    public void setGender(String gender) {
        this.gender.setValue(gender);
    }

    public String getAvatar() {
        return this.avatar.get();
    }

    public void setAvatar(String avatar) {
        this.avatar.setValue(avatar);
    }

    public String getPassword() {
        return this.password.get();
    }

    public void setPassword(String password) {
        this.password.setValue(password);
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Persona other = (Persona) obj;
        return Objects.equals(this.email, other.email);
    }

    @Override
    public String toString() {
        return "Persona{" + "name=" + name + ", surname=" + surname + ", email=" + email + ", gender=" + gender + ", avatar=" + avatar + ", password=" + password + '}';
    }
    
            
          
    
    
}
