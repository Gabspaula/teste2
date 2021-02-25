package com.company;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {


        int popA = 80000;
        int popB = 200000;
        int cont = 0;

        while (popA < popB){

            popA += (popA/100) * 3;
            popB += (popB/100) * 1.5f;
            cont++;
        }

        System.out.println("Populacao A: " + popA);
        System.out.println("Populacao B: " + popB);
        System.out.println("Qtd anos: " + cont);
    }
}
