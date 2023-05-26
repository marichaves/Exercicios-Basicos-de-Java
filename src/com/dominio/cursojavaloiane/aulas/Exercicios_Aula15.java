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
		
//		//Outra maneira de fazer o ex 4 é com a manipulação de String
//		System.out.println("Digite uma letra: ");
//		String letra = scan.next();
//		if(letra.equalsIgnoreCase("a")|| letra.equalsIgnoreCase("e")||
//				letra.equalsIgnoreCase("i")||letra.equalsIgnoreCase("o")||
//				letra.equalsIgnoreCase("u")) {
//			System.out.println(letra + ": é uma letra vogal");
//		}else {
//			System.out.println("É uma consoante");
//		}
//		
//		//Outra maneira de resolver o ex4 é com o switch case
//		if(letra.length() > 1) {
//			System.out.println("Não é uma letra válida");
//		} else {
//		switch(letra) {
//		case "a":
//		case "e":
//		case "i":
//		case "o":
//		case "u":
//		case "A":
//		case "E":
//		case "I":
//		case "O":
//		case "U":System.out.println("Vogal"); break;
//		default: System.out.println("Consoante");
//		}
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

		
		
//		System.out.println("Calculando o reajuste salarial. Digite o salário do colaborador:");
//		double salario = scan.nextFloat();
//		
//		if(salario <= 280.0) {
//			double temp = salario * 0.20;
//			double novosalario = salario + temp;
//			System.out.println("O novo salário do funcionário será de: " + novosalario);
//			System.out.println("O salário antigo era de: " + salario);
//			System.out.println("O valor aumentado foi de:" + temp);
//			System.out.println("O Percentual aumentado foi de: 20%");
//		} else if(salario > 280.0 && salario < 700.0){
//			double temp = salario * 0.15;
//			double novosalario = salario + temp;
//			System.out.println("O novo salário do funcionário será de: " + novosalario);
//			System.out.println("O salário antigo era de: " + salario);
//			System.out.println("O valor aumentado foi de:" + temp);
//			System.out.println("O Percentual aumentado foi de: 15%");
//		} else if(salario >= 700.0 && salario < 1500.0){
//			double temp = salario * 0.10;
//			double novosalario = salario + temp;
//			System.out.println("O novo salário do funcionário será de: " + novosalario);
//			System.out.println("O salário antigo era de: " + salario);
//			System.out.println("O valor aumentado foi de:" + temp);
//			System.out.println("O Percentual aumentado foi de: 10%");
//		}else {
//			double temp = salario * 0.05;
//			double novosalario = salario + temp;
//			System.out.println("O novo salário do funcionário será de: " + novosalario);
//			System.out.println("O salário antigo era de: " + salario);
//			System.out.println("O valor aumentado foi de:" + temp);
//			System.out.println("O Percentual aumentado foi de: 5%");
//		}
//		
		
//		System.out.println("Entre com o valor/hora:");
//		double valorHora = scan.nextDouble();
//		System.out.println("Qual o total de horas trabalhadas no mês?: ");
//		double qtHoras = scan.nextDouble();
//		
//		double salarioBruto = valorHora * qtHoras;
//		int percentualIR = 0;
//		if(salarioBruto <= 900) {
//			percentualIR = 0;
//		} else if (salarioBruto > 900 && salarioBruto <= 1500) {
//			percentualIR = 5;
//		} else if (salarioBruto > 1500 && salarioBruto <= 2500) {
//			percentualIR = 10;
//		} else if (salarioBruto > 2500) {
//			percentualIR = 20;
//		}
//		double ir = (salarioBruto / 100) * percentualIR;
//		double inss = (salarioBruto / 100) * 10;
//		double fgts = (salarioBruto / 100) * 11;
//		double totalDescontos = ir + inss;
//		double salarioLiquido = salarioBruto - totalDescontos;
//		
//		System.out.println("Salário Bruto: (" + valorHora + "*" + qtHoras + "): " + salarioBruto);
//		System.out.println("(-) IR (" + percentualIR + "%): " + ir );
//		System.out.println("(-) INSS (10%): " + inss);
//		System.out.println("FGTS (11%): " + fgts);
//		System.out.println("Total de descontos: " + totalDescontos);
//		System.out.println("Salário líquido: " + salarioLiquido);
		
		
		
//		System.out.println("Digite um dia da semana de 1 - 7:");
//		int semana = scan.nextInt();
//		
//		if (semana > 7) {
//			System.out.println("Não é um dia da semana válido");
//		} else {
//			switch (semana) {
//			case 1 :
//				System.out.println("Domingo");
//				break;
//			case 2 :
//				System.out.println("Segunda");
//				break;
//			case 3 :
//				System.out.println("Terça");
//				break;
//			case 4 :
//				System.out.println("Quarta");
//				break;
//			case 5 :
//				System.out.println("Quinta");
//				break;
//			case 6 :
//				System.out.println("Sexta");
//				break;
//			case 7 :
//				System.out.println("Sábado");
//				break;
//			}
//		}
		
		
		
//		System.out.println("Digite a primeira nota no aluno: ");
//		double nota1 = scan.nextDouble();
//		System.out.println("Digite a segunda nota no aluno: ");
//		double nota2 = scan.nextDouble();
//
//		double media = (nota1 + nota2) / 2;
//		String aproveitamento = "";
//		if(media >= 9 && media <= 10) {
//			aproveitamento = "A";
//		} else if(media >= 7.5 && media < 9) {
//			aproveitamento = "B";
//		}  else if(media >= 6 && media < 7.5) {
//			aproveitamento = "C";
//		} else if(media >= 4 && media < 6) {
//			aproveitamento = "E";
//		} else if(media >= 0 && media < 4) {
//			aproveitamento = "E";
//		}
//		System.out.println("Nota1: " + nota1);
//		System.out.println("Nota2: " + nota2);
//		System.out.println("Media: " + media);
//		System.out.println("Conceito: " + aproveitamento);
//		
//		switch(aproveitamento) {
//		case "A":
//		case "B":
//		case "C": System.out.println("APROVADO"); break;
//		case "D":
//		case "E": System.out.println("REPROVADO"); break;
//		}
		
		
//		System.out.println("Entre com o lado 1: ");
//		int lado1 = scan.nextInt();
//		System.out.println("Entre com o lado 2: ");
//		int lado2 = scan.nextInt();
//		System.out.println("Entre com o lado 3: ");
//		int lado3 = scan.nextInt();
//		
//		
//		if (((lado1 + lado2) > lado3) || 
//				((lado1 + lado3) > lado2) ||
//				((lado2 + lado3) > lado1)) {
//			if (lado1 == lado2 && lado1 == lado3) {
//				System.out.println("Triângulo Equilátero");
//			}else if (lado1 != lado2 && lado1 != 3 && lado3 != lado2 ){
//				System.out.println("Triângulo Escaleno");
//			} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
//				System.out.println("Triângulo Isóceles");
//			}
//			
//		} else {
//			System.out.println("Não forma um triângulo.");
//		}
		
		
		
		
	}

}
