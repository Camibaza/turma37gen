package entities;

public class Cliente {

	//ATRIBUTOS
	
	private String nome;
	private String cpf;
	private double telefone;
	
	//CONSTRUTOR
	
	public Cliente(String nome, String cpf, double telefone) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		
		
	}

	//ENCAPSULAMENTO
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getTelefone() {
		return telefone;
	}

	public void setTelefone(double telefone) {
		this.telefone = telefone;
	}
	
	
	
}
