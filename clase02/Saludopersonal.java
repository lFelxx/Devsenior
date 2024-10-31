import java.util.Scanner;

public class Saludopersonal {
        public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println(" Ingresa tu nombre porfavor");
        var name = scanner.nextLine();
        System.out.print(name + ", bienvenido al curso de Programación en Java!!!");

        scanner.close();
    }
}
