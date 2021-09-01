package br.com.aula07.implementacao;

import java.util.HashSet;
import java.util.Set;

public class ExecutarSet {

	public static void main(String[] args) {
		
		Set<String> cores = new HashSet<String>();
		
		// add elementos
		cores.add("Azul");
		cores.add("Verde");
		cores.add("Azul");
		cores.add("Branco");
		cores.add("Preto");
		
		//lista de cores
		System.out.println(cores);
		
		for (String conteudo : cores) {
			System.out.println(conteudo);
		}
		
		// Tem conteudo
		System.out.println("Está vazio: " + cores.isEmpty());
		
		//procurar elementos
		System.out.println("Tem a cor verde:" + cores.contains("Verde"));
		System.out.println("Tem a cor vermelho:" + cores.contains("Vermelho"));
		
		//Remove elemento
		cores.remove("Verde");
		System.out.println(cores);
		
		
	}

}
