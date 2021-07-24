package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula09 {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(2);

		vetor.adicionar("B");
		vetor.adicionar("G");
		vetor.adicionar("D");
		vetor.adicionar("E");
		vetor.adicionar("F");

		System.out.println(vetor);
		
		vetor.remover(1);
		
		System.out.println(vetor);
		
		System.out.println("Remover o elemento E");
		
		int posi = vetor.buscar("E");
		if(posi >= 0)
			vetor.remover(posi);
		else
			System.out.println("Esse elemento não existe no vetor");
		
		System.out.println(vetor);

	}

}
