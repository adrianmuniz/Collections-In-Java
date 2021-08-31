package br.com.aula07.implementacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.aula07.beans.Aluno;

public class ExecutarCollection {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<String>();
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		nomes.add("Beatriz");
		nomes.add("Pedro");
		nomes.add("Ana");
		
		System.out.println(nomes.size());
		System.out.println(nomes);
		
		Collections.sort(nomes);
		System.out.println("Lista organizada:" + nomes);
		
	}

}
