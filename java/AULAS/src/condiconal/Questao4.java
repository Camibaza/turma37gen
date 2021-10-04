package condiconal;

import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		int numero;
		
		System.out.print(("Digite um numero positivo: "));
		numero = leia.nextInt();

		if (numero < 0) {
			System.out.print("Você digitou um numero negativo");
		} else if (numero == 0) {
			System.out.print("Esse número é neutro");
		} else if (numero % 2 == 0) {
			System.out.print("O numero é par e sua raiz quadrada eh: " + Math.sqrt(numero));
		} else {
			System.out.print("O numero eh impar e seu quadrado eh: " + Math.pow(numero, 2));
		}

	}

}
