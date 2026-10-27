import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese numero positivo hasta 5 cifras: ");
        int num = scanner.nextInt();
        if (num < 0 || num > 99999) {
            System.out.println("Número no válido. Debe ser positivo y de hasta 5 cifras.");
        } else {
            int original = num;
            int invertido = 0;
            while (num > 0) {
                int cifra = num % 10;
                invertido = invertido * 10 + cifra;
                num = num / 10;
            }
            if (original == invertido) {
                System.out.println("El número es capicúa.");
            } else {
                System.out.println("El número no es capicúa.");
            }
        }
    }
}
