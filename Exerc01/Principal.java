package view;

import javax.swing.*;
/**
 *
 * @author arthur.purcino
 */
public class Principal {
    public static void main(String[] args) {
        Controller vetCont = new Controller();
        
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do seu vetor"));
        int[] vetorTeste = vetCont.geraVetor(n);
        
        vetCont.percorreVetor(vetorTeste);
    }
}
