import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Mapa de números a letras
        HashMap<Integer, Character> codigo = new HashMap<>();
        codigo.put(1, 'D');
        codigo.put(2, 'W');
        codigo.put(3, 'E');
        codigo.put(4, 'L');
        codigo.put(5, 'H');
        codigo.put(6, 'O');
        codigo.put(7, 'R');

        Scanner scanner = new Scanner(System.in);
        StringBuilder mensajeDecodificado = new StringBuilder();

        // Pedir 10 números
        System.out.println("Introduce 10 números (del 1 al 7) para decodificar el mensaje:");
        int contador = 0;
        while (contador < 10) {
            System.out.print("Número " + (contador + 1) + ": ");
            int num = scanner.nextInt();

            if (codigo.containsKey(num)) {
                mensajeDecodificado.append(codigo.get(num));
                contador++;
            } else {
                System.out.println("Número no válido. Intenta nuevamente.");
            }
        }

        scanner.close();
        System.out.println("Mensaje decodificado: " + mensajeDecodificado.toString());

    }
}



