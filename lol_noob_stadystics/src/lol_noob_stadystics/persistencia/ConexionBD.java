/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lol_noob_stadystics.persistencia;
import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;
/**
 *
 * @author Usuario
 */
public class ConexionBD {
    private static final String URL = "jdbc:mysql://localhost:3306/lol_stadystic";
    private static final String USUARIO = "root";
    private static final String CLAVE = "";
    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL,USUARIO, CLAVE); 
        
        
        
    }
    
}
