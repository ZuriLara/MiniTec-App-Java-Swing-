/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author zurim
 */
public class conexionMysql {
   static String url="jdbc:mysql://localhost:3306/MiniTec";
   static String user="root";
   static String pass="mysql24";
    
    public static Connection conectar (){
        Connection con = null;
        
        try{
            con=DriverManager.getConnection(url, user, pass);
            System.out.println("Conexion Exitosa");
        }catch(SQLException e){
        e.printStackTrace();
        }
        return con;
    }
    
}
