
package controlador;
import vista.Vista;
import modelo.Modelo;
import javax.swing.JOptionPane;

public class CajaUno implements Runnable {

    @Override
    public void run() {
        String nombre;
      
        int i= 1;
                 
            nombre = JOptionPane.showInputDialog("Digite la persona registrada en la caja 1: ");
            System.out.println("La persona " + i + " Ingresado en la caja 1 es: " + nombre);
        
        while ( i<5 && nombre != null ){
          nombre = JOptionPane.showInputDialog("Digite la persona registrada en la caja 1: ");
            
          System.out.println("La persona " + i + " Ingresada en la caja 1 es: " + nombre); i++;   
        }
        
        
         System.out.println("------------------------------------------------------ " );
         JOptionPane.showMessageDialog(null,"INSERTE LOS DATOS DE LA SIGUIENTE CAJA  ");
    }
    
    
}
