package brinde.model;

public class BrindeEvento extends Brinde{
	
	private String diaMaximoDeEntrega,nomeEvento;
	private int dia;

	public BrindeEvento(int quantidade, int id, String nome, float preco, float peso, String diaMaximoDeEntrega,String nomeEvento, int dia) {
		super(quantidade, id, nome, preco, peso);
		this.nomeEvento = nomeEvento; 
		this.diaMaximoDeEntrega = diaMaximoDeEntrega;
		this.dia = dia;
	}

	public String getNomeEvento() {
		return nomeEvento;
	}

	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}

	public String getDiaMaximoDeEntrega() {
		return diaMaximoDeEntrega;
	}

	public void setDiaMaximoDeEntrega(String diaMaximoDeEntrega) {
		this.diaMaximoDeEntrega = diaMaximoDeEntrega;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}
	
	

}
