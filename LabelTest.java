
// A linha abaixo importará o componente JFrame do módulo swing da biblioteca (pacote_ javax)
import javax.swing.JFrame;

// A linha abaixo está declarando a classe LabelTest
public class LabelTest 
// A linha abaixo esta iniciando o bloco de código da classe LabelTest
{
   //A linha abaixo esta declarando o metodo main
   public static void main(String[] args)
   { 
      // A linha abaixo esta declarando a variavél LabelFrame, está variável é do tipo LabelFrame, toda vez que tem o new você esta declarando um novo objeto. (;)encerra a linha de código
      LabelFrame labelFrame = new LabelFrame(); 

      // Do (.) está envocando o método (set = definir | Defaul= Padrão | Close = Fechamento | Operation = Operação | Definando a operação de fechamento Padrão) 
      // Dentro dos () tem os parâmetros Exit_on_close que é sair ao fechar
      labelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      // A linha abaixo esta setando o tamanho altura e largura, unidade de medida pixel
      labelFrame.setSize(260, 180); 
      // A linha abaixo esta setando a visibilidade | True = Verdadeiro 
      labelFrame.setVisible(true); 
      // A linha abaixo encerrra o bloco de códigos do método
   } 
   // A linha abaixo encerrra o bloco de códigos da classe LabelTest
} 



