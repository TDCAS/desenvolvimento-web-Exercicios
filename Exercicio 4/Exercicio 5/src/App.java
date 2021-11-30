import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class App {
    public static void main(String[] args) throws Exception {
        /*5. Escreva um algoritmo que receba um percentual de 
        desconto e calcule esse 
        desconto sobre o preço do produto, apresentando o valor
        do desconto e o novo preço do produto.*/
        
 
        //Formatador de decimal
        DecimalFormat decimal = new DecimalFormat("0.00");
        
        
        //chamando minha porcentagem
        Calcular cali = new Calcular();

        /*converti o input de String para Int dado pelo JOptioPane e coloquei
        numa variavel chamanda porcentagem*/
        int valor = Integer.parseInt(JOptionPane.showInputDialog(
            null,"Quanto de desconto você dara ao cliente (So numeros)"));
        

        //Criei uma variavel para guardar minha porcentagem
        double porcentagem = cali.dividir(valor);


        //otra variavel para guardar o calculo
        double calculo = (porcentagem*150)-150;

        JOptionPane.showMessageDialog(
            null,"valor da compra: RS150.00"+ 
            "\nPorcentagem escolhida: "+valor+"%"+
            "\n\nValor com desconto: "+decimal.format(calculo)
            );


    }
}
