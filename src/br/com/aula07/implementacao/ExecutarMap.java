package br.com.aula07.implementacao;

import java.util.HashMap;
import java.util.Map;

public class ExecutarMap {

	public static void main(String[] args) {
		Map<Integer, String> cores = new HashMap<Integer, String>();
		
		cores.put(1, "Azul");
		cores.put(2, "Vermelho");
		cores.put(3, "Amarelo");
		
		
		// Validando se no mapeando existe chaves ou valores determinados
		System.out.println(cores.containsKey(1)); 
		System.out.println(cores.containsValue("Azul"));
		
		// Exibe chaves e valores
		System.out.println(cores.entrySet());
		
		// Retornando as chaves armazenadas
		System.out.println(cores.keySet());
		
		//Verificando se o mapeamento está vazio
		System.out.println(cores.isEmpty());
		
		// Obter valor da chave
		System.out.println(cores.get(1));
		
		// Mostrar chaves e valores separados
		for (Map.Entry conteudo : cores.entrySet()) {
			System.out.println(conteudo.getKey() + " " + conteudo.getValue());
		}
		
		// Remover chave
		System.out.println(cores.remove(1));
		System.out.println(cores.entrySet());
		
	}

}
