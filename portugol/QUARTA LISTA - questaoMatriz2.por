programa
{
	



	//Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida,
	//exiba a soma dos valores dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal.


	funcao inicio()
	{
		inteiro matriz[3][3], linha=0, coluna=0
		inteiro somaTotal=0
		inteiro somaDiagonal=0

		para(linha=0;linha<3;linha++){
			para(coluna=0;coluna<3;coluna++){
			escreva("Digite um valor:  ")
			leia(matriz[linha][coluna])
			somaTotal+=matriz[linha][coluna]
			se(linha==coluna)
			somaDiagonal+=matriz[linha][coluna]
			}
		}

		escreva("\n A soma da matriz é:  ", somaTotal)
		escreva("\n A soma da diagonal é:  ", somaDiagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 675; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */