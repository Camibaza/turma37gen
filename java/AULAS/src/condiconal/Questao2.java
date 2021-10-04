package condiconal;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int numero1, numero2, numero3;
		int auxiliar;
		
		System.out.print("Digite o primeiro numero: ");
		numero1=leia.nextInt();
		System.out.print("Digite o segundo numero: ");
		numero2=leia.nextInt();
		System.out.print("Digite o terceiro numero: ");
		numero3=leia.nextInt();
		
		System.out.printf("Voce digitou: %d, %d e %d.", numero1, numero2,numero3);
		
		if(numero1 < numero2) {
			auxiliar = numero1;
			numero1 = numero2;
			numero2 = auxiliar;
		}
		
		if(numero2 < numero3) {
			auxiliar = numero2;
			numero2 = numero3;
			numero3 = auxiliar;
		}
		
		if(numero3 < numero1) {
			auxiliar = numero3;
			numero3 = numero1;
			numero1 = auxiliar;
		}
		
		System.out.printf("A ordem crescente dos numeros digitados é: %d, %d e %d.", numero1, numero2,numero3);
		
		
	}

}
