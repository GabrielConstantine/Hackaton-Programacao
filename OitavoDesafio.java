/*@author Gabriel Victor.
 *@classroom Técnologo em Redes de Computadores - Fase 2.
 *@challenge Implementar o calculo fatorial de um numero qualquer num while e numa recursividade.
 */
import java.util.Scanner;

public class OitavoDesafio {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Informe um numero inicial (1 a 5): ");
    int numInicial = scan.nextInt();
    
    while (numInicial <= 5) {
    if(numInicial == 1) {
        System.out.println("!"+numInicial+" = "+numInicial);
        System.out.println("!"+numInicial+" = "+numInicial+" = "+numInicial);
    }
    if(numInicial == 2) {
        System.out.println("!"+numInicial+" = "+numInicial);
        System.out.println("!"+numInicial+" = "+numInicial+" = "+numInicial);
        System.out.println("!"+numInicial+" = "+numInicial+" * "+(numInicial-1)+" = "+(numInicial * (numInicial -1)));
    }
    if(numInicial == 3) {
        System.out.println("!"+numInicial+" = "+numInicial);
        System.out.println("!"+numInicial+" = "+numInicial+" = "+numInicial);
        System.out.println("!"+numInicial+" = "+numInicial+" * "+(numInicial-1)+" = "+(numInicial * (numInicial -1)));
        int resultadoFatorial = numInicial * (numInicial-1) * (numInicial-2);
        System.out.println("!"+numInicial+" = "+numInicial+" * "+(numInicial-1)+" * "+(numInicial-2)+" = "+resultadoFatorial);
    }
    if(numInicial == 4) {
        System.out.println("!"+numInicial+" = "+numInicial);
        System.out.println("!"+numInicial+" = "+numInicial+" = "+numInicial);
        System.out.println("!"+numInicial+" = "+numInicial+" * "+(numInicial-1)+" = "+(numInicial * (numInicial -1)));
        int resultadoFatorial = numInicial * (numInicial-1) * (numInicial-2);
        System.out.println("!"+numInicial+" = "+numInicial+" * "+(numInicial-1)+" * "+(numInicial-2)+" = "+resultadoFatorial);
        int resultadoFatorial4 = numInicial * (numInicial-1) * (numInicial-2) * (numInicial-3);
        System.out.println("!"+numInicial+" = "+numInicial+" * "+(numInicial-1)+" * "+(numInicial-2)+" * "+(numInicial-3)+" = "+resultadoFatorial4);
        break;
    }
    if(numInicial == 5) {
        System.out.println("!"+numInicial+" = "+numInicial);
        System.out.println("!"+numInicial+" = "+numInicial+" = "+numInicial);
        System.out.println("!"+numInicial+" = "+numInicial+" * "+(numInicial-1)+" = "+(numInicial * (numInicial -1)));
        int resultadoFatorial = numInicial * (numInicial-1) * (numInicial-2);
        System.out.println("!"+numInicial+" = "+numInicial+" * "+(numInicial-1)+" * "+(numInicial-2)+" = "+resultadoFatorial);
        int resultadoFatorial4 = numInicial * (numInicial-1) * (numInicial-2) * (numInicial-3);
        System.out.println("!"+numInicial+" = "+numInicial+" * "+(numInicial-1)+" * "+(numInicial-2)+" * "+(numInicial-3)+" = "+resultadoFatorial4);
        int resultadoFatorial5 = numInicial * (numInicial-1) * (numInicial-2) * (numInicial-3) * (numInicial-4);
        System.out.println("!"+numInicial+" = "+numInicial+" * "+(numInicial-1)+" * "+(numInicial-2)+" * "+(numInicial-3)+" * "+(numInicial-4)+" = "+resultadoFatorial5);
        break;
    }
    }
    }
}