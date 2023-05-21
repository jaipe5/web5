import java.util.Scanner;

public class Edad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int edad;
        String nombre;

        System.out.print("Ingrese su edad: ");
        edad = input.nextInt();

        System.out.println("Tu edad es: " + edad);
        input.nextLine();

        System.out.print("Ingrese su nombre: ");
        nombre = input.nextLine();

        System.out.println("Tu nombre es: " + nombre);

        input.close();

    }
}

