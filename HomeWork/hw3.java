package HomeWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class hw3 {
    public static void main(String [] args){
        ArrayList <String> myL = new ArrayList <> ();
        myL.add("story");
        myL.add("live");
        myL.add("knowlege");
        myL.add("77i77");
        myL.add("way");
        myL.add("my");

        // выводим в терминал
        for (String st : myL) {
            System.out.print(" " + st);
        }
        System.out.println();

        // добавляем ! ко всем элементам списка
        for (int i = 0; i < myL.size(); i++) {
            myL.set(i, myL.get(i) + "!");
        }
        System.out.println(myL);
        
        myL.add(0, "first"); // добавляем эл-т в начало списка
        System.out.println(myL.get(0)); //выводим элемент по индексу
        System.out.println(myL.set(3, "is")); // изменяем элемент по индексу
        myL.remove(2); // удаляем 3-й эл-т
        System.out.println(myL.indexOf("is")); // поиск элемента по строке
        
        System.out.println(myL);
        
        //Создать новый список и добавить в него несколько елементов первого списка.
        ArrayList <String> newL = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 4; i++) {
            newL.add(i, myL.get(rnd.nextInt(myL.size())));
        }
        System.out.println("temp list: " + newL);     
        
        // Удалить из первого списка все элементы отсутствующие во втором списке   
        myL.retainAll(newL);
        System.out.println(myL);  
        
        // сортировка простая
        Collections.sort(myL);
        
        System.out.println(myL);  



    }
}
