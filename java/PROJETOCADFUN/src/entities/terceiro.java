package entities;

public class terceiro extends funcionario {

	private double adicional;

	//CONSTRUTOR
	
	public terceiro(String matricula, String nome, double adicional) {
		super(matricula, nome);
		this.adicional = adicional;
	}

	//ENCAPSULAMENTO


	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	@Override
	public double calcularSalario() {
		
		//quando é private coloca a mae no meio(super)
		return (super.getHorasTrabalhadas()*super.getValorHora()+this.adicional);
		
	}


}
