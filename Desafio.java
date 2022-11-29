import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Desafio {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int numero;
    List<Integer> numeros = new ArrayList<>();

    for (int ciclo = 0; ciclo < 10; ciclo++) {
        System.out.println("Informe o "+(ciclo+1)+"° numero: ");
        numero = scan.nextInt();
        numeros.add(numero);
    }
    
    }
}
