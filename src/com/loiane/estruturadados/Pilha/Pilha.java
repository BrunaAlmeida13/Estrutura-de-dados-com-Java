package com.loiane.estruturadados.Pilha;

import com.loiane.estruturadados.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {
	
	//As vari�veis elemento e tamanho est�o vindo da suoer(), onde est�o como protected
	
	public Pilha() {
		super();
	}
	
	public Pilha(int capacidade) {
		super(capacidade);
	}
	
	public void empilha(T elemento) {
		super.adiciona(elemento);
	}
	
	public T desempilha() {
		if(this.estaVazia())
			return null;
		
		return this.elementos[--tamanho];
		
		/*T elemento = this.elementos[tamanho - 1];
		tamanho--;
		return elemento;)*/
	}
	
	public boolean estaVazia() {
		return super.estaVazia();
	}
	
	public T topo() { //retornar� o tipo da pilha Ex. String, Contato, Integer
		if(this.estaVazia()) {
			return null;
		}
		return this.elementos[tamanho - 1];
	}
}
