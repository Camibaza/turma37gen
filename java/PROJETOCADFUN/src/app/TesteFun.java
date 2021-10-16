package app;



import entities.funcionario;
import entities.terceiro;

public class TesteFun {

	public static void main(String[] args) {
		
		
		funcionario func1 = new funcionario("001", "CAMILA");
		terceiro ter1 = new terceiro("012", "DANIEL", 70.00);
		
		func1.setHorasTrabalhadas(50);
		func1.setValorHora(20.00);
		
		ter1.setHorasTrabalhadas(50);
		ter1.setValorHora(20.00);
	
	System.out.println("Salario do funcionario "+func1.getNome()+" R$ "+func1.calcularSalario());
	System.out.println("Salario do funcionario "+ter1.getNome()+" R$ "+ter1.calcularSalario());
	
	}
	
	
}
