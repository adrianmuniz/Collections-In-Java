package br.com.aula08.util;

import javax.swing.JOptionPane;

public class Input {

	public static String texto(String msg) {
		return JOptionPane.showInputDialog(msg);
	}
	
	public static float decimal(String msg) {
		return Float.parseFloat(texto(msg));
	}
	
	public static boolean logico(String msg) {
		if (JOptionPane.showConfirmDialog(null, msg,"Pergunta",JOptionPane.YES_NO_OPTION) == 0) {
			return true;
		}
		return false;
	}	
	
	public static int inteiro(String msg) {
		return Integer.parseInt(texto(msg));
	}
	
	public static void mensagem (String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}
}
