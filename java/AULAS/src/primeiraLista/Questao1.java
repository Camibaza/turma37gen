package primeiraLista;
import java.util.Scanner;

public class Questao1 {
 public static void main(String[] args) {
	 
	 Scanner leia = new Scanner(System.in);
	 
	 
	int anos;  
	int meses;
	int dias;
	int totalDias;
	
	System.out.println("anos :  ");
	anos = leia.nextInt();
	System.out.println("meses :  ");
	meses=leia.nextInt();
	System.out.println("dias :  ");
	dias=leia.nextInt();
	
	
	 totalDias= anos*360+meses*30+dias;
	
			System.out.println("Sua idade em dias é:  "+totalDias);
	 
			
 }
}
