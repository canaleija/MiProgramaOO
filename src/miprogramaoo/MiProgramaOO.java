/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprogramaoo;

/**
 *
 * @author Roberto Cruz Leija
 */
public class MiProgramaOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Alumno erick = new Alumno(231, "upiiz", "primero", "Erick", 23, 45.5, 1.78, 'm', "Guadalupe");
                erick.setNombre("Erick Gurrola");
       
        System.out.println("Hola, soy "+erick.getNombre());
                
    }
    
}
