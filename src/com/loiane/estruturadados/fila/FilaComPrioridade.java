package com.loiane.estruturadados.fila;

public class FilaComPrioridade<T> extends Fila<T>{
		
	@SuppressWarnings("unchecked")
	@Override
	public void enfileira(T elemento) {
		Comparable<T> chave = (Comparable<T>) elemento;
		
		int i;
		for(i = 0; i < this.tamanho; i++) { //o for só funciona se tiver elementos na fila
			/*
			 * Se a chave, que é o elemento que se quer adicionar, comparado ao outro
			 * elemento, ou seja, o elemento que já está dentro da fila, for menor que
			 * zero, ou seja, for um elemento com uma prioridade maior, adiciona-se 
			 * esse elemento.
			 */
			if(chave.compareTo(this.elementos[i]) < 0) {
				break;
			}
		}
		this.adiciona(i, elemento);
	}

	/*@Override
	public int compareTo(FilaComPrioridade<T> o) {
		//obj1 > obj2 return numero > 0 (por default: 1)
		//obj1 < obj2 return numero < 0 (por default: 0)
		//obj1 == obj2 return 0
		
		if(this.prioridade > o.get)
		
		return 0;
	}*/
}
