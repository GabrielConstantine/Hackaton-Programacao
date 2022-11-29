/*@author Gabriel Victor.
 *@classroom Técnologo em Redes de Computadores - Fase 2.
 *@challenge Fazer o usuario informar 10 numeros. Agora informe o menor, maior e a media deles.
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

public class PrimeiroDesafio {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int numero, media;
    ArrayList<Integer> numeros = new ArrayList<Integer>();
    
    for (int ciclo = 1; ciclo <= 10; ciclo++) {
        System.out.println("Informe o "+ciclo+"° numero: ");
        numero = scan.nextInt();
        numeros.add(numero);
    }
    System.out.println("Informe um par comparativo (1 a 5): ");
    int par = scan.nextInt();

    if(par == 1) {
        System.out.println("O menor numero do primeiro par: "+(Math.min(numeros.get(0), numeros.get(1))));
        System.out.println("O maior numero do primeiro par: "+(Math.max(numeros.get(0), numeros.get(1))));  
    }
    if(par == 2) {
        System.out.println("O menor numero do segundo par: "+(Math.min(numeros.get(2), numeros.get(3))));
        System.out.println("O maior numero do segundo par: "+(Math.max(numeros.get(2), numeros.get(3)))); 
    }
    if(par == 3) {
        System.out.println("O menor numero do terceiro par: "+(Math.min(numeros.get(4), numeros.get(5))));
        System.out.println("O maior numero do terceiro par: "+(Math.max(numeros.get(4), numeros.get(1)))); 
    }
    if(par == 4) {
        System.out.println("O menor numero do quarto par: "+(Math.min(numeros.get(6), numeros.get(7))));
        System.out.println("O maior numero do quarto par: "+(Math.max(numeros.get(6), numeros.get(7)))); 
    }
    if(par == 5) {
        System.out.println("O menor numero do quinto par: "+(Math.min(numeros.get(8), numeros.get(9))));
        System.out.println("O maior numero do quinto par: "+(Math.max(numeros.get(8), numeros.get(9)))); 
    }

    media = numeros.get(0)+numeros.get(1)+numeros.get(2)+numeros.get(3)+numeros.get(4);
    media = (numeros.get(6)+numeros.get(6)+numeros.get(7)+numeros.get(8)+numeros.get(9))/10;
    System.out.println("A media dos 10 numeros é  "+media);
    }
}