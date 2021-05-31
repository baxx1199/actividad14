
package modelo;
import javax.swing.JFrame;
import vista.Vista;

public class Modelo {
    String nombre;
    Vista v = new Vista();
    public void iniciar(){
    
        v.setVisible(true);
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v.setLocationRelativeTo(null);
    }
}
