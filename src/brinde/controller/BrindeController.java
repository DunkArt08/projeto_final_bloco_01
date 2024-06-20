package brinde.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import brinde.model.Brinde;
import brinde.repository.brindeRepository;

public class BrindeController implements brindeRepository {
	
	private List<Brinde> listaBrindes = new ArrayList<Brinde>();
	int numero = 0;

	@Override
	public void adicionarProdutoNoEstoque(Brinde brinde) {
		listaBrindes.add(brinde);
		System.out.println(brinde.getNome() + " foi adicionados em nosso galpão");
		
	}
	
	public void procurarPorNome(String nome) {
		var correr = buscarNaCollection(nome.toLowerCase());
		
		if (correr != null) {
			correr.visualizarTudo();
		}else {
			System.out.println("\nO brinde "+ nome + " não foi encontrado! ");
		}
	}
 
	@Override
	public void removerProdutoNoEstoque(String nome) {
		var correr = buscarNaCollection(nome.toLowerCase());
		
		if( correr != null) {
			if (listaBrindes.remove(correr) == true) {
				System.out.println("\nO produto: "+ nome  + " foi removido com sucesso!");	
			}
		}else {
			System.out.println("\nO produto: " + nome + " não foi encontrado!");
		}
		
	}

	@Override
	public void mostrarEstoque() {
		for(var brinde : listaBrindes) {
			brinde.visualizar();
		}
		
	}

	@Override
	public void atualizarProduto(Brinde brinde) {
		var buscabrinde = buscarNaCollection(brinde.getNome().toLowerCase());
		
		if(buscabrinde != null) {
			listaBrindes.set(listaBrindes.indexOf(buscabrinde), brinde);
			System.out.println("\nO produto: " + brinde.getNome() + " foi atualizado com sucesso!" );
		}else {
			System.out.println("\nO produto: " + brinde.getNome() + " não foi encontrado!");
		}
		
	}
	
	public Brinde buscarNaCollection(String nome) {
		for (var num : listaBrindes) {
			if (num.getNome().contains(nome)) {
				return num;
			}
		}
		return null;
	}

}
