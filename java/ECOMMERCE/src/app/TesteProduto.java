package app;

import java.util.HashSet;
import java.util.Set;

import entities.Produtos;

public class TesteProduto {

	public static void main(String[] args) {
		
		Set<Produtos> conjunto = new HashSet<Produtos>();
		Produtos p1= new Produtos("MOUSE ", "G3-01 ", 30.00 , 10);
	    Produtos p2= new Produtos("TECLADO  ", "G3-02 ", 40.00 , 10);
	    Produtos p3= new Produtos("WEBCAM ", "G3-03 ", 80.00 , 10);
	    Produtos p4= new Produtos("IMPRESSORA ", "G3-04 ", 500.00 , 10);
	    Produtos p5= new Produtos("MONITOR ", "G3-05 ", 800.00 , 10);
	    Produtos p6= new Produtos("HEADSET ", "G3-06 ", 100.00 , 10);
	    Produtos p7= new Produtos("CAIXA DE SOM ", "G3-07 ", 70.00 , 10);
	    Produtos p8= new Produtos("ROTEADOR ", "G3-08 ", 150.00 , 10);
	    Produtos p9= new Produtos("HD EXTERNO", "G3-09 ", 400.00 , 10);
	    Produtos p10= new Produtos("CABO HDMI ", "G3-10 ", 30.00 , 10);
	    
	    conjunto.add(p1);
	    conjunto.add(p2);
	    conjunto.add(p3);
	    conjunto.add(p4);
	    conjunto.add(p5);
	    conjunto.add(p6);
	    conjunto.add(p7);
	    conjunto.add(p8);
	    conjunto.add(p9);
	    conjunto.add(p10);
	    
	    System.out.println(conjunto);
	    
		
		
	}

}
