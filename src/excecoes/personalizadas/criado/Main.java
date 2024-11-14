package excecoes.personalizadas.criado;

import java.util.Scanner;

/* Esta classe chamará o método criado */

public class Main {


    /* Criando função para chamar o método excMariana, personalizando a mensagem de erro */

    public static void validarNome(String nome) {
        if (nome != "Mariana") {
            throw new excMariana("Não é permitido nomes que não sejam Mariana"); // Mensagem de erro
        } else {
            System.out.println("Nome válido"); // Tratando exceção
        }
    }


    /* Criando main, onde a função validarNome será chamada */

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in); // Criando scanner

        System.out.println("Digite o nome: ");
        String nome = ler.next();

        try {
            validarNome(nome); // Chamando função
        } catch (excMariana erroNome) {
            System.out.println("Erro: " + erroNome.getMessage()); // Tratando exceção
        }

        ler.close();
    }
}
