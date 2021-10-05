package lacosDeRepeticao;

import java.util.Scanner;

public class Questao3While {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade=0, menor21=0, maior50=0;
		
		while(idade != -99) {
			System.out.print("Digite a idade: ");
			idade=leia.nextInt();
			
			if(idade>0 && idade<21) {
				menor21++;
				
			}
			else if(idade>50) {
				maior50++;
			}
			
		}
		System.out.printf("\nTotal de pessoas com menos de 21 anos: %d", menor21);
		System.out.printf("\nTotal de pessoas com mais de 50 anos: %d", maior50);
	}

}
