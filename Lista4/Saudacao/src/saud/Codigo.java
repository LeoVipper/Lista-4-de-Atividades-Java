package saud;

import java.util.*;
import javax.swing.JOptionPane;

public class Codigo {

	public static void main(String[] args) {
		
		int n = 0;
		
		n = Integer.parseInt(JOptionPane.showInputDialog("Que horas são: "));
		
		if(n >= 0 && n <= 6) {
			
			JOptionPane.showMessageDialog(null, "Zzzzzzzzz");
			
		}else if(n >= 7 && n <= 11) {
			
			JOptionPane.showMessageDialog(null, "Bom dia");
			
		}else if(n >= 12 && n <= 17) {
			
			JOptionPane.showMessageDialog(null, "Boa Tarde");
			
		}else if(n >= 18 && n <= 23){
			
			JOptionPane.showMessageDialog(null, "Boa noite");
			
		}
		
	}

}
//Leonardo Henrique M. de A. Ramos