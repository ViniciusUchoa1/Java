package interfacedepreços;
import java.util.Scanner;

public class PrecosDosProdutos {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String matriz[][] = new String[2][3];
        boolean controle = true;
        
        matriz[0][0] = "12";  
        matriz[0][1] = "Cola";  
        matriz[0][2] = "R$: 5,00";  
        
        matriz[1][0] = "13";
        matriz[1][1] = "Caneta";  
        matriz[1][2] = "R$: 0.80";  
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Digite o codigo");
                String codigo = tcl.next();
                    
                if (matriz[i][0].equals(codigo)){
                    System.out.println("O seu produto é " + matriz[i][1]+ " e o seu preço é " + matriz[i][2]);
                        
                }else{
                    System.out.println("O produto não se encontra na lista");
                }
            }
        }
    }
}
