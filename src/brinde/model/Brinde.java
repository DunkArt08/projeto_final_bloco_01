package brinde.model;
import brinde.controller.*;
public abstract class Brinde {
	
	private int quantidade,tipo;
	private String nome,setor;
	private float preco, peso;
	
	//Construtor
	public Brinde(int quantidade, String nome, float preco, float peso,int tipo) {
		this.quantidade = quantidade;
		this.nome = nome;
		this.preco = preco;
		this.peso = peso;
		this.tipo = tipo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	public void gerarId() {
		
	}

	public void visualizar() {
		
		String setor="";
		
		switch (tipo) {
		case 1:
			setor = "PERIGOSO";
			break;
		case 2:
			setor = "FRÁGIL";
			break;
		}
		
		System.out.println("\n*************************************************************************");
		System.out.println("Dados do produto: ");
		System.out.println("\n*************************************************************************");
		System.out.println("Nome do produto: " + this.nome);
		System.out.println("Esse produto é: " + setor);
	}
	
	public void visualizarTudo() {
		String setor="";
		
		switch (tipo) {
		case 1:
			setor = "PERIGOSO";
			break;
		case 2:
			setor = "Frágil";
			break;
		}
		
		System.out.println("\n*************************************************************************");
		System.out.println("Dados do produto: ");
		System.out.println("\n*************************************************************************");
		System.out.println("Nome do produto: " + this.nome);
		System.out.println("Esse produto é: " + setor);
		System.out.println("Quantidade: " + this.quantidade);
		System.out.println("Valor unitário: " + preco);
		System.out.println("Peso Unitário: " + peso);
	}

}
