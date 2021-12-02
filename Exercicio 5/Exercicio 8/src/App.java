import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        /*8. Escreva um algoritmo que leia 3 valores representando os 
        3 lados de um triângulo. Mostre o tipo do triângulo.

        - Equilátero: 3 lados iguais
        - Isósceles: 2 lados iguais
        - Escaleno: 3 lados diferentes

        */ 

        double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o Primeiro valor"));
        double valor2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o Segundo valor"));
        double valor3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o Terceiro valor"));

        if (valor ==valor2 && valor2 == valor3) {
            JOptionPane.showMessageDialog(null, "Os lados que você informou é: Triangulo Equilatero");

        }  else if(valor !=valor2 && valor ==valor3){
            JOptionPane.showMessageDialog(null, "Os lados que você informou é: Triangulo Isósceles");

        }  else  {
            JOptionPane.showMessageDialog(null, "Os lados que você informou é: Triangulo Escaleno");
            
        }

        
        
    }
}
