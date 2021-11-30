import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        /*6. Escreva um algoritmo que receba 2 valores e inverta os valores informados 
        valor1 passa a ter o conteúdo de valor2 e valor2 passa a ter o conteúdo de valor1.*/
        
        //Crianção de variavel
        int valor = Integer.parseInt(JOptionPane.showInputDialog(null,"Primeiro valor"));
        int valor2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Segundo valo2"));
        //Criei um terceira para nao perder o primeiro valor
        int valor3 = valor;

        

        
        //Painel print
        JOptionPane.showMessageDialog(
            null,
            "  * Primeiro valor: "+valor+
            "\n * Segundo valor: "+ valor2+
            "\n\n      invertido"+
            "\n  * Primeiro valor: " + (valor= valor2)+
            "\n * Segundo valor: "+(valor2=valor3)

            );
    
    }
}
