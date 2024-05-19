package ifsc;

import java.util.ArrayList;

public class MainVeiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veiculo a = new Veiculo();
		Veiculo b = new Veiculo();
		Veiculo c = new Veiculo();
		
		a.setNome("Impala");
		a.setAno(1967);
		a.setNumerodaroda(4);
		a.setFabricante("Chevrolet");
		a.setCor("Preto");
		
		b.setNome("Fusca");
		b.setAno(1993);
		b.setNumerodaroda(4);
		b.setFabricante("Volkswagen");
		b.setCor("Azul");
		
		c.setNome("Uno mile com escada");
		c.setAno(2000);
		c.setNumerodaroda(4);
		c.setFabricante("Fiat");
		c.setCor("Vermelho Bordo");
		
		ArrayList<Veiculo> v1 = new ArrayList<>();
		v1.add(a);
		v1.add(b);
		v1.add(c);
		
		for (Veiculo veiculo : v1) {
			System.out.println(veiculo.getNome());
			System.out.println(veiculo.getAno());
			System.out.println(veiculo.getNumerodaroda());
			System.out.println(veiculo.getFabricante());
			System.out.println(veiculo.getCor());
			System.out.println("");
		}
	}
	}


