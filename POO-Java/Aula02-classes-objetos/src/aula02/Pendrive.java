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
public class Pendrive {
    
    String modelo;
    String cor;
    int capacidade;
    boolean conectado;
    boolean espacoInterno;
    
    void statusPen(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Capacidade: " + this.capacidade);
        System.out.println("Está conectado? " + this.conectado);
        System.out.println("Tem espaço? " + this.espacoInterno);
    }
    
    void utilizar(){
        if(this.conectado == false){
            System.out.println("O pendrive está desconectado!");
        }else{
            System.out.println("O pendrive está conectado.");
        }
    }
    void conectar(){
        this.conectado = true;
    }
    void desconectar(){
        this.conectado = false;
    }
    void salvarArquivo(){
        if(this.espacoInterno == false){
            System.out.println("O pendrive está cheio! Apague arquivos desnecessários para liberar espaço.");
        }else{
            System.out.println("O pendrive está vazio, você pode salvar arquivos.");
        }
    }
    void cheio(){
        this.espacoInterno = false;
    }
    void vazio(){
        this.espacoInterno = true;
    }
        
}
