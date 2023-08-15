package exercicios;

import java.util.Scanner;

public class Inteiros {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com o primeiro número ");
		int num1 = scan.nextInt();
		System.out.println("Entre com o segundo número ");
		int num2 = scan.nextInt();	System.out.println("Entre com o primeiro número ");
		
		for (int i=num1; i <= num2; i++) {
			System.out.println(i);
		}
		
	}

}
