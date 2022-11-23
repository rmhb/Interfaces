/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dam.rental;

import java.util.Objects;

/**
 *
 * @author NASA
 */
public class Persona {
    String name;
    String surname;
    String email;
    String gender;
    String avatar;
    String password;

    public Persona(String name, String surname, String email, String gender, String avatar, String password) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.gender = gender;
        this.avatar = avatar;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
