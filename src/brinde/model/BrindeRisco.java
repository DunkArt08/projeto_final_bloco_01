package brinde.model;

public class BrindeRisco extends Brinde{
	private String tipoRisco,personalizacaoBrinde;
	

	public BrindeRisco(int quantidade, String nome, float preco, float peso,int tipo, String nomeEmpresa,String personalizacaoBrinde) {
		super(quantidade, nome, preco, peso, tipo);
		this.tipoRisco = nomeEmpresa;
		this.personalizacaoBrinde = personalizacaoBrinde;
	}


	public String getTipoRisco() {
		return tipoRisco;
	}


	public void setTipoRisco(String tipoRisco) {
		this.tipoRisco = tipoRisco;
	}


	public String getPersonalizacaoBrinde() {
		return personalizacaoBrinde;
	}


	public void setPersonalizacaoBrinde(String personalizacaoBrinde) {
		this.personalizacaoBrinde = personalizacaoBrinde;
	}
	
	
	

}
