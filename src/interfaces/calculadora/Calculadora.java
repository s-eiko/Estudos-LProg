package interfaces.calculadora;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class Calculadora extends JFrame {

    // Painéis
    private JPanel pPrincipal = new JPanel(); // Painel que armazenará o Label de input e saída de dados
    private JPanel pNumeros = new JPanel(); // Painel que armazenará os botões de números
    private JPanel pOp = new JPanel(); // Painel que armazenará os botões de operações
    private JLabel lInput = new JLabel("0.00"); // Label da área de input e saída de resultados

    // Botões
    private JButton[] btNumericos = new JButton[11]; // Array de botões dos números
    private JButton[] btOp =  new JButton[5]; // Array de botões das operações

    // Layouts
    private BorderLayout layoutCalc = new BorderLayout();
    private GridLayout layoutTeclNum = new GridLayout(4,3);
    private GridLayout layoutTeclOp = new GridLayout(5,1);

    // Criando método
    public Calculadora () {
        super("Calculadora"); // Título

        this.setSize(300, 350); // Tamanho
        this.setResizable(false); // Não pode mudar de tamanho
        this.setLocationRelativeTo(null); // Elementos centralizados
        this.getContentPane().setBackground(Color.darkGray); // Fundo cinza
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fechar JFrame quando fechar a janela

        // Configurando o layout geral da calculadora (BorderLayout)
        layoutCalc.setHgap(10); // Gap horizontal entre os elementos
        layoutCalc.setVgap(10); // Gap vertical entre os elementos
        this.setLayout(layoutCalc); // Chamando o método de layout (BorderLayout)


        // Criando área de input
        Border lineBorder = BorderFactory.createLineBorder(Color.blue); // Criando margem na cor azul
        pPrincipal.setBorder(lineBorder); // Adicionando a margem ao painel principaç
        pPrincipal.setLayout(new GridLayout(1,1)); // Configurando display para grid de 1 por 1

        lInput.setFont(new Font("Serif", Font.PLAIN, 16)); // Personalizando fonte da label de input
        lInput.setHorizontalAlignment(SwingConstants.RIGHT); // Alinhando a direita
        pPrincipal.add(lInput); // Adicionando ao painel principal

        // Adicionando o painel de input ao norte do painel principal
        this.add(pPrincipal,BorderLayout.NORTH);

        //Configura o painel numerico e cria os botoes
        criaTeclNumerico();
        this.add(pNumeros,BorderLayout.CENTER);

        criaTeclOperações();
        this.add(pOp,BorderLayout.EAST);
    }

    // Criando método para display do teclado de operações
    private void criaTeclOperações() {
        layoutTeclOp.setHgap(5); // Gap horizontal dos elementos
        layoutTeclOp.setVgap(5); // Gap vertical dos elementos
        pOp.setLayout(layoutTeclOp); // Definindo o layout do painel (grid de 5 por 1)
        Border lineBorder = BorderFactory.createLineBorder(Color.blue); // Criando margem da cor azul
        pOp.setBorder(lineBorder); // Adicionando a margem

        // Colocando os valores do botões na array de botões de operações
        btOp[0] = new JButton("+");
        btOp[1] = new JButton("-");
        btOp[2] = new JButton("*");
        btOp[3] = new JButton("/");
        btOp[4] = new JButton("=");

        // Adicionando os botões de acordo com a ordem estabelecida
        for(int i=0;i<=4;i++) {
            pOp.add(btOp[i]);
        }
    }

    // Criando método para display do teclado de números
    private void criaTeclNumerico() {
        layoutTeclNum.setHgap(10); // Gap horizontal dos elementos
        layoutTeclNum.setVgap(10); // Gap vertical dos elementos
        pNumeros.setLayout(layoutTeclNum); // Definindo layout do painel de números (grid de 4 por 3)
        Border lineBorder = BorderFactory.createLineBorder(Color.blue); // Criando margem da cor azul
        pNumeros.setBorder(lineBorder); // Adicionando a margem

        // Adicionando os valores do botões no array de botões numéricos
        for(int i=0;i<=9;i++) {
            btNumericos[i] = new JButton(Integer.toString(i)); // Adicionando valor
            btNumericos[i].addActionListener(evento -> clickBotaoNum(evento)); // Configurando o botão para rodar a função clickBotaoNum toda vez que o botão for clicado
        }

        btNumericos[10] = new JButton("."); // Adicionando botão de "." para escrever números quebrados
        btNumericos[10].addActionListener(evento -> clickBotaoNum(evento)); // Configurando o botão para rodar a função clickBotaoNum toda vez que o botão for clicado

        // Adicionando botões ao display, começando pelo valor 1, visto que o botão de valor 0 ficará impresso na última linha da calculadora
        for(int i=1;i<=9;i++) {
            pNumeros.add(btNumericos[i]);
        }

        pNumeros.add(btNumericos[0]); // Adicionando o botão de valor 0
        pNumeros.add(btNumericos[10]); // Adicionando o botão de valor "."
    }

    // Objeto que verificará se o botão foi clicado
    private Object clickBotaoNum(ActionEvent evento) {
        System.out.println(((AbstractButton) evento.getSource()).getText()); // O botão passa a ter o valor do texto contido nele

        return null;
    }

}
