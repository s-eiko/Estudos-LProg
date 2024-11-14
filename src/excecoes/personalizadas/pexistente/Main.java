package excecoes.personalizadas.pexistente;
import java.util.Scanner;

/* Esta classe chamará os métodos criados, todos eles com tratamento de exceções já definidos */

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in); // Criando scanner


        /* Chamando método dividir */

        try {
            System.out.println("Digite o numerador: ");
            double numerador = ler.nextDouble();

            System.out.println("Digite o divisor: ");
            double divisor = ler.nextDouble();

            double resuldiv = excMatematica.dividir(numerador, divisor); // Chamando o método

            System.out.println("Resultado: " + resuldiv); // Printando o resultado
        } catch (ArithmeticException erroMat) {
            System.out.println("Erro: " + erroMat.getMessage()); // Tratando exceção
        }


        /* Chamando método fatorial */

        try {
            System.out.println("Digite o número: ");
            int n = ler.nextInt();

            long resulfat = excMatematica.fatorial(n); // Chamando o método

            System.out.println("Resultado: " + resulfat); // Printando o resultado
        } catch (ArithmeticException erroMat) {
            System.out.println("Erro: " + erroMat.getMessage()); // Tratando exceção
        }


        /* Chamando método raizQuadrada */

        try {
            System.out.println("Digite o número: ");
            double num = ler.nextDouble();

            double resulraiz = excMatematica.raizQuadrada(num); // Chamando o método

            System.out.println("Resultado: " + resulraiz); // Printando o resultado
        } catch (ArithmeticException erroMat) {
            System.out.println("Erro: " + erroMat.getMessage()); // Tratando exceção
        }




        /* Chamando método verificarNull */

        try {
            excNull.verificarNull(null); // Chamando método com valor null
        } catch (NullPointerException erroNull) {
            System.out.println("Erro: " + erroNull.getMessage()); // Tratando exceção
        }




        /* Chamando método validarMenor300 */

        try {
            System.out.println("Digite o número: ");
            double num = ler.nextDouble();

            excIllegalArg.validarMenor300(num); // Chamando o método
        } catch (IllegalArgumentException erroVal) {
            System.out.println("Erro: " + erroVal.getMessage()); // Tratando exceção
        }


        /* Chamando método validarPositivo */

        try {
            System.out.println("Digite o número: ");
            double num = ler.nextDouble();

            excIllegalArg.validarPositivo(num); // Chamando o método
        } catch (IllegalArgumentException erroVal) {
            System.out.println("Erro: " + erroVal.getMessage()); // Tratando exceção
        }




        /* Chamando método acessarIndice */

        try {
            int[] numeros = {1, 2, 3, 4, 5};

            excIndex.acessarIndice(numeros, 10); // Chamando o método
        } catch (IndexOutOfBoundsException erroIndex) {
            System.out.println("Erro: " + erroIndex.getMessage()); // Tratando exceção
        }

        ler.close();
    }
}
