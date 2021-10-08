package application;

import java.util.Scanner;

import entities.Celular;

public class ExCelular {

	public static void main(String[] args) {
		
			Celular exemplo1Celular = new Celular();
			Scanner leia = new Scanner(System.in);
		
		//Entradas
			
			exemplo1Celular.numero = 34415678;
			exemplo1Celular.cor = "Vermelho";
			exemplo1Celular.marca = "Apple";
			
			
		//Saidas	
			
			exemplo1Celular.exibirligarCelular();
			exemplo1Celular.exibirContato();
			exemplo1Celular.exibirCor();
			exemplo1Celular.exibirMarca();
			
	
				System.out.println("O celular será pago como? Digite 'D' para debito, 'C' para credito ou 'E' para especie: " );
				exemplo1Celular.formaPagamento = leia.next().toUpperCase().charAt(0);
				exemplo1Celular.exibirformaPagamento();
		
		
		
	
		
		
		
	}

}
