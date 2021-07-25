package com.loiane.estruturadados.fila.teste;

import com.loiane.estruturadados.fila.Fila;

public class Aula20 {

	public static void main(String[] args) {
		Fila<Integer> fila = new Fila<>();
		
		fila.enfileira(1);
		fila.enfileira(2);
		fila.enfileira(3);
		
		System.out.println("Fila vazia? " + fila.estaVazia());
		System.out.print("Tamanho da fila: " + fila.tamanho());
		System.out.print("\nElementos: " + fila.toString());
	}

}
