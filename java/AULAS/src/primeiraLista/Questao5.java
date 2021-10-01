package primeiraLista;

import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		double n1; 
		double n2;
		double n3;
		double n4;
		double notaFinal;
		
		System.out.println("Digite a nota 1:  ");
		n1=leia.nextDouble();
		System.out.println("Digite a nota 2:  ");
		n2=leia.nextDouble();
		System.out.println("Digite a nota 3:  ");
		n3=leia.nextDouble();
		
		
		notaFinal= ((n1*2) +(n2*3)+(n3*5))/(2+3+5);
		
		System.out.println("A média final é:   " + notaFinal);
	}

}
