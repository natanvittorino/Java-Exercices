package com.company;

//Informar um saldo e imprimir o saldo com reajuste de 1%.

public class Saldo {
    public static void main(String[] args){
        double saldo = 1000.0;
        System.out.println("Saldo Inicial:" + " " + saldo);

        double reajuste = 1.0/ 100.0;
        double change = reajuste * saldo;
        double reajusteFinal = change + saldo;
        System.out.println("Valor do Reajuste:" + " " +change + ". " + "Reasjuste de 1%.");
        System.out.println("Saldo mais Reajuste:" + " " + reajusteFinal);
    }
}
