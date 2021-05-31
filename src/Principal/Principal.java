
package Principal;
import vista.Vista;
import modelo.Modelo;
import controlador.controlador;

public class Principal {

    public static void main(String[] args) {
          Modelo m = new Modelo();
           Vista v = new Vista();
           controlador c = new controlador(m,v);
           c.iniciarVentana();
           c.cerrarprograma();
           
         
    }
}
