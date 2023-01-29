package HomeWork;
import java.util.Random;
// import java.util.Arrays;

public class hw1 {
    public static void main (String [] args) {
        Random rnd = new Random();
        int i = rnd.nextInt(2000); // случайное число

        String toBin = Integer.toBinaryString(i);
        int n = toBin.length() - 1; // номер старшего бита

        int shMin = Short.MIN_VALUE;
        int shMax = Short.MAX_VALUE;
        
        
        int temp1_i = i;
        while (temp1_i%n != 0) temp1_i++; // находим ближайшее кратное 
        int lengthAliquot = (shMax-temp1_i) / n + 1; // длина массива для кратных чисел
        int [] m1 = new int [lengthAliquot]; // массив для кратных чисел

        for (int j = 0; j < m1.length; j++) {
            m1[j] = temp1_i;
            temp1_i += n;
        }

        

        int lengthNoAliquot; //длинна массива для некратных чисел
        if (i%n == 0) {
            lengthNoAliquot = (shMin*(-1)) + i - (((shMin*(-1)) + i) / n);
        } else {
            int u = i;
            while (u%n != 0) u--;
            lengthNoAliquot = (shMin*(-1)) + i - (((shMin*(-1)) + u) / n) - 1;
        }

        int[] m2 = new int [lengthNoAliquot];
        int temp2_i = i-1; // так как последнее число диапазона не включается
        for (int j = 0; j < m2.length; j++){
            if(temp2_i%n == 0){
                temp2_i--;
            }
            m2[j] = temp2_i;
            temp2_i--;

        }

        
        
        System.out.println(i);
        System.out.println(toBin);
        System.out.println(n + "\n");
        System.out.println(shMax);
        System.out.println(shMin + "\n");
        System.out.println(m1[0]);
        System.out.println(m1[1]);
        System.out.println(m1[lengthAliquot-2]);
        System.out.println(m1[lengthAliquot-1] + "\n");
        System.out.println(m2[0]);
        System.out.println(m2[1]);
        System.out.println(m2[lengthNoAliquot-2]);
        System.out.println(m2[lengthNoAliquot-1]);
        // System.out.println(Arrays.toString(m2));
        // System.out.println(Arrays.toString(m1));
    }
}
