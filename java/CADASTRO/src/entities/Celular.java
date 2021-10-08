package entities;

public class Celular {

	//ATRIBUTOS
	
	public String marca;
	public boolean ligado;
	public double numero;
	public String cor;
	public char formaPagamento;

	
	//Encapsulamento
	
	public String getMarca() {
		return marca;
	}

	public void setModelo(String marca) {
		this.marca = marca;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public double getNumero() {
		return numero;
	}

	public void setNumero(double numero) {
		this.numero = numero;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public char getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(char formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	
	//Metodos
	
	public void exibirMarca() {
		System.out.println("O nome da marca é: " +marca);
	}
	public void exibirCor() {
		System.out.println("A cor do celular é: " +cor);
	}
	public void exibirContato() {
		System.out.println("O numero do celular é: "+numero);
	}
	public void exibirligarCelular() {
		ligado=true;
		System.out.println("O celular esta ligado!!");
	}
	public void exibirformaPagamento() {
		if(formaPagamento == 'D') {
			System.out.println("O celular será pago no debito");
		}
		else if(formaPagamento == 'C') {
			System.out.println("O celular será pago no crédito");
		}
		else {
			System.out.println("O celular será pago em especie");
		}
	}
	
}
