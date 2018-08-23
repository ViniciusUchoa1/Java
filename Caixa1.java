package caixa1;
import java.util.Scanner;

public class Caixa1 {

    public static void main(String[] args) {

        Scanner tcl = new Scanner (System.in);
        int saldo = 0;
        boolean continuar = true;
       
        System.out.println("Caixa Eletrônico");
      
        while(continuar == true){
           
           System.out.println("1 Sacar");
           System.out.println("2 Depositar");
           System.out.println("3 Ver saldo");
           System.out.println("0 Sair");
           System.out.println("");
           
           int casos = tcl.nextInt();
            
            switch (casos){
                case 1 : 
                    System.out.println("Digite o valor de saque " );
                    saldo-= tcl.nextInt();
                    break;
                case 2 : 
                    System.out.println("Digite o valor de depósito " );
                    saldo+= tcl.nextInt();
                    break;
                case 3 : 
                    System.out.println("Seu saldo é "+ saldo);
                    break;                    
                case 0 : 
                    continuar = false;
                    System.out.println("Agradecemos por usar o nosso serviço");
                    break;
                default:
                    System.out.println("Digite uma opção válida");
                    break;    
            } 
        }  
    }
}
  
