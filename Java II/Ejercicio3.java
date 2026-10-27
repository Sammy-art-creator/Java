import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese primera nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Ingrese segunda nota: ");
        double nota2 = scanner.nextDouble();
        double media = (nota1 + nota2) / 2;

        if (media >= 5) {
            System.out.println("Aprobado con una media de: " + media);
        } else {
            System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
            String resultado = scanner.next();
            if (resultado.equalsIgnoreCase("apto")) {
                System.out.println("Aprobado con recuperación, media de: " + 5);
            } else if (resultado.equalsIgnoreCase("no apto")) {
                System.out.println("Suspendido con una media de: " + media);
            } else {
                System.out.println("Resultado de recuperación no válido.");
            }
        }

    }
}
