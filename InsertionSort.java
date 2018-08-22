package insertionsort;

public class InsertionSort {

    public static void main(String[] args) {
           
        int v[] = {2,4,6,78,20,3,5};
        int aux, j;
        
        for (int i = 0; i < v.length; i++) {
            aux = v[i];
            j = i-1;
            while ((j >= 0) && v[j] > aux) {
                v[j + 1] = v[j];
                j = j - 1;
            }    
            v[j + 1] = aux;
        }
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i]+" ");            
        }
    }
}
