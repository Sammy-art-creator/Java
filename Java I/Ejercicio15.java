import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la nota del primer examen: ");
        double nota1 = scanner.nextDouble();
        System.out.print("¿Qué nota quieres sacar en el trimestre?: ");
        double mediadeseada = scanner.nextDouble();
        double nota2 = (mediadeseada - (nota1*0.4))/0.6;
        System.out.println("Para tener un " + mediadeseada + " en el trimestre necesitas sacar un " + nota2 + " en el segundo examen.");

    }
}
