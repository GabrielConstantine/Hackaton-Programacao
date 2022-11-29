/*@author Gabriel Victor.
 *@classroom Técnologo em Redes de Computadores - Fase 2.
 *@challenge Imprimir o nome informado pelo usuario ao contrario.
 */
import java.util.Scanner;

public class QuartoDesafio {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String nome, contrario = "";

    System.out.println("Informe o seu nome: ");
    nome = scan.nextLine();

        for(int cont = nome.length()-1; cont >= 0; cont--){
            contrario += String.valueOf(nome.charAt(cont));
            
        }
        System.out.println("\nNome ao contrario: "+contrario);
    }
}