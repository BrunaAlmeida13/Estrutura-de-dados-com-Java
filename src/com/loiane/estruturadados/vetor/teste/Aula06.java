package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula06 {

	public static void main(String[] args) {
Vetor vetor = new Vetor(10);
		
		vetor.adicionar("Bruna");
		vetor.adicionar("Ara�jo");
		vetor.adicionar("Almeida");
		
		System.out.println("Posi��o do elemento buscado: " + vetor.buscar("Bruna"));
		System.out.println("Posi��o do elemento buscado: " + vetor.buscar("Sadness"));
	}

}
