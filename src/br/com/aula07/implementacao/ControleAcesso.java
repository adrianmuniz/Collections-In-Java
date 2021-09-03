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
		String leitura, tipo;
		
		while(resp== true) {
			
		tipo = Input.texto("Digite E <entrada ou S <saida>");	
		
		
		if (tipo.equalsIgnoreCase("E")) {
			
			leitura = Input.texto("Leitor cracha: ");
			if (!codigo.contains(leitura)) {
				Input.mensagem("Bem vindo! Acesso liberado");
				codigo.add(leitura);
			} else {
				Input.mensagem("Entrada já foi registrada para esse cracha");
			}
		}else {
			if (tipo.equalsIgnoreCase("S")) {
			leitura = Input.texto("Leitor cracha: ");
			
			if (!codigo.contains(leitura)) {
				Input.mensagem("Entrada não registrada - Acesso bloqueado");	
			} else 
				Input.mensagem("Obrigado pela visita");
				codigo.remove(leitura);
			}
		}
	}

	}
}
