package com.loiane.estruturadados.Pilha.teste;

import com.loiane.estruturadados.Pilha.Pilha;

public class Aula17 {

	public static void main(String[] args) {
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		pilha.empilha(12);
		pilha.empilha(10);
		pilha.empilha(8); //topo da pilha, é o final da pilha
		
		System.out.println("Elementos: " + pilha);
		
		pilha.desempilha();
		
		System.out.println("\nElementos atualizados: " + pilha);
	}

}
