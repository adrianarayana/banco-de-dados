import java.awt.FlowLayout; // Importando o componente de um módulo de uma biblioteca pacote, cada componente faz parte do seu respectivo módulo e pacote de biblioteca.
import javax.swing.JFrame; 
import javax.swing.JLabel;
import javax.swing.SwingConstants; 
import javax.swing.Icon; 
import javax.swing.ImageIcon; 

// A linha abaixo esta declarando a classe LabelFrame e tem que ter o mesmo nome do arquivo | extends esta herdando o componente JFrame
public class LabelFrame extends JFrame 
// A linha abaixo está iniciando o bloco de códigos da classe LabelFrame
{
   // A 3 linhas abaixo está são delarações de variáveis | Private = Privado, só quem esta dentro do bloco de códigos pode utilizar | private não exporta a variável
   // final serve para declarar uma variável somente leitura | JLabel é o tipo da variável | label1 é o nome da variável
   private final JLabel label1;
   private final JLabel label2; 
   private final JLabel label3; 
  // Tem que ser reflixel e variável, não pode ser private e protegido, esta variável tem que ser pública, tem a função de construtor oferecendo informações
  // Basta a  pulbic tem que ter o mesmo nome da classe que tem o mesm nome do arquivo
   public LabelFrame()
   // inicio do bloco de códigos do construtor
   {
      // O super é um método de interface, siginifica que estamos definando o título da janela
      // O texto é enviado dentro de aspas duplas, sendo padrão.
      super("Testing JLabel");
      // A linha abaixo vai definir o desenho do quadro, como  vai ficar a saída das camadas | Dentro do () esta enviando um novo layout 
      setLayout(new FlowLayout()); 
// O label1 esta recebendo um novo objeto JLabel, enviando de parametro dentro do parenteses entre aspas duplas é um texto
           label1 = new JLabel("Label with text");
           //setToolTipText está definando um texto de dica, enviando um texto como parâmetro quando colocar o mouse em cima do elemento vai aparecer o texto
      label1.setToolTipText("This is label1");
      //add é adicionar, neste cenário está adicionando o label1 definido acima, tem a funcionalidade de monstrar no layout
      add(label1); 
     // Declarando uma variável bug do tipo icon que esta recebendo (=) um novo ojeto do tipo imageIcon, esta  sendo enviado a ele um parametro com método que coleta a clase da LabIframe
     // (getlass = enviar a classe)
      Icon bug = new ImageIcon(getClass().getResource("bug1.png"));
      // Label 2 esta recendo (=) um novo objeto do tipo JLabel e enviando também outro parâmetro, a virgula dentro de declaração de paramétros serve como separador de parâmetros.
      label2 = new JLabel("Label with text and icon", bug, 
      //a linha abaixo é para definir o alinhamento do paramêtro anterior neste caso o bug | LEFT alinhando a esquerda
         SwingConstants.LEFT);
      //setToolTipText está definando um texto de dica, enviando um texto como parâmetro quando colocar o mouse em cima do elemento vai aparecer o texto
      label2.setToolTipText("This is label2");
         //add é adicionar, neste cenário está adicionando o label2 definido acima, tem a funcionalidade de monstrar no layout
      add(label2); 
// O label1 esta recebendo um novo objeto JLabel, porém nao tem texto, porque ele esta sendod atribuido depois de ser atribuido o objeto
      label3 = new JLabel(); 
      //sextext definindo o texto que estaria na linha acima entre os ()
      label3.setText("Label with icon and text at bottom");
      //Enviado o bug
      label3.setIcon(bug); 
      label3.setHorizontalTextPosition(SwingConstants.CENTER); //Definando a posição horizontal do texto = Centralizado
      label3.setVerticalTextPosition(SwingConstants.BOTTOM); //Definando a posição vertical do texto que é abaixo
      //Texto de dica
      label3.setToolTipText("This is label3");
               //add é adicionar, neste cenário está adicionando o label2 definido acima, tem a funcionalidade de monstrar no layout
      add(label3);
         // finalizando o bloco de códigos do construtor
   } 
   // A linha abaixo está finalizando o bloco de códigos da classe LabelFrame
} 
