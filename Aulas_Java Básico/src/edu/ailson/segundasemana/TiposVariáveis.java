// Tipos de Variáveis
package edu.ailson.segundasemana;

import java.io.PrintStream;

public class TiposVariáveis {
    private static PrintStream printf;

    public static void main(String[] args) {
        // Tipos de Variáveis - 1, 2 e 3: link texto: https://glysns.gitbook.io/java-basico/sintaxe/variaveis
       

        // estudar tipos primitivos
        // estudar a classe Strings (representa texto na aplicação)

        String meuNome = "Ailson Guedes da Fonseca";
        System.out.printf("Nome: %s", meuNome);

        double salarioMinimo = 2500.33;
        System.out.printf("\nSalário Mínimo: %f", salarioMinimo);


        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        // Tipos de Variáveis - 4: variáveis e constantes 

        int numero = 5;
        System.out.printf("\nNúmero = %d",numero);

        numero = 10;
        printf = System.out.printf("\nNúmero = %d", numero);

        final double VALOR_DE_PI = 3.14; 
        System.out.printf("\nValor de PI = %f", VALOR_DE_PI);


    }
}
