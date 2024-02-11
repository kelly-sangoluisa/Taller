package Negocio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OpcionesLogin {
     //Realizamos la conexion con la base de datos
    Conexion con = new Conexion();
    //llamando a la clase conexion 
    Connection cn = con.getConection();
    
    public boolean validarUsuario (int usuario, String contrasenia){
        try{
            
            String ingresar="Select CEDULA_CLIENTE, CONTRA_CLIENTE from CLIENTE WHERE CEDULA_CLIENTE ="+usuario+" and CONTRA_CLIENTE='"+contrasenia+"'";
            PreparedStatement pps = cn.prepareStatement(ingresar);
            ResultSet rs = pps.executeQuery();
            return rs.next();
            //si existe el cliente  nos devuelve verdadero y si  no falso ,lo utilizaremos para ingresar en el login ,deja pasar a la cartelera
        }catch(SQLException e){
            return false;
        }
    }
    
    //si no existe verdadero si el usuario no exite , y falso si exite sirve para crear un nuevo cliiente y que no se repita la primary key
    public boolean validarIdUnico (int usuario){
        try{
            
            String ingresar="Select CEDULA_EMPLEADO from EMPLEADO WHERE CEDULA_EMPLEADO ="+usuario;
            PreparedStatement pps = cn.prepareStatement(ingresar);
            ResultSet rs = pps.executeQuery();
            return (!rs.next()); // esta libre
            
        }catch(SQLException e){
            return false;  // ya esta ocupado 
        }
    }
    public String obtenerNombreUsuario (int usuario){
      try{
            String nombre="";
            String apellido="";
            String ingresar="Select NOMBRE_CLIENTE, APELLIDO_CLIENTE from cliente WHERE CEDULA_CLIENTE ="+usuario;
            PreparedStatement pps = cn.prepareStatement(ingresar);
            ResultSet rs = pps.executeQuery();
            while(rs.next()){
                nombre = rs.getString("NOMBRE_CLIENTE");
                apellido = rs.getString("APELLIDO_CLIENTE");
            }
            String nombreCompleto = nombre + apellido;
            nombreCompleto = nombreCompleto.replaceAll("\\s+", " ");
            System.out.println(nombreCompleto);
            return nombreCompleto;
            
        }catch(SQLException e){
            return "error";
        }
    }
}
