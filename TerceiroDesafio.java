/*@author Gabriel Victor.
 *@classroom Técnologo em Redes de Computadores - Fase 2.
 *@challenge Imprimir numeros impares e pares ao mesmo tempo entre 2 numeros informados pelo usuario.
 */
import java.util.Scanner;

public class TerceiroDesafio {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int numero, numeroFinal;

    System.out.println("Informe um numero: ");
    numero = scan.nextInt();
    System.out.println("Informe outro numero: ");
    numeroFinal = scan.nextInt();
    System.out.println();

    for(;numero <= numeroFinal; numero++) {

        if (numero % 2 ==0) {
            System.out.println("----------");
            System.out.println("Numero Par: "+numero);
        }
        else {
            System.out.println("----------");
            System.out.println("Numero Impar: "+numero);
        }
    }
    }
}