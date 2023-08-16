package exercicios;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int primeiro = 1;
		int segundo = 1;
		int aux;
		
		System.out.println("Entre com o n-ésimo termo da série de fibonacci");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(primeiro);
		System.out.println(segundo);
		for(int i= 3; i <= n; i++ ) {
			aux = primeiro + segundo;
			primeiro = segundo;
			segundo = aux;
			
			System.out.println(aux);
		}
		

	}

}
