import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int clave = 7476;
        int intentos = 4;
        while (intentos >0) {
            System.out.println("Ingrese clave de acceso: ");
            int pass = scanner.nextInt();

            if ( clave == pass) {
                System.out.println("La caja se ha abierto satisfactoriamente");
            } else {
                intentos--;
                System.out.println("Lo siento, esa no es la combinacion correcta");
            }
        }
    }
}
