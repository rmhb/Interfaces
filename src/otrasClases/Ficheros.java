/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package otrasClases;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author NASA
 */
public class Ficheros {
    
    public static ArrayList recuperaDatosFichero(String nombreFich, ArrayList Objetos){
        try{
            FileInputStream file = new FileInputStream(nombreFich);
            ObjectInputStream inputFile = new ObjectInputStream(file);
            boolean endOfFile=false;
            while(!endOfFile){
                try{
                    Objetos.add(inputFile.readObject());
                }catch(EOFException e){
                    endOfFile = true;
                }
                catch(Exception f){
                    JOptionPane.showMessageDialog(null, f.getMessage());
                }
            }
            inputFile.close();
        
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return Objetos;
    }
    
    public static void saveClaseToFile(String nombreFich, ArrayList Objeto){
        try{
            FileOutputStream file = new FileOutputStream(nombreFich);
            ObjectOutputStream outputFile = new ObjectOutputStream(file);
            
            for(int i=0 ; i < Objeto.size() ; i++ ){
                outputFile.writeObject(Objeto.get(i)); 
            }
            outputFile.close();
            JOptionPane.showMessageDialog(null, "Guardado Correctamente");
            
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
}
