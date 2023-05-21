import java.util.Scanner;

public class EjemploPreguntas {
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer por teclado
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("¿Cuál es tu nombre? ");
        String nombre = scanner.nextLine();

        
        System.out.print("¿Cuántos años tienes? ");
        int edad = scanner.nextInt();

        System.out.println("Hola " + nombre + ", tienes " + edad + " años.");

        // Cerramos el objeto Scanner
        scanner.close();
    }
}

