package arquivos.dados;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LendoFileCSV {
    public static void main(String[] args) {

        // Indicando o caminho do arquivo
        String caminho = new String("C:\\Users\\maria\\Documents\\Projetos-Github\\Estudos-LProg\\src\\arquivos\\dados\\Produtos.txt");

        // Criando uma lista, chamada de listaProdutos, que armazenará outras listas, cada uma com os dados de cada produto
        List<Dados> listaProdutos = new ArrayList<Dados>();

        // Iniciando FileReader e BufferedReader
        try (FileReader freader = new FileReader(caminho); BufferedReader breader = new BufferedReader(freader);) {

            // Criando a variável linha
            String linha = null;

            linha = breader.readLine();

            do {

                // Adicionando valor à linha
                linha = breader.readLine();

                // Caso a linha contenha algum valor
                if (linha != null) {

                    /* Criando um vetor que pegará o texto da linha e dividirá todas as partes que estiverem entre vírgulas
                    * Neste caso, o arquivo txt que estamos lendo mostra os dados de cada produto um em cada linha, sendo separados por vírgulas */
                    String vetor[] = linha.split(",");

                    String codigo = vetor[0]; // Associando o primeiro valor do vetor ao código
                    String nome = vetor[1]; // Associando o segundo valor do vetor ao nome
                    double preco = Double.parseDouble(vetor[2]); // Transformando o terceiro valor em double e associando ele ao preço
                    int qtdeEstoque = Integer.parseInt(vetor[3]); // Transformando o quarto valor em int e associando ele à quantidade de estoque

                    // Criando novo Produto com os dados extraídos
                    Dados dados = new Dados(codigo, nome, preco, qtdeEstoque);

                    // Adicionando o produto criado ao array de produtos
                    listaProdutos.add(dados);
                }

            // Executará o código enquanto linha possuir valor
            } while (linha != null);

        // Lançando exceção IOException
        } catch (IOException erroArquivo) {
            System.out.println("Erro: " + erroArquivo.getMessage());
        }

        // Criando sistema de repetição para printar todos os produtos do array listaProdutos
        for (Dados p: listaProdutos) {
            System.out.println(p);
        }
    }
}
