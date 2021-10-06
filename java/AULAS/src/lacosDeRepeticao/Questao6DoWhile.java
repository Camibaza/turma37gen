package lacosDeRepeticao;

import java.util.Scanner;

public class Questao6DoWhile {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero=0;
		double media=0.00, soma=0.00, totalMultiplos=0.00;
		
		
		do {
			System.out.print("Digite um numero: ");
			numero = leia.nextInt();
			if(numero%3==0 && numero>0) {
				soma= soma+numero;
				totalMultiplos++;
			}
			
		}while(numero!=0);
		
		media=soma/totalMultiplos;
		System.out.printf("A soma dos multiplos de 3 é %.2f: ", soma);
		System.out.printf("Você digitou %.2f numeros multiplos de 3.", totalMultiplos);
		System.out.printf("A media entre eles é %.2f",media);
		

	}

}
