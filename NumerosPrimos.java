public class NumerosPrimos {
    public static void main(String[] args) {
        
        for(int i = 2; i < 20; i++) {
            
            boolean esPrimo = true;//suponemos que es primo
            
            for(int j = 2; j < i; j++) {//comprobamos si es divisible por alguno de los numeros anteriores
                
                if(i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if(esPrimo) {
                System.out.println(i);
            }
        }
    }
}
