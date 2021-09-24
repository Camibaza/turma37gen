programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real numero1,numero2,numero3,numero4, q1,q2,q3,q4

		escreva("Digite o valor de 1:")
		leia(numero1)
		escreva("Digite o valor de 2:")
		leia(numero2)
		escreva("Digite o valor de 3:")
		leia(numero3)
		escreva("Digite o valor de 4:")
		leia(numero4)

		 q1=mat.potencia(numero1, 2)
		 q2=mat.potencia(numero2, 2)
		 q3=mat.potencia(numero3, 2)
		 q4=mat.potencia(numero4, 2)

		se(numero3>=1000){
			escreva("O quadrado de  ", numero3, "  e " ,q3)
		}

		senao se(q3<1000){
			
			escreva("\n O quadrado do  ",numero1, " é ",q1)
			escreva("\n O quadrado do  ",numero2, " é: ",q2)
			escreva("\n O quadrado do  ",numero3, " é: ",q3)
			escreva("\n O quadrado do  ",numero4, " é: ",q4)
		}
		

		

		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 760; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */