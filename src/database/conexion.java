/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexion {
    
    public static final String URL = "jdbc:mariadb://localhost:3306/integradora";
    public static final String USER = "root";
    public static final String CLAVE = "";
    
    public Connection getConexion(){
        Connection con = null;
        try {
            //Class.forName("com.mariadb.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USER, CLAVE);
            System.out.println("La conexion fue exitosa");
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return con;
    }
}