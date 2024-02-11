package Negocio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Opciones {
    //Realizamos la conexion con la base de datos
    Conexion con = new Conexion();
    //llamando a la clase conexion 
    Connection cn = con.getConection();
    
    public void opcioness (String mysql){
        try 
        { 
            //Conectamos a la base de datos y le pasamos la sentencia mysql 
            PreparedStatement pps = cn.prepareStatement(mysql);
            //se ejecuta todo lo anterior en mysql.
            pps.executeUpdate(); 
        } 
        catch (Exception e) 
        {
            //Insert code
        }  
    }
      
    public void cargarTabla(DefaultTableModel tblAux, JTable tblTablaCine,String nombreTabla,String[] Titulos,int id){
       tblAux.setRowCount(0);
        try {
        PreparedStatement pps = cn.prepareStatement(nombreTabla);    
        ResultSet rs = pps.executeQuery();
            tblAux = (DefaultTableModel) tblTablaCine.getModel();
            Object[] variableTabla = new Object[id];
            while (rs.next()){
                try{
                    for(int i=0;i<id;i++){
                       variableTabla[i]=rs.getObject(Titulos[i]);
                    }
                }catch(SQLException ex){
                        System.out.println("error1");  
                }
                tblAux.addRow(variableTabla);
            }
            tblTablaCine.setModel(tblAux);
        } catch (Exception ex) {
            System.out.println("error2");      
        }
    }

      //obtner el numero de elemtos que tenga una tabla.
    public int numElemtos(String sql)
    {
        int n = 0;
        try {
        PreparedStatement pps = cn.prepareStatement(sql);    
        ResultSet rs = pps.executeQuery();
            while (rs.next()){
                n++;
            }
        } catch (Exception ex) {
            System.out.println("error2");      
        }
        return n;        
        
    }
     //obtner los los idSala de la tabla asiento sala en un arreglod de int 
    public int[] extraerAsiento_Sala(int sala, int x){
        int n = 0;
        int[] salas_As = new int[x];
        try {
        PreparedStatement pps = cn.prepareStatement("SELECT * FROM asiento_sala where IdSalaA = "+sala);    
        ResultSet rs = pps.executeQuery();
            while (rs.next()){
                salas_As[n]= (int) rs.getObject("IdAsiento_Sala");
                n++;
            }
        } catch (Exception ex) {
            System.out.println("error2");      
        }
        return salas_As;
    }
    //utilizamos en escoger asientos para obtener la pk de asiento 
    public int pk(int x, String tabla)
    {
        int n = 0;
        try {
        PreparedStatement pps = cn.prepareStatement("SELECT * FROM asiento_sala where IdAsiento_Sala = "+x);    
        ResultSet rs = pps.executeQuery();
            while (rs.next()){
                n = (int) rs.getObject("IdAsientoS");
            }
        } catch (Exception ex) {
            System.out.println("error2");      
        }
        return n;        
        
    }    
  
}
