package my;

import java.util.function.Function;

public class Main {
    static Integer x=5;
    public static void main(String[] args) {

        System.out.println("Hello word");
        System.out.println("Hello user");
    }

    public static void met(int a){
        Function<Integer, Integer> b=(n)->{
            int i = a+1;
            return n+i;
        };
    }
}
