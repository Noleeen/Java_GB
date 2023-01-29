package HomeWork;

public class hw2 {
    public static void main (String [] args){
        // 1 Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
        String a = "the first string";
        String b = "the";
        System.out.println(a.contains(b));

        // 2 Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
        String c = "eht";
        rev(b,c);

        // 4 Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
        StringBuilder operation = new StringBuilder();
        int num1 = 56;
        int num2 = 3;
        operation
            .append(num1)
            .append(" + ")
            .append(num2)
            .append(" = ")
            .append(num1 + num2 + "\n")
            .append(num1)
            .append(" - ")
            .append(num2)
            .append(" = ")
            .append(num1 - num2 + "\n")
            .append(num1)
            .append(" * ")
            .append(num2)
            .append(" = ")
            .append(num1 * num2 + "\n");
        System.out.println(operation);
        
        // 5 Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
        for (int i = 0; i < operation.length(); i++) {
            char s = '=';
            if (operation.charAt(i) == s) operation.replace(i, i+1, "равно");
        }
        
        System.out.println(operation);

        // 7 Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.
        // не понял до конца задания, поэтому просто сравниваю время создание строки средствами String и StringBuilder.

        StringBuilder q = new StringBuilder();
        String w = "";

        long begin1 = System.currentTimeMillis();
        for(int i = 0; i<10000; i++) {
            q.append("Ы");
        }
        
        long fin1 = System.currentTimeMillis();
        
        long begin2 = System.currentTimeMillis();
        for(int i = 0; i<10000; i++) {
            w += "Ы";
        }
        
        long fin2 = System.currentTimeMillis();

        System.out.println(fin1 - begin1);
        System.out.println(fin2 - begin2);


    }


    // метод преобразует строку в StringBuilder переворачивает её преобразовывает обратно в строку и сравнивает со второй строкой
    static void rev(String str1,String str2) {
        String revStr = new StringBuilder(str1).reverse().toString();
        if (revStr.equals(str2))  System.out.println(str2 + " является разворотом " + str1);
        else System.out.println(str2 + " не является разворотом " + str1);
    }
}
