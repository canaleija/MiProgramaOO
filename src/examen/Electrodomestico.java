/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author Roberto Cruz Leija
 */
public class Electrodomestico {
    
    // atributos 
    private double precio;
    private  String color;
    private  char consumo;
    private  double peso;
    // defecto
    public Electrodomestico (){
     precio = 0;
     color = "desconocido";
     consumo = ' ';
     peso = 0;
    }
    
     public Electrodomestico (double precio, double peso){
     this.precio = precio;
     color = "desconocido";
     consumo = ' ';
     this.peso = peso;
    }
    public Electrodomestico (double precio, double peso, String color, char consumo){
     this.precio = precio;
     this.color = color;
     this.consumo = consumo;
     this.peso = peso;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the consumo
     */
    public char getConsumo() {
        return consumo;
    }

    /**
     * @param consumo the consumo to set
     */
    public void setConsumo(char consumo) {
        this.consumo = consumo;
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
    
    
    
}
