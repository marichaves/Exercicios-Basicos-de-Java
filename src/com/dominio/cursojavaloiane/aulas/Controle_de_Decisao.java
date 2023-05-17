package com.dominio.cursojavaloiane.aulas;

import java.util.Scanner;

public class Controle_de_Decisao {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	
//	System.out.println("Qual a sua idade?: ");
//	int idade = scan.nextInt();
//		if (idade >= 18) {
//			System.out.println("É maior de idade");
//		} else {
//			System.out.println("É menor de idade");
//		}
		
		//barato <= 10
		//10 < vaor < 15 - pedir desconto 
		//15 <= valor 17 - pesquisar mais
		//>= 17 - muito caro 
		System.out.println("Entre com o preço do item:");
		double valor = scan.nextDouble();
		
		if (valor <= 10) {
			System.out.println("Está barato, pode comprar");
		} else if (valor < 10 && valor < 15) {
			System.out.println("Você pode pedir um desconto");
		} else if ( valor  >= 15 && valor < 17){
			System.out.println("Pesquisar mais");
		} else {
			System.out.println("Muito caro!");
		}
	}
}
