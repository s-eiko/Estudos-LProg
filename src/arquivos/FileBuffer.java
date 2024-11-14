package arquivos;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* Aqui serão explicados o uso de FileReader e BufferedReader */

public class FileBuffer {
    public static void main(String[] args) {

        // Definindo o caminho do arquivo
        String caminho = "C:\\Users\\maria\\Documents\\Projetos-Github\\Estudos-LProg\\src\\arquivosArquivo.txt";

        /* Criando objeto FileReader
        * FileReader é um tipo de objeto que codifica os caracteres, aumentando o desempenho do programa */
        FileReader freader = null;

        /* Criando objeto BufferedReader
        * BufferedReader é um tipo de objeto que proporciona melhor leitura de texto, vista que também considera linhas e arrays de caracteres */
        BufferedReader breader = null;

        try {

            // Associando o FileReader ao arquivo
            freader = new FileReader(caminho);

            // Associando o BufferedReader ao FileReader
            breader = new BufferedReader(freader);

            // Criando uma variável String que conterá o valor da linha a ser imprimida
            String linha = null;

            do {

                // Associando a linha lida pelo BufferedReader à variável linha
                linha = breader.readLine();

                // Caso a linha contenha algum valor, será printada
                if (linha != null) {
                    System.out.println(linha);
                }
            } while (linha != null); // Código será executado enquanto linha tiver algum valor

        // Lançando a exceção IOException, caso haja algum problema ao rodar o arquivo
        } catch (IOException erroArquivo) {
            System.out.println("Erro: " + erroArquivo.getMessage()); // Tratando a exceção
        } finally {
            try {
                freader.close();
                breader.close();

            // Lançando a exceção IOException, caso haja algum problema tentando achar os objetos FileReader e BufferedReader
            } catch (IOException erroReader) {
                System.out.println("Erro: " + erroReader.getMessage());
            }
        }
    }
}
