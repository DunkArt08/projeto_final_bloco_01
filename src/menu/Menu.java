package menu;
import java.io.IOException;
import java.util.*;

import brinde.controller.BrindeController;
import brinde.model.BrindeRisco;
import brinde.model.BrindeFragil;


public class Menu {

	public static void main(String[] args) {
		
		BrindeController brinde = new BrindeController();
		
		int opcao,quantidade,setor=0,grauFragilidade,procuraID;
		String nome,tipoRisco,prevencaoRisco,serFragil,procurarNome;
		float preco, peso;
		
		
		Scanner leia = new Scanner(System.in);

		while(true) {
			System.out.println("**************************************************************************************");
			System.out.println("                                                                                      ");
			System.out.println("                                Controle e adm de estoque                             ");
			System.out.println("                                                                                      ");
			System.out.println("**************************************************************************************");
			System.out.println("                        1 - Mostrar produtos no estoque                               ");
			System.out.println("                        2 - Adicionar produto ao estoque                              ");
			System.out.println("                        3 - Procurar produto por nome/mostrar detalhadamente          ");
			System.out.println("                        4 - Remover produto do estoque                                ");
			System.out.println("                        5 - Modificar produto no estoque                              ");
			System.out.println("                        7 - Sair do APP                                               ");
			System.out.println("                                                                                      ");
			System.out.println("**************************************************************************************");
			System.out.println("Entre com a opção desejada:                                                           ");
			System.out.println("                                                                                      ");
			
			//try catch para me certificar de que o usuario inseriu um numero valido
			try {
			opcao = leia.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}
			
			if(opcao == 7) {
				System.out.println("\nObrigado por tirar um momento do seu dia para consultar noss app!");
				sobre();
				leia.close();
				System.exit(0);
			}
			
			switch (opcao) {
			case 1:
				System.out.println("\nProdutos Disponiveis em nosso estoque: ");
				brinde.mostrarEstoque();
				keyPress();
				break;
			case 2:
				System.out.println("\nAdicionar produto ao estoque");
				System.out.println("\nDigite o nome do produto: ");
				leia.skip("\\R?");
				nome = leia.nextLine();
				System.out.println("Digite o a quantidade de produtos que será armazenado: ");
				try {
					quantidade = leia.nextInt();
					}catch(InputMismatchException e) {
						System.out.println("\nDigite valores inteiros!");
						leia.nextLine();
						keyPress();
						break;
					}	
				System.out.println("Digite o valor unitário de cada produto: ");
				try {
					preco = leia.nextFloat();
					}catch(InputMismatchException e) {
						System.out.println("\nDigite algum numero!");
						leia.nextLine();
						keyPress();
						break;
					}
				System.out.println("Digite o peso unitário de cada produto: ");
				try {
					peso = leia.nextFloat();
					}catch(InputMismatchException e) {
						System.out.println("\nDigite algum numero!");
						leia.nextLine();
						keyPress();
						break;
					}
				System.out.println("O seu produto é de risco?\n1- SIM \n2- NÃO\n");
				try {
					setor = leia.nextInt();
					}catch(InputMismatchException e) {
						System.out.println("\nDigite valores inteiros!");
						leia.nextLine();
						keyPress();
						break;
					}
					switch (setor) {
					case 1:
							System.out.println("Insira o tipo de Risco: ");
							leia.skip("\\R?");
							tipoRisco = leia.nextLine();
							System.out.println("Insira Métodos de prevenção para esse produto: ");
							leia.skip("\\R?");
							prevencaoRisco = leia.nextLine();
							brinde.adicionarProdutoNoEstoque(new BrindeRisco(quantidade, nome, preco, peso,setor, tipoRisco, prevencaoRisco));
							
						break;
					case 2:
						System.out.println("Seu produto é frágil? (SIM/NÃO): ");
						leia.skip("\\R?");
						serFragil = leia.nextLine();
						do {
						System.out.println("Em uma escala de 0 a 10 qual frágil ele possui?: ");
						leia.skip("\\R?");
						grauFragilidade = leia.nextInt();
						}while(grauFragilidade < 0 && grauFragilidade > 10);
						
						brinde.adicionarProdutoNoEstoque(new BrindeFragil(quantidade, nome, preco, peso,setor, serFragil, grauFragilidade));
						
						break;
					default:
						break;
					}
				
				
				keyPress();
				break;
			case 3:
				System.out.println("\nInsira o nome do brinde:");
				leia.nextLine();
				procurarNome = leia.nextLine();
				
				brinde.procurarPorNome(procurarNome);
				keyPress();
				break;
			case 4:
				System.out.println("\nRemover produto do estoque");
				System.out.println("\nDigite o nome do produto que deseja remover: ");
				leia.nextLine();
				nome = leia.nextLine();
				brinde.removerProdutoNoEstoque(nome);
				
				keyPress();
				break;
			case 5:
				System.out.println("Insira o nome do produto que deseja alterar: ");
				leia.nextLine();
				nome = leia.nextLine();
				
				var acharProduto = brinde.buscarNaCollection(nome);
				
				if(acharProduto != null) {
					System.out.println("Digite a nova quantidade de produtos que será armazenado: ");
					quantidade = leia.nextInt();
					System.out.println("Digite o novo valor unitário de cada produto: ");
					preco = leia.nextFloat();
					System.out.println("Digite o novo peso unitário de cada produto: ");
					peso = leia.nextFloat();
					System.out.println("O seu produto ainda é de risco?\n1- SIM \n2- NÃO\n");
					setor = leia.nextInt();
						switch (setor) {
						case 1:
								System.out.println("Insira o tipo de Risco: ");
								leia.skip("\\R?");
								tipoRisco = leia.nextLine();
								System.out.println("Insira Métodos de prevenção para esse produto: ");
								leia.skip("\\R?");
								prevencaoRisco = leia.nextLine();
								brinde.atualizarProduto(new BrindeRisco(quantidade, acharProduto.getNome(), preco, peso,setor, tipoRisco, prevencaoRisco));
								
							break;
						case 2:
							System.out.println("Seu produto é frágil? (SIM/NÃO): ");
							leia.skip("\\R?");
							serFragil = leia.nextLine();
							do {
							System.out.println("Em uma escala de 0 a 10 qual frágil ele possui?: ");
							leia.skip("\\R?");
							grauFragilidade = leia.nextInt();
							}while(grauFragilidade < 0 && grauFragilidade > 10);
							
							brinde.atualizarProduto(new BrindeFragil(quantidade, nome, preco, peso,setor, serFragil, grauFragilidade));
							
							break;
						default:
							break;
						}
				}
				
				keyPress();
				break;
			default:
				System.out.println("\nOpcao Inválida!");
				keyPress();
				break;
			}
			
		}
	}
	
	public static void sobre() {
		System.out.println("\n************************************************************************************\n");
		System.out.println("Projeto desenvolvido por: Daniel Lopes");
		System.out.println("email para contato: daniellucaspc@hotmail.com");
		System.out.println("https://github.com/DunkArt08");
		System.out.println("\n************************************************************************************\n");
	}
	
	public static void keyPress() {
		try {
			System.out.println("\n\nPressione Enter para continuar....;");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente de Enter!");
		}
	}

}
