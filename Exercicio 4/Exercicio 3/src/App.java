import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        //Saber a area de um quadrado


        //Criando variaveis 
        double altura = 5;
        double base =  6;
        double areaDoQuadrado = altura * base;
        //tela que fala sobre as variaveis(alturra,base e calculo)
        //Motrando na tela elas e a resposta 
        JOptionPane.showMessageDialog(null,"Altura: "+ altura+"\nBase: "+base+"\n\n Area do Quadrado: "+ areaDoQuadrado);
        //INPUT 
        //JOptionPane.showInputDialog();
    }
}
