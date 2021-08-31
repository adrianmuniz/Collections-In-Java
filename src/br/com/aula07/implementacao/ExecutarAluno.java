package br.com.aula07.implementacao;

import java.util.Scanner;

import br.com.aula07.beans.Aluno;

public class ExecutarAluno {
	
	//Método Statico
	public static String pesquisa(String vetorPesquisa[], int tamanho, String texto) {
		String resultado = "Não localizado";
		for (int i=0; i<tamanho; i++) {
			if (vetorPesquisa[i].equalsIgnoreCase(texto)) {
				resultado = vetorPesquisa[i] + " posição " + i;
				
			}
		}
		return resultado;
	}
	
	public static String pesquisa(Aluno[] vetorPesquisa, int tamanho, String texto) {
		String resultado = "Não localizado";
		for (int i=0; i<tamanho; i++) {
			if(vetorPesquisa[i].getNome().equalsIgnoreCase(texto))
				resultado = vetorPesquisa[i].getNome() + " posição " + i;
			}
		return resultado;
		}
	
	
	public static void main(String[] args) {
		Aluno[] alunosVetor = new Aluno [3];
		
		String nomesVetor[] = {"Beatriz", "Maria", "Ana"};
		
		//Usando a pesquisa
		System.out.println(pesquisa(nomesVetor, 3, "Mria"));
		
		// vetor simples de objetos
		alunosVetor[0] = new Aluno ("Pedro", 8 , 50, 20);
		alunosVetor[1] = new Aluno ("Ana", 9 , 5, 21);
		alunosVetor[2] = new Aluno ();
		alunosVetor[2].setNome("Maria");
		alunosVetor[2].setIdade(22);
		alunosVetor[2].setMedia(10);
		
		//usando o metodo pesquisa
		System.out.println("Posição String " + pesquisa(alunosVetor, 3, "Pedro"));
		
		
	}

}
