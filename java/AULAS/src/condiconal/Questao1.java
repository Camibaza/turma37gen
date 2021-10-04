package condiconal;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int numero1, numero2, numero3;
		int maiorNumero=0;
		
		System.out.print("Digite o primeiro numero: ");
		numero1=leia.nextInt();
		System.out.print("Digite o segundo numero: ");
		numero2=leia.nextInt();
		System.out.print("Digite o terceiro numero: ");
		numero3=leia.nextInt();
		
		if(numero1>numero2 && numero1>numero3){
			maiorNumero = numero1;
		}else if(numero2>numero1 && numero2>numero3) {
			maiorNumero = numero2;
			}
		else {
			maiorNumero=numero3;
		}
		
		System.out.printf("O primeiro foi %d, o segundo foi %d, o terceiro foi %d e o maior foi %d.", numero1, numero2, numero3, maiorNumero);
	}

}
