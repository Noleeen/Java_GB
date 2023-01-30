public class Seminar2 {
    public static void main (String [] args){
        StringBuilder build = new StringBuilder("строка");
        build.append(5);
        build.append(true);
        build.append(1.2);
        build.append('G'); //это видимо char
        
        StringBuilder build2 = new StringBuilder("строка");
        build2.append(5);
        build2.append(true);
        build2.append(1.2);
        build2.append('G'); //это видимо char

        System.out.println(build);
        System.out.println(build2);
        System.out.println(build.equals(build2));
        
        String t = build.toString();
        String p = build2.toString();
        System.out.println(p.equals(t));
        // s = build.toString();

        StringBuilder oper = new StringBuilder();
        int a = 3;
        int b = 56;
        oper
            .append(a)
            .append(" + ")
            .append(b)
            .append(" = ")
            .append(a + b + "\n" );
        oper
            .append(a)
            .append(" - ")
            .append(b)
            .append(" = ")
            .append(a - b + "\n"  );
        oper
            .append(a)
            .append(" * ")
            .append(b)
            .append(" = ")
            .append(a * b + "\n"  );
        oper
            .append(a)
            .append(" / ")
            .append(b)
            .append(" = ")
            .append((float)a / b + "\n"  );

        System.out.println(oper);
        
        
        System.out.println(oper.toString().replaceAll("=", "равно"));
        
        System.out.println(oper);

        StringBuilder q = new StringBuilder();
        String w = "=";

        long begin1 = System.currentTimeMillis();
        for(int i = 0; i<10000; i++) {
            q.append("R ");
        }
        
        long fin1 = System.currentTimeMillis();
        
        long begin2 = System.currentTimeMillis();
        for(int i = 0; i<10000; i++) {
            w += "R ";
        }
        
        long fin2 = System.currentTimeMillis();

        System.out.println(fin1 - begin1);
        System.out.println(fin2 - begin2);

    }

}
