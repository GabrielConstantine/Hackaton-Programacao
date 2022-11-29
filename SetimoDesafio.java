/*@author Gabriel Victor.
 *@classroom Técnologo em Redes de Computadores - Fase 2.
 *@challenge Imprima uma matriz com o numero de colunas e linhas sendo informada pelo usuarios e os numeros nela sendo aleatorio.
 */
import java.util.Scanner;
import java.util.Random;

public class SetimoDesafio {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Random aleatorio = new Random();
    int colunas, linhas;

    System.out.println("Informe o numero de colunas da matriz (1 a 6): ");
    colunas = scan.nextInt();
    System.out.println("Informe o numero de linhas da matriz (1 a 6): ");
    linhas = scan.nextInt();

    for(int matriz = 1; matriz <= linhas; matriz++) {
        int numeros = aleatorio.nextInt(100);
        if (colunas == 1) {
            System.out.println("| "+numeros+" |");
    }
        if (colunas == 2) {
            System.out.println("| "+numeros+" |"+(numeros = aleatorio.nextInt(100)));
    }
        if (colunas == 3) {
            System.out.println("| "+numeros+" |"+(numeros = aleatorio.nextInt(100))+" | "+(numeros = aleatorio.nextInt(100)));
    }
        if (colunas == 4) {
            System.out.println("| "+numeros+" | "+(numeros = aleatorio.nextInt(100))+" | "+(numeros = aleatorio.nextInt(100))+" | "+(numeros = aleatorio.nextInt(100)));
    }
        if (colunas == 5) {
            System.out.println("| "+numeros+" | "+(numeros = aleatorio.nextInt(100))+" | "+(numeros = aleatorio.nextInt(100))+" | "+(numeros = aleatorio.nextInt(100))+" | "+(numeros = aleatorio.nextInt(100)));
    }
        if (colunas == 6) {
            System.out.println("| "+numeros+" | "+(numeros = aleatorio.nextInt(100))+" | "+(numeros = aleatorio.nextInt(100))+" | "+(numeros = aleatorio.nextInt(100))+" | "+(numeros = aleatorio.nextInt(100))+" | "+(numeros = aleatorio.nextInt(100)));
    }
    }
    }
}