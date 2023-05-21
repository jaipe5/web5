import java.util.Scanner;//importamos la clase Scanner del paquete java.util

public class AreaCircunferencia {//creamos la clase AreaCircunferencia
    public static void main(String[] args) {//creamos el método main que es el que se ejecuta al ejecutar el programa
        Scanner sc = new Scanner(System.in);//creamos un objeto Scanner para leer por teclado y lo llamamos sc
        
        System.out.print("Introduce el radio de la circunferencia: ");//pedimos al usuario que introduzca el radio de la circunferencia
        double radio = sc.nextDouble();//leemos el radio de la circunferencia 
        
        double area = Math.PI * Math.pow(radio, 2);//calculamos el área de la circunferencia multiplicando PI por el radio al cuadrado
        
        System.out.println("El area de la circunferencia es: " + area);//mostramos el área de la circunferencia
        
        sc.close();
        
    }
}

