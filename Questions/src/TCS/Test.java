package TCS;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {


        HashMap<Character, Integer> map = new HashMap<>();


        int help = 0;

        for (int i = 10; i <= 16; i++) {
            map.put((char) ('a'+help), i);
            map.put((char) ('A'+help), i);
            help++;
        }

        System.out.println(map);

    }
}
