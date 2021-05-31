
package controlador;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CajaDos implements Runnable{
   @Override
    public void run() {
        String nombre;
        int i= 1;
                 
            nombre = JOptionPane.showInputDialog("Digite la persona registrada en la caja 2: ");
            System.out.println("La persona  " + i + " Ingresada a la caja 2 es: " + nombre);
        
        while ( i<5 && nombre != null ){
          nombre = JOptionPane.showInputDialog("Digite la persona registrada en la caja 2: ");
            
          System.out.println("La persona  " + i + " Ingresada de la caja 2 es: " + nombre); i++;   
        }
        
        System.out.println("------------------------------------------------------ " );
        JOptionPane.showMessageDialog(null,"INSERTE LOS DATOS DE LA SIGUIENTE CAJA  ");
    }
 
}
