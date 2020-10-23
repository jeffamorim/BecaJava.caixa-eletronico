package main;

import java.util.Scanner;

public class CaixaEletronico {

	public int[] notas = { 200, 100, 50, 20, 10, 5, 2 };
	int cont;

	public void ValorSaque() {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor que deseja sacar: ");
		double valor = entrada.nextDouble();

		for (cont = 0; cont < notas.length; cont++) {
			if (valor >= notas[cont]) {

				int qtnotas = (int) (valor / notas[cont]);
				valor = valor % notas[cont];

				System.out.println("Saque de " + qtnotas + " nota de " + notas[cont]);
			}
		}

	}
}

