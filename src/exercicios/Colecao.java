package exercicios;

import java.util.Scanner;

public class Colecao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de CDs: ");
		int cds = scan.nextInt();
		
		float valor;
		float media = 0;
		float sum = 0;
		for(int i = 1; i <= cds; i++ ) {
			System.out.println("Informe o valor do CD " + i + ":");
			valor = scan.nextFloat();
			sum += valor;
			media = sum /cds;
			
		}
		System.out.println("A media de dinheiro gasto com CDs foi de: " + media + "reais.");

	}

}
