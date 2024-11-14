package interfaces.primeira;
import javax.swing.JFrame;
import javax.swing.JLabel;

// Esta classe criará o método que definirá os elementos da interface gráfica, que será chamada na classe App

/* JFrame   -   Container (formulário) que agrupa outros componentes
* JLabel    -   Área em que podem ser exibidos textos não-editáveis ou ícones
* JTextField    -   Campo de texto para input
* JButton   -   Botão
* JCheckBox    -   Campo que pode ser selecionado ou não-selecionado
* JComboBox    -   Lista de itens que o usuário pode selecionar clicando ou digitando o nome
* JList    -   Lista de itens que o usuário pode selecionar apenas clicando
* JPanel    -   Container onde os elementos podem ser colocados */

public class PrimeiraGUI extends JFrame {

    // Criando JLabel que terá o texto do rótulo
    private JLabel rotulo;

    // A String de nome titulo será recebida quando chamada na classe App
    public PrimeiraGUI(String titulo) {
        super(titulo); // Utilizando o método super parar nomear a aba aberta com o valor da String titulo
        this.setSize(400,100);
        rotulo = new JLabel("Hello World!");
        this.add(rotulo);
    }
}
