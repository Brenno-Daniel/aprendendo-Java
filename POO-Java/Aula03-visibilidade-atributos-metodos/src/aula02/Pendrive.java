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
    
    public String modelo;
    public String cor;
    protected int capacidade;
    private boolean conectado;
    private boolean espacoInterno;
    
    public void statusPen(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Capacidade: " + this.capacidade);
        System.out.println("Está conectado? " + this.conectado);
        System.out.println("Tem espaço? " + this.espacoInterno);
    }
    
    public void utilizar(){
        if(this.conectado == false){
            System.out.println("O pendrive está desconectado!");
        }else{
            System.out.println("O pendrive está conectado.");
        }
    }
    public void conectar(){
        this.conectado = true;
    }
    public void desconectar(){
        this.conectado = false;
    }
    public void salvarArquivo(){
        if(this.espacoInterno == false){
            System.out.println("O pendrive está cheio! Apague arquivos desnecessários para liberar espaço.\n");
        }else{
            System.out.println("O pendrive está vazio, você pode salvar arquivos.\n");
        }
    }
    public void cheio(){
        this.espacoInterno = false;
    }
    public void vazio(){
        this.espacoInterno = true;
    }
        
}
