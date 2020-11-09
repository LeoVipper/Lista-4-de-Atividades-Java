package AprovadoReprovado;

import java.util.*;

public class Randomico {
	
	public static void main (String args[]) {
	
		
		int n;
		
		Random nota = new Random();
		
			 n = nota.nextInt(11);
			
			 System.out.println(n);
			 
			if(n<6) {
				System.out.println(" Reprovado");
			}
			else{
				System.out.println(" Aprovado");
			}
			
		}
		
}
//Leonardo Henrique M. de A. Ramos