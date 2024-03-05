package com.mycompany.exerciciovogalconsoante;

import java.util.Scanner;

public class ExercicioVogalConsoante {

    public static void main(String[] args) {

Scanner teclado2 = new Scanner(System.in);

System.out.println("Escreva uma letra vogal minuscula ou MAISCULA");
char letra = teclado2.next().charAt(0);

switch (letra) {
    case 'a':
    case 'A':
    case 'e':
    case 'E':
    case 'i':
    case 'I':
    case 'o':
    case 'O':
    case 'u':
    case 'U':
    System.out.println("Vogal");
    break;
    default: System.out.println("Consoante");
    }



}



    }

