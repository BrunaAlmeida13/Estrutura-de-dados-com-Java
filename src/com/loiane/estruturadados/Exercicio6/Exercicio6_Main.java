package com.loiane.estruturadados.Exercicio6;

import java.util.Scanner;

import com.loiane.estruturadados.vetor.Lista_Generics;

public class Exercicio6_Main {

	public static void main(String[] args) {
		//Criação das variáveis
		Scanner sc = new Scanner(System.in);
		//Criar vetor com 20 capacidade
		Lista_Generics<Contato> lista = new Lista_Generics<>(20);
		//Criar e adicionar 30 contatos
		criarContatosDinamicamente(3, lista);
		//Criar um menu para que o usuário escolha a opção
		int opcao = 1;

		while(opcao != 0) {
			
			obterOpcaoMenu(sc);

			switch (opcao) {
			case 1: {
				adicionarContatoFinal(sc, lista);
				break;
			}
			case 2:{
				adicionarContatoPosicao(sc, lista);
				break;
			}
			case 3:{
				obtemContatoPosicao(sc, lista);
				break;
			}
			case 4:{
				obtemContato(sc, lista);
				break;
			}
			case 5:{
				pesquisarUltimoIndice(sc, lista);
				break;
			}
			case 6:{
				pesquisarContatoExiste(sc, lista);
				break;
			}
			case 7:{
				excluirPorPosicao(sc, lista);
				break;
			}
			case 8:{
				excluirContato(sc, lista);
				break;
			}
			case 9:{
				imprimeTamanhoVetor(lista);
				break;
			}
			case 10:{
				limparVetor(lista);
				break;
			}
			case 11:{
				imprimirVetor(lista);
				break;
			}
			default:
				break;
			}

		}

		System.out.println("Programa Finalizado!");

		sc.close();
	}

	private static int obterOpcaoMenu(Scanner sc) {
		String entrada; 
		boolean entradaValida = false; //Flag
		int opcao = 0; 

		while(!entradaValida) {

			System.out.println("Digite a opção desejada\n");
			System.out.println("1 - Adiciona contato no final do vetor");
			System.out.println("2 - Adiciona contato em uma posição específica");
			System.out.println("3 - Obtém contato de uma posção específica");
			System.out.println("4 - Consulta contato");
			System.out.println("5 - Consulta último índice do contato");
			System.out.println("6 - Verifica se contato existe");
			System.out.println("7 - Excluir por posição");
			System.out.println("8 - Excluir contato");
			System.out.println("9 - Verifica tamanho do vetor");
			System.out.println("10 - Excluir todos os contatos do vetor");
			System.out.println("11 - Imprime vetor");
			System.out.println("12 - Sair");

			try {
				entrada = sc.nextLine();
				opcao = Integer.parseInt(entrada);

				if(opcao >= 0 && opcao <= 12)
					entradaValida = true;
				else
					throw new Exception();

			} catch(Exception e) {
				System.out.println("Entrada inválida! Digite novamente.\n\n");
			}
		}

		return opcao;
	}

	private static void criarContatosDinamicamente(int quantidade, Lista_Generics<Contato> lista) {
		//Não é uma boa prática instanciar objetos/variá´veis dentro de loops
		Contato contato;

		for(int i = 1; i <= quantidade; i++) {

			contato = new Contato();

			contato.setNome("Contato " + i);
			contato.setTelefone("111111" + i);
			contato.setEmail("contato" + i + "@email.com");

			lista.adicionar(contato);
		}
	}

	private static void adicionarContatoFinal(Scanner sc, Lista_Generics<Contato> lista) {
		System.out.println("\nCriando um contato. Entre com a informações.");
		String nome = lerInformacao("Nome", sc);
		String telefone = lerInformacao("Telefone", sc);
		String email = lerInformacao("E-mail", sc);

		Contato contato = new Contato(nome, telefone, email);

		lista.adicionar(contato);

		System.out.println("Contato adicionado com sucesso!\n");
		System.out.println(contato);
	}

	protected static String lerInformacao(String msg, Scanner sc) {
		System.out.println(msg);
		String entrada = sc.nextLine();

		return entrada;
	}

	protected static int lerInformacaoInt(String msg, Scanner sc) {
		String entrada;
		boolean entradaValida = false;
		int num = 0;

		while(!entradaValida) {
			try {
				System.out.println(msg);
				entrada = sc.nextLine();

				num = Integer.parseInt(entrada);

				entradaValida = true; //se o num der exception, essa linha não será executada.

			} catch (Exception e) {
				System.out.println("Entrada inválida! Digite novamente.");
			}
		}
		return num;
	}

	private static void adicionarContatoPosicao(Scanner sc, Lista_Generics<Contato> lista) {
		System.out.println("\nCriando um contato. Entre com a informações.");
		String nome = lerInformacao("Nome", sc);
		String telefone = lerInformacao("Telefone", sc);
		String email = lerInformacao("E-mail", sc);

		Contato contato = new Contato(nome, telefone, email);

		int posicao = lerInformacaoInt("\nEntre com a posição para adicionar o contato", sc);

		try {

			lista.adicionar(posicao, contato);
			System.out.println("Contato adicionado com sucesso!\n");
			System.out.println(contato);

		} catch (Exception e) {
			System.out.println("\nPosição inválida, contato não adicionado!\n");
		}


		System.out.println("Contato adicionado com sucesso!\n");
		System.out.println(contato);
	}

	private static void obtemContatoPosicao(Scanner sc, Lista_Generics<Contato> lista) {

		int posicao = lerInformacaoInt("\nEntre com a posição a ser pesquisada.", sc);

		try {
			
			Contato contato = lista.buscar(posicao);
			System.out.println("Contato existe. Seguem dados:");
			System.out.println(contato);
			
		} catch (Exception e) {
			System.out.println("\nPosição inválida!\n");
		}
	}

	private static void obtemContato(Scanner sc, Lista_Generics<Contato> lista) {

		int posicao = lerInformacaoInt("\nEntre com a posição a ser pesquisada.", sc);

		try {
			Contato contato = lista.buscar(posicao);
			System.out.println("Contato existe. Seguem dados:");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do contato encontrado: ");
			posicao = lista.buscar(contato);

			System.out.println("Contato encontrado na posição " + posicao);

		} catch (Exception e) {
			System.out.println("\nPosição inválida!\n");
		}
	}
	
	private static void pesquisarUltimoIndice(Scanner sc, Lista_Generics<Contato> lista) {

		int posicao = lerInformacaoInt("\nEntre com a posição a ser pesquisada.", sc);

		try {
			Contato contato = lista.buscar(posicao);
			System.out.println("Contato existe. Seguem dados:");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do último índice do contato encontrado: ");
			posicao = lista.ultimoIndice(contato);

			System.out.println("Contato encontrado na posição " + posicao);

		} catch (Exception e) {
			System.out.println("\nPosição inválida!\n");
		}
	}
	
	private static void pesquisarContatoExiste(Scanner sc, Lista_Generics<Contato> lista) {

		int posicao = lerInformacaoInt("\nEntre com a posição a ser pesquisada.", sc);

		try {
			Contato contato = lista.buscar(posicao);
			
			boolean existe = lista.contem(contato);
			
			if(existe) {
				System.out.println("Contato existe. Seguem dados:");
				System.out.println(contato);
			} else System.out.println("Contato não existe!");
				

		} catch (Exception e) {
			System.out.println("\nPosição inválida!\n");
		}
	}
	
	private static void excluirPorPosicao(Scanner sc, Lista_Generics<Contato> lista) {

		int posicao = lerInformacaoInt("\nEntre com a posição a ser removida.", sc);

		try {
			
			lista.remover(posicao);
			System.out.println("Contato Excluído!");
			
		} catch (Exception e) {
			System.out.println("\nPosição inválida!");
		}
	}
	
	private static void excluirContato(Scanner sc, Lista_Generics<Contato> lista) {

		int posicao = lerInformacaoInt("\nEntre com a posição a ser removida.", sc);

		try {
			
			Contato contato = lista.buscar(posicao);
			lista.remover(contato);
			System.out.println("Contato Excluído!");
			
		} catch (Exception e) {
			System.out.println("\nPosição inválida!");
		}
	}
	
	private static void imprimeTamanhoVetor(Lista_Generics<Contato> lista) {
		System.out.println("Tamanho do vetor é de: " + lista.tamanho());
	}
	
	private static void limparVetor(Lista_Generics<Contato> lista) {
		lista.limparTudo();
		System.out.println("Todos os contatos do vetor foram excluídos!");
	}
	
	private static void imprimirVetor(Lista_Generics<Contato> lista) {
		System.out.println(lista);
	}
}