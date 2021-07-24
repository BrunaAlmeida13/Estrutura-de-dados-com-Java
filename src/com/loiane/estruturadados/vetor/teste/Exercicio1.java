package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Lista_Generics;

public class Exercicio1 {

	public static void main(String[] args) {

		Lista_Generics<String> lista = new Lista_Generics<>(3);
		
		lista.adicionar("A");
		lista.adicionar("B");
		
		System.out.println(lista.contem("0"));
	}

}
