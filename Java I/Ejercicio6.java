import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner eurosScanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de euros: ");
        double euros = eurosScanner.nextDouble();
        double dolares = euros * 1.08;
        System.out.println(euros + " euros son equivalentes a:");
        System.out.println(dolares + " dólares");
    }
}
