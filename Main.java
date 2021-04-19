package com.company;

public class Main {

    public static void main(String[] args) {

	bankAccount natansAccount = new bankAccount("AIBK274578589 8909 90888", 0.00,
			"Natan Alves", "natanbreakman11ie@gmail.com", "+55 85 988637346" );


	natansAccount.withdrawal(100.0);

	natansAccount.deposit(50.0);
	natansAccount.withdrawal(100.0);

	natansAccount.deposit(51.0);
	natansAccount.withdrawal(100.0);
    }
}
