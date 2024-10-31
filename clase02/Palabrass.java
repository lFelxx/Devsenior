import java.util.Scanner;

public class Palabrass {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("¡Hola!, porfavor ingresa 3 palabras");
        System.out.println("Ingresa la primera palabra ");
        var Pa1 = scanner.nextLine();
        System.out.println("Ingrese la segunda palabra ");
        var Pa2 = scanner.nextLine();
        System.out.println("Ingrese la tercera palabra");
        var Pa3 = scanner.nextLine();

        System.out.println("La primera palabra es " + Pa1 + " y tiene " + Pa1.length() + " caracteres");
        System.out.println("La segunda palabra es " + Pa2 + " y tiene " + Pa2.length() + " caracteres");
        System.out.println("La tercera palabra es " + Pa3 + " y tiene " + Pa3.length() + " caracteres");

        scanner.close();
    }

}
