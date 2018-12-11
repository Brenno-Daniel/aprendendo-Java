/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

import java.util.Scanner;

/**
 *
 * @author brenno
 */
public class ContaBanco {
    
    public int numConta;
    private String dono;
    protected String tipo;
    private float saldo;
    private boolean status;

    public void abrirConta(String t){
        
        this.setTipo(t);
        this.setStatus(true);
        
        
        if(t == "CC"){
            
            this.setSaldo(50);
            
        }else if(t == "CP"){
            
            this.setSaldo(150);
            
        }
        System.out.println("Conta aberta com sucesso!");
    }
    
    public void fecharConta(){
        if(this.getSaldo() > 0){
            
            System.out.println("A conta tem dinheiro.");            
            
        }else if(this.getSaldo() < 0){            
            
            System.out.println("A conta está com débito.");
            
        }else{
            
            this.setStatus(false);
            System.out.println("A conta foi fechada.");
            
        }
    }
    
    public void depositar(float v){
                
        if(this.getStatus()){
            
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito efetuado na conta de " + this.getDono());
            
        }else{
            
            System.out.println("Não é possível depositar.");        
        
        }
    }
    
    public void sacar(float v){
        
               
        if(this.getStatus()){
            
            if(this.getSaldo() >= v){
                
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque efetuado na conta de " + this.getDono());
                
            }else{
                
                System.out.println("Saldo insuficiente.");
                
            }
        }else{
            
            System.out.println("Não é possível sacar.");
            
        }
    }
    
    public void pagarMensal(){
        
        float v = 0;
        
        if(getTipo() == "CC"){
            
           v = 12;
           
        }else if(getTipo() == "CP"){
            
           v = 20;
           
        }
        
        if(getStatus()){
            
            if(getSaldo() > v){
                
                setSaldo(getSaldo() - v);
                System.out.println("Mensalidade paga com sucesso por " + this.getDono());
                
            }else{
                
                System.out.println("Saldo insuficiente!");
                
            }            
        }else{
            
            System.out.println("Impossível pagar mensalidade!");
            
        }        
    }

        
    public void estadoConta(){
        System.out.println("*---------------------------*");
        System.out.println("N° da conta: "+ getNumConta());
        System.out.println("Dono: "+ getDono());
        System.out.println("Tipo: "+ getTipo());
        System.out.println("Saldo: "+ getSaldo());
        System.out.println("Status: "+ getStatus());
        System.out.println("*---------------------------*");
    }
    
    
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }
    
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        
        this.dono = dono;
    }

    public String getTipo() {
                
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
