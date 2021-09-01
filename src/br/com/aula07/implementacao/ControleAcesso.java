package br.com.aula07.implementacao;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JOptionPane;

import br.com.aula08.util.Input;

public class ControleAcesso {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		Set<String> codigo = new HashSet<String>();
		
		boolean resp = true;
		String leitura;
		
		while(resp== true) {
		leitura = Input.texto("Leitor cracha: ");
		codigo.add(leitura);
		
		if (!codigo.contains(leitura)) {
			Input.mensagem("Bem vindo! Acesso liberado");
			codigo.add(leitura);
		} else {
			Input.mensagem("Obrigado pela visita");
			codigo.remove(leitura);
		}
		
		resp = Input.logico("Continuar?");
		
		}

	}

}
