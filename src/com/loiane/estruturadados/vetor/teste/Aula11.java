package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Lista_Generics;

public class Aula11 {

	public static void main(String[] args) {
		
		Lista_Generics<Contato> vetor = new Lista_Generics<>(2);

		Contato c1 = new Contato("Contato 1", "1234567", "contato1@email");
		Contato c2 = new Contato("Contato 2", "1234567", "contato2@email");
		
		vetor.adicionar(c1);
		vetor.adicionar(c2);
		
	}

}
