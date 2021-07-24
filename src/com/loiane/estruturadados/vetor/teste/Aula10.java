package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.VetorObjeto;

public class Aula10 {

	public static void main(String[] args) {
		
		VetorObjeto vetor = new VetorObjeto(3);
		
		Contato c1 = new Contato("Contato 1", "1234567", "contato1@email");
		Contato c2 = new Contato("Contato 2", "1234567", "contato2@email");
		Contato c3 = new Contato("Contato 3", "1234567", "contato3@email");
		
		//Cópia do c1
		Contato c4 = new Contato("Contato 1", "1234567", "contato1@email");
		
		vetor.adicionar(c1);
		vetor.adicionar(c2);
		vetor.adicionar(c3);
		
		System.out.println("Tamanho = " + vetor.tamanho());
		
		System.out.println(vetor);

		//Aqui o equals compara o endereço de memória, depois compara os elementos
		int posi = vetor.buscar(c4);
		if(posi > -1)
			System.out.println("Elemento existe no vetor");
		else
			System.out.println("Elemento não existe no vetor");
		
		
//		/*
//		 * Passando tipo primitivo para objeto, se chama autoboxing
//		 * *wrapper class*
//		 */
//		//Pode passar string também
//		vetor.adicionar(3);
//		vetor.adicionar(4);
//		vetor.adicionar(5);
	}

}
