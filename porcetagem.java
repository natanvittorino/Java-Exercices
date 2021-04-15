package com.company;

/* Escrever um algoritmo que lê:
- a porcentagem do IPI a ser acrescido no valor das peças.
- o código da peça 1, valor unitário da peça 1, quantidade de peças 1
- o código da peça 2, valor unitário da peça 2, quantidade de peças 2
O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.*/

//Base de cálculo = (Valor do produto + Frete + Seguro + Outras Despesas Acessórias)
//
//Valor do IPI = Base de cálculo * (Alíquota / 100)

public class porcetagem {
    public static void main(String[] args) {
        int id1 = 12345;
        int id2 = 15432;
        double value1 = 10.50;
        double value2 = 9.60;
        int amount1 = 10;
        int amount2 = 25;
        double shipping1 = 3.0;
        double shipping2 = 6.0;
        double insurance1 = 25.0;
        double insurance2 = 55.0;
        double otherTaxes1 = 2.0;
        double otherTaxes2 = 2.0;

        System.out.println();


        double base1 = value1 + shipping1 + insurance1 + otherTaxes1;
        double ipi1 = 5.0 / 100.0;
        double ipiFinal1 = base1 * ipi1;
        double finalPrice = ipiFinal1 + value1;
        double valorTotal = finalPrice * amount1;
        System.out.println("Valor Total do IPI sobre o produto com id:" + id1 + " " + "e de:" + " " + "R$" + ipiFinal1 + ".");
        System.out.println("Valor Total da peca:" + " " + "R$" + finalPrice);
        System.out.println("Quantidade de Pecas:" + " " + amount1);
        System.out.println("Valor Total:" + " " + valorTotal);

        System.out.println("");

        double base2 = value2 + shipping2 + insurance2 + otherTaxes2;
        double ipi2 = 5.0 / 100.0;
        double ipiFinal2 = base2 * ipi2;
        double finalPrice2 = ipiFinal2 + value2;
        double valorTotal2 = finalPrice2 * amount2;
        System.out.println("Valor Total do IPI sobre o produto com id:" + id2 + " " + "e de:" + " "  + "R$" + ipiFinal2 + ".");
        System.out.println("Valor Total da peca:" + " " + "R$" + finalPrice2);
        System.out.println("Valor Total:" + " " + valorTotal2);




    }
}
