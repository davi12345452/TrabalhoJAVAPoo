import java.util.ArrayList;
import java.util.List;

public class Cofrinho {

  private List<Moeda> moedas;

  /**
   * Construtor da classe Cofrinho que inicializa a lista de moedas.
   */
  public Cofrinho() {
    this.moedas = new ArrayList<>();
  }

  /**
   * Adiciona uma moeda à lista de moedas do cofrinho.
   *
   * @param moeda a moeda a ser adicionada
   */
  public void adicionarMoeda(Moeda moeda) {
    moedas.add(moeda);
  }

  /**
   * Remove uma moeda da lista de moedas do cofrinho com base no índice informado.
   *
   * @param indice o índice da moeda a ser removida
   */
  public void removerMoeda(int indice) {
    if (indice >= 0 && indice < moedas.size()) {
      moedas.remove(indice);
    } else {
      System.out.println("Indice invalido. Moeda nao removida.");
    }
  }

  /**
   * Lista todas as moedas presentes no cofrinho, exibindo seus nomes e valores.
   */
  public void listarMoedas() {
    System.out.println("Moedas no cofrinho:");
    for (Moeda m : moedas) {
      System.out.println("- " + m.getNome() + ": " + m.valor);
    }
  }

  /**
   * Calcula e retorna o valor total em reais das moedas presentes no cofrinho.
   *
   * @return o valor total em reais
   */
  public double getTotalEmReais() {
    double total = 0;
    for (Moeda m : moedas) {
      total += m.getValorEmReais();
    }
    return total;
  }
}
