/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.dam.interfacesud6;

/**
 *
 * @author NASA
 */
public class InterfacesUD6 {

     public int suma(int a, int b){
        return a+b;
    }
    public boolean mayor(double a, double b){
        boolean res = false;
        if (a > b)
            res = true;
        return res;
    }
    public double resta(double a , double b){
        double res;
        if(mayor(a,b))
            res = a-b;
        else
            res=b-a;
        return res;
    }
    public double division(double a , double b){
        double res;
        if(mayor(a,b))
            res = a/b;
        else if(a!=0)
            res=b/a;
        else
            res = 0;
        return res;
    }
    public double mult(double a, double b){
        return a*b;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
    }
   
}
