package com.loiane.estruturadados.Pilha.teste;

import com.loiane.estruturadados.Pilha.Pilha;

public class Aula15 {

	public static void main(String[] args) {
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		System.out.println("Está vazia? " + pilha.estaVazia());
		
		pilha.empilha(25);
		
		System.out.println("Está vazia? " + pilha.estaVazia());
	}

}
