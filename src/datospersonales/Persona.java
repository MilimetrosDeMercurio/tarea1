/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datospersonales;

/**
 *
 * @author Margarita
 */
public class Persona {
    //Definicion de Atributos
    String Nombre,Apellidos;
    int Edad,FechadeNacimiento;
    
    //Funciones
    
    public void Nombre(){
        System.out.println("Jennifer Margarita");
        
    }
    public void Apellido(){
        System.out.println("Serrano Barahona");
        
    }
    public void Edad(){
        System.out.println("19 anios");
        
    }
    public void FechadeNacimiento(){
        System.out.println("30 Septiembre 1998");
        
    }
    public void Imprimirdatos(){
        System.out.println("Mis Datos");
        System.out.println("Nombres: " + "Jennifer " + "Margarita");
        System.out.println("Apellidos: " + "Serrano " + "Barahona");
        System.out.println("Fecha de nacimiento: " + "30" + " Septiembre" + " 1998");
        System.out.println("Edad: " + " 19 anios ");
        System.out.println("Carrera: " + "Ingeniería Informática ");
        
    
}
    
    
}
