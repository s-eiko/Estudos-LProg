package arquivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscrevendoArquivo {

    // Declarando local do arquivo
    static final String caminho = new String("C:\\Users\\maria\\Documents\\Projetos-Github\\Estudos-LProg\\src\\arquivosArquivo.txt");

    // Declarando arquivo
    static File arquivo = new File(caminho);

    public static void main(String[] args) {
            /* Declarando um objeto FileWriter, de nome escArquivo, que possibilitará o codificação do texto digitado
     Declarando um objeto BufferedWriter, de nome bufArquivo, que possibilitará a melhor compreensão do texto pelo programa */
        try (FileWriter escArquivo = new FileWriter(arquivo); BufferedWriter bufArquivo = new BufferedWriter(escArquivo);) {

            // Utilizando um sistema de repetição para escrever 10 linhas
            bufArquivo.write("\nVou escrever dez linhas");
            for (int i = 0; i < 10; i++) {
                bufArquivo.newLine(); // Criando nova linha
                bufArquivo.write("Linha " + i); // Escrevendo na nova linha
            }

            bufArquivo.flush(); // Garante que os novos textos serão gravados no arquivo

            // Lançando a exceção IOException
        } catch (IOException erroArquivo) {
            System.out.println("Erro: " + erroArquivo.getMessage());
        }
    }
}
