package lacosDeRepeticao;

import java.util.Scanner;

public class Questao5DoWhile {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero=0, soma=0;
		
		do {
			System.out.println("Digite um numero: ");
			numero=leia.nextInt();
			soma = soma + numero;
						
		}while(numero!=0);
		
		System.out.printf("A soma dos numeros digitados foi: %d", soma);
			
			
		}

	}


