package arquivos.dados;

// Aqui todos os dados do arquivo serão associados a suas respectivas variáveis, utilizando como exemplo os dados de um produto

public class Dados {

    private String codigo; // Código do produto
    private String nome; // Nome do produto
    private double preco; // Preço do produto
    private int qtdeEstoque; // Quantidade de estoque

    // Inicializando o método Dados, que nos possibilitará pegar os dados
    public Dados () {

    }

    // Criando método completo
    public Dados (String codigo, String nome, double preco, int qtdEstoque) {
        super();
        this.codigo = codigo; // Associando o código recebido com a variável codigo desta classe
        this.nome = nome; // Associando o nome
        this.preco = preco; // Associando o preço
        this.qtdeEstoque = qtdEstoque; // Associando a quantidade de estoque
    }

    // Criando métodos para pegar cada uma das variáveis
    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQtdeEstoque() {
        return qtdeEstoque;
    }

    // Criando métodos para colocar os valores recebidos e associá-los às variáveis privadas desta classe. Ou seja, os dados retirados da classe LendoFileCSV foram trazidos para essa classe por meio dos métodos acima e agora serão associados às variáveis
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQtdeEstoque(int qtdeEstoque) {
        this.qtdeEstoque = qtdeEstoque;
    }
}
