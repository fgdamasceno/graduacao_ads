package Testes;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		final double CAMBIO_ATUAL = 5.54;

		System.out.println("Qual o valor em dolar?");

		double valorEmDolar = sc.nextDouble();
		double valorEmReal = valorEmDolar * CAMBIO_ATUAL;

		System.out.printf("Valor em real: R$ %.2f", valorEmReal);

		sc.close();
	}

}
