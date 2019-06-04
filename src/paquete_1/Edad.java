
package paquete_1;

import javax.swing.JOptionPane;

public class Edad {
   private int edad_peapel;
    
    public void pedirEdad(){
        edad_peapel = Integer.parseInt(JOptionPane.showInputDialog("Escribe tu edad"));
    }
    
    public void pedirEdad_2(){
        edad_peapel = Integer.parseInt(JOptionPane.showInputDialog("Escribe tu edad otra vez amigo"));
       
    } 
   
}
