package com.dominio.cursojavaloiane.aulas;

public class While_DoWhile {

	public static void main(String[] args) {
			int i = 1;
			int max = 10;
			System.out.println("Contando até " + max);
			while(i <= max) {
				
				System.out.println("Valor de i: " + i);
				i++;
			}
			
			do { 
				System.out.println(i);
				i++;
				System.out.println("Valor de i: " + i);
			} while (i < 15 );//primeiro executa e depois avalia a expressão
			System.out.println(i);
	}

}
