// Operadores
package edu.ailson.terceirasemana;

public class Operadores {
    public static void main (String[] args) {
        // Operadores - 1:
        // Atribuição: = 
        // Aritméticos: 
        // Soma: + Também serve para concatenar strings
        // Subtrção: -
        // Multiplicação: *
        // Divisão: /
        // Módulo: %
        //

        // Concatenação: 
        String fullName = "first name" + " last name";
        String concateName = fullName;

        System.out.printf("Result: %s\n", concateName);

        String concatenacao = "?";

        concatenacao =  1 + 1 + 1 + "1";

        System.out.println(concatenacao);

        concatenacao =  1 + "1" + 1 + 1;

        System.out.println(concatenacao);

        concatenacao =  "1" + 1 + 1 + 1;

        System.out.println(concatenacao);

        concatenacao =  "1" + (1 + 1 + 1);

        System.out.println(concatenacao);

    }
}
