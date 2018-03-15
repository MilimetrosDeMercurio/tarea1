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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Persona Margarita = new Persona();

        Margarita.Nombre();
        Margarita.Apellido();
        Margarita.Edad();
        Margarita.FechadeNacimiento();
        System.out.println("Forma 2");
        Margarita.Imprimirdatos();
    }
}