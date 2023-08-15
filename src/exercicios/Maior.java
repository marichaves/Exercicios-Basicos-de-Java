package exercicios;

import java.util.Scanner;

public class Maior {

	public static void main(String[] args) {
		Scanner entra = new Scanner(System.in);
		int num;
		int maior = Integer.MIN_VALUE; //O menor valor para inteiro
		for (int i= 0; i <5; i++) {
			System.out.println("Entre com um número: ");
			num = entra.nextInt();
			if (num > maior) { // aqui na medida em que for digitando um numero maior, ele vai sendo salvo no "maior"
				maior = num;
			}
		}
		System.out.println("O maior número digitado foi: " + maior);
		

	}

}
