package buscabinaria;
import java.util.Random;
import java.util.Scanner;

public class BuscaBinaria {

    public static void main(String[] args) {
        Scanner tcl =  new  Scanner( System.in );
        Random aleatorios = new Random();
        
        System.out.println ( "Tamanho do vetor: " );
        int tamanho = tcl.nextInt();
        int vetor[] = new int [tamanho];
        
            
        for ( int i =  0 ; i < vetor.length; i ++ ) {
            vetor [i] = aleatorios.nextInt (tamanho);

        }
        int min = vetor [ 0 ];
        int max = vetor.length;
        int meio = (min + max) /  2 ;

        System.out.println ( "Valor para procurar: " );
        int valor = tcl . nextInt ();

        if (valor < meio) {
            for ( int i =  0 ; i < vetor.length; i ++ ) {
                if (valor == vetor [i]) {
                    System.out.println ( " O valor se encontra em: "  + i);
                }
            }
        } else  if (valor > meio) {
            for ( int i =  0 ; i < vetor.length; i ++ ) {
                if (valor == vetor [i]) {
                    System.out.println ( " O se encontra em: "  + i);
                }
            }
        } else  if (valor == meio) {
            System.out.println ( " O valor se encontra em: "  + meio);
        }
    }
}
 
