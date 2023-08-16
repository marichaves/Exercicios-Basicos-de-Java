package exercicios;

import java.util.Scanner;

public class Primo {

	public static void main(String[] args) {
		Scanner entra = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int num = entra.nextInt();
		boolean primo = false;
		 for (int i = 2; i <num ; i++) {
			 if (num % i == 0) {
				 break;
			 } else {
				 primo = true;
				 break;
			 }
			
		 }
		 if (primo) {
			 System.out.println("É número primo.");
		 } else {
			 System.out.println("Não é primo");
		 }
	}

}
