/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractoInterfaces;

/**
 *
 * @author Roberto Cruz Leija
 */
public class TelefonoCelular implements Mensajero {

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("pin pin pin "+mensaje);
    
    
    }
    
}
