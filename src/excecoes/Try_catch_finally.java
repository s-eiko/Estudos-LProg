package excecoes;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_catch_finally {

    /* Lançando uma exceção:
     * try {
     * 		código que pode gerar uma exceção
     * } catch (tipo_de_exceção identificador) {
     * 		tratamento da exceção (o que fazer quando a exceção é detectada
     * } catch (tipo_de_exceção identificador) {
     * 		tratamento da exceção (caso o tratamento anterior não seja o suficiente
     * } finally {
     * 		ação que sempre será executada após o bloco try, mesmo que haja alguma exceção
     * } */


    /* Criando scanner */

    Scanner ler = new Scanner(System.in);


    /* Exemplo 1: Tratando a exceção ArithmeticException (quando o cálculo realizado é impossível) */

    public void arithmeticExc() {
        System.out.println("Digite o valor de a:");
        int a = ler.nextInt();
        int b = 0;

        try {
            System.out.println(a/b);
        } catch (ArithmeticException erroAritmetico) {
            System.out.println("Não é possível dividir um número por 0");
        } finally {
            ler.close();
        }
    }


    /* Exemplo 2: Tratando a exceção InputMismatchException (quando o input não corresponde ao tipo da variável assignada) */

    public void MismatchExc() {
        System.out.println("Não digite um número inteiro");
        int n = ler.nextInt();

        try {
            System.out.println(n);
        } catch (InputMismatchException erroMismatch) {
            System.out.println("O variável não pode ter este valor, pois é do tipo int");
        } finally {
            ler.close();
        }
    }
}
