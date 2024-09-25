// A linha abaixo esta importando o camponente JFrame do módulo swing da biblioteca pacote javax
import javax.swing.JFrame;
// A linha abaixo esta declarando a classe textFieldTeste que tem o mesmo nome do arquivo
public class TextFieldTest
// A linha abaixo esta iniciando o bloco de código da classe TextFieldTest
{
   // A linha abaixo esta declarando o método main (principal, conhecido como método executor) 
   public static void main(String[] args)
   // A linha abaixo inicia o bloco de código do método
   { 
      // A linha abaixo temos a declaração da variável textfieldFrame = atribui a ela um novo objeto siginifica que estamos trazendo p cá o construtor deste objeto TextFieldFrame
      TextFieldFrame textFieldFrame = new TextFieldFrame(); 
      // A linha abaixo esta definando a operação de fechamento padrão
      textFieldFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      // A linha abaixo esta setando o tamanho
      textFieldFrame.setSize(350, 100); 
      // A linha abaixo esta informado que vai definir a visibilidade
      textFieldFrame.setVisible(true); 
      // A linha abaixo fecha o bloco de código do método
   } 
   // A linha abaixo final o bloco de código da classe TextFieldTest
} 

