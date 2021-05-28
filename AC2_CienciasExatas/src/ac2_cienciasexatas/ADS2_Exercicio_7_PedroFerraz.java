package ac2_cienciasexatas;

import java.util.Scanner;

public class ADS2_Exercicio_7_PedroFerraz {

    public static void main(String[] args) {

        char c = 0, c12;
        Scanner ler = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("Questão 7. Escreva um algoritmo em Java que recebe um caractere e exibe:");
        System.out.println(" ");
        System.out.print("Digite um caractere: ");

        c = ler.nextLine().charAt(c);

        int i = (int) c;
        System.out.println("\n a) O seu valor numérico: " + i);

        c12 = (char) (c + 12);
        System.out.println("\n b) O caractere 12 casas a frente na tabela Unicode: " + c12);

        if (Character.isDigit(c)) {
            System.out.println("\n Você digitou um número !! Para ter acesso a mais respostas digite uma letra do alfabeto !!");
        } else {
            char maiuscula = Character.toUpperCase(c);
            char minuscula = Character.toLowerCase(c);

            System.out.println("\n c) Caso seja uma letra, o exibe em maiúsculo. Ou seja, exibir em maiúsculo de qualquer forma: " + maiuscula);
            System.out.println("\n d) Caso seja uma letra, o exibe em minúsculo. Ou seja, exibir em minúsculo de qualquer forma: " + minuscula);

            if (c == Character.toLowerCase(c)) {
                System.out.println("\n e) Caso seja uma letra minúscula, converta para maiúscula: " + maiuscula);
            } else {
                System.out.println("\n e) Caso seja uma letra maiúscula, converta para minúscula: " + minuscula);
            }

        }

    }
}
