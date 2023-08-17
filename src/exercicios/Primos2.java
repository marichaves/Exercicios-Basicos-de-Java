package exercicios;

import java.util.Scanner;

public class Primos2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o número");
		int num = scan.nextInt();
		boolean primo; // É melhor declarar variáveis fora do loop
		for(int i = 1; i <= num ; i++) {
			primo = true;
			 for (int j = 2; j <i ; j++) {
				 if (i % j == 0) {
					 break;
				 } else {
					 primo = false;
					 break;
				 }
				
			 }
			 if (primo) {
				 System.out.println(i);
			 } 
		}
		}
	

}
