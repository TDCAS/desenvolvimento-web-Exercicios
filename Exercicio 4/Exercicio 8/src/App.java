import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        /*8. Considerando que, para um consórcio, sabe-se o número total de prestações,
         a quantidade de prestações pagas e o valor da prestação (fixa),
          escreva um algoritmo que mostre o saldo devedor do cliente.*/
        //carta de ben  requisitado
        DecimalFormat deci = new DecimalFormat("0.000");
        double ben = 52.200;
        //Taxa de administração + 20% do valor do ben 
        double taxaDeAdimis = 10.440;
        double totalpagar = ben+taxaDeAdimis;
        int prestaçoes = 60,qPPagas = 27;
        double vPrestacao =  1.044;

        double calculo = -((60-27)*1.044)+totalpagar;

        JOptionPane.showMessageDialog(
            null,"   Consorcio"+
            "\nValor do ben:  R$"+deci.format(ben)+
            "\nTaxa de administração(20%): R$"+deci.format(taxaDeAdimis)+
            "\n   Valor final: R$"+deci.format(totalpagar)+
            "\nQuantidade das pretações: "+prestaçoes+
            "\nValor da prestação: R$"+deci.format(vPrestacao)+
            "\nQuantidade ja pagas: "+qPPagas+
            "\nValor das Quantidade ja pagas: R$37.560"+
            "\nValor das pretaçoes retantes: R$"+deci.format(calculo));
        
    }
}
