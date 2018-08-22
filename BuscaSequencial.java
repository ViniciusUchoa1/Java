package buscasequencial; 
import java.util.Scanner;
import java.util.Random;

    public class BuscaSequencial {
        public static void main (String []args){
            Scanner tcl = new Scanner(System.in);
            Random sequencia = new Random();

            int v[] = new int[15];
            boolean win = false;
            for (int i = 0; i < 15; i++){
                v[i] = sequencia.nextInt(35);
            }

            System.out.println("Digite um valor");
            int valor = tcl.nextInt();
            for (int i = 0; i < 15; i++){
                if (valor == v[i]){
                    System.out.println("Valor sorteado");
                    win = true;
                    break;
                }
            }
            if (win == false){
                System.out.println("Número errado");
            }                           
        }    
    }