package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula05 {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(10);
		
		vetor.adicionar("Bruna");
		vetor.adicionar("Araújo");
		vetor.adicionar("Almeida");
		
		System.out.println(vetor.buscar(0));
		//System.out.println(vetor.buscar(15)); Lança Exception
	}

}
