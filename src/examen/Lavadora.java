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
public class Lavadora extends Electrodomestico {
   
    private double carga;
    
    public Lavadora (){
       this.carga = 0;
    }
    
    public Lavadora(double precio,double peso){
       super(precio,peso);
        this.carga = 0;
    }
    public Lavadora(double precio, double peso, String color, char consumo,double carga){
      super(precio,peso,color,consumo);
      this.carga = carga;
    }

    /**
     * @return the carga
     */
    public double getCarga() {
        return carga;
    }
   
    
}
