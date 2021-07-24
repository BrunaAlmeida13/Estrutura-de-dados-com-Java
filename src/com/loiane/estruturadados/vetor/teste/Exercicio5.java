package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Lista_Generics;

public class Exercicio5 {

	public static void main(String[] args) {
		Lista_Generics<String> lista = new Lista_Generics<>(3);

		lista.adicionar("A");
		lista.adicionar("B");
		lista.adicionar("C");
		lista.adicionar("D");
		lista.adicionar("E");
		lista.adicionar("F");
		
		System.out.println(lista);
	
		lista.limparTudo();
		
		System.out.println(lista);

	}

}
