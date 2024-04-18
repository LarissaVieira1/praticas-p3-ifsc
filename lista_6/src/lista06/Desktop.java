package lista06;

import java.util.ArrayList;

public class Desktop extends Produto {

	private Boolean gamer;
	private ArrayList<String> pecas;

	public boolean isGamer() {
		return gamer;
	}

	public void setGamer(boolean gamer) {
		this.gamer = gamer;
	}

	public ArrayList<String> getPecas() {
		return pecas;
	}

	public void setPecas(ArrayList<String> pecas) {
		this.pecas = pecas;
	}

}
