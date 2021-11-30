import javax.swing.JOptionPane;

public class Calculadora {
    public static void main(String[] args) throws Exception {
        //4. Escreva um algoritmo que calcule o desconto de 10% sobre o preço de um produto. Apresente o novo preço na tela.

        //Calculo de Desconto RS150-(RS150(10/150))
        double Valor = 150;
        
        double  calculo = Valor-(0.05*150);
        //Mostrar 
        JOptionPane.showMessageDialog(
            null,"Valor: "+Valor+
            "\nCom 10% de desconto: "+ calculo);
    }
}
