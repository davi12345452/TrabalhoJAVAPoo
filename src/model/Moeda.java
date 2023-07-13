package src.model;

public abstract class Moeda {

    protected String nome;
    protected double valor;
  
    public Moeda(String nome, double valor) {
      this.nome = nome;
      this.valor = valor;
    }
  
    public String getNome() {
      return this.nome;
    }
  
    public double getValor() {  
      return this.valor;
    }
  
  }