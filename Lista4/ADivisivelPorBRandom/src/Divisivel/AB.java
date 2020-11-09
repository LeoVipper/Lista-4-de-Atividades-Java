package Divisivel;

import java.util.*;

public class AB {

	public static void main(String[] args) {
		
		int a,b;
		
		Random A = new Random();
		Random B = new Random();
		
		a = A.nextInt(1001);
		b = B.nextInt(21);
		
		System.out.println(a);
		System.out.println(b);
		
		if(a % b == 0) {
			
			System.out.println("A é divisivel por B");
			
		}else {
			
			System.out.println("A não e divisivel por B");
			
		}

	}

}
//Leonardo Henrique M. de A. Ramos