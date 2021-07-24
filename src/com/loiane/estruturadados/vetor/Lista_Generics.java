package com.loiane.estruturadados.vetor;

import java.lang.reflect.Array;
import java.util.Arrays;

//Generics serve para definir o tipo de classe que ser� trabalhado, String, Objeto...

public class Lista_Generics<T> { //T -> Class Type

	private T[] elementos;
	private int tamanho;

	//1a solu��o: Instanciando vetores de forma gen�rica
	@SuppressWarnings("unchecked")
	public Lista_Generics(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}

	//2a solu��o: Reflection
	@SuppressWarnings("unchecked")
	public Lista_Generics(int capacidade, Class<T> tipoClasse) {
		this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
		this.tamanho = 0;
	}

	public boolean adicionar(T elemento) {
		aumentarCapacidade();
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}

	public boolean adicionar(int posicao, T elemento) {
		aumentarCapacidade();
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posi��o inv�lida!");
		}

		for (int i = this.tamanho - 1; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}

		this.elementos[posicao] = elemento;
		this.tamanho++;

		return true;
	}

	@SuppressWarnings("unchecked")
	private void aumentarCapacidade() {
		if (this.tamanho == this.elementos.length) {
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];

			for (int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}

			this.elementos = elementosNovos;
		}

	}

	public T buscar(int posicao) {

		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posi��o inv�lida!");
		}

		return this.elementos[posicao];
	}


	public int buscar(T elemento) {
		for (int i = 0; i < this.tamanho; i++) {
			if (this.elementos[i].equals(elemento))
				return i;
		}
		return -1;
	}

	public T obtem(int posicao) {
		return buscar(posicao);
	}

	public boolean contem(T elemento) {
		if(elemento.equals(this.elementos))
			return true;
		else
			return false;
	}

	//	Solucao 1 -> Quanto mais dados, mais lerdo fica
	//	public int ultimoIndice(T elemento) {
	//		int ultimaPosi = -1;
	//		for (int i = 0; i < this.tamanho; i++) {
	//			if (this.elementos[i].equals(elemento))
	//				ultimaPosi = i;
	//		}
	//		return ultimaPosi;
	//	}

	//Solu��o 2 -> Mais r�pido procurar come�ando pelo �ltimo elemento
	public int ultimoIndice(T elemento) {
		for (int i = this.tamanho - 1; i >= 0; i--) {
			if (this.elementos[i].equals(elemento))
				return i;
		}
		return -1;
	}

	public int tamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");

		for (int i = 0; i < this.tamanho - 1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}

		if (this.tamanho > 0) {
			s.append(this.elementos[this.tamanho - 1]);
		}

		s.append("]");

		return s.toString();
	}

	public void remover(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho))
			throw new IllegalArgumentException("Posi��o inv�lida!");

		for (int i = posicao; i < this.tamanho - 1; i++) {
			this.elementos[i] = this.elementos[i + 1];
		}

		this.tamanho--;
	}

	public void remover(T elemento) {
		int posi = buscar(elemento);
		if(posi > -1)
			remover(posi);
	}
	
	//Solu��o 1: instanciar um vetor, para criar um novo
	/*
	 * Como o vetor de elementos est� fazendo ref�rencia para receber
	 * um novo objeto, os elementos que estavam no outro vetor e todas
	 * as refer�ncias v�o ficar livres para que o coletor de lixo do
	 * Java possa varrer a mem�ria e possa limpar todos aqueles objetos
	 * da mem�ria
	 */
	public void removerTudo() {
		this.elementos = (T[]) new Object[this.elementos.length];
	}
	
	//Solu��o 2
	/*
	 * Resetando o tamanho para 0, todos os outros elementos se
	 * tornariam uma esp�cie de lixo
	 */
	public void limparTudo() {
		this.tamanho = 0;
	}
	
	//Solu��o 3
	public void limpar() {
		for(int i = 0; i < this.tamanho; i++) {
			this.elementos[i] = null;
		}
		this.tamanho = 0;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.deepHashCode(elementos);
		result = prime * result + tamanho;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lista_Generics other = (Lista_Generics) obj;
		if (!Arrays.deepEquals(elementos, other.elementos))
			return false;
		if (tamanho != other.tamanho)
			return false;
		return true;
	}


}
