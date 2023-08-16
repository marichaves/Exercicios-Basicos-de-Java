package exercicios;

import java.util.Scanner;

public class NumMedioAlunos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int turma;
		int alunos;
		int media;
		
		boolean valida = false;
		do {
			System.out.println("Qual a quantidade de turmas? ");
			turma = scan.nextInt();
			System.out.println("Quantos alunos? ");
			alunos = scan.nextInt();
			media = alunos/turma;
			if (media >= 40) {
				System.out.println("Não é permitido mais de 40 alunos por turma, você precisa de mais turmas!");	
			} else {
				
				System.out.println("A media de alunos por turma é: " + media);
				valida = true;
			}
		} while(!valida);
		
		

	}

}
