import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int num2 = scanner.nextInt();
        String mensaje = (num1 > num2) ? "El segundo numero es menor" : "El primer numero es menor";
        System.out.println(mensaje);
    }
}
