package exercicios;

import java.util.Scanner;

public class Cadastro {

	public static void main(String[] args) {
		Scanner entra = new Scanner(System.in);
		boolean validaSenha = true;
		
		do {
			System.out.println("Digite o nome de usuário:");
			String nome = entra.next();
			System.out.println(nome + " digite a senha:");
			String senha = entra.next();
			
			if(nome.equalsIgnoreCase(senha)) {
				System.out.println("Senha inválida! A senha não pode ser igual ao nome.");
				validaSenha = false;
			} else {
				System.out.println("Cadastro concluído com sucesso!");
			}
			
		} while (!validaSenha);
	}

}
