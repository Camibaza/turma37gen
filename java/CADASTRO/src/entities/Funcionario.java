package entities;

public class Funcionario {

	
	//Atributos
	
	public String nome;
	public int matricula;
	public double salario;
	public int anoNascimento;
	
	//Metodos
	
	public void exibirNome() {
		System.out.println("O nome do funcionario �: "+ nome);
	}
	public void exibirIdade() {
		System.out.println("A idade do funcionario �:  "+ (2021-anoNascimento));
	}
	public void exibirMatricula() {
		System.out.println("A matricula do funcionario �: " +matricula);
	}
	public void exibirSalario() {
		System.out.println("O salario do funcionario �: " +salario);
	}
}
