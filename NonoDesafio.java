import java.util.Random;
import java.util.ArrayList;

public class NonoDesafio {
    public static void main(String[] args) {
    Random aleatorio = new Random();
    ArrayList<Integer> matrizA = new ArrayList<Integer>();
    ArrayList<Integer> matrizB = new ArrayList<Integer>();
    int numberA, numberB;
    
    System.out.println("Matriz:");
    for (int ciclo = 1; ciclo <= 3; ciclo++) {
        System.out.println("| "+(numberA = aleatorio.nextInt(16))+" | "+(numberB = aleatorio.nextInt(16))+" |");
        matrizA.add(numberA);
        matrizB.add(numberB) ;

        if(ciclo == 3) {
            System.out.println("\nMatriz transporta:");
            System.out.println("| "+matrizA.get(0)+" | "+matrizA.get(1)+" |"+matrizA.get(2)+" |");
            System.out.println("| "+matrizB.get(0)+" | "+matrizB.get(1)+" |"+matrizB.get(2)+" |");
        }
    }
    }
}