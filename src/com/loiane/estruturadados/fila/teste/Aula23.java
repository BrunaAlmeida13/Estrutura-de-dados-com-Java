package com.loiane.estruturadados.fila.teste;

import java.util.LinkedList;
import java.util.Queue;

public class Aula23 {

	public static void main(String[] args) {
		/*
		 * A classe Queue � uma interface, ent�o para ter acesso �
		 * ela, � necess�rio instanciar uma classe que a implemente.
		 * A classe LinkedList j� tem seus m�todos pr�prios, mas para
		 * a garantia de um comportamento FIFO, quando a queue � 
		 * colocada como tipo, ela permite apenas o uso dos seus 
		 * m�todos.
		 */
		Queue<Integer> fila = new LinkedList<Integer>();

		fila.add(11); //enqueue - enfileirar
		fila.add(12);
		
		System.out.print("Elementos: " + fila);
		System.out.print("\nPrimeiro elemento: " + fila.peek());
		System.out.print("\nRemovendo a primeira posi��o: " + fila.remove()); //dequeue
		System.out.print("\nElementos: " + fila);
	}

}
