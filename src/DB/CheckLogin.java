/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DB;
import java.sql.*;
/**
 *
 * @author Nasa
 */
public class CheckLogin {
    
//  
    public void compruebaUsuario(){
        try{
            Statement stmt = (Statement) ConnectDB.getCon().createStatement();
            String query = "SELECT * FROM usuarios";
            String query2 = "INSERT INTO usuarios(nombre,apellidos, login) VALUES ('Mariano','Lombardo','mlombardo')";
            if ( stmt.executeUpdate(query2)!=0)
            {
                System.out.println( "Listado nombres Usuario: ·");
                ResultSet allResults = stmt.executeQuery(query);
                while (allResults.next()) {
                    System.out.println("Nombre:  "+allResults.getString("nombre"));
                }
            }
        } catch(Exception e){
            System.out.println("CAgada al hacer la consulta "+e.getMessage());
        }
    }
    
    
}
