package entitiesHeranca;

public class Cachorro extends Animal {

	
	public Cachorro(String nome, int idade) {
		super(nome, idade);
		
	}

	public void correr() {
		System.out.println("Correu atras do osso");
	}
}
