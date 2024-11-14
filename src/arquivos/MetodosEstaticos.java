package arquivos;
import java.io.File;
import java.io.IOException;

/* Aqui serão explicados todos os métodos estáticos de um objeto File */

public class MetodosEstaticos {

    public static void main(String[] args) {


        /* Declarando um objeto File */

        File arquivo = new File("C:\\Users\\maria\\Documents\\Projetos-Github\\Estudos-LProg\\src\\arquivosArquivo.txt");

        // Verificando se arquivo existe
        if (arquivo.exists()) {
            System.out.println("O arquivo existe");

            // Achando o tamanho do arquivo
            System.out.println("O tamanho do arquivo em bytes é de: " + arquivo.length());

            // Verificando se o usuário tem permissão para ler o arquivo
            if (arquivo.canRead()) {
                System.out.println("Você tem permissão para ler o arquivo");
            } else {
                System.out.println("Você não tem permissão para ler o arquivo");
            }

            // Verificando se o usuário tem permissão para escrever no arquivo
            if (arquivo.canWrite()) {
                System.out.println("Você pode escrever no arquivo");
            } else {
                System.out.println("Você não pode escrever no arquivo");
            }

            // Caso o arquivo não exista
        } else {
            try {

                // O método createNewFile cria um arquivo, caso ele não exista, e lança automaticamento a exceção IOException, caso haja algum ero no sistema de arquivo
                if (arquivo.createNewFile()) {
                    System.out.println("Arquivo criado");
                } else {
                    System.out.println("Arquivo não pode ser criado");
                }
            } catch (IOException erroIO) {
                System.out.println("Erro na criação do arquivo");
            }
        }
    }
}
