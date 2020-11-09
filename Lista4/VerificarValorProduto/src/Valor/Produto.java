package Valor;

import java.util.*;

public class Produto {

	public static void main (String[] args) {
		
		Scanner n1 = new Scanner(System.in);
		Scanner n2 = new Scanner(System.in);
		
		int num1,num2;
		
		System.out.println("Digite o 1º valor: ");
		num1 = n1.nextInt();
		
		System.out.println("Digite o 2º valor: ");
		num2 = n2.nextInt();
		
		if(num1 < 0 || num2 <0 || num1 > 1000 || num2 >1000) {
			
			System.out.println("VALOR INVALIDO");
			
		}else if(num1 < num2) {
			
			System.out.println("O produto 1 e mais barato");
			
		}else if(num2 < num1) {
			
			System.out.println("O produto 2 e mais barato");
			
		}else {
			
			System.out.println("O =s valores são iguais");
			
		}
		

	}

}
//Leonardo Henrique M. de A. Ramos