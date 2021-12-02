import javax.swing.JOptionPane;

public class App {
    
    
    public static void main(String[] args) throws Exception {
        //1. Escreva um algoritmo que receba um valor.
        //Mostre se o valor informado é:
        //Par, Ímpar ou Zero

        int valor = Integer.parseInt(JOptionPane.showInputDialog(null,"escreva um valor"));

        if (valor == 0) {
            
            JOptionPane.showMessageDialog(null,"Seu valor = "+valor+"\n valor é 0");
            
        } else if (valor % 2 ==1) {
            JOptionPane.showMessageDialog(null,"Seu valor = "+valor+"\n valor é impar");

        } else {
            JOptionPane.showMessageDialog(null,"Seu valor = "+valor+"\n valor é par");
        }
    }
}
