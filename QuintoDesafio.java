/*@author Gabriel Victor.
 *@classroom Técnologo em Redes de Computadores - Fase 2.
 *@challenge
*/
import java.util.Scanner;
import java.util.ArrayList;

public class QuintoDesafio {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    ArrayList<String> nomes = new ArrayList<String>();
    String nome;

    for(int ciclo = 1; ciclo <= 10; ciclo++) {
        System.out.println("Informe um nome: ");
		nome = scan.next();
        nomes.add(nome);
    }

    System.out.println("Os nomes estão divididos e ordenados em par de 1 a 5, escolha 1 para comparar: ");
    int par = scan.nextInt();

    if (par == 1) {
            if (nomes.get(0).length() < nomes.get(1).length()) {
            System.out.println("O nome "+nomes.get(0)+" é mais curto do que o "+nomes.get(1));
        }
        else {
            System.out.println("O nome "+nomes.get(1)+" é mais curto do que o "+nomes.get(0));
        }
        if (nomes.get(0).length() > nomes.get(1).length()) {
            System.out.println("O nome "+nomes.get(0)+" é mais longo do que o "+nomes.get(1));
        }
        else {
            System.out.println("O nome "+nomes.get(1)+" é mais longo do que o "+nomes.get(0));
        }
    }

    if (par == 2) {
            if (nomes.get(2).length() < nomes.get(3).length()) {
            System.out.println("O nome "+nomes.get(2)+" é mais curto do que o "+nomes.get(3));
        }
        else {
            System.out.println("O nome "+nomes.get(3)+" é mais curto do que o "+nomes.get(2));
        }
        if (nomes.get(3).length() > nomes.get(2).length()) {
            System.out.println("O nome "+nomes.get(3)+" é mais longo do que o "+nomes.get(2));
        }
        else {
            System.out.println("O nome "+nomes.get(2)+" é mais longo do que o "+nomes.get(3));
        }
    }

    if (par == 3) {
        if (nomes.get(4).length() < nomes.get(5).length()) {
        System.out.println("O nome "+nomes.get(4)+" é mais curto do que o "+nomes.get(5));
        }
        else {
        System.out.println("O nome "+nomes.get(5)+" é mais curto do que o "+nomes.get(4));
        }
        if (nomes.get(5).length() > nomes.get(4).length()) {
        System.out.println("O nome "+nomes.get(5)+" é mais longo do que o "+nomes.get(4));
        }
        else {
        System.out.println("O nome "+nomes.get(4)+" é mais longo do que o "+nomes.get(5));
        }
    }

    if (par == 4) {
        if (nomes.get(6).length() < nomes.get(7).length()) {
        System.out.println("O nome "+nomes.get(6)+" é mais curto do que o "+nomes.get(7));
        }
        else {
        System.out.println("O nome "+nomes.get(7)+" é mais curto do que o "+nomes.get(6));
        }
        if (nomes.get(6).length() > nomes.get(7).length()) {
        System.out.println("O nome "+nomes.get(6)+" é mais longo do que o "+nomes.get(7));
        }
        else {
        System.out.println("O nome "+nomes.get(7)+" é mais longo do que o "+nomes.get(6));
        }
    }

    if (par == 5) {
        if (nomes.get(8).length() < nomes.get(9).length()) {
        System.out.println("O nome "+nomes.get(8)+" é mais curto do que o "+nomes.get(9));
        }
        else {
        System.out.println("O nome "+nomes.get(9)+" é mais curto do que o "+nomes.get(8));
        }
       if (nomes.get(9).length() > nomes.get(8).length()) {
        System.out.println("O nome "+nomes.get(9)+" é mais longo do que o "+nomes.get(8));
        }
        else {
        System.out.println("O nome "+nomes.get(8)+" é mais longo do que o "+nomes.get(9));
        }
    }
    }
}