package com.loiane.estruturadados.fila.teste;

import java.util.PriorityQueue;
import java.util.Queue;

public class Aula25 {

	public static void main(String[] args) {
		Queue<Integer> filaComPrioridade = new PriorityQueue<Integer>();
		
		filaComPrioridade.add(10);
		filaComPrioridade.add(5);
		
		System.out.println(filaComPrioridade);
		
		Queue<Paciente> filaComPrioridade2 = new PriorityQueue<Paciente>();

		filaComPrioridade2.add(new Paciente("A", 2));
		filaComPrioridade2.add(new Paciente("C", 1));
		filaComPrioridade2.add(new Paciente("B", 3));
		
		System.out.println(filaComPrioridade2);
	}

}
