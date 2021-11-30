import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        
        int valor = 5 ,valor2 = 6,valor3 = 2;
        
        int calculo = (valor+valor2+valor3)/3;
        
        JOptionPane.showMessageDialog(
            null,"Primeiro nota; "+valor+
            "\nSegundo snota: "+valor2+
            "\nTerceira nota: "+valor3+
            "\n\nMedia final: "+calculo
            );
    }
}
