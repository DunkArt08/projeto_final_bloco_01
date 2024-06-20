package brinde.model;

public abstract class Brinde {
	
	private int quantidade,id;
	private String nome;
	private float preco, peso;
	
	//Construtor
	public Brinde(int quantidade, int id, String nome, float preco, float peso) {
		this.quantidade = quantidade;
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.peso = peso;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	
	
	
	

}
