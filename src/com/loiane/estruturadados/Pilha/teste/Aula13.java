package com.loiane.estruturadados.Pilha.teste;

import com.loiane.estruturadados.Pilha.Pilha;

public class Aula13 {

	public static void main(String[] args) {
		
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		System.out.println("Elementos: " + pilha); //toString()
		
		System.out.println("Tamanho: " + pilha.tamanho());
	}

}
