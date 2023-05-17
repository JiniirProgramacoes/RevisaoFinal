package ifba.edu.br.colecao;

import java.util.Arrays;

import ifba.edu.br.entidades.Conta;

public class CadastrarConta {
	
	private Conta[] con = new Conta[2];
	private int total = 0;
	
	public void adicionarConta(Conta c) {
		aumentarVetor();
		con[total] = c;
		total++;
	}
	
	public void adicionarContaPosicao(Conta c, int posicao) {
		aumentarVetor();
		for(int i = total; i > posicao; i--) {
			con[i] = con[i-1];
		}
		con[posicao] = c;
		total++;
	}
	
	public void removerContaPosicao(int posicao) {
		for(int i = posicao; i < total; i++) {
			con[i] = con[i+1];
		}
		con[total] = null;
		total--;
	}
	
	public void aumentarVetor() {
		if(total >= con.length) {
			Conta[] conNova = new Conta[con.length*2];
			System.arraycopy(con, 0, conNova, 0, con.length);
			con = conNova;
		}
	}

	public String listarConta() {
		return Arrays.toString(con);
	}
	
	public String procurarContaPorNome(String nome) {
		for(int i = 0; i <= total; i++) {
			if(con[i].getNome().equalsIgnoreCase(nome)){
				return con[i].toString();
			}
		}
		return "Não foi encontrado nenhuma conta com esse nome.";
	}
	
	public String procurarConta(int posicao) {
		return con[posicao].toString();
	}
}
