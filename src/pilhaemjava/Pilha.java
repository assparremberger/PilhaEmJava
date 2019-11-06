package pilhaemjava;

import javax.swing.JOptionPane;

/**
 *
 * @author adaltoss
 */
public class Pilha {
    
    // Vetor para armazenar os valores empilhados
    private int[] array;
    
    // Atributo que guarda a posição no array onde estó o topo da pilha
    private int topo;
    
    // Atributo para guardar o tamanho do array
    private int tamanho;
    
    public Pilha(int tamanho){
        // Inicialização do array com o tamanho recebido por parâmetro
        array = new int[tamanho];
        
        // Como o Zero é uma posição válida no array, então colocamos um valor
        // não válido para sinalizar que a pilha está vazia
        topo = -1;
        
        this.tamanho = tamanho;
    }
    
    public void adicionar(int valor){
        if( topo == tamanho - 1){
            JOptionPane.showMessageDialog(null, "Valor não adicionado, pois a pilha está cheia");
        }else{
            topo ++;
            array[topo] = valor;
            imprimir();
        }
    }
    
    public void retirar(){
        if( topo == -1 ){
            JOptionPane.showMessageDialog(null, "A pilha já está vazia");
        }else{
            topo --;
            imprimir();
        }
    }
    
    public void imprimir(){
        if( topo == -1 ){
            JOptionPane.showMessageDialog(null, "A pilha está vazia");
        }else{
            String texto = "";
            for(int i = topo; i>=0; i--){
                texto += array[i] + "\n";
            }
            JOptionPane.showMessageDialog(null, texto);
        }
    }
    
}
