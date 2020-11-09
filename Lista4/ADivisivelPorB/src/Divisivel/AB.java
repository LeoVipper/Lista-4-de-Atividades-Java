package Divisivel;

import java.util.*;
import javax.swing.JOptionPane;

public class AB {

	

	public static void main(String[] args) {
		
		int a,b;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero de 1 a 1000"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero de 1 a 20"));
		
		
		if(a % b ==0) {
			
			JOptionPane.showMessageDialog(null,a + " / " + b + " É divisivel");
			
		}else {
			
			JOptionPane.showMessageDialog(null,a + " / " + b + " Não é divisivel");
			
		}

	}

}
//Leonardo Henrique M. de A. Ramos