import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
       /* 5. Escreva um algoritmo que receba 3 valores.
        Verifique:
        qual o maior valor
        qual o valor do meio
        qual o menor valor
        ou se são iguais */
        ArrayList list = new ArrayList<>();
        
        list.add(Integer.parseInt(JOptionPane.showInputDialog(null,"Primeiro valor")));
        list.add(Integer.parseInt(JOptionPane.showInputDialog(null,"Segundo valor")));
        list.add(Integer.parseInt(JOptionPane.showInputDialog(null,"Terceiro valor")));
    
        Collections.sort(list);

        if (list.get(0) ==list.get(1) && list.get(1) ==list.get(2)) {
            JOptionPane.showMessageDialog(null,"Todos os tres valores sao iguais\n      Valores"+list);

        } else {
            JOptionPane.showMessageDialog(
                null, "O Maior valor é : " +list.get(2)+
                "\nO valor do Meio é:  "+list.get(1)+
                "\nO Menor valor é: " + list.get(0));
        }
            
    }
}
