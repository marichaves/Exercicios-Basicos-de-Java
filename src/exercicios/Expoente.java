package exercicios;

import java.util.Scanner;

public class Expoente {

	public static void main(String[] args) {
		Scanner entra = new Scanner(System.in);
			
		System.out.println("Digite dois números seguidos: ");
		int base = entra.nextInt(); 
		int expoente = entra.nextInt();
		int resultado = base;
		for(int i = 1; i < expoente; i++) { //Quando inicializa a varável i com 0, a regra deve ser que i seja sempre < que o numero desejado
			resultado *= base;
			
		}
		System.out.println("Resultado: " +resultado);
	}

}
