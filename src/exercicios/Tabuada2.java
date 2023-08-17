package exercicios;

import java.util.Scanner;

public class Tabuada2 {

	public static void main(String[] args) {
		Scanner entra = new Scanner(System.in);

		System.out.print("Mostrar a tabuada de: ");
		int num = entra.nextInt();
		
		System.out.print("Começar por: ");
		int comeco = entra.nextInt();
		
		System.out.print("Terminar em: ");
		int termino = entra.nextInt();
		System.out.println();
		System.out.println("Vou montar a tabuada de " + num + " começando em " + comeco + " e terminando em " + termino + ":");
		for (int i = comeco; i <= termino; i++) {
			
			System.out.println(num + " X " + i +" = " + (num*i));
		}

	}

}
