/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escreverArq;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author brenno
 */
public class escrever {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{	
            
            Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o texto para salvar:");

		String texto = scanner.nextLine();

		FileWriter filewriter = new FileWriter("/home/brenno/Documentos/aprendendo-Java/arquivoTeste.txt");

		PrintWriter printwriter = new PrintWriter(filewriter);

		printwriter.print(texto);

		filewriter.close();
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
    
}
