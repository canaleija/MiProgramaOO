/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracto;

/**
 *
 * @author Roberto Cruz Leija
 */
public class PalomaMensajera extends Mensajero{

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Cu Cu Cu! "+mensaje);
    }
    
}
