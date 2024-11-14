package excecoes.personalizadas.pexistente;

/* Esta classe cuidará de exceções que tenham argumentos fornecidos inválidos para o método */

public class excIllegalArg {


    /* Criando método em que o número deve ser menor ou igual a 300 */

    public static void validarMenor300(double num) throws IllegalArgumentException {
        if (num > 300) {
            throw new IllegalArgumentException("O valor não pode ser maior que 300");
        } else {
            System.out.println("O valor é válido"); // Retornando mensagem
        }
    }


    /* Criando método em que o número deve ser positivo */

    public static void validarPositivo(double num) {
        if (num < 0) {
            throw new IllegalArgumentException("O valor não pode ser negativo");
        }
        System.out.println("O valor é válido"); // Retornando mensagem
    }
}
