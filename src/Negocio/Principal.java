package Negocio;

import VistaUsuario.JFCartelera;
import VistaUsuario.JFLogin;
import java.sql.Connection;


public class Principal {

    public static void main(String[] args) {
//        JFCartelera jfcartelera = new JFCartelera();
//        jfcartelera.setVisible(true);
       //  JFLogin jflogin = new JFLogin();
       //jflogin.setVisible(true);
//       
      
        
        // Llama al método getConection de la clase Conexion
         Conexion conexion = new Conexion();
        conexion.getConection();
       
    }
    
}
