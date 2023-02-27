package exercicioNumerosAleatórios;

import java.util.Random;

public class NumerosAleatórios {
    public static void main(String[] args) {
        Random random = new Random();

        int [] numerosAleatorios = new int[20];

        for (int i = 0; i <numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;

        }
        System.out.print("numeros aleatorios: ");
        for(int numero : numerosAleatorios){
            System.out.println(numero + " ");

        }
        System.out.print("\nSucessores dos numeros aleatorios: ");
        for(int numero : numerosAleatorios) {
            System.out.print((numero + 1) + " ");
        }
            System.out.print("\nAntecessores dos numeros aleatorios: ");
            for(int numero : numerosAleatorios){
                System.out.println((numero - 1) + " ");
            }

    }
}
