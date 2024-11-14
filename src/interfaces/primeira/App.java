package interfaces.primeira;

public class App {
    public static void main(String[] args) {

        // Criando um novo objeto, chamado hello, que seguirá os parâmetros descritos no método PrimeiraGUI
        PrimeiraGUI hello = new PrimeiraGUI("Minha interface gráfica");

        // Deixando hello visível
        hello.setVisible(true);
    }
}
