package ifsc;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Gato a1 = new Gato();
		a1.setClasse("Mamifero");
		a1.setNomeCientifico("Felis catus");
		a1.setPedigree("snowshoe");
		a1.setApelido("Xano");

		Gato b2 = new Gato();
		b2.setClasse("Mamifero");
		b2.setNomeCientifico("Felis catus");
		b2.setPedigree("Bobtail americano");
		b2.setApelido("Xana");

		Gato c3 = new Gato();
		c3.setClasse("Mamifero");
		c3.setNomeCientifico("Felis catus");
		c3.setPedigree("Gato Angora");
		c3.setApelido("Xana filha");

		Tutor a = new Tutor();
		a.setNomeCompleto("Jane terezinha Campanharo Vieira Lopes");
		a.setGato(a1);

		Tutor b = new Tutor();
		b.setNomeCompleto("Larissa Vieira de Sousa Lopes");
		b.setGato(b2);

		Tutor c = new Tutor();
		c.setNomeCompleto("Djaci de Sousa Lopes");
		c.setGato(c3);

		ArrayList<Tutor> Lista = new ArrayList<>();

		Lista.add(a);
		Lista.add(b);
		Lista.add(c);

		for (Tutor tutores : Lista) {
			System.out.println(tutores.getNomeCompleto());
			System.out.println(tutores.getGato().getClasse());
			System.out.println(tutores.getGato().getNomeCientifico());
			System.out.println(tutores.getGato().getPedigree());
			System.out.println(tutores.getGato().getApelido());
			System.out.println();

		}
	}
}
