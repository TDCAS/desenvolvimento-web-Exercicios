import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        /*2. Escreva um algoritmo que receba 2 valores.
            Verifique:
            qual o maior valor
            ou se são iguais*/
        
        int valor = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o primeiro"));
        int valor2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o segundo"));

        if (valor == valor2) {
            JOptionPane.showMessageDialog(
                null,"Os dois valores são iguais"+
                "\nPrimeiro valor: "+valor+
                "\nSegundo valor"+valor2
                );

        } else if (valor > valor2) {
            JOptionPane.showMessageDialog(
                null,"O Primeiro valor é o Maior"+
                "\nPrimeiro valor: " + valor+
                "\nSegundo valor: "+ valor2
                );
        } else {
            JOptionPane.showMessageDialog(
                null,"O Segundo  valor é o Maior"+
                "\nPrimeiro valor: " + valor+
                "\nSegundo valor: "+ valor2
                );
        }
        
        

    }
}
