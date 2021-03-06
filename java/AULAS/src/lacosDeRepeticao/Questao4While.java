package lacosDeRepeticao;

import java.util.Scanner;

public class Questao4While {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
	
	//Uma empresa desenvolveu uma pesquisa para saber as características
	//psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
	//era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
	//(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
	//agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
	//pessoas, calcule e mostre: (WHILE)
	// o número de pessoas calmas;
		// o número de mulheres nervosas;
		// o número de homens agressivos;
		// o número de outros calmos;
		// o número de pessoas nervosas com mais de 40 anos;
		// o número de pessoas calmas com menos de 18 anos.
	
	
		//variaveis
		
		int idade;
		char sexo;  // (1-feminino / 2-masculino / 3-Outros)
		char opcao; // (1 - pessoa calma; 2- pessoa nervosa, 3-pessoa agressiva)
		int pessoasCalmas=0;
		int mulheresNervosas=0;
		int homensAgressivos=0;
		int outrosCalmos=0;
		int pessoasNervosasAcima40anos=0;
		int pessoasCalmasMenos18anos=0;
		char op='S';
		int contadorHabitantes=1;
		
		//entradas
		while (op == 'S' && contadorHabitantes<=150) {
			System.out.println("Habitante numero " +contadorHabitantes);
			System.out.println("Digite a idade: ");
			idade=leia.nextInt();
			System.out.println("Escolha\n1-femino\n2-masculino\n3-outros");
			sexo=leia.next().charAt(0);
			System.out.println("Escolha \n1-pessoa calma\n2-pessoa nervosa\n3-pessoa agressiva");
			opcao=leia.next().charAt(0);
			System.out.println("Continuar S/N : ");
			op = leia.next().toUpperCase().charAt(0);
			contadorHabitantes++;
			
			if(opcao == '1') {
				pessoasCalmas++;
			}
			
			if(sexo == '1' && opcao == '2') {
				mulheresNervosas++;
				
			}
			if(sexo == '2' && opcao == '3') {
				outrosCalmos++;
				
			}
			if(opcao == '2' && idade>40) {
				pessoasNervosasAcima40anos++;
				
			}
			if(opcao == '1' && idade<18) {
				pessoasCalmasMenos18anos++;
				
			}
		}
		
		//saidas
		
		System.out.println("Habitantes entrevistados: "+(contadorHabitantes-1));
		System.out.println("Pessoas calmas: "+pessoasCalmas);
		System.out.println("Mulheres nervosas: "+mulheresNervosas);
		System.out.println("Homens agressivos: "+homensAgressivos);
		System.out.println("Outros calmos: "+outrosCalmos);
		System.out.println("Pessoas nervosas acima de 40 anos: "+pessoasNervosasAcima40anos);
		System.out.println("Pessoas calmas menos de 18 anos: "+pessoasCalmasMenos18anos);

	}

}
