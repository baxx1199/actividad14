
package controlador;
import javax.swing.JOptionPane;

public class CajaTres implements Runnable{
    @Override
    public void run() {
        String nombre;
        int i= 1;
                 
            nombre = JOptionPane.showInputDialog("Digite la persona registrada en la caja 3: ");
            System.out.println("la persona  " + i + " Ingresada en la caja 3 es: " + nombre);
        
        while ( i<5 && nombre != null ){
          nombre = JOptionPane.showInputDialog("Digite la persona registrada en la caja 3: ");
            
          System.out.println("la persona " + i + " Ingresada en la caja 3 es: " + nombre); i++;   
        }
        
        
        
        System.out.println("------------------------------------------------------ " );
         JOptionPane.showMessageDialog(null,"INSERTE LOS DATOS DE LA SIGUIENTE CAJA  ");
         
    }

}
