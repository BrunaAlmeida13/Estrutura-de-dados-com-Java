package com.loiane.estruturadados.fila.teste;

import com.loiane.estruturadados.fila.Fila;

public class Aula21 {

	public static void main(String[] args) {
		Fila<Integer> fila = new Fila<>();
		
		System.out.println("Primeiro elemento da fila: " + fila.espiar());
	
		fila.enfileira(1);
		fila.enfileira(2);
		fila.enfileira(3);
	
		System.out.println("Primeiro elemento da fila: " + fila.espiar());
	}

}
