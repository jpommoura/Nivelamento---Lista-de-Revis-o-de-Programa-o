import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num = entrada.nextInt();
        while (num < 0) {
            System.out.println("Seu número não pode ser negativo. Tente novamente!");
            num = entrada.nextInt();
        }

        int fatorial = 1;
        if (num > 0) {
            for (int i = num; i > 0; i--) {
                fatorial *= i;
            }
        }

        System.out.print("Fatorial de " + num + ": " + fatorial);
    }
}
