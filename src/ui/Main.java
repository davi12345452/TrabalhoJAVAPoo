package src.ui;

import src.service.Cofrinho;

public class Main {

  public static void main(String[] args) {
    
    ScannerManager entrada = new ScannerManager();
    Cofrinho cofrinho = new Cofrinho();

    int opcao;

    do {
      exibirMenu();
      
      opcao = entrada.lerInt("Digite uma opção: ");
      
      if (opcao == 1) {
    	  int tipo = entrada.lerInt("Digite o tipo (1-Real, 2-Dólar, 3-Euro): ");
    	  double valor = entrada.lerDouble("Digite o valor: ");

    	  // cria a moeda correspondente e adiciona no cofrinho
    	  if(tipo == 1) {
    	    cofrinho.adicionarMoeda(new Real(valor)); 
    	  } else if(tipo == 2) {
    	    cofrinho.adicionarMoeda(new Dolar(valor));
    	  } else if(tipo == 3) {
    	    cofrinho.adicionarMoeda(new Euro(valor));
    	  }
      } else if (opcao == 2) {
        cofrinho.listarMoedas();
      } else if (opcao == 3) {
    	  // lê o tipo da moeda a remover
    	  int tipo = entrada.lerInt("Digite o tipo da moeda a remover: ");

    	  // remove a primeira moeda desse tipo encontrada
    	  if(tipo == 1) {
    	    cofrinho.removerMoeda(Real.class);
    	  } else if(tipo == 2) {
    	    cofrinho.removerMoeda(Dolar.class);
    	  } else if(tipo == 3) {
    	    cofrinho.removerMoeda(Euro.class);
    	  }
      } else if (opcao == 4) {
        System.out.println("Total em reais: " + cofrinho.calcularTotalEmReais()); 
      }
      
    } while (opcao != 0);

  }

  private static void exibirMenu() {
    System.out.println("\n--- Menu ---");
    System.out.println("1 - Adicionar moeda");
    System.out.println("2 - Listar moedas");
    System.out.println("3 - Remover moeda");
    System.out.println("4 - Total em reais");
    System.out.println("0 - Sair");
  }

}