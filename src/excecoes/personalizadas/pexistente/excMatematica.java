package excecoes.personalizadas.pexistente;

/* Esta classe cuidará de exceções que tenham a ver com cálculos numéricos */

public class excMatematica {


    /* Criando método com tratamento para divisões impossíveis */

    public static double dividir(double numerador, double divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("Não é possível dividir por 0");
        } else {
            return numerador / divisor; // Retornando a divisão
        }
    }


    /* Criando método com tratamento para cálculos impossíveis de fatorial */

    public static long fatorial(int n) throws ArithmeticException {
        if (n < 0) {
            throw new ArithmeticException("Não é possível calcular fatorial de números negativos");
        } else if (n == 1) {
            return 1; // Fatorial de 1 é sempre 1
        } else {
            return n * fatorial(n-1); // Retornando o fatorial
        }
    }


    /* Criando método com tratamento para cálculos impossíveis de raiz quadrada */

    public static double raizQuadrada(double num) throws ArithmeticException {
        if (num < 0) {
            throw new ArithmeticException("Não é possível calcular raiz quadrada de números negativos");
        } else {
            return num * num; // Retornando raiz quadrada
        }
    }
}
