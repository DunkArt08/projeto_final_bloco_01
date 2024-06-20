package brinde.repository;

import brinde.model.Brinde;

public interface brindeRepository {

	//CRIANDO O CRUD PARA O MENU
	public void adicionarProdutoNoEstoque(Brinde brinde);
	public void removerProdutoNoEstoque(String nome);
	public void mostrarEstoque();
	public void atualizarProduto(Brinde brinde);
	
}
