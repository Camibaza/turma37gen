package primeiraLista;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int dias;
		int totalMeses;
		int totalAnos;
		
		System.out.println("Dias : ");
		dias=leia.nextInt();
		
		totalMeses= dias/30;
		totalAnos= dias/360;
		
		System.out.println("Sua idade em meses �: " + totalMeses +  
				"Sua idade em anos �: " + totalAnos + 
				"Sua idade em dias �: " + dias);
		

	}

}
