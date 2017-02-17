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
public class Persona {
    
    // definir atributos (variables, tipos de datos)
    String nombre;
    int edad;
    double peso;
    double estatura;
    char sexo;
    String procedencia;
    // definir comportamientos (metodos)
    
    // METODO CONSTRUCTOR defecto
    public Persona(){
      nombre = "";
      edad = 0;
      peso = 0;
      estatura = 0;
      sexo = 'i';
      procedencia = "desconocido";
    
    }
    
    // sobre cargar el constructor 
    public Persona(String nombre, int edad,
                double peso,double estatura,char sexo,
                String procedencia){
      this.nombre = nombre;
      this.edad = edad; 
      this.peso = peso; 
      this.estatura = estatura; 
      this.sexo = sexo; 
      this.procedencia = procedencia; 
      
    }
    
    public Persona(Persona persona){
      this.nombre = persona.nombre;
      this.edad = persona.edad;
      this.estatura = persona.estatura;
      this.procedencia = persona.procedencia;
      this.sexo = persona.sexo;
      this.peso = persona.peso;
    }
        
    void saludar(){
        // a la persona que salude
        System.out.println("Hola! soy "+nombre);
    }
    
}
