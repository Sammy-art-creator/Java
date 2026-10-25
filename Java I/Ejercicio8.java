import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese base imposible: ");
        double base = scanner.nextDouble();
        double iva = base * 0.21;
        double total = base + iva;
        System.out.println(base + " euros son equivalentes a:");
        System.out.println(iva + " euros de IVA");
        System.out.println(total + " euros de total facturado");
    }
}