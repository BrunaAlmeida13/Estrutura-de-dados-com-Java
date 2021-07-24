package com.loiane.estruturadados.Pilha.teste;

import com.loiane.estruturadados.Pilha.Pilha;

public class Aula14 {

	public static void main(String[] args) {
		Pilha<Integer> pilha = new Pilha<Integer>();
		//capacidade padrão: 10
		
		for (int i = 1; i <= 10; i++) {
			pilha.empilha(i); //vai empilhar o elemento i
		}
		
		System.out.println("toString da pilha:\n" + pilha);
		System.out.println("Tamanho da pilha:\n" + pilha.tamanho());
	}

}
