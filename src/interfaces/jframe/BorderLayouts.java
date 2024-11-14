package interfaces.jframe;
import javax.swing.*;
import java.awt.*;

// BorderLayout organiza os componentes em 5 regiões: Norte, Sul, Oeste, Leste e Centro. Todo o espaço não utilizado pelas regiões é deixado para o centro. Cada região só aceita um componente. Para colocar mais de um componente na região, é preciso criar um JPanel dentro da região, que agrupará todos os componentes.

public class BorderLayouts extends JFrame {

    // Criando botões
    private JButton botao1 = new JButton("Botão 1");
    private JButton botao2 = new JButton("Botão 2");
    private JButton botao3 = new JButton("Botão 3");
    private JButton botao4 = new JButton("Botão 4");
    private JButton botao5 = new JButton("Botão 5");

    // Criando JFrame
    public BorderLayouts(String titulo) {
        super(titulo);

        this.setLayout(new BorderLayout()); // Colocando o layout como Flow

        // Adicionando botões
        this.add(botao1, BorderLayout.NORTH); // Norte
        this.add(botao2, BorderLayout.WEST); // Oeste
        this.add(botao3, BorderLayout.CENTER); // Centro
        this.add(botao4, BorderLayout.EAST); // Leste
        this.add(botao5, BorderLayout.SOUTH); // Sul

        this.setSize(400,400); // Definindo o tamanho da janela
    }
}
