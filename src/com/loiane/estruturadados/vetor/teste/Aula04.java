package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula04 {

	public static void main(String[] args) {
	Vetor vetor = new Vetor(10);
		
		vetor.adicionar("Bruna");
		vetor.adicionar("Araújo");
		vetor.adicionar("Almeida");
		
		System.out.println("Quantidade de elementos no vetor: " + vetor.tamanho());
	
		System.out.println(vetor.toString());
	}

}
