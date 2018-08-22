package bubblesort;

public class BubbleSort {

    public static void main(String[] args){    
        
        int v[] = {5,2,6,78,4,3,7};
        int aux;
        
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length - 1; j++) {
                if (v[j] > v[j+1]){
                    aux = v[j];
                    v[j] = v[j+1];    
                    v[j+1] = aux;
                }
            }
        }
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i]+" ");            
        }  
    }
}
