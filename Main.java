package com.company;

import java.util.Scanner;
/*
1. Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)*/

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please tell me age in years: ");
        int ageInYears = scanner.nextInt();
        int result = ageInYears;
        System.out.println("");


        int monthResult = 12 * ageInYears;
        System.out.println("");


        int resultBirthday = 365 * ageInYears;
        System.out.println("");

        System.out.println(ageInYears + " " + "years" + " " + monthResult + " " + "months" + " " + resultBirthday + " " + "days");

    }
}
