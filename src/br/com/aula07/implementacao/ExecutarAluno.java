package br.com.aula07.implementacao;

import java.util.Scanner;

import br.com.aula07.beans.Aluno;

public class ExecutarAluno {

	public static void main(String[] args) {
		Aluno[] alunosVetor = new Aluno [3];
		
		String nomesVetor[] = {"Beatriz", "Maria", "Ana"};
		
		System.out.println(nomesVetor[0]);
		
		Scanner leitor = new Scanner (System.in);
		
		int[] idadesVetor = new int [3];
		
		for (int i=0; i <idadesVetor.length; i++) {
			idadesVetor[i] = leitor.nextInt();
		}
		
		for (int i=0; i <idadesVetor.length; i++) {
			System.out.println(idadesVetor[i]);
		}
		
		alunosVetor[0] = new Aluno ("Pedro", 8 , 50, 20);
		alunosVetor[1] = new Aluno ("Ana", 9 , 5, 21);
		alunosVetor[2] = new Aluno ("Maria", 10 , 0, 18);
		
		System.out.println(alunosVetor[0].getNome());
		

	}

}
