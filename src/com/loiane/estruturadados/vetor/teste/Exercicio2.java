package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Lista_Generics;

public class Exercicio2 {

	public static void main(String[] args) {
		Lista_Generics<String> lista = new Lista_Generics<>(4);
		
		lista.adicionar("A");
		lista.adicionar("B");
		lista.adicionar("C");
		lista.adicionar("A");
		lista.adicionar("B");
		lista.adicionar("C");
		
		System.out.println(lista.ultimoIndice("C"));

	}

}
