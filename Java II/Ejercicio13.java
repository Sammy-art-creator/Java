import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        // Validación: repetir hasta que sea positivo
        do {
            System.out.print("Introduce un número entero positivo: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Error: el número debe ser positivo.");
            }
        } while (n <= 0);

        // Suma de los 100 números siguientes
        long suma = 0;
        for (int i = n + 1; i <= n + 100; i++) {
            suma += i;
        }

        System.out.println("La suma de los 100 números siguientes a " + n + " es: " + suma);
        sc.close();
    }
}