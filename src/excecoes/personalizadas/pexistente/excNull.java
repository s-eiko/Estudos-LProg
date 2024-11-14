package excecoes.personalizadas.pexistente;

/* Esta classe cuidará da exceção NullPointerException */

public class excNull {


    /* Criando método com tratamento para objetos de valor null */

    public static void verificarNull(Object obj) throws NullPointerException {
        if (obj == null) {
            throw new NullPointerException("O objeto não pode ser nulo");
        } else {
            System.out.println("Objeto válido"); // Printando mensagem
        }
    }
}
