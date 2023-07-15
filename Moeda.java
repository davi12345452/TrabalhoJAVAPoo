abstract class Moeda {
    protected String nome;
    protected double valor;

    /**
     * Construtor da classe abstrata Moeda que inicializa o nome e valor da moeda.
     *
     * @param nome  o nome da moeda
     * @param valor o valor da moeda
     */
    public Moeda(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    /**
     * Retorna o valor da moeda em reais.
     *
     * @return o valor da moeda em reais
     */
    public abstract double getValorEmReais();

    /**
     * Retorna o nome da moeda.
     *
     * @return o nome da moeda
     */
    public String getNome() {
        return nome;
    }
}

class Real extends Moeda {

    /**
     * Construtor da classe Real que chama o construtor da superclasse Moeda e define o nome como "Real".
     *
     * @param valor o valor da moeda em reais
     */
    public Real(double valor) {
        super("Real", valor);
    }

    /**
     * Retorna o valor da moeda em reais.
     *
     * @return o valor da moeda em reais
     */
    @Override
    public double getValorEmReais() {
        return valor;
    }
}

class Dolar extends Moeda {

    private static final double TAXA_DE_CONVERSAO = 4.8;

    /**
     * Construtor da classe Dolar que chama o construtor da superclasse Moeda e define o nome como "Dólar".
     *
     * @param valor o valor da moeda em dólares
     */
    public Dolar(double valor) {
        super("Dólar", valor);
    }

    /**
     * Retorna o valor da moeda em reais, convertendo de dólares para reais.
     *
     * @return o valor da moeda em reais
     */
    @Override
    public double getValorEmReais() {
        return valor * TAXA_DE_CONVERSAO;
    }
}

class Euro extends Moeda {

    private static final double TAXA_DE_CONVERSAO = 5.4;

    /**
     * Construtor da classe Euro que chama o construtor da superclasse Moeda e define o nome como "Euro".
     *
     * @param valor o valor da moeda em euros
     */
    public Euro(double valor) {
        super("Euro", valor);
    }

    /**
     * Retorna o valor da moeda em reais, convertendo de euros para reais.
     *
     * @return o valor da moeda em reais
     */
    @Override
    public double getValorEmReais() {
        return valor * TAXA_DE_CONVERSAO;
    }
}
