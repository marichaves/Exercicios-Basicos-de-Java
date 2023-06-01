package com.dominio.cursojavaloiane.aulas;

import java.util.Scanner;

public class Exercicios_Aula16e17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

//		boolean notaValida = true;
//		do {
//			System.out.println("Digite a nota entre 0 e 10: ");
//			double nota = scan.nextDouble();
//			if (nota > 10 || nota < 0) {
//				notaValida = false;
//				System.out.println("Nota inválida, digite novamente");
//				nota = scan.nextDouble();
//			} else {
//				System.out.println("A nota é válida, e é: " + nota);
//			}
//		} while (!notaValida);
		
		
		//É importante declarar as váriaveis que serão usadas, fora do loop, por questão de memória.
		boolean infoValidas = false;
		String usuario;
		String senha;
		do {
			System.out.println("Digite o nome de usuário:");
			usuario = scan.nextLine();
			System.out.println();
			System.out.println("Digite a senha de usuário:");
			senha = scan.nextLine();

			if (usuario.contains(senha)) {
				infoValidas = false;
				System.out.println("A senha não pode ser o mesmo nome de usuário, digite a senha novamente:");
			} else {
				infoValidas = true;
				System.out.println("User: " + usuario);
				System.out.println("Senha: " + senha);
			}
		} while (!infoValidas);

	}

}
