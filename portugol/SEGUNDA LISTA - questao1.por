programa
{
	inclua biblioteca Teclado
	
	funcao inicio()
	{
		inteiro pesoTomate
		inteiro excessoTomate 
		inteiro multaTomate
	

		escreva("Qual o peso dos tomates?:")
		leia(pesoTomate)

		excessoTomate= pesoTomate-50

		multaTomate= excessoTomate*4

		se(excessoTomate <=0){
			escreva("Não há peso escedente")


		}

		senao se(excessoTomate >0){
			escreva("Tem ", excessoTomate," quilos a mais, sua multa é de ",multaTomate,"reais")

		}

		senao se(pesoTomate<0){
			escreva("Peso invalido")

		}
		
				
			
		
			

		
			
		}
		
		
		
	}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 372; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */