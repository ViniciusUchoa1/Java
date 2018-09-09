package buscasequencialmatriz;
import java.util.Scanner;
import java.util.Random;

public class BuscaSequencialMatriz {

    public static void main(String[] args) {
        Random aleatorios = new Random();
        Scanner tcl = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        boolean win = false;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[j][i] = aleatorios.nextInt(10); 
            }
        }

        System.out.println("Digite o um valor de 1 a 10");
        int valor = tcl.nextInt();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (valor == matriz[i][j]){
                    System.out.println("valor encontrado na coluna "+j+" linha "+i);
                    win = true;
                }
            }   
        }       
        if (win == false){
            System.out.println("Valor não encontrado");
        }
    }
    
}
