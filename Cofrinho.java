import java.util.ArrayList;
import java.util.List;

public class Cofrinho {

  private List<Moeda> moedas;

  public Cofrinho() {
    this.moedas = new ArrayList<>();
  }

  public void adicionarMoeda(Moeda moeda) {
    moedas.add(moeda);
  }

  public void removerMoeda(int indice) {
    if (indice >= 0 && indice < moedas.size()) {
      moedas.remove(indice);
    } else {
      System.out.println("Indice invalido. Moeda nao removida.");
    }
  }

  public void listarMoedas() {
    System.out.println("Moedas no cofrinho:");
    for (Moeda m : moedas) {
      System.out.println("- " + m.getNome() + ": " + m.valor);
    }
  }

  public double getTotalEmReais() {
    double total = 0;
    for (Moeda m : moedas) {
      total += m.getValorEmReais();
    }
    return total;
  }
}
