// A linha abaixo tem varios importes que seguem o mesmo padrão
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
// A linha abaixo esta declarando a clara TextFieldFrame que esta herdando o componente JFrame
public class TextFieldFrame extends JFrame 
// A linha abaixo inicio do bloco da classe TextFieldFrama
{
   // A 4 linhas abaixo são delcaração de variável
   private final JTextField textField1; 
   private final JTextField textField2; 
   private final JTextField textField3; 
   private final JPasswordField passwordField; 
// A linha abaixo é o construtor, utilizando o public que é o exportador
   public TextFieldFrame()
   // A linha abaixo inicio do bloco de códigos do construtor TextfieldFrame
   {
      // A linha abaixo, super é a definição do titulo da janela
      super("Testing JTextField and JPasswordField");
      // A linha abaixo é o desing das camadas, o que for reinderizado primeiro ja mostra na tela
      setLayout(new FlowLayout());
// A linha abaixo vai receber uma atribuição, definindo a largura das colunas (10)
      textField1 = new JTextField(10); 
      // A linha abaixo esta adicionando o texfiel na reinderização do quadro
      add(textField1); 
// A linha abaixo esta sendo atribuido um novo jtextfield com a adição de texto
      textField2 = new JTextField("Enter text here");
      add(textField2); 
// A linha abaixo esta adicionando um texto e qtde especifica de colunas
      textField3 = new JTextField("Uneditable text field", 21);
      // A linha abaixo não deixa editar o texto
      textField3.setEditable(false); 
      add(textField3); 
// A linha abaixo esta atribuindo um novo objeto e enviado um text e não é ppossivel ver, por isso é um jpasswordfield
      passwordField = new JPasswordField("Hidden text");
      add(passwordField); 
// Handler é um manipulador dos campos textfiel
      TextFieldHandler handler = new TextFieldHandler();
      // todos os textfield serão adicionado um escutador de ação
      textField1.addActionListener(handler);
      textField2.addActionListener(handler);
      textField3.addActionListener(handler);
      passwordField.addActionListener(handler); //handler tem q ser um objeto
      // A linha abaixo é o final do bloco de códigos do construtor TextFieldFrame
   } 
// A linha abaixo é privativo de uso da classe principal como se fosse um new ActionLIster, por isso que é implements, esta sendo injetado como objeto
   private class TextFieldHandler implements ActionListener 
   {
      // A linha abaixo ira subscrever, utiliza o @antes para nao exibir notificação de aviso, ira subcrever o método da linha abaixo
      @Override
      // void siginifica que nao tem retorno, as ações q vão acontecer sera enviado para executar no bloco de cósigo, e para receber as informações precisa o parâmetro actionevent
      public void actionPerformed(ActionEvent event)
      {
         // A linha abaixo o nome da variável, esta atribuindo um texto vazio
         String string = ""; 
         // O if é um algoritimo de validação, permite validar as ações q tiverem após a linha dele, comparando ao excel é a formula se de comparação.
         // Quando tem 2 sinais de = é um operador de comparação, comparando o lado esquerdo com o direito, se retornar vrdadeira a comparação será executado
         if (event.getSource() == textField1)
         // o s depois da % siginifica que vai retornar um texto
            string = String.format("textField1: %s",
               event.getActionCommand()); //sifinifica pegar o comando da ação
         // o if executa somente 1 linha por isso as repetições abaixo
         else if (event.getSource() == textField2)
            string = String.format("textField2: %s",
               event.getActionCommand());
         
         else if (event.getSource() == textField3)
            string = String.format("textField3: %s", 
               event.getActionCommand());
         
         else if (event.getSource() == passwordField)
            string = String.format("passwordField: %s", 
               event.getActionCommand());
               // A linha abaixo espa envocando o JoptionPane
         JOptionPane.showMessageDialog(null, string); 
      } 
   } 
} 

