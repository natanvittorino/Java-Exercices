package com.company;
/*2. Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
números 4, 5 e 6. A soma das duas médias. A média das médias.*/

public class Medias {
    public static void main(String[] args){
        int number1 = 8;
        int number2 = 9;
        int number3 = 7;

        int number4 = 4;
        int number5 = 5;
        int number6 = 6;

        int media1 = ( number1 + number2 + number3) / 3;
        int media2 = ( number4 + number5 + number6) / 3;
        int soma = media1 + media2;
        int mediaFinal = (media1 + media2) / 2;

        System.out.println("Soma =" + " "+ soma);
        System.out.println("Media =" + " " + mediaFinal);

    }
}
