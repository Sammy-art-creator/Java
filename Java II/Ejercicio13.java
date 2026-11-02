import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero positivo: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Error: el número debe ser positivo.");
        }
        else {
            // Suma de los 100 números siguientes
            int suma = 0;
            int i;
            for ( i = 1; i <= 100; i++) {
                suma = suma + (num + i);
            }
            System.out.println("La suma de los 100 números siguientes a " + num + " es: " + suma);
        }
    }
}