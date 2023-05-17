package com.dominio.cursojavaloiane.aulas;

import java.util.Scanner;

public class Exercicios_Aula13 {
	private static Scanner entra;


	//Exercícios Aula 13: https://www.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13
	public static void main(String[] args) {
//		System.out.println("Olá Mundo");
//		
//		
//		Scanner entrada = new Scanner(System.in);
//		System.out.println("Digite um número: ");
//		int var = entrada.nextInt();
//		System.out.println(var);
//		
//		System.out.println("Digite dois números");
//		int num1 = entrada.nextInt();
//		int num2 = entrada.nextInt();
//		System.out.println(num1 + num2);
		
//		Scanner nota = new Scanner(System.in);
//		System.out.println("Digite as quatro notas seguidas: ");
//		int matematica = nota.nextInt();
//		int historia = nota.nextInt();
//		int fisica = nota.nextInt();
//		int filosofia = nota.nextInt();
//		int media = (matematica + historia + fisica + filosofia) / 4;
//		System.out.println("A media do aluno no bimestre é de: " + media);
		
//		float metros, centimetros;
//		Scanner leitura = new Scanner(System.in);
//		System.out.println("Digite a distância em metros: ");
//		metros = leitura.nextFloat();
//		centimetros = metros * 100;
//		System.out.println("A distância em centimetros é de: " + centimetros);
		
//		//Area de um círculo
//		double raio, area;
//		Scanner entrada = new Scanner(System.in);
//		System.out.println("Digite o raio do círculo: ");
//		raio = entrada.nextFloat();
//		area = Math.PI * Math.pow(raio, 2);
//		System.out.println("A Area é: " + area);
		
//		// Area de um quadrado
//		double area, base, altura;
//		entra = new Scanner(System.in);
//		System.out.println("Digite a base do quadrado: ");
//		base = entra.nextDouble();
//		System.out.println("Digite a altura do quadrado: ");
//		altura = entra.nextDouble();
//		area = base * altura;
//		area = area*2;
//		System.out.println("A Area é de: "+ area);
		
//		// Quanto você recebe por hora e o numero de horas trabalhadas por mês? Qual o seu salario final?
//		double salarioPorHora, horas, salario;
//		Scanner recebe = new Scanner(System.in);
//		System.out.println("Quanto você recebe por hora? Quantas horas você trabalha no mês?: ");
//		salarioPorHora = recebe.nextDouble();
//		horas = recebe.nextDouble();
//		salario = horas * salarioPorHora;
//		salario = salario * 30;
//		System.out.println("Você recebe por mês: " + "R$" + salario);
		
//		double c, f;
//		Scanner r = new Scanner(System.in);
//		System.out.println("Digite a temperatura em Farenheit:");
//		f = r.nextDouble();
//		c = (5*(f-32)/9);
//		System.out.println("A temperatura em Celsius é: " + c);
//		
//		
//		Scanner a = new Scanner(System.in);
//		double inteiro1, inteiro2, real, produto, soma, cubo;
//		System.out.println("Digite dois números inteiros e um numero real: ");
//		inteiro1 = a.nextDouble();
//		inteiro2 = a.nextDouble();
//		real = a.nextDouble();
//		produto = (2*inteiro1)*(inteiro2/2);
//		soma = inteiro1*3 + real;
//		cubo = Math.pow(real, 3);
//		System.out.println("Resultado da questão a) " + produto );
//		System.out.println("Resultado da questão b) " + soma);
//		System.out.println("resultado da questão c) " + cubo);
		
		Scanner p = new Scanner(System.in);
		double altura, peso;
		System.out.println("Qual a sua altura? ");
		altura = p.nextDouble();
		System.out.println("Você é do sexo masculino ou feminino?  ");
		char sexo = p.next().charAt(0);
		
		if (sexo == 'm') {
			peso = (72.7* altura)-58;
			System.out.println("Seu peso ideal é de: " + peso +"kg");
			System.out.println("Informe o seu peso: ");
			double seu = p.nextDouble();
		
			if (seu < peso) {
				System.out.println("Você está abaixo do peso ideal!");
				return;
			} else if (seu > peso) {
				System.out.println("Você está acima do peso ideal!");
				return;
			} else {
				System.out.println("Você está no peso ideal");
				return;
			}
			
		} else if (sexo == 'f') {
			peso = (62.1* altura)-44.7;
			System.out.println("Seu peso ideal é de: " + peso +"kg");
			System.out.println("Informe o seu peso: ");
			double seu = p.nextDouble();
		
			if (seu < peso) {
				System.out.println("Você está abaixo do peso ideal!");
				return;
			} else if (seu > peso) {
				System.out.println("Você está acima do peso ideal!");
				return;
			} else {
				System.out.println("Você está no peso ideal");
				return;
			}
		} else {
		 System.out.println("Coloque um sexo valido ");
		 return;
		}		
//		
		
		
		
		
		
		
	}
	
}
