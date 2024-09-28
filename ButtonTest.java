import javax.swing.JFrame; // Importa a classe para criar janelas

public class ButtonTest {
    public static void main(String[] args) {
        // Cria uma instância da classe ButtonFrame, que representa a janela com botões
        ButtonFrame buttonFrame = new ButtonFrame();
        
        // Define a operação padrão ao fechar a janela (encerra o programa)
        buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Define o tamanho da janela (largura, altura)
        buttonFrame.setSize(275, 110);
        
        // Torna a janela visível
        buttonFrame.setVisible(true);
    }
}
