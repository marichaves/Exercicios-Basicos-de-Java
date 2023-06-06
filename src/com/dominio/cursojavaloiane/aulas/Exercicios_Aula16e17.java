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
		
		
//		//É importante declarar as váriaveis que serão usadas, fora do loop, por questão de memória.
//		boolean infoValidas = false;
//		String usuario;
//		String senha;
//		do {
//			System.out.println("Digite o nome de usuário:");
//			usuario = scan.nextLine();
//			System.out.println();
//			System.out.println("Digite a senha de usuário:");
//			senha = scan.nextLine();
//
//			if (usuario.contains(senha)) {
//				infoValidas = false;
//				System.out.println("A senha não pode ser o mesmo nome de usuário, digite a senha novamente:");
//			} else {
//				infoValidas = true;
//				System.out.println("User: " + usuario);
//				System.out.println("Senha: " + senha);
//			}
//		} while (!infoValidas);
		
		
		
//		boolean infoValida = false;
//		String nome; 
//		
//		
//		do {
//			
//			System.out.println("Entre com o nome: ");
//			nome = scan.next();
//			if (nome.length() > 3 ) {
//				infoValida = true;
//			}else {
//				System.out.println("Nome precisa no mínimo 3 caracteres.");
//			}
//		}while (!infoValida);
//		
//		infoValida = false;
//		int idade; 
//		
//		do {
//			
//			System.out.println("Entre com a idade: ");
//			idade = scan.nextInt();
//			if (idade >= 0 && idade <= 150 ) {
//				infoValida = true;
//			}else {
//				System.out.println("Idade precisa ser maior que 0 e menor que 150");
//			}
//		}while (!infoValida);
//		
//		infoValida = false;
//		double salario;
//		
//		do {
//			
//			System.out.println("Entre com o salário");
//			salario = scan.nextDouble();
//			if (salario > 0 ) {
//				infoValida = true;
//			}else {
//				System.out.println("Salário precisa ser maior que 0");
//			}
//		}while (!infoValida);
//		
//		infoValida = false; //Reseta
//		String sexo;
//		
//		do {
//			
//			System.out.println("Entre com o sexo");
//			sexo = scan.next();
//			if (sexo.equalsIgnoreCase("f")|| sexo.equalsIgnoreCase("m")) {
//				infoValida = true;
//			}else {
//				System.out.println("Sexo precisa ser 'f' ou 'm ' .");
//			}
//		}while (!infoValida);
//		
//		infoValida = false; //Reseta
//		String estadoCivil;
//		
//		do {
//			
//			System.out.println("Entre com o estado civil:");
//			estadoCivil = scan.next();
//			if (estadoCivil.equalsIgnoreCase("s")|| estadoCivil.equalsIgnoreCase("c") || estadoCivil.contentEquals("d") || estadoCivil.equalsIgnoreCase("v")) {
//				infoValida = true;
//			}else {
//				System.out.println("Estado civil precisa ser 's', 'c', 'd' ou 'v' ");
//			}
//		}while (!infoValida);
//		System.out.println();
//		System.out.println("As seguintes informações foram coletadas: ");
//		System.out.println("Nome: "+ nome);
//		System.out.println("Idade: " + idade);
//		System.out.println("Salário: " + salario);
//		System.out.println("Sexo: " + sexo);
//		System.out.println("Estado Civil: " + estadoCivil);
		
		
		
		int popA = 80000;
		int popB = 200000;
		int cont = 0;
		
		while (popA <= popB) {
			
			popA += (popA/100) * 3;
			popB += (popB/100) * 1.5;
			cont++;
			
		}
		System.out.println("População A: " + popA);
		System.out.println("População B: " + popB);
		System.out.println("Qtd anos:   " + cont);
		
		
		
		double populaA;
		double populaB;
		double taxaA;
		double taxaB;
		boolean valido = false;
		do {
			System.out.println("Entre com a população A");
			populaA = scan.nextDouble();
			
			if(populaA > 0) {
				valido = true;
			}else {
				System.out.println("População A precisa ser maior que 0");
			}
			
		} while (!valido);
		
		valido = false;
		do {
			System.out.println("Entre com a população B");
			populaB = scan.nextDouble();
			
			if(populaB > 0) {
				valido = true;
			}else {
				System.out.println("População B precisa ser maior que 0");
			}
			
		} while (!valido);
		
		valido = false;
		do {
			System.out.println("Entre com a taxa de crescimento da população A");
			taxaA = scan.nextDouble();
			
			if(taxaA > 0) {
				valido = true;
			}else {
				System.out.println("A taxa de crescimento precisa ser maior que 0");
			}
			
		} while (!valido);
		
		valido = false;
		do {
			System.out.println("Entre com a taxa de crescimento da população B");
			taxaB = scan.nextDouble();
			
			if(taxaB > 0) {
				valido = true;
			}else {
				System.out.println("B taxa de crescimento precisa ser maior que 0");
			}
			
		} while (!valido);
		
		
		while (popA <= popB) {
			
			populaA += (populaA/100) * taxaA;
			populaB += (populaB/100) * taxaB;
			cont++;
			
		}
		System.out.println("População A: " + populaA);
		System.out.println("População B: " + populaB);
		System.out.println("Qtd anos:   " + cont);
	}

}
