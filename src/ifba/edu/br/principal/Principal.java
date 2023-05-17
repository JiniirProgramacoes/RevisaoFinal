package ifba.edu.br.principal;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
import ifba.edu.br.colecao.CadastrarConta;
import ifba.edu.br.colecao.Funcoes;
import ifba.edu.br.entidades.Conta;

public class Principal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		/*CadastrarConta cC = new CadastrarConta();
		
		for(int i = 0; i < 2; i++) {
			Conta c = new Conta();
			System.out.println("Digite a conta:");
			String nomeConta = scan.next();
			double valorConta = scan.nextDouble();
			c.setNome(nomeConta);
			c.setValor(valorConta);
			cC.adicionarConta(c);
		}
		System.out.println(cC.listarConta());
		Conta c = new Conta();
		System.out.println("Digite a conta:");
		String nomeConta = scan.next();
		double valorConta = scan.nextDouble();
		int posicao = scan.nextInt();
		c.setNome(nomeConta);
		c.setValor(valorConta);
		cC.adicionarContaPosicao(c, posicao);
		System.out.println(cC.listarConta());
		cC.removerContaPosicao(1);
		System.out.println(cC.listarConta());
		System.out.println(cC.procurarConta(0));
		System.out.println(cC.procurarContaPorNome("Miguel"));*/
		
		Funcoes F = new Funcoes();
		/*System.out.println("Escreva um número binário");
		String numeroB = scan.next();
		System.out.println(""+cN.conversao(numeroB));
		*/
		
		/*int[] vetor = new int[5];
		for(int i = 0; i <= 4; i++) {
			int num = scan.nextInt();
			vetor[i] = num;
		}
		System.out.println(F.Maior(vetor));
		System.out.println(F.SegundoMaior(vetor));*/
		
		String[] vetorNome = new String[3];
		for(int i = 0; i <= 2; i++) {
			String nome = scan.next();
			vetorNome[i] = nome;
		}
		Arrays.sort(vetorNome);
		System.out.println(Arrays.toString(vetorNome));
		
		Random rand = new Random();
		
		int[] vetor = new int[3];
		vetor[0] = rand.nextInt(2);
		vetor[1] = rand.nextInt(2);
		vetor[2] = rand.nextInt(2);
		F.ZerinhoOuUm(vetor);
		System.out.println(vetor[0]+", "+vetor[1]+", "+vetor[2]);
		
		
	}

}
