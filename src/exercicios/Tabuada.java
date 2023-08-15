package exercicios;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner entra = new Scanner(System.in);
		
		System.out.println("Digite o número que deseja ver a tabuada: ");
		int num = entra.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i );
		}
	}

}
