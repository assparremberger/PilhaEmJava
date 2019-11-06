package pilhaemjava;

import javax.swing.JOptionPane;

/**
 *
 * @author adaltoss
 */
public class PilhaEmJava {

    public static void main(String[] args) {
        int opcao = -1;
        int tamanho = Integer.valueOf(
                JOptionPane.showInputDialog("Qual tamanho da pilha?")
        );
        Pilha pilha = new Pilha( tamanho );
        
        while ( opcao != 0 ) {       
            String menu =   "1 - Adicionar na pilha \n" + 
                            "2 - Retirar da pilha \n" +
                            "3 - Imprimir pilha \n"+
                            "0 - Sair";
            opcao = Integer.valueOf( JOptionPane.showInputDialog( menu ) );
            switch( opcao ){
                case 1:
                    int valor = Integer.valueOf( JOptionPane.showInputDialog( "Digite o valor:") );
                    pilha.adicionar(valor);
                    break;
                case 2:
                    pilha.retirar();
                    break;
                case 3: 
                    pilha.imprimir();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
        
    }
    
}
