programa
{
	
	funcao inicio()
	{
		inteiro horasExtra
		inteiro horas
		inteiro salarioNormal
		inteiro salarioExtra
		inteiro codigo
		inteiro salarioMenor
		
		escreva("Qual é o código do funcionário? ")
		leia(codigo)
		
		escreva("Qual o total de horas que você trabalhou?")
		leia(horas)

		horasExtra= horas - 50
		salarioExtra= horasExtra*20
		salarioNormal= horas*10
		salarioMenor= horas*10

		se(horasExtra>0.1){
			escreva("Você trabalhou  ", horasExtra,  " horas a mais,  \n receberá R$:",salarioNormal, " do salário normal \n e recebera R$: ")
			escreva("Salário total R$: ", salarioNormal+salarioExtra)
		}

		senao se(horasExtra<0){
			escreva("Você receberá R$: ", salarioMenor)
			
			
		}

		senao se(horasExtra==0){
			escreva("Você receberá o salario de  R$:  ",salarioNormal)
		}
		

		

		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 399; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */