package Ex3;

public class AnimalMain {
	public static void main(String[] args) {
		Animal lobo_da_tasmania = new Animal();

		lobo_da_tasmania.Nomes_Populares_Animal = new String[5];

		lobo_da_tasmania.nomeCientifico = "Thylacinus cynocephalus";
		lobo_da_tasmania.familia = "Thylacinidae";
		lobo_da_tasmania.reino = "Animalia";
		lobo_da_tasmania.Nomes_Populares_Animal[0] = "Tigre-da-Tasmania";
		lobo_da_tasmania.Nomes_Populares_Animal[1] = "Tigre-Australiano";
		lobo_da_tasmania.Nomes_Populares_Animal[2] = "Animal extinto";
		lobo_da_tasmania.Nomes_Populares_Animal[3] = "Marsupial";
		lobo_da_tasmania.Nomes_Populares_Animal[4] = "Tigrinho";

		System.out.println("=/=Tigre-da-Tasmania=/=" + "\n");

		System.out.println("Nome cientifico:" + lobo_da_tasmania.nomeCientifico);
		System.out.println("Familia:" + lobo_da_tasmania.familia);
		System.out.println("Reino:" + lobo_da_tasmania.reino);

		for (int i = 0; i < lobo_da_tasmania.Nomes_Populares_Animal.length; i++) {
			System.out.println(
					"Os nomes mais populares do diabo da tasmania sao: " + lobo_da_tasmania.Nomes_Populares_Animal[i]);

		}
	}
}
