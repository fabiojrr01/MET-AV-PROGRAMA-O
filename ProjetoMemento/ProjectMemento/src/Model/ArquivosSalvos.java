package Model;

import java.util.ArrayList;

public class ArquivosSalvos {
	
	private ArrayList<Memento> mementoLista = new ArrayList <Memento>();
	
	public void add (Memento arquivo) {
		mementoLista.add(arquivo);
	}
	
	public Memento get (int posicao) {
		return mementoLista.get(posicao);
	}

	

}
