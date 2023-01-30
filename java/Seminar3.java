import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Seminar3 {
    public static void main (String[] args) {
        // int a = 0;
        // ArrayList list = new ArrayList();

        // list.add(12);
        // list.add("sdf");
        // list.add(43);

        // System.out.println(list);
        // System.out.println(list.get(1));
        
        // if (list.get(0) instanceof Integer) {
        //     a = (int) list.get(0);
        // }
        // System.out.println(a);

        // ArrayList<String> list = new ArrayList<>();
        // list.add("123");
        // list.add("That");
        // list.add("my voice");
        
        // list.add(2, "rrrr");

        // int a = list.size();

        // System.out.println(a);
        // System.out.println(list);
        // System.out.println(list.get(2));

        // for (int i = 0; i< list.size(); i++) {
        //     System.out.println(list.get(i));
        // }

        // for (String str : list) { //только показывает элементы, изменять не может
        //     System.out.println(str);
        // }

        // Iterator<String> it = list.iterator();
        // while (it.hasNext()) {
        //     String str = it.next();
        //     System.out.println(str);
        //     // it.remove(); // удаляет элемент
        // }

        // list.forEach((j) -> System.out.println(j) );

        ArrayList <String> l1 = new ArrayList<>();
        ArrayList <String> tempList = new ArrayList<>();
        ArrayList <Integer> l2 = new ArrayList<>();

        l1.add("good luck");
        l1.add("cool");
        l1.add("i like my live");
        l1.add("purple");
        l1.add("and");
        
        Random rnd = new Random();
        
        for (int i = 0; i < l1.size(); i++) {
            l2.add(rnd.nextInt(14));
        }
        
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l2.get(1));
        
        for (int i = 0; i < 5; i++) {
            int a = l1.get(i).length();
            int b = l2.get(i);
            if (a < b) {
                tempList.add(l1.get(i));
            }
            
        }
        l1.removeAll(tempList);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(tempList);

    }
    
}
