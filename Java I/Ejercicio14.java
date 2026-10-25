import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la base imponible: ");
        int base = scanner.nextInt();
        System.out.print("Ingrese el tipo de IVA (reducido o general): ");
        String tipoiva = scanner.next();
        System.out.print("Ingrese la promoción (mitad, nopromo): ");
        String promo = scanner.next();

        double iva;
        if (tipoiva.equalsIgnoreCase("reducido")) {
            iva = 0.10;
        } else if (tipoiva.equalsIgnoreCase("general")) {
            iva = 0.21;
        } else {
            System.out.println("Tipo de IVA no válido");
            return;
        }

        double ivafinal = base * iva;
        double mitad;
        if (promo.equalsIgnoreCase("mitad")) {
            mitad = (base + ivafinal) / 2;
        } else if (promo.equalsIgnoreCase("nopromo")) {
            mitad = 0;
        } else {
            System.out.println("Promoción no válida");
            return;
        }
        
        double total = base + ivafinal - mitad;
        System.out.println("Base Imponible: " + base);
        System.out.println("Tipo de IVA: " + tipoiva);
        System.out.println("IVA final: " + ivafinal);
        System.out.println("Promoción: " + promo);
        System.out.println("Cod. Promoción: " + mitad);
        System.out.println("Total: " + total);
    }
}