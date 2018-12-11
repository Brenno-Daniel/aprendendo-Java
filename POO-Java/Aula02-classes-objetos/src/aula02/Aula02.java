/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

/**
 *
 * @author brenno
 */
public class Aula02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        //-------------EXEMPLO CANETA---------//
        //Instancia da caneta 1
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.destampar();
        c1.statusCaneta();
        c1.rabiscar();
        
        //Instancia da caneta 2
        Caneta c2 = new Caneta();
        c2.modelo = "Bic";
        c2.cor = "Preta";
        c2.tampar();
        c2.statusCaneta();
        c2.rabiscar();
        //-------------EXEMPLO CANETA---------//
        */

        //-------------EXEMPLO PENDRIVE-------//
        //Instancia Pendrive 1
        Pendrive p1 = new Pendrive();
        p1.modelo = "Sandisk";
        p1.cor = "Vermelho/ preto";
        p1.capacidade = 8;
        p1.conectar();
        p1.statusPen();
        p1.utilizar();
        p1.salvarArquivo();
        
        //Instancia Pendrive 2
        Pendrive p2 = new Pendrive();
        
        //-------------EXEMPLO PENDRIVE-------//
    }
    
}
