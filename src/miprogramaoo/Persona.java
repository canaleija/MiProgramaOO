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
    
    
    void saludar(){
        // a la persona que salude
        System.out.println("Hola! soy "+nombre);
    }
    
}
