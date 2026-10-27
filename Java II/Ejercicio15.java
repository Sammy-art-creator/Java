import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = sc.nextInt();

        int invertido = 0;
        while (n > 0) {
            int digito = n % 10;              // último dígito
            invertido = invertido * 10 + digito; // lo añade al final
            n = n / 10;                        // quita el último dígito
        }

        System.out.println("Al revés: " + invertido);
        sc.close();
    }
}