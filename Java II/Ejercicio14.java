import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.print("Introduce n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // Espacios
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Subida: 1 hasta i
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Bajada: i-1 hasta 1
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}