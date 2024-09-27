import javax.swing.JOptionPane; // Importa a classe JOptionPane para exibir diálogos gráficos

public class Addition {
    public static void main(String[] args) {
        // Solicita o primeiro número ao usuário
        String firstNumber = JOptionPane.showInputDialog("Enter first integer");
        
        // Solicita o segundo número ao usuário
        String secondNumber = JOptionPane.showInputDialog("Enter second integer");

        try {
            // Converte os números de String para int
            int number1 = Integer.parseInt(firstNumber);
            int number2 = Integer.parseInt(secondNumber);

            // Soma os números
            int sum = number1 + number2;

            // Exibe o resultado em um diálogo
            JOptionPane.showMessageDialog(null, "The sum is " + sum, 
                "Sum of Two Integers", JOptionPane.PLAIN_MESSAGE);
        } catch (NumberFormatException e) {
            // Trata o erro caso a entrada não seja um número inteiro válido
            JOptionPane.showMessageDialog(null, "Please enter valid integers.", 
                "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}



