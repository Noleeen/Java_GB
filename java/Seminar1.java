import java.util.Arrays;
import java.util.Random;

public class Seminar1 {
    public static void main (String [] args) {

        int [] array = new int [7];
        array[2] = 23;
        Random rd = new Random();
        for(int i = 0; i < array.length; i++) {
            //  array[i] = (int) (Math.random() * 100);
            array[i] = rd.nextInt(500);
        }    
        System.out.println(Arrays.toString(array));
        
        System.out.println("may be the end is the new way");
        
        String s = "Кофе, дерево!";
        String[] g = s.split(" ");
        for( int i = 0; i < g.length; i++) {
            if (g[i].contains(",") | g[i].contains(".") | g[i].contains("!")) {
                g[i] = g[i].substring(0, g[i].length()-1);
                  
            }
        }
        
        System.out.println(Arrays.toString(g));
        System.out.println(g[1]);

    }
     
 
}