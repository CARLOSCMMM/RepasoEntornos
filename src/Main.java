import java.util.Random;

public class Main {
    public static void main(String[] args) {
        
        System.out.printf("Hello and welcome!\n");
       
        int numero = generarNumeroAleatorio(1, 10);  // Genera un número aleatorio entre 1 y 10
        
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

    // Método para generar un número aleatorio dentro de un rango específico
    public static int generarNumeroAleatorio(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
}