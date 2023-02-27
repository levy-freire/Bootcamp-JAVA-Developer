package exercicioParImpar;

import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0;
        int quantImpares = 0;


        int count = 0;

        System.out.println("quantidade de numeros: ");
        quantNumeros = scan.nextInt();

        do {
            System.out.println("numero: ");
            numero = scan.nextInt();

            if (numero % 2 == 0 ) quantPares ++;
            else quantImpares++;

            count = count + 1;

        }while (count < quantNumeros);

        System.out.println("quantidade de pares: " + quantPares);
        System.out.println("quantidade de impares: "+ quantImpares);

    }
}
