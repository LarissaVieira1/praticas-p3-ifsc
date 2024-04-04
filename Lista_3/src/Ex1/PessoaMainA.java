package Ex1;

public class PessoaMainA {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();

		p1.nome = "Felipe";
		p1.cpf = (long) 11100;
		p1.data_de_nascimento = "28/03/2007";

		System.out.println(p1.nome);
		System.out.println(p1.cpf);
		System.out.println(p1.data_de_nascimento + "\n");

		Pessoa p2 = new Pessoa();

		p2.nome = "Bruna";
		p2.cpf = (long) 00111;
		p2.data_de_nascimento = "20/05/1990";

		System.out.println(p2.nome);
		System.out.println(p2.cpf);
		System.out.println(p2.data_de_nascimento + "\n");

		Pessoa p3 = new Pessoa();

		p3.nome = "Willian";
		p3.cpf = (long) 00011;
		p3.data_de_nascimento = "14/04/2006";

		System.out.println(p3.nome);
		System.out.println(p3.cpf);
		System.out.println(p3.data_de_nascimento + "\n");

	}

}
