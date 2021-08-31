package br.com.aula07.implementacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.aula07.beans.Aluno;

public class ExecutarCollection {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<String>();
	
		nomes.add("Beatriz");
		nomes.add("Pedro");
		nomes.add("Ana");
		
		System.out.println(nomes.size());
		System.out.println(nomes);
		
		Collections.sort(nomes);
		System.out.println("Lista organizada:" + nomes);
		
		System.out.println(nomes.get(1));
		
		String textoProcura = JOptionPane.showInputDialog("Informe o nome de pesquisa:");
		if(nomes.indexOf(textoProcura) >= 0) {
			System.out.println("Pesquisa String "  + nomes.get(nomes.indexOf(textoProcura)));
		} else {
			System.out.println("Não localizado");
		}
		
		//Agora com classe
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		
		Aluno a1 = new Aluno ("Pedro", 8 , 50, 20);
		Aluno a2 = new Aluno ("Ana", 9 , 5, 21);
		
		alunos.add(a1);
		alunos.add(a2);
		
		System.out.println(alunos.size());
		
		for (Aluno a: alunos) {
			System.out.println(a.getNome() +  " idade:" + a.getIdade());
		}
		
		Collections.sort(alunos);
		System.out.println("\n\n Lista em ordem Idade");
		for (Aluno alunoElemento: alunos) {
			System.out.println(alunoElemento.getNome() + " idade:" + alunoElemento.getIdade());
		}
		
	}

}
