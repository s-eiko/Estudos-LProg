package interfaces.jframe;
import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class OutrasConfig extends JFrame {

    // Criando botões
    private JButton botao1 = new JButton("Botão 1");
    private JButton botao2 = new JButton("Botão 2");
    private JButton botao3 = new JButton("Botão 3");
    private JButton botao4 = new JButton("Botão 4");
    private JButton botao5 = new JButton("Botão 5");

    // Criando JFrame
    public OutrasConfig(String titulo) {
        super(titulo);

        this.setLayout(new FlowLayout()); // Colocando o layout como Flow

        // Adicionando botões
        this.add(botao1);
        this.add(botao2);
        this.add(botao3);
        this.add(botao4);
        this.add(botao5);

        this.setSize(500,500); // Definindo o tamanho da janela
        this.getContentPane().setBackground(Color.cyan); // Definindo cor de fundo
        this.setLocationRelativeTo(null); // Centralizando componentes

        URL icone = getClass().getResource("/interfaces/icone.png"); // Indicando local do ícone
        this.setIconImage(new ImageIcon(icone).getImage()); // Adicionando ícone
    }
}
