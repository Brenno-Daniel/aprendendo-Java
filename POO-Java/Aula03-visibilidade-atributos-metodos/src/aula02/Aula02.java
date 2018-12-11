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
        
        //-------------EXEMPLO CANETA---------//
        //Instancia da caneta 1
        Caneta c1 = new Caneta();
        c1.modelo = "Modelo 1";
        c1.cor = "Verde";
        //c1.ponta = 0.5f;
        c1.carga = 80;
        c1.tampar();
        c1.statusCaneta();
        c1.rabiscar();
        
        //Instancia da caneta 2
        Caneta c2 = new Caneta();
        c2.modelo = "Modelo 2";
        c2.cor = "Preto";
        c2.carga = 50;
        c2.destampar();
        c2.statusCaneta();
        c2.rabiscar();
        //-------------EXEMPLO CANETA---------//
        

        //-------------EXEMPLO PENDRIVE-------//
        //Instancia Pendrive 1
        Pendrive p1 = new Pendrive();
        p1.modelo = "Pd1";
        p1.cor = "Preto e vermelho";
        p1.capacidade = 12;
        p1.conectar();
        p1.vazio();
        p1.statusPen();
        p1.utilizar();
        p1.salvarArquivo();
        
        //Instancia Pendrive 2
        Pendrive p2 = new Pendrive();
        p1.modelo = "Pd2";
        p1.cor = "Prata";
        p1.capacidade = 32;
        p1.desconectar();
        p1.cheio();
        p1.statusPen();
        p1.utilizar();
        p1.salvarArquivo();
        //-------------EXEMPLO PENDRIVE-------//
    }
    
}
