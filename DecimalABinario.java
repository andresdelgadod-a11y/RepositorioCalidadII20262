import java.util.Scanner;

public class DecimalABinario {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero decimal: ");
        int numero = entrada.nextInt();

        if (numero == 0) {

            System.out.println("Resultado en binario: 0");

        } else if (numero > 0) {

            String binario = "";

            while (numero > 0) {

                int residuo = numero % 2;

                binario = residuo + binario;

                numero = numero / 2;
            }

            System.out.println("Resultado en binario: " + binario);

        } else {

            System.out.println("Error: ingrese un numero entero positivo.");
        }

        entrada.close();
    }
}