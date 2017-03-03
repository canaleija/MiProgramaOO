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
        
        
        Alumno martin = new Alumno(34567, "UPIIZ","Cuarto", "Martin Alejandro", 20, 80, 1.90, 'm',"San Luis");
        martin.saludar();
        
        Persona javier = new Persona("Javier", 34, 60, 1.98,'m',"Aguascalientes");
        javier.saludar();
        
        Persona alejandra = new Alumno(34566, "cecyt18", "primero","Alejandra Fernanda", 15, 55, 1.60, 'f',"Guadalupe");
        alejandra.saludar();
        
        Alumno alejandraAlumno = (Alumno)alejandra;
        alejandraAlumno.saludar();
        
    }
    
}
