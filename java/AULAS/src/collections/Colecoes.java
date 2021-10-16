package collections;

import java.util.ArrayList;
import java.util.Collection;

public class Colecoes {

	public static void main(String[] args) {
		
		Collection<String> nomes = new ArrayList();
		nomes.add("mouse");
		nomes.add("teclado");
		nomes.add("webcam");
		nomes.add("impressora");
		nomes.add("monitor");
		nomes.add("headset");
		nomes.add("caixa de som");
		nomes.add("roteador");
		nomes.add("hd externo");
		nomes.add("cabo hdmi");
		
		System.out.println("Lista dos produtos: "+nomes);

	}

}
