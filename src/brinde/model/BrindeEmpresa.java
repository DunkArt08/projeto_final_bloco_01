package brinde.model;

public class BrindeEmpresa extends Brinde{
	private String nomeEmpresa,personalizacaoBrinde;
	

	public BrindeEmpresa(int quantidade, int id, String nome, float preco, float peso, String nomeEmpresa,String personalizacaoBrinde) {
		super(quantidade, id, nome, preco, peso);
		this.nomeEmpresa = nomeEmpresa;
		this.personalizacaoBrinde = personalizacaoBrinde;
	}


	public String getNomeEmpresa() {
		return nomeEmpresa;
	}


	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}


	public String getPersonalizacaoBrinde() {
		return personalizacaoBrinde;
	}


	public void setPersonalizacaoBrinde(String personalizacaoBrinde) {
		this.personalizacaoBrinde = personalizacaoBrinde;
	}
	
	
	

}
