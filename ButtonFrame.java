import java.awt.FlowLayout; // Importa o layout que organiza componentes em uma linha
import java.awt.event.ActionListener; // Importa a interface para lidar com eventos de ação
import java.awt.event.ActionEvent; // Importa a classe que representa um evento de ação
import javax.swing.JFrame; // Importa a classe para criar uma janela
import javax.swing.JButton; // Importa a classe para criar botões
import javax.swing.Icon; // Importa a interface para ícones
import javax.swing.ImageIcon; // Importa a classe para trabalhar com imagens
import javax.swing.JOptionPane; // Importa a classe para diálogos de mensagem

public class ButtonFrame extends JFrame {
    // Declaração dos botões
    private final JButton plainJButton; // Botão simples
    private final JButton fancyJButton; // Botão com ícone

    // Construtor da classe ButtonFrame
    public ButtonFrame() {
        super("Testing Buttons"); // Define o título da janela
        setLayout(new FlowLayout()); // Define o layout da janela

        // Criação do botão simples
        plainJButton = new JButton("Plain Button");
        add(plainJButton); // Adiciona o botão à janela

        // Criação de ícones para o botão elegante
        Icon bug1 = new ImageIcon(getClass().getResource("bug1.gif"));
        Icon bug2 = new ImageIcon(getClass().getResource("bug2.gif"));
        
        // Criação do botão elegante com ícone
        fancyJButton = new JButton("Fancy Button", bug1);
        fancyJButton.setRolloverIcon(bug2); // Define o ícone de rollover
        add(fancyJButton); // Adiciona o botão à janela

        // Criação do manipulador de eventos
        ButtonHandler handler = new ButtonHandler();
        // Adiciona o manipulador de eventos aos botões
        fancyJButton.addActionListener(handler);
        plainJButton.addActionListener(handler);
    }

    // Classe interna para manipular eventos de botão
    private class ButtonHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            // Exibe uma mensagem informando qual botão foi pressionado
            JOptionPane.showMessageDialog(ButtonFrame.this, String.format(
                "You pressed: %s", event.getActionCommand()));
        }
    }
}
