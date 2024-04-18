package lista06;

import java.util.ArrayList;

public class MainProduto {

	public static void main(String[] args) {

		ArrayList<Desktop> desktops = new ArrayList<>();

//-----------------------------------------//

		Desktop d1 = new Desktop();

		d1.setFabricante("Intel");
		d1.setGamer(true);
		d1.setCodBarras(12345);

		ArrayList<String> peca1 = new ArrayList<>();

		peca1.add("Gabinete");
		peca1.add("Monitor");
		peca1.add("fonte");

		d1.setPecas(peca1);

		desktops.add(d1);

//-----------------------------------------//

		Desktop d2 = new Desktop();

		d2.setFabricante("Lenovo");
		d2.setGamer(false);
		d2.setCodBarras(54321);

		ArrayList<String> peca2 = new ArrayList<>();

		peca2.add("Fone");
		peca2.add("teclado");
		peca2.add("placaMae");

		d2.setPecas(peca2);

		desktops.add(d2);

//-----------------------------------------//

		Desktop d3 = new Desktop();

		d3.setFabricante("HP");
		d3.setGamer(true);
		d3.setCodBarras(56789);

		ArrayList<String> peca3 = new ArrayList<>();

		peca3.add("memoriaRam");
		peca3.add("Fans");
		peca3.add("Cabo");

		d3.setPecas(peca3);

		desktops.add(d3);

//----------------------------------------//

		for (Desktop desktop : desktops) {
			System.out.println(desktop.getFabricante());
			System.out.println(desktop.isGamer());
			System.out.println(desktop.getCodBarras() + "\n");

			for (String pecas : desktop.getPecas()) {
				System.out.println(pecas);

			}
			System.out.println("");
		}

//-----------------------------------------//

		ArrayList<Smartphone> smartphones = new ArrayList<>();

		Smartphone s1 = new Smartphone();

		s1.setFabricante("Samsung");
		s1.setDimensoesTela("5 polegadas");
		s1.setQuantiadeArmazenamento("126");
		s1.setCodBarras(12345);

		smartphones.add(s1);

//-----------------------------------------//

		Smartphone s2 = new Smartphone();

		s2.setFabricante("Iphone");
		s2.setDimensoesTela("4,5 polegadas");
		s2.setQuantiadeArmazenamento("60");
		s2.setCodBarras(54321);

		smartphones.add(s2);

//-----------------------------------------//

		Smartphone s3 = new Smartphone();

		s3.setFabricante("Xiaome");
		s3.setDimensoesTela("6 polegadas");
		s3.setQuantiadeArmazenamento("256");
		s3.setCodBarras(56789);

		smartphones.add(s3);

// -----------------------------------------//

		for (Smartphone smartphone : smartphones) {
			System.out.println(smartphone.getFabricante());
			System.out.println(smartphone.getDimensoesTela());
			System.out.println(smartphone.getQuantiadeArmazenamento());
			System.out.println(smartphone.getCodBarras() + "\n");
		}

	}
}
