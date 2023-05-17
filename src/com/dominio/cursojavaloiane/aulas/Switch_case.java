package com.dominio.cursojavaloiane.aulas;

import java.util.Scanner;

public class Switch_case {
	public static void main(String[] args) {
		// O comando de Switch - Case pode ser uma alternativa ao uso de vários if-Else aninhados
		Scanner scan = new Scanner(System.in);
		int diaSemana = scan.nextInt();
		
//		switch(diaSemana) {
//		case 1: System.out.println("Domingo"); break;
//		case 2: System.out.println("Segunda"); break;
//		case 3: System.out.println("Terça"); break;
//		case 4: System.out.println("Quarta"); break;
//		case 5: System.out.println("Quinta"); break;
//		case 6: System.out.println("Sexta"); break;
//		case 7: System.out.println("Sábado"); break;
//		default: System.out.println("Não é um dia da semana válido"); 
//		}
		
		switch(diaSemana) {
		case 2: 
		case 3: 
		case 4: 
		case 5: 
		case 6: System.out.println("Dia útil"); break;
		case 1:
		case 7: System.out.println("Fim de semana"); break;
		default: System.out.println("Não é um dia da semana válido"); 
		}
	}
}
