package com.dominio.cursojavaloiane.aulas;

import java.util.Scanner;

public class Exercicios_Aula15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		System.out.println("Digite dois números seguidos:");
//		int numero1 = scan.nextInt();
//		int numero2 = scan.nextInt();
//		
//		if (numero1 > numero2 ) {
//			System.out.println(numero1);
//		} else {
//			System.out.println(numero2);
//		}
//		
//		if(numero1 > 0) {
//			System.out.println("O primeiro número é positivo");
//		} else {
//			System.out.println("O primeiro número é negativo");
//		}
	
//		System.out.println("Digite o sexo F ou M");
//		char sexo = scan.findInLine(".").charAt(0);
//		
//		if(sexo == 'F' || sexo == 'f') {
//			System.out.println("O sexo é feminino");
//		} else if (sexo == 'M' || sexo == 'm') {
//			System.out.println("O sexo é masculino");
//		} else {
//			System.out.println("Sexo inválido");
//		}
		
		
//		System.out.println("Digite uma letra: ");
//		char letra = scan.findInLine(".").charAt(0);
//		
//		if(letra == 'a'|  letra =='e' | letra == 'i' | letra == 'o' |letra == 'u' || 
//				letra == 'A'|  letra =='E' | letra == 'I' | letra == 'O' |letra == 'U') {
//			System.out.println("Vogal");
//			
//		}else {
//			System.out.println("Consoante");
//		}
		
		
		
//		System.out.println("Digite as duas notas do aluno");
//		float nota1 = scan.nextFloat();
//		float nota2 = scan.nextFloat();
//		float media = (nota1 + nota2) /2;
//		if  (media == 10){
//			System.out.println("Aprovado em distinção");
//		} else if (media < 7 ){
//			System.out.println("Reprovado!");	
//		} else if (media >= 7) {
//			System.out.println("Aprovado!");
//		}

		System.out.println("Digite três números");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
		
		if(n1 > n2 & n1 > n3) {
			System.out.println("O maior número é o: " + n1);
		} else if(n2 > n3 & n2 > n3)  {
				System.out.println("O maior número é o: " + n2);		
		} else {
			System.out.println("O maior é o:" + n3);
		}
	}

}
