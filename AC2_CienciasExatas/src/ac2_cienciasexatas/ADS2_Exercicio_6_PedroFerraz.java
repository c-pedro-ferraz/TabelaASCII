package ac2_cienciasexatas;

import java.util.Scanner;

public class ADS2_Exercicio_6_PedroFerraz {

    public static void main(String[] args) {

        int numero;
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um número: ");
        numero = ler.nextInt();

        if (numero >= 0 && numero <= 255) {

            String convertido = Character.toString((char) numero);
            System.out.println(numero + " = " + convertido);

        } else {
            System.out.println("Digite um numero entre 0 e 255");
        }

    }
}
