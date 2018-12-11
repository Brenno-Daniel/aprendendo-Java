/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

/**
 *
 * @author brenno
 * 
 * EXEMPLO PRATICO, EXERCICIO CONTA DE BANCO
 */
public class Aula05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Instancia do primeiro cliente com CONTA CORRENTE
        ContaBanco c1 = new ContaBanco();
        c1.setNumConta(1111);
        c1.setDono("Jubileu");
        c1.abrirConta("CC");
        
        //c1.depositar(50);
        //c1.sacar(10);
        //c1.pagarMensal();
        
        c1.estadoConta();
        
        //Instancia do segundo cliente com CONTA POUPANÇA
        ContaBanco c2 = new ContaBanco();
        c2.setNumConta(2222);
        c2.setDono("Creuza");        
        c2.abrirConta("CP");
        
        //c2.depositar(100);
        //c2.sacar(50);
        //c2.pagarMensal();
        
        c2.estadoConta();
    }
    
}
