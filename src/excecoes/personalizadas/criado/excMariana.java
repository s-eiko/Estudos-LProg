package excecoes.personalizadas.criado;

/* Aqui ficarão declaradas todas as minhas funções personalizadas */

public class excMariana extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /* Criando método para tratamento de exceções
     * O método recebe uma mensagem de erro personalizada, declarada quando é chamado */

    public excMariana (String msg) {
        super(msg); // Retornando a mensagem de erro
    }
}
