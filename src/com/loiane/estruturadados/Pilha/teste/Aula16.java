package com.loiane.estruturadados.Pilha.teste;

import com.loiane.estruturadados.Pilha.Pilha;

public class Aula16 {

	public static void main(String[] args) {
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		System.out.println("Topo da pilha: " + pilha.topo() + "\nElementos: " + pilha);
		
		pilha.empilha(1);
		pilha.empilha(12);
		pilha.empilha(10);
		
		System.out.println("\nTopo da pilha: " + pilha.topo() + "\nElementos: " + pilha);

	}

}
