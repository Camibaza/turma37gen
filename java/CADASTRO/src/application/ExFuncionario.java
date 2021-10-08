package application;

import java.util.Scanner;

import entities.Funcionario;

public class ExFuncionario {

	public static void main(String[] args) {
		
		Funcionario exemplo1Funcionario = new Funcionario();
		Scanner leia = new Scanner(System.in);
		
		//Entradas
		
		exemplo1Funcionario.nome = "Camila";
		exemplo1Funcionario.matricula = 791248768;
		exemplo1Funcionario.anoNascimento = 1997;
		exemplo1Funcionario.salario = 2500.00;
		
		//Saidas
		
		exemplo1Funcionario.exibirNome();
		exemplo1Funcionario.exibirMatricula();
		exemplo1Funcionario.exibirIdade();
		exemplo1Funcionario.exibirSalario();
		
		
		
	}
	

}
