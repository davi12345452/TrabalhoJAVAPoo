// arquivo: src/service/Cofrinho.java

package src.service;
import java.util.ArrayList;
import java.util.List;
import src.model.Dolar;
import src.model.Euro;
import src.model.Moeda;
import src.model.Real;

public class Cofrinho {

  private List<Moeda> moedas;
  
  public Cofrinho() {
    this.moedas = new ArrayList<>(); 
  }

  public void adicionarMoeda(Moeda moeda) { 
    this.moedas.add(moeda);
  }

  public void removerMoeda(Moeda moeda) {
    this.moedas.remove(moeda); 
  }

  public void listarMoedas() {
    System.out.println("Moedas no cofrinho:");
  
    for(Moeda m : this.moedas) {
      System.out.println("- " + m.getNome() + ": " + m.getValor());
    }  
  }

  public double calcularTotalEmReais() {
    double total = 0;

    for(Moeda m : this.moedas) {
      
      if(m instanceof Real) {
        total += m.getValor(); 
      } else if (m instanceof Dolar) {
        total += m.getValor() * 4.8; // considerando 1 dólar = 5 reais
      } else if (m instanceof Euro) {
        total += m.getValor() * 5.2; // considerando 1 euro = 6 reais
      }
  
    }
  
    return total;
  }

}
