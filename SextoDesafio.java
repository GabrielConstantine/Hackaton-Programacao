/*@author Gabriel Victor.
 *@classroom Técnologo em Redes de Computadores - Fase 2.
 *@challenge
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class SextoDesafio {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    ArrayList<String> colecaoNomes = new ArrayList<String>();
    
    for(int ciclo = 1;  ciclo <= 5; ciclo++) {
    System.out.println("Informe o "+ciclo+"° nome: ");
    String nome = scan.next();
    colecaoNomes.add(nome);
    }

    System.out.println("---------------------------");

    for(int ciclo = 6;  ciclo <= 10; ciclo++) {
        System.out.println("Informe o "+ciclo+"° nome: ");
        String nome = scan.next();
        colecaoNomes.add(nome);
    }

    Collection nomes = new ArrayList();
    for (int cicloF = 1; cicloF <= 10; cicloF++) {
        nomes.add(colecaoNomes);
    }

    nomes = Collections.singleton(new HashSet(nomes));
    for (Object object : nomes) {
        System.out.println(object.toString());
    }

    }
}