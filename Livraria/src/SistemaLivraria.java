import java.util.*;
public class SistemaLivraria {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Scanner string = new Scanner(System.in); //Leitura de String
		
		int menu;
		double valorInicial, valorFinal;
		
		Livro livro;
		
		String titulo, autor, genero;
		float preco;
		int cod_livro;
		
		System.out.println("\t\t\tProjeto Interdisciplinar - Java Crud ||| ArrayList\n");
		System.out.println("\t\t\t\t\tLivraria Cruzeiro do Sul");
		System.out.println("\n\t\t\tAnálise e Desenvolvimento de Sistemas Noturno - Turma B\n");
		System.out.println("\t\t\t\t\tIntegrantes:\n"
				+ "\n\t\t\t\tKauê Loviz de Oliveira - 30650615\n"
				+ "\n\t\t\t\tDenis Pancionato - 29294649\n"
				+ "\n\t\t\t\tCamila Cunha - 29372917\n"
				+ "\n\t\t\t\tDaniel Amorim Messias - 131116736\n"
				+ "\n\t\t\t\tGabriel Henrique Santos - 28996089\n"
				+ "\n\t\t\t\tLucas Matos de Santana - 29371538\n");
		
		
		do {
			exibirMenu();
			menu = entrada.nextInt();
			
			switch(menu) {
			//Cadastrar livro
			case 1:
				System.out.println("\n\t\t\t\t====================================");
				System.out.println("\t\t\t\t========= Cadastrar Livros =========");
				System.out.println("\t\t\t\t====================================");
				System.out.println("\nDigite o Titulo do livro: ");
				titulo = string.nextLine();
				
				System.out.println("\nDigite o Autor do livro: ");
				autor = string.nextLine();
				
				System.out.println("\nDigite o Gênero do livro: ");
				genero = string.nextLine();
				
				System.out.println("\nDigite o Código do livro: ");
				cod_livro = entrada.nextInt();
				
				System.out.println("\nDigite o Preço do livro: R$ ");
				preco = entrada.nextFloat();
				
				livro = new Livro(titulo, autor, cod_livro, genero, preco);
				
				//Inserir no arrayList
				Acumulo.adicionar(livro);

				break;
			
			//Listar livros	
			case 2:
				System.out.println("\n\t\t\t\t=================================");
				System.out.println("\t\t\t\t========= Listar Livros =========");
				System.out.println("\t\t\t\t=================================");
				//Verificando se a listagem est� vazia
				if(! (Acumulo.listar().isEmpty())) {
					
				}else {
					System.out.println("\nNão existe livros na base de dados da Livraria Cruzeiro do Sul!!!");
				}
				System.out.println(Acumulo.listar());
				
				break;
			
			//excluir livros		
			case 3:
				System.out.println("\n\t\t\t\t=================================");
				System.out.println("\t\t\t\t========= Excluir Livros ========");
				System.out.println("\t\t\t\t=================================");
				System.out.println("\nDigite o Titulo do Livro que deseja excluir: ");
				titulo = string.nextLine();
				
				//Verificando se a lista de livros n�o est� vazia
				if(! (Acumulo.getLista_Livros().isEmpty())) {
					if(Acumulo.remover(titulo)) {
						System.out.println("\nLivro Removido com Sucesso!!!");
					}else {
						System.out.println("\nO Título do livro não foi encontrado!!!");
					}
				}else {
					System.out.println("\nNão existe livros para serem excluídos na Livraria Cruzeiro do Sul!!!");
				}
				
				break;
				
			//Pesquisa livro pelo gênero	
			case 4:
				System.out.println("\n\t\t\t\t================================================");
				System.out.println("\t\t\t\t========= Pesquisar Livros pelo Gênero =========");
				System.out.println("\t\t\t\t================================================");
				System.out.println("\nDigite o Gênero do Livro: ");
				genero = string.nextLine();
				System.out.println("\nExiste " + Acumulo.pesquisar(genero)
						+" livro(s) do Gênero " + genero);
				
				break;
				
			//Pesquisa livro pela faixa de preço
			case 5:
				System.out.println("\n\t\t\t\t==========================================================");
				System.out.println("\t\t\t\t========= Pesquisar Livros pelo faixa de Preço =========");
				System.out.println("\t\t\t\t==========================================================");
				System.out.println("\nDigite 1° a faixa inicial e 2° a faixa final do livro: R$ ");
				valorInicial = entrada.nextDouble();
				valorFinal = entrada.nextDouble();
				
				System.out.println("\nExiste " + Acumulo.pesquisar(valorInicial, valorFinal)
				+ " livro(s) com preço entre "
				+ String.format("R$ %.2f e R$ %.2f \n", valorInicial, valorFinal));
				
				break;
				
			//Total livros em reais
			case 6:
				System.out.println("\n\t\t\t\t====================================================================");
				System.out.println("\t\t\t\t========= Total em R$ Livros na Livraria Cruzeiro do Sul =========");
				System.out.println("\t\t\t\t====================================================================");
				System.out.println("\nO valor total da Livraria Cruzeiro do Sul é: R$ " + String.format("R$ %.2f \n", Acumulo.calcularTotalLivros()));
				break;
				
			//Saindo do programa	
			case 7:
				System.out.println("\nEncerrando o sistema...");
				System.out.println("\nBye Bye, Até mais (:");
				entrada.close();
				string.close();
				break;
				
			default:
				System.out.println("\nOpção Inválida!!!");
			}
			
		}while(menu != 7);
				
	}
	
	//Método para exibir o menu
	
	static void exibirMenu() {
		System.out.println("\n\t\t\t====================================================");
		System.out.println("\t\t\t============= Livraria Cruzeiro do Sul =============");
		System.out.println("\t\t\t====================================================");
		System.out.println("\n1 -> Cadastar Livro");
		System.out.println("\n2 -> Listar Livro");
		System.out.println("\n3 -> Excluir Livro");
		System.out.println("\n4 -> Pesquisar Gênero");
		System.out.println("\n5 -> Pesquisar Faixa de Preço");
		System.out.println("\n6 -> Calcular Valor Total de Livros");
		System.out.println("\n7 -> Sair");
		System.out.println("\n--------> Escolha a opção que deseje: \n");
	}
}