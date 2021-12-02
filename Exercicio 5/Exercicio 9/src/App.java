import java.lang.invoke.StringConcatFactory;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        /*9. Escreva um algoritmo que construa um menu de cadastro com as 
        opções abaixo.

            Escolha uma das opções ou 0 para sair:
            C) Cadastrar
            R) Buscar
            U) Alterar
            D) Excluir*/ 
        

        boolean isAtivo = true;
        while (isAtivo){
        String valor = JOptionPane.showInputDialog(
            null,
             "C) Cadastrar"+
             "\nR) Buscar" +
             "\nU) Alterar" +
             "\nD) Excluir").toUpperCase();
        switch (valor){



            case "C":
                JOptionPane.showMessageDialog(null,"Cadastrandoo....");
                break;
            case "R":
                JOptionPane.showMessageDialog(null,"Buscando....");
                break;
            case "U":
                JOptionPane.showMessageDialog(null, "Alterando..");
                break;
            case "D":
                JOptionPane.showMessageDialog(null, "Excluindo.....");
                break;
            default:
                String resposta = JOptionPane.showInputDialog(null,"Tem certeza que quer sair?[s/n]").toLowerCase();
                if (resposta.equals("n")){
                    isAtivo = false;
                    break;
                }
        
            
            }
        }
    }
}
