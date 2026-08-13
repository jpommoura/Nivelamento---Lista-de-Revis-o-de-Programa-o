import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[3];
        System.out.println("Digite um numero inteiro(restantes: 3): ");
        int x = scanner.nextInt();
        vetor[0] = x;
        System.out.println("Digite outro numero inteiro(restantes: 2): ");
        int y = scanner.nextInt();
        vetor[1] = y;
        System.out.println("Digite outro numero inteiro(restantes: 1): ");
        int z = scanner.nextInt();
        vetor[2] = z;

        int maior = vetor[0];
        int menor = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
            else if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        if (y < z) {
            if (x >= y && x <= z) {
                System.out.println(x + " está dentro do intervalo fechado de " + y + "e " + z + ".");
            }
            else {
                System.out.println(x + " está fora do intervalo fechado de " + y + "e " + z + ".");
            }
        }
        else if (y > z) {
            if (x >= z && x <= y) {
                System.out.println(x + " está dentro do intervalo fechado de " + z + "e " + y + ".");
            }
            else {
                System.out.println(x + " está fora do intervalo fechado de " + z + "e " + y + ".");
            }
        }
        else {
            if (x == y) {
                System.out.println(x + " está dentro do intervalo fechado de " + y + "e " + z + ".");
            }
            else {
                System.out.println(x + " está fora do intervalo fechado de " + y + "e " + z + ".");
            }
        }

        // DIVISIBILIDADE POR 0 É UM ERRO AQUI, CONSERTAR
        if (x % y == 0) {
            System.out.println(x + " é divisível por " + y + ".");
        }
        if (x % z == 0) {
            System.out.println(x + " é divisível por " + z + ".");
        }
    }
}
