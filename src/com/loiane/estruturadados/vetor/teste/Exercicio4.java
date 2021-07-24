package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Lista_Generics;

public class Exercicio4 {

	public static void main(String[] args) {
		Lista_Generics<String> lista = new Lista_Generics<>(3);

		lista.adicionar("A");
		lista.adicionar("B");
		lista.adicionar("C");

		System.out.println(lista.obtem(1));

	}

}
