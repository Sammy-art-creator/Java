import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de dolares: ");
        double dolares = scanner.nextDouble();
        double euros = dolares / 1.08;
        System.out.println(dolares + " dolares son equivalentes a:");
        System.out.println(euros + " euros");
    }
}
