package Ex2;

import java.util.Scanner;

import Ex1.Pessoa;

public class PessoaMainB {

	public static void main(String[] args) {

		Pessoa[] p = new Pessoa[3];
		Scanner leitura = new Scanner(System.in);

		for (int i = 0; i < p.length; i++) {
			Pessoa pessoa = new Pessoa();
			System.out.println("Digite o nome:");
			pessoa.nome = leitura.nextLine();

			System.out.println("Digite o cpf:");
			pessoa.cpf = Long.valueOf(leitura.nextLine());

			System.out.println("Digite a data de nascimento:");
			pessoa.data_de_nascimento = leitura.nextLine();
			p[i] = pessoa;
		}

		for (int i = 0; i < p.length; i++) {
			System.out.println("Nome:" + p[i].nome);
			System.out.println("Cpf:" + p[i].cpf);
			System.out.println("Data de nascimento:" + p[i].data_de_nascimento + "\n");

		}

	}

}
