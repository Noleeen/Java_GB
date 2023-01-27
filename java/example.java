import java.net.SocketPermission;
import java.util.Arrays;

public class example {
    public static void main (String[] args) {
        int i = 54;
        int n = 9;
        int shMin = -60;
        
        int lengthNoAliguot;
        if (i%n == 0) {
            lengthNoAliguot = (shMin*(-1)) + i - (((shMin*(-1)) + i) / n);
        } else {
            int u = i;
            while (u%n != 0) u--;
            lengthNoAliguot = (shMin*(-1)) + i - (((shMin*(-1)) + u) / n) - 1;
        }
        int[] m2 = new int [lengthNoAliguot];
        i--; // так как последнее число диапазона не включается
        for (int j = 0; j < m2.length; j++){
            if(i%n == 0){
                i--;
            }
            m2[j] = i;
            i--;

        }

        System.out.println(Arrays.toString(m2));
    }
}
