package exercicioNota;

import java.util.Scanner;

public class ExercicioNota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("nota:");
        nota = scan.nextInt();

        while (nota <0 | nota > 10) {
            System.out.println("nota inválida! digite novamente");
            nota = scan.nextInt();

        }

    }
}
