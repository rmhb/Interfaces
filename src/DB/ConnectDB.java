/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DB;
import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author Nasa
 */
public class ConnectDB {
   
    private static final String URL_DB =  "jdbc:mysql://localhost:3306/javanet";;
    private static final String USER_DB ="javanet";
    private static final String PW_DB = "1234qwerty";  

    public static Connection getCon(){
        Connection  conex = null;
        try{
            conex = DriverManager.getConnection(URL_DB, USER_DB, PW_DB);
        }catch(Exception e){
            System.out.println(" Ha habido problema a la hora de obtener la conexión con la DB "+e.getMessage());
        } 
        return conex;
    }
    

    
}
