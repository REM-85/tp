import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
//creo una clase para encontrar pares que sumen k
public class ParesSumaK {
    
    public static List<int[]> encontrarPares(int[] vector, int k) {
        HashSet<Integer> vistos = new HashSet<>();
        List<int[]> pares = new ArrayList<>();
        
        for (int num : vector) {
            int complemento = k - num;
            if (vistos.contains(complemento)) {
                pares.add(new int[]{complemento, num});
            }
            vistos.add(num);
        }
        
        return pares;
    }
    
    public static void main(String[] args) {
        int[] vector = {2, 7, 11, 15, -2, 9};
        int k = 9;
        
        List<int[]> pares = encontrarPares(vector, k);
        
        System.out.println("Pares que suman " + k + ":");
        for (int[] par : pares) {
            System.out.println("[" + par[0] + "," + par[1] + "]");
        }
    }
}