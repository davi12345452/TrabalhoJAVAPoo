import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Cofrinho cofrinho = new Cofrinho();

    Scanner scanner = new Scanner(System.in);
    int opcao = 0;

    do {
      System.out.println("Menu:");
      System.out.println("1 - Adicionar moeda");
      System.out.println("2 - Remover moeda");
      System.out.println("3 - Listar moedas");
      System.out.println("4 - Total em reais");
      System.out.println("5 - Sair");
      System.out.print("Escolha uma opcao: ");
      opcao = scanner.nextInt();

      switch (opcao) {
        case 1:
          adicionarMoedaMenu(cofrinho, scanner);
          break;
        case 2:
          removerMoedaMenu(cofrinho, scanner);
          break;
        case 3:
          cofrinho.listarMoedas();
          break;
        case 4:
          System.out.println("Total em reais: " + cofrinho.getTotalEmReais());
          break;
        case 5:
          System.out.println("Encerrando o programa...");
          break;
        default:
          System.out.println("Opção inválida. Tente novamente.");
      }
    } while (opcao != 5);
  }

  private static void adicionarMoedaMenu(Cofrinho cofrinho, Scanner scanner) {
    System.out.println("Tipos de moedas:");
    System.out.println("1 - Real");
    System.out.println("2 - Dolar");
    System.out.println("3 - Euro");
    System.out.print("Escolha uma moeda para adicionar: ");
    int opcaoMoeda = scanner.nextInt();
    System.out.print("Informe o valor da moeda: ");
    double valor = scanner.nextDouble();

    switch (opcaoMoeda) {
      case 1:
        cofrinho.adicionarMoeda(new Real(valor));
        break;
      case 2:
        cofrinho.adicionarMoeda(new Dolar(valor)); // Sem conversão para reais
        break;
      case 3:
        cofrinho.adicionarMoeda(new Euro(valor)); // Sem conversão para reais
        break;
      default:
        System.out.println("Opcao invalida. Moeda nao adicionada.");
    }
  }

  private static void removerMoedaMenu(Cofrinho cofrinho, Scanner scanner) {
    cofrinho.listarMoedas();
    System.out.print("Informe o indice da moeda a ser removida: ");
    int indice = scanner.nextInt();

    cofrinho.removerMoeda(indice);
  }
}

