/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06;

/**
 *
 * @author brenno
 */
public class ControleRemoto implements Controlador {
    
    //***Atributos***
    private int volume;
    private boolean ligado;
    private boolean tocando;
   
    //***Metodos Especiais***
    
    //Construtor
    public ControleRemoto(){
    
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    
    }
    
    
    //Getters and Setters
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    
    //Implementação dos métodos abstratos
    public void ligar(){
    
        this.setLigado(true);
        System.out.println("ligando...");
        
    }
    
    public void desligar(){
    
        this.setLigado(false);
        System.out.println("Desligando...");
    
    }
    
    public void abrirMenu(){
    
        System.out.println("");
        System.out.println("-----MENU-----");
        System.out.println("Ligado: " + this.getLigado());        
        System.out.println("Tocando: " + this.getTocando());
        System.out.print("Volume: " + this.getVolume());
        
        for (int i = 0; i <= this.getVolume(); i += 10){
        
            System.out.print(" | ");
        
        }
        System.out.println("");
    }
    
    public void fecharMenu(){
                    
        System.out.println("");
        System.out.println("Fechando Menu...");
        
    }
    
    public void maisVolume(){
    
        if (this.getLigado()){
        
            this.setVolume(this.getVolume() + 1);
            System.out.println("Botão mais volume foi apertado.");
            
        }
    
    }
    
    public void menosVolume(){
    
        if (this.getLigado()){
            
            this.setVolume(this.getVolume() - 1);
            System.out.println("Botão menos volume foi apertado.");
            
        }
    
    }
    
    public void ligarMudo(){
    
        if (this.getLigado() && this.getVolume() > 0){
            
            this.setVolume(0);
            System.out.println("Botão ligar mudo foi apertado.");
            
        }
        
    }
    
    public void desligarMudo(){
    
        if (this.getLigado() && this.getVolume() == 0){
            
            this.setVolume(50);
            System.out.println("Botão desligar mudo foi apertado.");
            
        }
    
    }
    
    public void play(){
    
        if (this.getLigado() && this.getTocando() == false){
            
            this.setTocando(true);
            System.out.println("Botão play foi apertado.");
            
        }
    
    }
    
    public void pause(){
    
        if (this.getLigado() && this.getTocando() == true){
            
            this.setTocando(false);
            System.out.println("Botão pause foi apertado.");
            
        }
    
    }
    
    
    
}
