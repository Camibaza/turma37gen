package entities;

public class Conta {
	
	//atributos
	private int numero;
	private String cpf;
	private double saldo;
	private boolean ativa;
	
	//construtor - mesmo nome da classe
	
	public Conta(int numero, String cpf) {
		this.numero = numero;
		this.cpf = cpf;
	}

	//sobrecarga
	public Conta(int numero, String cpf, double saldo, boolean ativa) {
		super();
		this.numero = numero;
		this.cpf = cpf;
		this.saldo = saldo;
		this.ativa = ativa;
	}

	//encapsulamento - getters and setters
	
	public int getNumero() { //retorna o numero
		return numero;
	}

	public void setNumero(int numero) { //espera que voce informe
		this.numero = numero;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	//public void setSaldo(double saldo) {
		//this.saldo = saldo;
	

	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	
	//metodos
	
	public void ativarConta() {
		ativa = true;
		System.out.println("Conta ativada");
	}
	
	public void debito(int valor) {
		saldo = saldo - valor;
	}
	
	public void credito(double valor) {
		saldo = saldo + valor;
	}
	
	
	

}
