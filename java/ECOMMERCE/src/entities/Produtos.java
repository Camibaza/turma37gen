package entities;

public class Produtos {
	
    private String nome;
    private double valor;
    private String codigo;
    private int estoque;
	
    
  //CONSTRUTOR
    
    public Produtos(String nome, String codigo, double valor, int estoque) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.codigo = codigo;
		this.estoque = estoque;
	}

    //ENCAPSULAMENTO

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public int getEstoque() {
		return estoque;
	}


	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
    
	@Override
	public String toString() {
		return "Produtos [produto=" + nome + ", codigo=" + codigo + ", valor=" + valor + ", estoque=" + estoque + "]";
	}
	public void adicionar(int quantidade) {
		if (quantidade<=estoque&& quantidade>0 && estoque>=0) {
			estoque = estoque - quantidade;
			System.out.println("Parabéns, sua compra foi aprovada!");
		}
		
		else {
			estoque = estoque - quantidade;
			System.out.println("Nao é possivel realizar a operação.");
		}
	}
	
    

}
