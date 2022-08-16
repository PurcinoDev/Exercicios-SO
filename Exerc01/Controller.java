package view;
/**
 *
 * @author arthur.purcino
 */
public class Controller {

    public Controller() {
        super();
    }
    
    public int[] geraVetor(int n) {
        int[] vet = new int[n];
        for (int i = 0; i < n; i++) {
            vet[i] = 0;
        }
        return vet;
    }

    public void percorreVetor(int[] vetorTeste) {        
        double tempoInicial = System.nanoTime();
        for (int zero : vetorTeste) {
            System.out.println(zero);
        }
        double tempoFinal = System.nanoTime();
        double tempoTotal = tempoFinal - tempoInicial;
        tempoTotal = tempoTotal / Math.pow(10, 9);
        System.out.println("Tempo de processo ==> " + tempoTotal + "s.");
    }
}
