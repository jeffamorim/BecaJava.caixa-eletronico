package caixaEletronico;
import java.util.Scanner;

public class CaixaEletronico {

	public static void main(String[] args) {
		
		int[] notas = {200,100,50,20,10,5,2};
		int cont;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor a ser sacado, valor minimo 2R$: ");
		int valor = entrada.nextInt();
		
		for(cont = 0; cont < notas.length; cont++) {
			if(valor >= notas[cont]) {
				
			int qtnotas = valor /  notas[cont];
				 valor = valor % notas[cont];
				
				System.out.println("Saque de " +qtnotas+ " nota de " +notas[cont]);
			}
			
		};

	}
}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//Scanner valor_saque = new Scanner(System.in);
//
//System.out.println("Digite o valor que deseja sacar, valor minimo 10R$: ");
//int saque = valor_saque.nextInt();
//
//int n200 = 200, n100 = 100, n50 = 50, n20 = 20, n10 = 10;
//
//if(saque >= 10 ) {
//	if(n200 >) {
//		
//	}
//	
//}else {
//	System.out.println("Nota não disponivel");
//}
//
//
