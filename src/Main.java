
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        
        System.out.printf("Hello and welcome!\n");
       
        Random random = new Random();
        int numero = random.nextInt(10 + 1);  
        
        System.out.println("Número generado: " + numero);
        verificarParImpar(numero);
    }
    public static void verificarParImpar(int numero) {
        if (numero % 2 == 0) {
            System.out.println(numero + " es un número par.");
        } else {
            System.out.println(numero + " es un número impar.");
        }
    }
}