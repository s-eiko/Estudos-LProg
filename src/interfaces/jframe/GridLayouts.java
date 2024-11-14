package interfaces.jframe;
import javax.swing.*;
import java.awt.*;

// GridLayout organiza os componentes em linhas e colunas, da esquerda para a direita de acordo com a ordem em que foram colocados. Qualquer componente adiciona ocupa a célula inteira.

public class GridLayouts extends JFrame {

    // Criando botões
    private JButton botao1 = new JButton("Botão 1");
    private JButton botao2 = new JButton("Botão 2");
    private JButton botao3 = new JButton("Botão 3");
    private JButton botao4 = new JButton("Botão 4");
    private JButton botao5 = new JButton("Botão 5");

    // Criando JFrame
    public GridLayouts(String titulo) {
        super(titulo);

        this.setLayout(new GridLayout(2,3)); // Colocando o layout como grid, com 2 linhas e 3 colunas

        // Adicionando botões
        this.add(botao1);
        this.add(botao2);
        this.add(botao3);
        this.add(botao4);
        this.add(botao5);

        this.setSize(400,400); // Definindo o tamanho da janela
    }
}
