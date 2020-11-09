package AP;

import java.util.*;
public class Codigo {
	
	public static void main (String args[]) {
	
		
		Scanner nota = new Scanner(System.in);
		
		System.out.println("Digite a sua nota: ");
		int n = nota.nextInt();
		
		if(n<6 && n>=0) {
			System.out.println("Reprovado");
			
		}else if(n>=6 && n<=10) {
			System.out.println("Aprovado");
			
		}else {
		System.out.println("Valor invalido");
	}
	}
}
//Leonardo Henrique M. de A. Ramos