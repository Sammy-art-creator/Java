import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intentos = 0;
        while (intentos < 3) {
            System.out.println("Ingrese clave de acceso: ");
            String clave = scanner.nextLine();

            if (clave.equals("7476")) {
                System.out.println("La caja se ha abierto satisfactoriamente");
                break;
            } else {
                intentos++;
                System.out.println("Lo siento, esa no es la combinacion correcta");
            }
        }
    }
}
