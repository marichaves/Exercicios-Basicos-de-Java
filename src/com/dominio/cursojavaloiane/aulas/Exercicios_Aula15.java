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

//		System.out.println("Digite três números");
//		int n1 = scan.nextInt();
//		int n2 = scan.nextInt();
//		int n3 = scan.nextInt();
//		
//		if(n1 > n2 & n1 > n3) {
//			System.out.println("O maior número é o: " + n1);
//		} else if(n2 > n3 & n2 > n3)  {
//				System.out.println("O maior número é o: " + n2);		
//		} else {
//			System.out.println("O maior é o:" + n3);
//		}
//		 if (n1 < n2 & n1 < n3)  {
//			System.out.println("O menor número é o: " + n1);
//		}  else if(n2 < n3 & n2 < n3)  {
//			System.out.println("O menor número é o: " + n2);	
//		} else {
//			System.out.println("O menor número é o: " + n3);
//		}

//		System.out.println("Digite o preço dos três produtos: ");
//		float produto1 = scan.nextFloat();
//		float produto2 = scan.nextFloat();
//		float produto3 = scan.nextFloat();
//		
//		if (produto1 < produto2 & produto1 < produto3) {
//			System.out.println("Compre o produto: " + produto1);
//		} else if (produto2 < produto1 & produto2 < produto3){
//			System.out.println("Compre o produto: " + produto2);
//		} else {
//			System.out.println("Compre o produto: " + produto3);
//		}

//		System.out.println("Digite três numeros, vou mostrar em ordem decrescente: ");
//		int decrs1 = scan.nextInt();
//		int decrs2 = scan.nextInt();
//		int decrs3 = scan.nextInt();
//
//		if (decrs1 > decrs2 & decrs2 > decrs3) {
//			System.out.println(decrs1 + " " + decrs2 + " " + decrs3);
//		} else if (decrs2 > decrs1 & decrs1 > decrs3) {
//			System.out.println(decrs2 + " " + decrs1 + " " + decrs3);
//		} else if (decrs3 > decrs2 & decrs2 > decrs1) {
//			System.out.println(decrs3 + " " + decrs2 + " " + decrs1);
//		} else if (decrs1 > decrs3 & decrs3 > decrs2) {
//			System.out.println(decrs1 + " " + decrs3 + " " + decrs2);
//		} else if (decrs2 > decrs3 & decrs3 > decrs1) {
//			System.out.println(decrs2 + " " + decrs3 + " " + decrs1);
//		} else {
//			System.out.println(decrs3 + " " + decrs1 + " " + decrs2);
//		}
		
		
		
//		System.out.println("Em que turno você estuda? Digite M para matutino, V para vespertino ou N para noturno:" );
//		char turno = scan.next().charAt(0);
//		
//		if (turno == 'm' || turno == 'M') {
//			System.out.println("Bom dia!");
//		} else if (turno == 'v' || turno == 'V') {
//			System.out.println("Boa tarde!");
//		} else if (turno == 'n' || turno == 'N') {
//			System.out.println("Boa Noite");
//		} else {
//			System.out.println("Entrada inválida!");
//		}

		System.out.println("Calculando o reajuste salarial. Digite o salário do colaborador:");
		double salario = scan.nextFloat();
		
		if(salario <= 280.0) {
			double temp = salario * 0.20;
			double novosalario = salario + temp;
			System.out.println("O novo salário do funcionário será de: " + novosalario);
			System.out.println("O salário antigo era de: " + salario);
			System.out.println("O valor aumentado foi de:" + temp);
			System.out.println("O Percentual aumentado foi de: 20%");
		} else if(salario > 280.0 && salario < 700.0){
			double temp = salario * 0.15;
			double novosalario = salario + temp;
			System.out.println("O novo salário do funcionário será de: " + novosalario);
			System.out.println("O salário antigo era de: " + salario);
			System.out.println("O valor aumentado foi de:" + temp);
			System.out.println("O Percentual aumentado foi de: 15%");
		} else if(salario >= 700.0 && salario < 1500.0){
			double temp = salario * 0.10;
			double novosalario = salario + temp;
			System.out.println("O novo salário do funcionário será de: " + novosalario);
			System.out.println("O salário antigo era de: " + salario);
			System.out.println("O valor aumentado foi de:" + temp);
			System.out.println("O Percentual aumentado foi de: 10%");
		}else {
			double temp = salario * 0.05;
			double novosalario = salario + temp;
			System.out.println("O novo salário do funcionário será de: " + novosalario);
			System.out.println("O salário antigo era de: " + salario);
			System.out.println("O valor aumentado foi de:" + temp);
			System.out.println("O Percentual aumentado foi de: 5%");
		}
		
		
		
	}

}
