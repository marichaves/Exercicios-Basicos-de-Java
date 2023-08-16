package exercicios;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int n = scan.nextInt();
		System.out.println(n + "! = ");
		int fatorial = 1;
		
		
		for(int i = n; i > 0 ; i--) {
			fatorial *= i;
			
			System.out.println(i);	
		}
		System.out.println("Resultado: " + fatorial);
	}

}
