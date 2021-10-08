package application;

import java.util.Scanner;

import entities.Clientes;

public class ExCliente {

	public static void main(String[] args) {
		
		Clientes exemplo1 = new Clientes();
		Scanner leia = new Scanner(System.in);
		
		//Entradas
		
		exemplo1.nome = "Camila";
		exemplo1.anoNascimento = 1997;
		exemplo1.cpf = 123456789;
		exemplo1.contato = 32456978;
		
		//Saida
		
		exemplo1.exibirNome();
		exemplo1.exibirIdade();
		exemplo1.exibirCpf();
		exemplo1.exibirContato();
		
		System.out.println("O cliente pagará como? Digite 'D' para debito, 'C' para credito ou 'E' para especie " );
		exemplo1.formaPagamento = leia.next().toUpperCase().charAt(0);
		exemplo1.exibirPagamento();
		
	}

}
