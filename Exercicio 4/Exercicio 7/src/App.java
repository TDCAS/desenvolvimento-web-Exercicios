import java.util.ArrayList;
import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
         /*7. Uma sorveteria vende três tipos de picolés: os de Frutas 
         custam R$2,50, os Cremosos custam R$ 3,50 e os Recheados custam R$4,50. 
         Escreva um algoritmo que receba a quantidade
         de picolés vendida de cada tipo e mostre quanto a sorveteria faturou por cada tipo de picolé e no total de vendas.*/
        /*ArrayList list = new ArrayList<>();
        for (int valores = 0;valores!=4; valores++){ 
            list.add(valore = Integer.parseInt(JOptionPane.showInputDialog(null,"escreva um valor"))); 

        }
        System.out.println("Hello, World!"+list);*/

        double Cremosos = 3.50,recheados = 4.50,frutas = 2.50;
        int qcremosos = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantos picoles CREMOSOS foram vendidos"));
        int qfrutas = Integer.parseInt(JOptionPane.showInputDialog(null,"Qunatos picoles de FRUTAS foram vendidos"));
        int qrecheados = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantos picoles de RECHEADOS foram vendidos"));

        double faturacaoFinal = (qcremosos * Cremosos)+(qfrutas *frutas)+(qrecheados*recheados);

        JOptionPane.showMessageDialog(
            null,"     Valores dos picoles"+
            "\nCremosos: "+Cremosos+
            "\nFrutas: "+frutas+
            "\nRechaados: "+recheados+
            "\n    Quantidade vendida "+
            "\nCremosos: "+qcremosos+
            "\nFrutas: "+qfrutas+
            "\nRecheados: "+qrecheados+
            "\n  Valor Total: "+faturacaoFinal);

    }
}
