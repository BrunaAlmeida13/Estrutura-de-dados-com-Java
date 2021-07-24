package com.loiane.estruturadados.vetor;

public class Vetor {
	private String[] elementos;
	private int tamanho;

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}
	
	//Add elementos no final do vetor
	public boolean adicionar(String elemento){
		aumentarCapacidade();
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		} 
		return false;	
	}
	
	public boolean adicionar(int posicao, String elemento) {
		aumentarCapacidade();
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida!");
		}
		
		/* Movendo todos os elementos
		 * i tem que começar pela última posição ocupada, e enquanto i for maior
		 * ou igual a posição passada, i retocede outra casa.
		 */
		for(int i = this.tamanho - 1; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}
		/* Quando o i fica igual a posição passada, sai do for e atribui o
		 * elemento para a posição escolhida
		 */
		//O índice da posição recebe o elemento 
		this.elementos[posicao] = elemento;
		this.tamanho++;
		
		return true;
	}
	
	private void aumentarCapacidade() {
		if(this.tamanho == this.elementos.length) {
			String[] elementosNovos = new String[this.elementos.length * 2];
			/*
			 * Atribuindo o que está na posição 0 do elemento na posição 0 do 
			 * novo vetor
			 */
			for(int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
			
	}
//	OPÇÃO 2
//	public void adicionar(String elemento) throws Exception {
//		if (this.tamanho < this.elementos.length) {
//			this.elementos[this.tamanho] = elemento;
//			this.tamanho++;
//		} else
//			throw new Exception("Vetor já atingiu o seu limite");
//	}

	// Ineficiente, pois tem que percorrer todo o vetor toda vez
//	public void adicionar(String elemento) {
//		for(int i = 0; i < this.elementos.length; i++) {
//			if(this.elementos[i] == null) {
//				this.elementos[i] = elemento;
//				break;
//			}
//		}
//	}
	
	//Para fazer a busca, o método tem que ser do mesmo tipo do array
	public String buscar(int posicao) {
		//negando o intervalo válido para a busca
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida!");
		}
		
		return this.elementos[posicao];
	}
	
	public int buscar(String elemento) {
		//busca sequencial para verificar se o elemento existe
		for(int i = 0; i < this.tamanho; i++) {
			if(this.elementos[i].equalsIgnoreCase(elemento))
				return i; //Retornando a posição do elemento
		}
		return -1; //Retornando uma posição inexistente no array
	}
	
	public int tamanho() {
		return this.tamanho;
	}
	
	/*
	 * Faz uma concatenação para apresentar apenas as posições preenchidas do
	 * vetor (!= null)
	 */
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for(int i  = 0; i < this.tamanho - 1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}
		
		if(this.tamanho > 0) {
			s.append(this.elementos[this.tamanho - 1]);
		}
		
		s.append("]");
		
		return s.toString();
	}
	
	public void remover(int posicao) {
		if(!(posicao >= 0 && posicao < tamanho)) 
			throw new IllegalArgumentException("Posição inválida!");
		
		//Empurrando os elementos para preencher a posição do elemento removido
		for(int i = posicao; i < this.tamanho - 1; i++) {
			/*
			 * o vetor da posicao [i], passada pelo usuário, vai receber o vetor 
			 * seguinte, e assim por diante
			 */
			this.elementos[i] = this.elementos[i + 1];
			/*
			 * Exemplo: Removendo o elemento da posição 1, passa-se o elemento 
			 * da posição 2 para a posição 1, então: vetor[1] = vetor[2], etc
			 */
		}
		this.tamanho--; 
	}
	
}
