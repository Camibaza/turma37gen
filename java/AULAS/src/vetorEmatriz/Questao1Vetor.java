package vetorEmatriz;

import java.util.Scanner;

public class Questao1Vetor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
		//atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.
		
		//VARIAVEIS
		
		int numero, maior=0;
		int pontos[] = new int [5]; 
		
		for(int x=0; x<pontos.length; x++) {
			System.out.println("Digite um numero: ");
			numero=leia.nextInt();	
			pontos[x] = numero;
			if (numero > maior) {
				maior = numero;
			}
		}
		System.out.println("A maior pontuacao foi: " +maior);
				

	}

}
