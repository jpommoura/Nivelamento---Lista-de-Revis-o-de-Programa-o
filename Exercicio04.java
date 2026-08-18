import java.util.Scanner;
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho da lista X: ");
        int n = scanner.nextInt();
        int[] X = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Digite um elemento: ");
            X[i] = scanner.nextInt();
        }
        System.out.println("Digite o tamanho da lista Y: ");
        int m = scanner.nextInt();
        int[] Y = new int[m];
        for (int i = 0; i < n; i++) {
            System.out.println("Digite um elemento: ");
            Y[i] = scanner.nextInt();
        }
        
        int[] Z = new int[]; // colocar o tamanho do vetor aqui
        
        // terminar o codigo
    }
}
