package com.company;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        boolean notaValida = false;

        do {
            System.out.println("Digite a nota: ");

            double nota = ler.nextDouble();

            if (nota >= 0 && nota <= 10) {
                notaValida = true;
                System.out.println("Voce digitou " + nota);
            } else {
                notaValida = false;
                System.out.println("Nota invalida, tente novamente");
            }
        } while (notaValida == false) ;
    }
}


