package interfaces.jframe;
import javax.swing.*;
import java.awt.*;

// FLowLayout organiza os elementos sequencialmente, linha por linha, da esquerda para direita, se acordo com a ordem em que foram colocados

public class FlowLayouts extends JFrame {

    // Criando botões
    private JButton botao1 = new JButton("Botão 1");
    private JButton botao2 = new JButton("Botão 2");
    private JButton botao3 = new JButton("Botão 3");
    private JButton botao4 = new JButton("Botão 4");
    private JButton botao5 = new JButton("Botão 5");

    // Criando JFrame
    public FlowLayouts(String titulo) {
        super(titulo);

        this.setLayout(new FlowLayout()); // Colocando o layout como Flow

        // Adicionando botões
        this.add(botao1);
        this.add(botao2);
        this.add(botao3);
        this.add(botao4);
        this.add(botao5);

        this.setSize(400,400); // Definindo o tamanho da janela
    }
}
