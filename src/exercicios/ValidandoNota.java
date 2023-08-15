package exercicios;

import java.util.Scanner;

public class ValidandoNota {

	public static void main(String[] args) {
		System.out.println("Faça um programa que peça uma nota, entre zero e dez. Mostr uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido. ");
		Scanner entra = new Scanner(System.in);
		
		boolean notaValida = false;
		
		do {
			System.out.println("Digite a nota: ");
			float nota = entra.nextFloat();
			if(nota < 0 || nota > 10) {
				System.out.println("A nota do aluno é inválida, digite a nota novamente");
			} else {
				System.out.println("A nota do aluno é " + nota);
				notaValida = true;
			}
		} while (!notaValida);
	}

}
