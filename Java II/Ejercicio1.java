import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese dia de la semana, para conocer la asignatura: ");
        String dia = scanner.nextLine();
        switch (dia.toLowerCase()) {
            case "lunes":
                System.out.println("El lunes toca Base de datos");
                break;
            case "martes":
                System.out.println("El martes toca Sistemas informáticos");
                break;
            case "miercoles":
                System.out.println("El miércoles toca programación");
                break;
            case "jueves":
                System.out.println("El jueves toca Bases de datos");
                break;
            case "viernes":
                System.out.println("El viernes toca Entornos de desarrollo");
                break;
            default:
                System.out.println("No hay clase ese día");
                break;
    }
}
}