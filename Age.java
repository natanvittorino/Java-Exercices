package com.company;


/*1. Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)*/

//String userName = myObj.nextLine();
//System.out.println("Username is: " + userName);
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ageInYers =scanner.nextInt();
        System.out.println("Please input your birth year: " + ageInYers);
    }
}
