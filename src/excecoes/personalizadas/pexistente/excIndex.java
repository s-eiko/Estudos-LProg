package excecoes.personalizadas.pexistente;

/* Esta classe cuidará da exceção IndexOutOfBoundsException */

public class excIndex {


    /* Criando método com tratamento de índices fora de alcançe */

    public static void acessarIndice(int[] array, int indice) {
        if (indice < 0 || indice >= array.length) {
            throw new IndexOutOfBoundsException("Índice fora dos limites do array");
        }
        System.out.println("Elemento no índice " + indice + ": " + array[indice]);
    }
}
