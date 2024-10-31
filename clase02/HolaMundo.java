import java.util.Scanner;

/**
 * HolaMundo
 */
public class HolaMundo {

    public static void main(String[] args) {
        System.out.println("Hola mundo!");

        var scanner = new Scanner(System.in);
        System.out.print("Porfavor ingrese un numero: ");
        var entero = scanner.nextLine();
        scanner.close();

        System.out.println(entero);
    }

}