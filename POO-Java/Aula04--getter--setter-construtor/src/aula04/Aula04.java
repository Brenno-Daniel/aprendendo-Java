/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;

/**
 *
 * @author brenno
 * 
 * Métodos Acessores (Getters), Métodos Modificadores (Setters) e Métodos Construtores (Construct)
 */
public class Aula04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Caneta c1 = new Caneta("Modelo 1", "Azul", 5.0f, 100, true);
        c1.statusCaneta();
        System.out.println("\n");
        Caneta c2 = new Caneta("Modelo 2", "Preta", 2.0f, 80, false);
        c2.statusCaneta();
        System.out.println("\n");
        Caneta c3 = new Caneta("Modelo 3", "Verde", 1.5f, 50, true);
        c3.statusCaneta();
        
    }
    
}
