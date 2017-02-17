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
        
        
        Persona juan = new Persona();
        juan.edad = 23;
        juan.estatura = 1.55;
        juan.nombre = "Juan Alberto";
        juan.procedencia = "Hacienda Nueva";
        juan.sexo = 'm';
        juan.peso = 87.5;
       
      
        
        Persona maria = new Persona("María Guadalupe",
                         11, 45, 1.90, 'f', "El molino"); 
        
       
        Persona clon_Maria = new Persona(maria);
       
        
        System.out.println();
                
    }
    
}
