/*@author Gabriel Victor.
 *@classroom Técnologo em Redes de Computadores - Fase 2.
 *@challenge Informar numeros impares na tela de 1 a 50 e depois os pares.
 */

public class SegundoDesafio {
    public static void main(String[] args) {
    
    System.out.println("---- Numeros Impares (1 a 50) ----");
    for(int numImpar = 1; numImpar <=50; numImpar = numImpar + 2) {
        System.out.println(numImpar);
    }
    System.out.println("\n---- Numeros pares (1 a 50) ----");
    for(int numPar = 2; numPar <=50; numPar = numPar + 2) {
        System.out.println(numPar);
    }
    }
}