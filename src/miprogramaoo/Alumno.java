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
public class Alumno extends Persona {
    private int matricula;
    private String campus;
    private String semestre;
      
    public Alumno (int matricula, String campus, String semestre,String nombre, int edad,
                double peso,double estatura,char sexo,
                String procedencia)
    {super(nombre, edad, peso, estatura, sexo, procedencia);
     
     this.matricula=matricula;
     this.campus=campus;
     this.semestre=semestre;
    
    }
    
//    public Alumno(){
//    
//    matricula=0;
//    campus="unknown";
//    semestre="unknown";
//   
//    
//    }
//    
    public int getMatricula(){
        return matricula;
    }
    public void setMatricula(int matricula){
    this.matricula=matricula;
    }
    
    public String getCampus(){
    return campus;
    }
    public void setCampus(String campus){
    this.campus=campus;
    }
    



    /**
     * @param semestre the semestre to set
     */
    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    @Override
    public void saludar(){
        // a la persona que salude
        System.out.println("Hola! soy "+getNombre()+" y estudio en "+campus);
    }
    

    
}

