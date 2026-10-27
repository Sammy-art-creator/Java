import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = scanner.nextInt();
        int digitos = 0;
        do {
            numero /= 10;
            digitos++;
        } while (numero != 0);
        System.out.println("El numero tiene " + digitos + " digitos.");
    }
}
