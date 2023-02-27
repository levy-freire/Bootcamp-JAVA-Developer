package exercicioNumerosInteiros;

public class NumerosInteiros {
    public static void main(String[] args) {
        int[] vetor= {-5, -6, 15, 20, 7,3};

        System.out.println("valor: ");
        int count = 0;

        while(count < (vetor.length)) {
            System.out.print(vetor[count] + " ");
            count++;
        }
        System.out.println("\nvetor: ");
        for (int i= (vetor.length - 1); i >= 0; i-- ){
            System.out.print(vetor[i]+ " ");
        }

    }
}
