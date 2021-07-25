package com.loiane.estruturadados.fila.teste;

import java.util.LinkedList;
import java.util.Queue;

public class Aula23 {

	public static void main(String[] args) {
		/*
		 * A classe Queue é uma interface, então para ter acesso à
		 * ela, é necessário instanciar uma classe que a implemente.
		 * A classe LinkedList já tem seus métodos próprios, mas para
		 * a garantia de um comportamento FIFO, quando a queue é 
		 * colocada como tipo, ela permite apenas o uso dos seus 
		 * métodos.
		 */
		Queue<Integer> fila = new LinkedList<Integer>();

		fila.add(11); //enqueue - enfileirar
		fila.add(12);
		
		System.out.print("Elementos: " + fila);
		System.out.print("\nPrimeiro elemento: " + fila.peek());
		System.out.print("\nRemovendo a primeira posição: " + fila.remove()); //dequeue
		System.out.print("\nElementos: " + fila);
	}

}
