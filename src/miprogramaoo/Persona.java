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
    private String nombre;
    private int edad;
    private double peso;
    private double estatura;
    private char sexo;
    private String procedencia;
    // definir comportamientos (metodos)
    
    // METODO CONSTRUCTOR defecto
//    public Persona(){
//      nombre = "";
//      edad = 0;
//      peso = 0;
//      estatura = 0;
//      sexo = 'i';
//      procedencia = "desconocido";
//    
//    }
    
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
        
    public void saludar(){
        // a la persona que salude
        System.out.println("Hola! soy "+getNombre());
    }
    // metodo para obtener mi valor de edad
    public int getEdad(){
      return this.edad;
    }
    public void setEdad(int edad){
      this.edad = edad;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the estatura
     */
    public double getEstatura() {
        return estatura;
    }

    /**
     * @param estatura the estatura to set
     */
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    /**
     * @return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the procedencia
     */
    public String getProcedencia() {
        return procedencia;
    }

    /**
     * @param procedencia the procedencia to set
     */
    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }
    
}
