// Operadores
package edu.ailson.terceirasemana;

public class Operadores {
    /**
     * @param args
     */
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

        // Incrementação e Decrementação 
        int num = 5;
        // x repetição

        //Incremento
        System.out.println(++num);
        System.out.println(num);

        // Decremento
        System.out.println(--num);
        System.out.println(num);

        // Aplicado a valores booleanos
        boolean var = true;
        System.out.println(!var);
        System.out.println(var);

        var = !var;
        System.out.println(!var);
        System.out.println(var);

        // Operador Ternário

        int a, b;

        a = 5;
        b = 5;

        /* Exemplo de uma condicional utilizando os operadores if e else.
         * 
         * String resultado = "";
         * if(a==b)
         *    resultado = "verdadeiro";
         * else
         *    resultado = "falso";
         */

         // Exemplo de uma condicional utilizando operador ternário.
         String resultado = a==b ?"verdadeiro" : "falso";

         System.out.println(resultado);

        // Operadores relacionais

        // == : IGUAL A 
        // != : DIFERENTE
        // > : MAIOR QUE 
        // >= : MAIOR OU IGUAL
        // < : MENOR 
        // <= : MENOR IGUAL 

        int num1 = 1;
        int num2 = 2;

        boolean simNao = num1 == num2; 
        
        if (simNao == true)
            System.out.println("num1 é igual a num2? " + simNao);
        
        simNao = num1 != num2;  
        
        if (simNao == true)
            System.out.println("num1 é diferente a num2? " + simNao);
            
        if (num1 > num2)
            System.out.println("Número 1 é maior que o número 2.");
        else if (num1 < num2)
            System.out.println("Número 1 é menor que o número 2");


        // Operadore lógicos

        // && : Operador lógico E
        // || : Operador lógico OU

        boolean condicao1 = true;
        boolean condicao2 = false;

        /* Aqui estamos usando o operador logico E para fazer a união das expressões
         * 
         */

         if (condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
         }
         else if (condicao1 || condicao2) {
            System.out.println("Uma entre as duas condições é verdadeira");
         }

         System.out.println("FIM");
    }
}
