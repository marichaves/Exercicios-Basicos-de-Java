package com.dominio.cursojavaloiane.aulas;

public class LoopFor {
	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {
			System.out.println(i);
		}

		System.out.println();

		for (int i = 5; i > 0; i--) {
			System.out.println(i);
		}

		System.out.println();

		for (int i = 0, j = 5; i < j; i++, j--) {
			System.out.println(i + " != " + j);
		}
		
		System.out.println();
		
		int count = 0;
		for( ; count < 10 ; ) {
			System.out.println("Valor de count: " + count);
			count += 3;
		}
		
		System.out.println();
		
		for (int cont = 0; cont < 10; cont +=5) {
			System.out.println(cont);
		}
		
		System.out.println();
		
		int soma = 0;
		for(int i=1; i < 5; soma += i++);
		System.out.println("O valor da soma é: "+ soma );// O problema de usar fora do bloco é que só esta linha será replicada todo vez que o bloco rodar.
		
		

	}
}
