package com.company;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        boolean infoValida = false;
        String nome, sexo, estadoCivil;
        int idade;
        double salario;

        Scanner scan = new Scanner(System.in);


        infoValida = false;
        do {
            System.out.println("Digite um nome: ");
            nome = scan.next();

            if (nome.length() >= 3) {
                infoValida = true;
            } else {
                System.out.println("Nome precisa de no minimo 3 caracteres.");
            }
        } while (!infoValida);


        infoValida = false;
        do {
            System.out.println("Digite sua idade: ");
            idade = scan.nextInt();

            if (idade >= 0 && idade <= 150){
                infoValida = true;
            } else {
                System.out.println("Idade precisa ser entre 0 e 150.");
            }
        } while (!infoValida);


        infoValida = false;
        do {
            System.out.println("Digite o salario: ");
            salario = scan.nextDouble();

            if (salario > 0) {
                infoValida = true;
            } else {
                System.out.println("Salario precisa ser maior que 0");
            }
        } while (!infoValida);


        infoValida = false;
        do {
            System.out.println("Digite o genero: ");
            sexo = scan.next();

            if (sexo.equalsIgnoreCase("f") ||
                    sexo.equalsIgnoreCase("m")) {
                infoValida = true;
            } else {
                System.out.println("Genero precisa ser 'f' ou 'm'.");
            }
        } while (!infoValida);


        infoValida = false;
        do {
            System.out.println("Digite o estado civil:");
            estadoCivil = scan.next();

            if (estadoCivil.equalsIgnoreCase("s") ||
                    estadoCivil.equalsIgnoreCase("c") ||
                    estadoCivil.equalsIgnoreCase("v") ||
                    estadoCivil.equalsIgnoreCase("d")) {
                infoValida = true;
            } else {
                System.out.println("Genero precisa ser 's', 'c', 'v' ou 'd'.");
            }
        } while (!infoValida);

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salario: " + salario);
        System.out.println("Genero: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);
    }

}

