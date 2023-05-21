import java.util.Scanner;

public class EjemploScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Leer una cadena
        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Tu nombre es: " + nombre);
        
        // Leer un entero
        System.out.print("Introduce un entero: ");
        int entero = sc.nextInt();
        System.out.println("Entero introducido: " + entero);
        
        // Leer un número decimal
        System.out.print("Introduce un número decimal: ");
        double decimal = sc.nextDouble();
        System.out.println("Decimal introducido: " + decimal);
        
        sc.close(); // Cerrar el Scanner cuando no se necesite más
    }
}

