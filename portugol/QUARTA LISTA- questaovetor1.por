programa
{
	
	funcao inicio()
	{
		inteiro numero[5], x, maior=0

		para(x=0; x<5; x++){
		escreva("Digite um numero:  ")
		leia(numero[x])
		se(maior<numero[x]){
			maior=numero[x]	
		}
		}

		para(x=0;x<5;x++){
			escreva(numero[x], "\n")
			}
			escreva("A maior pontuação foi:  ", maior)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 151; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */