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

        // Operadores Unários: 

        // (+) Operador unário de valor positivo – números são positivos sem esse operador explicitamente;
        // (-) Operador unário de valor negativo – nega um número ou expressão aritmética;
        // (++) Operador unário de incremento de valor – incrementa o valor em 1 unidade;
        // (--) Operador unário de decremento de valor – decrementa o valor em 1 unidade;
        // (!) Operador unário lógico de negação – nega o valor de uma expressão booleana.

        //classe Operadores.java
        int numero = 5;
		
        //Imprimindo o numero negativo
        System.out.println(- numero);

        //incrementando numero em mais 1 numero, imprime 6
        numero ++;
        System.out.println(numero);

        //incrementando numero em mais 1 numero, imprime 7
        System.out.println(numero ++);// ops algo de errado não está certo

        System.out.println(numero);// agora sim, numero virou 7

        //ordem de precedencia conta aqui
        System.out.println(++ numero);

        boolean verdadeiro = true;

        System.out.println("Inverteu " + !verdadeiro);

    }
}
