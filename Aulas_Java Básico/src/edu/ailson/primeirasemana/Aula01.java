// Anatomia de Classes
package edu.ailson.primeirasemana;

public class Aula01 {

    public static void main(String[] args) {

        // Anatomia de Classes - 2
        System.out.println("Anatomia de Classes - 2");

        final String BR = "Brasil";
        int year = 2022;
        final double PI = 3.14;
        final int STATES_BRASILEIROS = 27;

        year = 2023;

       System.out.printf("País: %s // Ano: %d", BR, year);
       System.out.printf("Número de PI: %f // Número de Estados no Brasil: %d\n", PI, STATES_BRASILEIROS);

       // Anatomia de Classes - 3
        System.out.printf("\nAnatomia de Classes - 3\n");

        String myName = "Ailson";
        int fabricationYear = 2023;
        boolean truly = true;
        String boolStatus = "";

        if(truly == true){
            boolStatus = "Em estoque";
        } else {
            boolStatus = "Sem estoque";
        }

        System.out.printf("Olá, %s! O ano de fabricação do produto é %d. Status de Produtos: %s. \n",  myName, fabricationYear,boolStatus);

        fabricationYear = 2018;

        System.out.printf("ATUALIZADO: Olá, %s! O ano de fabricação do produto é %d. Status de Produtos: %s. \n",  myName, fabricationYear,boolStatus);

        String fristName = "Ailson";
        String lastName = "Fonseca";

        String fullName = fullName (fristName, lastName);
        System.out.println(fullName);

        System.out.println("\nAnatomia de Classes - 4: Arquivo BoletimEstudantil.java");
        System.out.println("\nAnatomia de Classes - 5: Organizando pacotes (edu.ailson.primeirasemana e edu.ailson.segundasemana)");
        System.out.println("\nAnatomia de Classes - 6: Java Beans");
        
    }

    public static String fullName(String firstName, String lastName) {
        return "Resultado do método: " + firstName.concat(" ").concat(lastName);
    }   

        // Anatomia de Classes - 4: Arquivo BoletimEstudantil.java
        // -
        //-
        // Anatomia de Classes - 5: Organizando pacotes (edu.ailson.primeirasemana e edu.ailson.segundasemana)
        // -
        //-
        // Anatomia de Classes - 6: Java Beans
        //
        // - Uma variável precisa ser clara, sem abreviações ou definições sem sentido.
        // - Uma variável é sempre no singular, exceto quando se referir a uma array ou coleção.
        // - Defina um idioma único para as suas variáveis. Se você for declarar uma variável em inglês, defina todas as outras em inglês.

}
