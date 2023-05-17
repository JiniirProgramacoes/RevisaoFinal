package ifba.edu.br.colecao;

import java.util.Objects;

public class Funcoes {
	
	public int conversao(String numeroBinario) {
		int soma = 0;
		char[] digitos = numeroBinario.toCharArray();
		char[] digitosInvertidos = new char[digitos.length];
		for(int i = 0; i < digitos.length; i++) {
			digitosInvertidos[digitos.length - 1 - (1*i)] = digitos[i];	
		}
		for(int i = 0; i < digitosInvertidos.length; i++) {
			if(Objects.equals(digitosInvertidos[i],'1')) {
				soma+=Math.pow(2, i);
			}
		}
		return soma;
	}
	
	public int Maior(int[] i) {
		int cont = 0;
		int maior = i[cont];
		for(cont = 1; cont < i.length; cont++) {
			if(maior < i[cont]) {
				maior = i[cont];
			}
		}
		return maior;
	}
	
	public int[] VetorMenor(int n, int[] i) {
		for(int cont = 0; cont < i.length; cont++) {
			if(n == i[cont]) {
				i[cont] = 0;
			}
		}
		return i;
	}
	
	public int SegundoMaior(int[] i) {
		return Maior(VetorMenor(Maior(i), i));
	}
	
	public String[] StringsSoComA(String[] vetor) {
		String[] vetorNovo = new String[vetor.length];
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i].substring(0, 1).equalsIgnoreCase("a")){
				vetorNovo[i] = vetor[i];
			}
		}
		return vetorNovo;
	}
	
	public void ZerinhoOuUm(int[] vetor) {
		if(vetor[0] == vetor[1]) {
			if(vetor[2] != vetor[0]) {
				System.out.println("Jogador C ganhou!");
			}else {
				System.out.println("Ninguém ganhou");
			}
		}else if(vetor[1] == vetor[2]) {
			System.out.println("Jogador A ganhou!");
		}else if(vetor[0] == vetor[2]) {
			System.out.println("Jogador B ganhou!");
		}
	}
	

}
