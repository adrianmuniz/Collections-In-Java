package br.com.aula07.implementacao;

import java.util.Scanner;

import br.com.aula07.beans.Aluno;

public class ExecutarAluno {
	
	public static String pesquisa(String vetorPesquisa[], int tamanho, String texto) {
		String resultado = "Não localizado";
		for (int i=0; i<tamanho; i++) {
			if (vetorPesquisa[i].equalsIgnoreCase(texto)) {
				resultado = vetorPesquisa[i] + " posição " + i;
			}
		}
		return resultado;
	}
	
	public static void main(String[] args) {
		Aluno[] alunosVetor = new Aluno [3];
		
		String nomesVetor[] = {"Beatriz", "Maria", "Ana"};
		System.out.println(nomesVetor[0]);
		
		System.out.println(pesquisa(nomesVetor, 3, "Mria"));
		
		Scanner leitor = new Scanner (System.in);
		
		int[] idadesVetor = new int [3];
		
		//for (int i=0; i <idadesVetor.length; i++) {
			//idadesVetor[i] = leitor.nextInt();
		//}
		
		
		alunosVetor[0] = new Aluno ("Pedro", 8 , 50, 20);
		alunosVetor[1] = new Aluno ("Ana", 9 , 5, 21);
		alunosVetor[2] = new Aluno ();
		
		alunosVetor[2].setNome("Maria");
		alunosVetor[2].setIdade(22);
		alunosVetor[2].setMedia(10);
		
		alunosVetor[3] = new Aluno("Beatriz", 9 , 5 , 21);
		
		System.out.println(alunosVetor[2].getNome());
		

	}

}
