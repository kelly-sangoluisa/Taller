package Negocio;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class OpcionesUsuario {
    
    public Icon setIcono(String url, JButton boton)
    {
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int ancho = boton.getWidth();
        int alto = boton.getHeight();
        ImageIcon icono = new  ImageIcon(icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        return icono;
    }
    // si se presiona que se haga mas pequeña 
    public Icon setIconoPresinado (String url, JButton boton, int ancho, int alto) {
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int weight = boton.getWidth() - ancho;
        int height = boton.getHeight() - alto;
        ImageIcon icono = new  ImageIcon(icon.getImage().getScaledInstance(weight, height, Image.SCALE_DEFAULT));
        return icono;        
    }
    
    public void cargarImagenBoton(JButton boton, String imagen)
    {
        boton.setIcon(setIcono(imagen, boton));
        boton.setPressedIcon(setIconoPresinado(imagen, boton,1, 1));
    }
}
