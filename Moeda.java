abstract class Moeda {
    protected String nome;
    protected double valor;

    public Moeda(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public abstract double getValorEmReais();

    public String getNome() {
        return nome;
    }
}

class Real extends Moeda {

    public Real(double valor) {
        super("Real", valor);
    }

    @Override
    public double getValorEmReais() {
        return valor;
    }
}

class Dolar extends Moeda {

    private static final double TAXA_DE_CONVERSAO = 4.8;

    public Dolar(double valor) {
        super("Dólar", valor);
    }

    @Override
    public double getValorEmReais() {
        return valor * TAXA_DE_CONVERSAO;
    }
}

class Euro extends Moeda {

    private static final double TAXA_DE_CONVERSAO = 5.4;

    public Euro(double valor) {
        super("Euro", valor);
    }

    @Override
    public double getValorEmReais() {
        return valor * TAXA_DE_CONVERSAO;
    }
}