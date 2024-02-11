package Negocio;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    public static Connection getConection(){
        String URL = "jdbc:sqlserver://localhost:1433;"+"database=Prueba;"+"user=sa;"+"password=P@ssw0rd;"+ "encrypt=false;" + "trustServerCertificate=false;";
        Connection con = null;
        try{
            con = (Connection)DriverManager.getConnection(URL);
            System.out.println("Conectado");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return con;
    }
}
