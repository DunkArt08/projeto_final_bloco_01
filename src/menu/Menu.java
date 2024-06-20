package menu;
import java.io.IOException;
import java.util.*;


public class Menu {

	public static void main(String[] args) {
		int opcao;
		
		Scanner leia = new Scanner(System.in);

		while(true) {
			System.out.println("**************************************************************************************");
			System.out.println("                                                                                      ");
			System.out.println("                                Brindes e Mimos                                       ");
			System.out.println("                                                                                      ");
			System.out.println("**************************************************************************************");
			System.out.println("                        1 - Mostrar brindes disponiveis                               ");
			System.out.println("                        2 - Adicionar brinde ao estoque                               ");
			System.out.println("                        3 - Mostrar seu estoque                                       ");
			System.out.println("                        4 - Remover brinde do estoque                                 ");
			System.out.println("                        5 - Finalizar Operação                                        ");
			System.out.println("                        6 - Modificar brinde no estoque                               ");
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
				System.out.println("\nBrindes Disponiveis em nosso estoque: ");
				
				keyPress();
				break;
			case 2:
				System.out.println("\nAdicionar brinde ao estoque");
				System.out.println("\nDigite o nome do Brinde: ");
				
				keyPress();
				break;
			case 3:
				System.out.println("\nSeu estoque:");
				
				keyPress();
				break;
			case 4:
				System.out.println("\nRemover brinde do estoque");
				System.out.println("\nDigite o Id do brinde que deseja remover: ");
				
				keyPress();
				break;
			case 5:
				System.out.println("Deseja mesmo finalizar sua operação (S/N) ?: ");
				
				
				keyPress();
				break;
			case 6:
				System.out.println("Modificar brinde no estoque: ");
				System.out.println("Digite o ID do brinde que deseja modificar: ");
				
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
