package com.loiane.estruturadados.fila.teste;

import com.loiane.estruturadados.fila.Fila;

public class Aula22 {

	public static void main(String[] args) {
		Fila<Integer> fila = new Fila<Integer>();
		
		fila.enfileira(10);
		fila.enfileira(20);
		fila.enfileira(30);

		System.out.print("Elementos atuais: " + fila);
		
		System.out.print("\nDesenfileirando: " + fila.desenfileira());
		
		System.out.println("Elementos atuais: " + fila);
	}

}
