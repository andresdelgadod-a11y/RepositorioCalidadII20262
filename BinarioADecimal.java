import java.util.Scanner;

public class BinarioADecimal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero binario: ");
        int numero = entrada.nextInt();

        int decimal = 0;
        int potencia = 1;
        boolean valido = true;

        int auxiliar = numero;

        while (auxiliar > 0) {

            int digito = auxiliar % 10;

            if (digito != 0 && digito != 1) {
                valido = false;
                break;
            }

            auxiliar = auxiliar / 10;
        }

        if (valido) {

            while (numero > 0) {

                int digito = numero % 10;

                decimal = decimal + (digito * potencia);

                potencia = potencia * 2;

                numero = numero / 10;
            }

            System.out.println("Resultado en decimal: " + decimal);

        } else {

            System.out.println("Error: el numero ingresado no es binario.");
        }

        entrada.close();
    }
}