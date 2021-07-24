package com.loiane.estruturadados.Pilha.teste;

import java.util.Scanner;

import com.loiane.estruturadados.Pilha.Pilha;

public class Exercicio01 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i <= 10; i++) {
			System.out.print("\nEntre com um número: ");
			int num = sc.nextInt();
			
			if(num % 2 == 0) {
				System.out.print("\nEmpilhando o número... ");
				pilha.empilha(num);
			} else {
				Integer desempilhado = pilha.desempilha();
				
				if(desempilhado == null) { //pra aceitar null, usa o Integer
					System.out.println("\nPilha está vazia!");
				} else {
					System.out.print("\nNúmero ímpar! Desempilhando o número: " + desempilhado);
				}
			}
				
		}
		
		System.out.println("Todos os números foram lidos.\nDesempilhando números da pilha...\n");
		
		while(!pilha.estaVazia()) {
			System.out.print("\nDesempilhando os elementos da pilha: " + pilha.desempilha());
		}
		
		System.out.println("\nTodos os elementos foram desempilhados...");
	}
}
