import java.util.Scanner;//importamos la clase Scanner del paquete java.util

public class AreaRectangulo {//creamos la clase AreaRectangulo
    public static void main(String[] args) {//creamos el método main que es el que se ejecuta al ejecutar el programa
        Scanner sc = new Scanner(System.in);//creamos un objeto Scanner para leer por teclado y lo llamamos sc
        
        System.out.print("Introduce la base del rectángulo: ");//pedimos al usuario que introduzca la base del rectángulo
        double base = sc.nextDouble();//leemos la base del rectángulo 
        
        System.out.print("Introduce la altura del rectángulo: "); //pedimos al usuario que introduzca la altura del rectángulo
        double altura = sc.nextDouble();//leemos la altura del rectángulo
        
        double area = base * altura;//calculamos el área del rectángulo multiplicando la base por la altura
        
        System.out.println("El área del rectángulo es: " + area);//mostramos el área del rectángulo
        
        sc.close();//cerramos el objeto Scanner
    }
}

