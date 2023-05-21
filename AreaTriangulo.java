import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce la base del triángulo: ");
        double base = sc.nextDouble();
        System.out.println("Haz introducido "+ base + " la base del triángulo: ");

        
        System.out.println("Introduce la altura del triángulo: ");
        double altura = sc.nextDouble();
        System.out.println("Haz introducido "+ altura + " la altura del triángulo: ");

        
        double area = (base * altura) / 2;
        
        System.out.println("El área del triángulo es: " + area);
        
        sc.close();
    }
}

