import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
    Scanner tcl = new Scanner(System.in);
    System.out.println("Digite o tamanho do seu vetor");
    int tamanho = tcl.nextInt();    
    long vetor[] = new long[tamanho];
    
        for (int i = 0; i < vetor.length; i++) {
           if (i < 2){
               vetor[i] = i;
           }else{
               vetor[i] = vetor[i - 1] + vetor[i - 2];
           }
            
        }
        
        System.out.println("Digite o número que deseja procurar");
        int num = tcl.nextInt();
        for (int j = 0; j < vetor.length; j++) {
            if(num == j) {
               System.out.println("O " + j +"° número da sequência é :"+vetor[j] ) ;
                
            }    
        }
    }
}
