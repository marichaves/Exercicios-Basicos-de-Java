package exercicios;

import java.util.Scanner;

public class FibonacciMaior500 {

	public static void main(String[] args) {
		int primeiro = 1;
		int segundo = 1;
		int aux = 0;
		

		System.out.println(primeiro);
		System.out.println(segundo);
		while (aux <= 500) {
			aux = primeiro + segundo;
			primeiro = segundo;
			segundo = aux;
			
			System.out.println(aux);
		}

	}

}
