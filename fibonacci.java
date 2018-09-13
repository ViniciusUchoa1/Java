import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in); 
         int num1 = 1, num2 = 1;
         System.out.println("Digite o tamanho do vetor; ");
         int a = tcl.nextInt();
         int vetor [] = new int[a];
        
        System.out.println(num2);
        System.out.println(num1);
        
        for(int i = 1; i < vetor.length; i++){
            num1 = num1 + num2;
            num2 = num1 - num2;
            System.out.println(num1);
        }
    }
}
