
package controlador;

import vista.Vista;
import modelo.Modelo;
import javax.swing.JFrame;

public class controlador {

   
    private Modelo m ;
    private Vista v;

    public controlador(Modelo m, Vista v) {
        this.m = m;
        this.v = v;
    }
    public void iniciarVentana(){
        m.iniciar();
    }
    public static void ejecutarHilos(){
        Thread hilo1 = new Thread (new CajaUno()); 
        Thread hilo2 = new Thread (new CajaDos());
        Thread hilo3 = new Thread (new CajaTres());
        Thread hilo4 = new Thread(new Color());
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        
    }
    public static void consultarCaja() throws InterruptedException{
        ejecutarHilos();
    }
    public void cerrarprograma(){
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
