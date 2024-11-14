package arquivos;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/* Nesta classe será lido um arquivo txt */

public class LendoArquivo {
    public static void main(String[] args) {


        // Declarando arquivo

        File arquivo = new File("C:\\Users\\maria\\Documents\\Projetos-Github\\Estudos-LProg\\src\\arquivosArquivo.txt");

        Scanner ler = null; // Colocar o valor null no scanner permite que fechemos o scanner depois de manipular o arquivo

        try {
            ler = new Scanner(arquivo); // Relaciona o scanner ao arquivo declarado

            // Executa o código enquanto o arquivo possuir mais uma linha
            while (ler.hasNextLine()) {
                String proxLinha = ler.nextLine(); // Adiciona a próxima linha à string proxLinha
                System.out.println(proxLinha); // Printa a próxima linha
            }
        } catch (FileNotFoundException erroFile) {
            System.out.println("Arquivo não encontrado"); // Tratando a exceção FileNotFoundException
        } finally {
            ler.close();
        }
    }
}
