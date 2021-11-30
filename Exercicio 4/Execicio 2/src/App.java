import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        boolean iniciar = true;
        while (iniciar){
            Calcular calcular =  new Calcular();
            //variaveis ja prontas
            int valor =  1 ,valor2 = 5,valor3 = 6,valor4 = -2; 
            //calclo com variavel
            int produto = calcular.multi(valor, valor2);
            int produto2 = calcular.multi(valor3, valor4);

            //Tela chamando funcoes e variaveis
            JOptionPane.showMessageDialog(null,"Primeiro valor: "+valor +"\nSegundo valor: "+valor2+
            "\nTerceiro valor: "+valor3+"\nQuarto valor: "+ valor4+
            "\n\nProduto dos dois primeiro "+produto+
            "\nProduto dos dois ultimos: "+produto2+
            "\nSoma dos dois produtos: "+calcular.somar(produto, produto2));

            
        }
        
    
    }
}

