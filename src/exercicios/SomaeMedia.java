package exercicios;

import java.util.Scanner;

public class SomaeMedia {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int soma = 0;
		int media = 0;
		int num;
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite um número");
			num = scan.nextInt();
			soma += num;
		}
		
		media = soma/5;
		System.out.println("A soma é: " + soma);
		System.out.println("A media é: " + media);

	}

}
