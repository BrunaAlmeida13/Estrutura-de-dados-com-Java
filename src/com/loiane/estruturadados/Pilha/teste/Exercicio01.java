package com.loiane.estruturadados.Pilha.teste;

import java.util.Scanner;

import com.loiane.estruturadados.Pilha.Pilha;

public class Exercicio01 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i <= 10; i++) {
			System.out.print("\nEntre com um n�mero: ");
			int num = sc.nextInt();
			
			if(num % 2 == 0) {
				System.out.print("\nEmpilhando o n�mero... ");
				pilha.empilha(num);
			} else {
				Integer desempilhado = pilha.desempilha();
				
				if(desempilhado == null) { //pra aceitar null, usa o Integer
					System.out.println("\nPilha est� vazia!");
				} else {
					System.out.print("\nN�mero �mpar! Desempilhando o n�mero: " + desempilhado);
				}
			}
				
		}
		
		System.out.println("Todos os n�meros foram lidos.\nDesempilhando n�meros da pilha...\n");
		
		while(!pilha.estaVazia()) {
			System.out.print("\nDesempilhando os elementos da pilha: " + pilha.desempilha());
		}
		
		System.out.println("\nTodos os elementos foram desempilhados...");
	}
}
