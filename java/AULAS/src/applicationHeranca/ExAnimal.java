package applicationHeranca;

import java.util.Scanner;

import entitiesHeranca.Cachorro;
import entitiesHeranca.Cavalo;
import entitiesHeranca.Preguica;

public class ExAnimal {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Cachorro dog1 = new Cachorro("Badu", 2);
		Cavalo horse1 = new Cavalo("Pangaré", 7);
		Preguica preg1 = new Preguica("Luna", 30);
		
		System.out.println("Digite o som do cachorro: ");
		String som = leia.next();
		System.out.println("Digite o som do cavalo: ");
		String som1 = leia.next();
		System.out.println("Digite o som da preguica: ");
		String som2 = leia.next();
		
		System.out.println();
		System.out.println("CACHORRO");
		System.out.println("NOME: "+dog1.getNome()+ "\nIDADE: "+dog1.getIdade());
		dog1.correr();
		dog1.emitirSom();
		
		System.out.println();
		System.out.println("CAVALO");
		System.out.println("NOME: "+horse1.getNome()+ "\nIDADE "+horse1.getIdade());
		horse1.correr();
		horse1.emitirSom();
		
		System.out.println();
		System.out.println("PREGUICA");
		System.out.println("NOME:  "+preg1.getNome()+ "\nIDADE "+preg1.getIdade());
		preg1.subir();
		preg1.emitirSom();
		
		
		
	}

}
