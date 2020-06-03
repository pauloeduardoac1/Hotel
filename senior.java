package HOSenior;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.GregorianCalendar;




public class HotelBO {
	
	
	
	public class Dados {

		private String nome = null;
		private String cpf = null;
		private int numeroTelefone= 0;
		private boolean vaganoestacionamento = false;
		public String getNome() {
			return nome;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public boolean isVaganoestacionamento() {
			return vaganoestacionamento;
		}
		public void setVaganoestacionamento(boolean vaganoestacionamento) {
			this.vaganoestacionamento = vaganoestacionamento;
		}

		public void setnumeroTelefone(String textInput) {
			
			
		}

		public int getNumeroTelefone() {
			return numeroTelefone;
		}

		public void setNumeroTelefone(int numeroTelefone) {
			this.numeroTelefone = numeroTelefone;
		}

		
}
			

	private Scanner l;
	public static void main(String[] args) {
		new Main();
	}

	private String menu() {
		System.out.println("Selecione a opção:");
		System.out.println("N - Novo cadastro");
		System.out.println("L - Listar cadastros");
		System.out.println("X - Sair");
		return l.nextLine(); 
	}

	private void cadastrar() {
		boolean cadastrando = true;

		while (cadastrando) {
			System.out.println("Cadastro de Usuário");
			Dados d = new Dados();
			d.setNome(textInput("Nome:"));
			d.setCpf(textInput("cpf:"));
			d.setnumeroTelefone(textInput("NumeroTelefone: "));
			Dados.add(d);
			String cadastrar = textInput("Adicionar cadastro (S/N) ?");
			if (cadastrar.equalsIgnoreCase("s")) {
				System.out.println("Cadastro adicionado !!!");
				
			} else if (cadastrar.equalsIgnoreCase("n")){
				System.out.println("Cadastro ignorado !!!");
			} else {
				System.out.println("\n Opção inválida \n");
			}

			String continua = textInput("Continuar cadastrando (S/N) ?");
			if (continua.equalsIgnoreCase("N")) {
				cadastrando = false;
			} else if (continua.equalsIgnoreCase("s")){
				// se for s sai do if e volta para o inicio do while
			} else {
				System.out.println("\n Cancelado \n");
				cadastrando = false;
			}
		}
	}

	private void listarCadastros() {
		if (Dados.size() == 0) {
			System.out.println("\nNão existem cadastros !!!\n");
		} else {
			System.out.println("\nLista de Cadastros\n");
			for (int i = 0; i < Dados.size(); i++) {
				Dados d = Dados.get(i);
				System.out.println("Cadastro número: " + i);
				System.out.println("\tNome: " + d.getNome());
				System.out.println("\tcpf: " + d.getCpf());
				System.out.println("\tCargo: " + d.getNumeroTelefone() + "\n");
			}
			System.out.println("\n Fim da lista \n");
		}
	}

	private String textInput(String label) {
		System.out.println(label);
		return l.nextLine();
	}
	
	
	
}