import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese edad: ");
        int edad = scanner.nextInt();
        System.out.print("Ingrese niveles de estudio: ");
        int nivel = scanner.nextInt();
        System.out.println("Ingrese sus ingresos:");
        int ingresos = scanner.nextInt();
        String mensaje = ((edad <= 28 && nivel > 3) || (edad<30 && ingresos>28000) ) ? "Verdadero" : "Falso";
        System.out.println(mensaje);
    }
}
