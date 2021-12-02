import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        /*10. Escreva um algoritmo que determine o preço com desconto para entradas de cinema.
         Mostre a categoria, o desconto e o valor final. Desconto não cumulativo.

        - Ingresso R$ 25,00.
        - Estudantes recebem 50% de desconto.
        - Aposentados recebem 30% de desconto.
        - Demais clientes pagam o ingresso completo.
        - Nas quartas, todos recebem 50% de desconto.

        */
        boolean isAtivo = true;
         while (isAtivo) {
            String valor = JOptionPane.showInputDialog(
                null, "CARTAZ DO CINEMA\n"+
                "                           Ingresso R$ 25.00.\n"+
                "   Nas quartas, todos recebem 50% de desconto\n\n."+
                "E) Estudantes Recebem 50% de desconto.\n"+
                "A) Aposentados recebem 20% de desconto.\n"+
                "C) Demais clientes pagam o ingresso completo.\n"+
                "S) Sair").toUpperCase();
            
            switch (valor) {
                case "E":
                    JOptionPane.showMessageDialog(null, "Ola estudante\n\nSeu Igresso será: R$12.50");
                    break;
                case "A":
                    JOptionPane.showMessageDialog(null,"Ola\n\nVoçê Escolheu o 'aposentado'\nEntão seu ingresso será: R$20.00");
                    break;
                case "C":
                    JOptionPane.showMessageDialog(null,"Ola Cliente seja Bem Vindo\n\nSeu ingresso será: R$25.00");
                    break;
                case "S":
                    isAtivo = false;
                    break;
                }
         }
        
    }
}
