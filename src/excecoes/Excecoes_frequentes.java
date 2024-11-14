package excecoes;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecoes_frequentes {

    /* Criando scanner */

    Scanner ler = new Scanner(System.in);


    /* Exceção ArithmeticException (quando o cálculo realizado é impossível) */

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


    /* Exceção InputMismatchException (quando o input não corresponde ao tipo da variável assignada) */

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


    /* Exceção ClassNotFound (quando o sistema não encontra a classe a ser carregada) */

    public void ClassNFound() {

        /* Existem três formas de carregar uma classe:
         * 		1. Class.forName('nome_da_classe')	-	Esta função carrega e inicializa os objetos contidos na classe indicada
         * 		2. loadClass('nome_da_classe')	-	Esta função carrega os objetos contidos na classe indicada, não necessariamente inicizalizando
         * 		3. findSystemClass('nome_da_classe')	-	Esta função procura a classe indicada, sem obrigatoriamente carregar */


        /* Exceção utilizando o Class.forName() */

        try {
            /* Declarando uma classe: Class nome_da_classe
             * Associando essa classe a uma classe que deveria ser pré-existente "classeNaoExistente" */
            Class classe = Class.forName("classeNaoExistente");

            /* Printando o nome da classe */
            System.out.println("Classe: " + classe.getName());
        } catch (ClassNotFoundException erroClasseNEncontrada) {
            System.out.println("Classe não encontrada");
        } finally {
            ler.close();
        }


        /* Exceção utilizando o loadClass() */

        try {
            /* Criando uma classe utilizando ClassLoader para ler os objetos da classe que deveria ser pré-existente "classeNaoExistente" */
            Class<?> classe = ClassLoader.getSystemClassLoader().loadClass("classeNaoExistente");

            /* Printando o nome da classe */
            System.out.println("Classe carregada: " + classe.getName());
        } catch (ClassNotFoundException erroClasseNEncontrada) {
            System.out.println("Classe não encontrada");
        } finally {
            ler.close();
        }


        /* Exceção utilizando o findSystemClass() */

        /* Para utilizar essa função é preciso utilizar um objeto de leitura de classe, do tipo ClassLoader
         * Criação de uma subclasse de ClassLoader */
        ClassLoader carregadorClasse = new ClassLoader() {
            @Override
            public Class<?> loadClass(String classe) throws ClassNotFoundException {
                // Chama o método protegido findSystemClass através de um método público
                return findSystemClass(classe);
            }
        };

        /* Associando o ClassLoader a uma classe que deveria ser pré-existente "classeNaoExistente"
         * O método findSystemClass() é protegido, ou seja, só pode ser invocado caso a função seja da subclasse ClassLoader */
        try {
            Class<?> classe = carregadorClasse.loadClass("classeNaoExistente");

            /* Printando resultado */
            System.out.println("Classe carregada com sucesso: " + classe.getName());
        } catch (ClassNotFoundException erroClasseNEncontrada) {
            System.err.println("Erro ao carregar a classe");
        } finally {
            ler.close();
        }
    }


    /* Exceção IndexOutOfBoundsException (quando o objeto a ser acessado faz parte de um vetor, mas seu index não existe) */

    public void IndexOutBounds() {

        /* Criando um vetor, de nome vetor, de tipo int, que pode conter 3 valores */
        int[] vetor = new int[3];

        /* Colocando valores no vetor */
        vetor[0] = 1;
        vetor[1] = 2;
        vetor[2] = 3;

        try {
            /* Tentando printar um valor do vetor que não existe */
            System.out.println("O valor é :" + vetor[3]);
        } catch (IndexOutOfBoundsException erroIndexNExiste) {
            System.out.println("O valor não existe");
        } finally {
            ler.close();
        }
    }


    /* Exceção NullPointerException (quando um valor Null é tratado como objeto) */

    public void NullObjeto() {

        /* Criando uma variável integer com valor null */
        Integer n = null;

        try {
            /* Tentando criar uma variável int utilizando valor null */
            int z = 5 + n;

            /* Printando a variável */
            System.out.println("Z é igual a: " + z);
        } catch (NullPointerException erroNull) {
            System.out.println("Z não pode derivar de um valor null, visto que é int");
        } finally {
            ler.close();
        }
    }


    /* Exceção NumberFormatException (quando tenta transformar uma variável string em número, mesmo que a string possua valores não numéricos */

    public void NumberFormat() {

        /* Criando String */
        String texto = "Texto";

        try {
            /* Tentando transformar a String em número */
            int num = Integer.parseInt(texto);

            /* Printando a variável */
            System.out.println("O número é: " + num);
        } catch (NumberFormatException erroFormatoNum) {
            System.out.println("A variável num é inválida, pois não se pode converter valores não numéricos em int");
        } finally {
            ler.close();
        }
    }
}
