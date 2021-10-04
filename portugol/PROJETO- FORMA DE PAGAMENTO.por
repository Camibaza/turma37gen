programa
{
	
	funcao inicio()
	{
		// Valor total da compra
		//Mostrar 9% imposto em cima do valor total
		//OPCOES DE PAGAMENTO:
		// 1- Para pagamento A VISTA, recebe 10% DE DESCONTO
		// 2- Para pagamento no CARTAO DE CRÉDITO, preço normal mais juros de 10%
		// 3- Para pagamento em DUAS VEZES, preço normal mais juros de 15% - MOSTRAR O VALOR DE CADA PARCELA
		
		// MOSTRAR A NOTA FISCAL
		
		// 1- valor do produto = valor do produto - (valor do produto * 0.10)
		// 2 - valor do produto= valor do produto + (valor do produto*0.10)
		// 3 - valor do produto= (valor do produto + valor do produto*0.15)/2  Dividir o valor em 2 vezes e somar 15% juros 


		inteiro codigo
		real valorTotalP=0.00, valorProduto=0.00 , valorTotalC=0.00

		escreva("Digite o valor do produto R$:  ")
		leia(valorProduto)

		escreva("Forma de pagamento:  ")

		escreva("\nDigite 1- Para pagamento A VISTA, recebe 10% DE DESCONTO")
		escreva("\nDigite 2- Para pagamento no CARTAO DE CRÉDITO, preço normal mais juros de 10%")
		escreva("\nDigite 3- Para pagamento em DUAS VEZES, preço normal mais juros de 15% - MOSTRAR O VALOR DE CADA PARCELA")

		escreva("\nDigite a forma de pagamento: ")
		leia(codigo)

		se (codigo == 1) { 
			valorTotalP = valorProduto - (valorProduto*0.10)
			escreva("Valor total R$:  ", valorTotalP)
			}
		
		senao se (codigo == 2) {
			valorTotalP = valorProduto + (valorProduto*0.10)
			escreva("Valor total R$:  ", valorTotalP)
			}
			
		senao se (codigo == 3){
			valorTotalP = (valorProduto + valorProduto*0.15)/2
			escreva("Valor total R$:  ", valorTotalP)	
		
		}

		valorTotalC= valorTotalP + (valorTotalP*0.09)

		
		escreva("\n------------------- NOTA FISCAL ----------------------")
		escreva("\nProdutos:")
		escreva("\n " + "------------------> ", valorTotalP)
		escreva("\n--------------------------------------------------------")
		escreva("O valor total da compra foi de R$:  ", valorTotalC )
		
		
		
		

		
			
		
		
		
		

		
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 449; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */