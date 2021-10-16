package entities;

public class funcionario {

	
	private String matricula;
	private String nome;
	private double valorHora;
	private int horasTrabalhadas;
	
	
	//construtor
	
	
		
	public funcionario(String matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
	}

	


	//encapsulamento
	
	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getValorHora() {
		return valorHora;
	}


	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}


	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}


	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	//METODOS
	// usa this p dizer que é atributo mas pode fazer sem 
	
	public double calcularSalario() {
		
		return (this.horasTrabalhadas*this.valorHora);
		
	}
	
	
	
}
