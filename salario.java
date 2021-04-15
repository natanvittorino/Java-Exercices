package com.company;

/*Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
(1SM=R$788,00)*/

/*for (int i = 0; i <= 10; i = i + 2) {
  System.out.println(i);
*/

import java.util.Scanner;

public class salario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double minimumWages = 788.0;
        System.out.println("Minimum Wages:" + " " + "$" + minimumWages);

        System.out.println("Please type your salary:");
        double salary = scanner.nextDouble();

        int salaries = (int)salary / (int)788.0;
        if (salaries > minimumWages) {
            System.out.println("The user earns:" + " " + salaries + " " + "minimun wages");
        } else {
            System.out.println("The user earns:" + " " + salaries + " " + "minimun wages");
        }

        }
    }

