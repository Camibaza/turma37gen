package condiconal;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia= new Scanner(System.in);
		
		int idade;
		
		System.out.print("Digite sua idade: ");
		idade=leia.nextInt();
		
		if(idade>=10 && idade<=14){
			System.out.print("Voc� � infantil!");
		
		} else if (idade>=15 && idade<=17){
			System.out.print("Voc� � juvenil!");
		} else if (idade>=18 && idade<=25) {
			System.out.print("Voc� � adulto!");
		}else {
			System.out.print("Voc� n�o faz parte do publico descrito");
		}
		

	}

}
