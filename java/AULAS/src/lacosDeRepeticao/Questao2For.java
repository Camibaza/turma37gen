package lacosDeRepeticao;

import java.util.Scanner;

public class Questao2For {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		int contadorImpar=0, contadorPar=0, numero=0;
		
		for(int x=0;x<10;x++) {
			System.out.print("Digite um numero inteiro: ");
			numero=leia.nextInt();
			if(numero%2==1 && numero>0) {
				contadorImpar++;
			}
			else if(numero%2==0 && numero>0) {
				contadorPar++;
				
			}
		}
	
		System.out.printf("\nQuantidade de numeros impares: %d", contadorImpar);
		System.out.printf("\nQuantidade de numeros pares: %d", contadorPar);
		

}
}
