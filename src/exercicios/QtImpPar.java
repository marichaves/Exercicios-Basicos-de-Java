package exercicios;

import java.util.Scanner;

public class QtImpPar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int par = 0;
		int impar = 0;
		int num;
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite um número");
			num = scan.nextInt();
			if (num % 2 == 0) {
				par++;
			} else {
				impar++;
			}
			
		}
		System.out.println("A quantidade de números ímpares é de: "+ impar);
		System.out.println("A quantidade de números par é de: "+ par);

	}

}
