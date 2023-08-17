package exercicios;

import java.util.Scanner;

public class Fatorial2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Fatorial de: ");
		int n = scan.nextInt();
		int resultado = 1;
		
		System.out.print(n + "! = ");
		for(int i = n; i > 1 ; i--) {
			resultado *= i;
			
			System.out.print(i + " . ");	
		}
		System.out.println(" 1  = " + resultado );

	}

}
