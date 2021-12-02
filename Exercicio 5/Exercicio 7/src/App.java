import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        /*7. Tendo como entrada a altura e o sexo (F: feminino ou M: masculino) de uma pessoa,
         escreva um algoritmo que calcule e imprima seu peso ideal,
         utilizando as seguintes fórmulas:*/ 

         /*- Mulheres: (62.1 * altura) - 44.7
            - Homens: (72.7 * altura) - 58*/ 
        DecimalFormat forma = new DecimalFormat("0.00");
         
        String  sexo = JOptionPane.showInputDialog("Informe o sexo \n[Masculino/feminino]").toUpperCase();
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura"));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso"));
        double imc = peso/(altura*altura);
        if (imc > 24.9) {
            JOptionPane.showMessageDialog(null, "VocÊ digitou\n"+
            "Sexo: "+sexo+
            "Altura: "+forma.format(altura)+
            "Peso: "+peso+
            "\n\nImc: "+forma.format(imc)+
            "\nVoce esta: acima do peso");
            
        } else if (imc >= 18.5 && imc <=24.0) {
            JOptionPane.showMessageDialog(null, "VocÊ digitou\n"+
            "Sexo: "+sexo+
            "\nAltura: "+forma.format(altura)+
            "\nPeso: "+peso+
            "\n\nImc: "+forma.format(imc)+
            "\nVoce esta: Peso normal");
        } else {
            JOptionPane.showMessageDialog(null, "VocÊ digitou\n"+
            "Sexo: "+sexo+
            "\nAltura: "+forma.format(altura)+
            "\nPeso: "+peso+
            "\n\nImc: "+forma.format(imc)+
            "\nVoce esta: Abaixo do peso");
        }
    }
}
