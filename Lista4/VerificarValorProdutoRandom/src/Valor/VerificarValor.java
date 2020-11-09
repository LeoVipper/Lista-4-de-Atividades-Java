package Valor;

import java.util.*;

public class VerificarValor {
	
	public static void main (String args[]) {
		
		Random n1 = new Random();
		Random n2 = new Random();
		
		int p1 = n1.nextInt(1000);
		int p2 = n2.nextInt(1000);
		
		System.out.println("Produto 1 " + p1);
		System.out.println("Produto 2 " + p2);
		
		if(p1<p2) {
			System.out.println("O produto 1 é o mais barato");
		}else if(p1>p2) {
			System.out.println("O produto 2 é o mais barato");
		}else {
			System.out.println("Ambos os produtos tem o mesmo valor");
		}
		
	}

}
//Leonardo Henrique M. de A. Ramos