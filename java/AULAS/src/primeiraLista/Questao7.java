package primeiraLista;

import java.util.Scanner;

public class Questao7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		double a;
		double b;
		double c;
		double d;
		double e;
		double f;
		double x;
		double y;
		
		System.out.println("Digite o valor de a: ");
		a=leia.nextDouble();
		System.out.println("Digite o valor de b: ");
		b=leia.nextDouble();
		System.out.println("Digite o valor de c: ");
		c=leia.nextDouble();
		System.out.println("Digite o valor de d: ");
		d=leia.nextDouble();
		System.out.println("Digite o valor de e: ");
		e=leia.nextDouble();
		System.out.println("Digite o valor de f: ");
		f=leia.nextDouble();
		
		x = ((c*e) - (b*f) / (a*e) - (b*d));
		y = ((a*f) - (c*d) / (c*d) - (a*e));
		
		System.out.println("Com isso o valor de x é:  "+x +"E o valor de y é o equivalente a: " +y );
	
	}

}
