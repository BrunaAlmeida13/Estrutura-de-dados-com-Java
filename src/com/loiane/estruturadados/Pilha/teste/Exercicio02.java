package com.loiane.estruturadados.Pilha.teste;

import java.util.Scanner;

import com.loiane.estruturadados.Pilha.Pilha;

public class Exercicio02 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Pilha<Integer> par = new Pilha<Integer>();
		Pilha<Integer> impar = new Pilha<Integer>();

		Scanner sc = new Scanner(System.in);

		for(int i = 1; i <= 10; i++) {
			System.out.println("Entre com um número:");
			int num = sc.nextInt();

			if(num == 0) {// numero 0 - desempilha das duas

				Integer desempilhado = par.desempilha();

				if(desempilhado == null) {
					System.out.println("Pilha par vazia.");
				} else {
					System.out.println("Desempilhando da pilha par...");
				}

				desempilhado = impar.desempilha();
				
				if(desempilhado == null) {
					System.out.println("Pilha impar vazia.");
				} else {
					System.out.println("Desempilhando da pilha impar...");
				}

			} else if(num % 2 == 0) { // numero par - empilha na par
				System.out.println("Empilhando na pilha par...");
				par.empilha(num);
			} else { // numero impar - empilha na par
				System.out.println("Empilhando na pilha ímpar...");
				impar.empilha(num);
			}
		}
		
		System.out.println("Desempilhando todos os números:");
		
		while(!par.estaVazia() && !impar.estaVazia()) {
			System.out.print("Pilha Par: " + par.desempilha());
			System.out.println("\nPilha Ímpar: " + impar.desempilha());
		}
	}

}
