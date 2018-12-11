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
public class Caneta {
    
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada; //Mesmo o atributo estando como privado, ainda pode-se alterá-lo através dos métodos de tampar e destampar pois são públicos e estão na mesma classe
    
    public void statusCaneta(){
        //"this" faz referencia ao próprio objeto que chama o método/ atributo
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
        
    }
    
    public void rabiscar(){
        
        if(this.tampada == true){
            System.out.println("ERRO! A caneta está tampada.\n");
        }else{
            System.out.println("Rabiscando...\n");
        }
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
    
}
