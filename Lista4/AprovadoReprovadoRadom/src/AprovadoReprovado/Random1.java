//package AprovadoReprovado;

import java.util.*;

public class Random1 {
	
	public static void main (String args[]) {
	
		Random nota = new Random();
		
		for(int i=0; i<=10;i++) {
			
			System.out.println(nota.nextInt());
			
			if(i<6) {
				System.out.println(i + " Reprovado");
			}else {
				System.out.println(i + " Aprovado");
			}
			
		}
		
		
	}

	

}
