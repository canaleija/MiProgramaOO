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
        
        juan.saludar();
        
        Persona maria = new Persona("María Guadalupe",
                         11, 45, 1.90, 'f', "El molino"); 
        maria.edad = 45;
        maria.estatura = 1.56;
        maria.nombre = "Maria Guadalupeeee";
        maria.procedencia = "Trancoso";
        maria.sexo = 'f';
        maria.peso = 78;
        
        maria.saludar();
        
        Persona miguelito = new Persona();
        miguelito.edad = 18;
        miguelito.estatura = 1.70;
        miguelito.nombre = "Martin Barraza";
        miguelito.procedencia = "La Benito";
        miguelito.sexo ='M';
        miguelito.peso = 70;
        
        miguelito.saludar();
        
        System.out.println();
                
    }
    
}
