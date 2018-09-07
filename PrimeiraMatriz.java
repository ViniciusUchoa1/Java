package primeiramatriz;

public class PrimeiraMatriz {

    public static void main(String[] args) {
        int matriz[][] = new int[3][3];
        int aux = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[j][i] = aux;
                aux++;
            }
        }
        for (int c = 0; c < matriz.length; c++) {
            for (int l = 0; l < matriz.length; l++) {
                System.out.print(matriz[l][c]+"   ");    
            }        
            System.out.println("");
        }        
    }
}
   
