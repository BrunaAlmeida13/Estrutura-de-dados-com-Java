package com.loiane.estruturadados.Pilha;

import com.loiane.estruturadados.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {
	
	private T[] elementos;
	private int tamanho;
	
	public Pilha(int capacidade) {
		//instanciando arrays passando um tipo genérico
		elementos = (T[]) new Object[capacidade];
		tamanho = 0;
	}
	
	public void empilha(T elemento) {
		
	}
	
	public void aumentaCapacidade() {
		
	}
	
	public boolean estaVazia() {
		return false;
	}
	
	public T topo() {
		return null;
	}
	
	public T desempilha() {
		return null;
	}
	
	public int tamanho() {
		return 0;
	}
	
	public String toString() {
		return null;
	}
}
