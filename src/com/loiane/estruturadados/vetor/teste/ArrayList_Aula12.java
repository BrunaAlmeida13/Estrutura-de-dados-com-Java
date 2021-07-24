package com.loiane.estruturadados.vetor.teste;

import java.util.ArrayList;

public class ArrayList_Aula12 {

	public static void main(String[] args) {
		/*
		 * Nas opções do ArrayList é permitido usar o construtor vazio, passar
		 * elementos iniciais, ou já passar a capacidade também. Mas ela aumenta a 
		 * capacidade conforme for necessitado
		 */
		ArrayList<String> arrayList = new ArrayList<>();
		
		//Tem a opção de adicionar elementos, ou adicionar e retornar um booleano
		 arrayList.add("A");
		 arrayList.add("C");
		 
		 System.out.println(arrayList);
		 
		 arrayList.add(1, "B");
		 
		 System.out.println(arrayList);
		 
		 boolean existe = arrayList.contains("A"); //buscar, retornando true or false
		 
		 if(existe) //Como é booleano, não precisa fazer comparação no if
			 System.out.println("Elemento existe");
		 else
			 System.out.println("Elemento inexistente");
		 
		 int posicao = arrayList.indexOf("B"); //Retorna o índice onde está o objeto
		 
		 if(posicao > -1)
			 System.out.println("Índice: " + posicao);
		 else 
			 System.out.println("Elemento não existe");
		 
		 System.out.println(arrayList.get(2)); //Busca elemento por posicao
		 
		 //Tem como remover o objeto passando o índice ou passando o objeto
		 arrayList.remove(2);
		 arrayList.remove("B");
		 
		 System.out.println(arrayList);
		 
		 System.out.println("Tamanho do array" + arrayList.size());
	
		 
	}

}
