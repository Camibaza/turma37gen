programa
{
	
	funcao inicio()
	{
		//variaveis

		inteiro numeroDigitado
		inteiro resultado
		
		escreva("Digite um numero positivo:  ")
		leia(numeroDigitado)

		se(numeroDigitado<0){
			escreva("Voce digitou um numero negativo")
	
		}
		senao se(numeroDigitado ==0){
			escreva("neutro")
			
		}
			senao se(numeroDigitado%2==0){
			escreva("O numero é par")
			
		}
		senao se(numeroDigitado%2==1){
			escreva("O numero é impar")
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 300; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */