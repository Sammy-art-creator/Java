import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese numero: ");
    int n = scanner.nextInt();

    String mensaje = (n>=0)? "El numero absoluto es: " + n : "El numero absoluto es: " + Math.abs(n);
    System.out.println(mensaje);
    }
}

