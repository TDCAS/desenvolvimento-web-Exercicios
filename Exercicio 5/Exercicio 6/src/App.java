import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {


        /*
            6. Escreva um algoritmo que receba 3 valores.
            Mostre os valores em ordem crescente*/ 

        //Criando a lista
        ArrayList list = new ArrayList<>();
        //criando a lista com 3 valores escolhidos pelo usuario
        list.add(Integer.parseInt(JOptionPane.showInputDialog("Primeiro valor")));
        list.add(Integer.parseInt(JOptionPane.showInputDialog("Segundo valor")));
        list.add(Integer.parseInt(JOptionPane.showInputDialog("Tegundo valor")));

        //mostrando a ordem conforme foi digitada
        JOptionPane.showMessageDialog(null,"ordem normal\n"+list);

        //Sort para organizar a lista
        Collections.sort(list);

        //Mostrando a lista na forma crescente
        JOptionPane.showMessageDialog(null,"Ordem crescente\n"+list);
    }
}
