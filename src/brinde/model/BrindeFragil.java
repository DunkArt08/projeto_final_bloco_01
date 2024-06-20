package brinde.model;

public class BrindeFragil extends Brinde{
	
	private String serFragil;
	private int grauFragilidade;

	public BrindeFragil(int quantidade, String nome, float preco, float peso,int tipo,String serFragil, int grauFragilidade) {
		super(quantidade, nome, preco, peso,tipo);
		this.serFragil = serFragil; 
		this.grauFragilidade = grauFragilidade;
	}

	public String getSerFragil() {
		return serFragil;
	}

	public void setSerFragil(String nomeEvento) {
		this.serFragil = nomeEvento;
	}

	public int getGrauFragilidade() {
		return grauFragilidade;
	}

	public void setGrauFragilidade(int dia) {
		this.grauFragilidade = dia;
	}
	
	

}
