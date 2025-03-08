package TCS;
import java.util.*;

public class SweetSeventeen {

    public static void main(String[] args) {

        String str = "23GF";
        HashMap<Character, Integer> map = new HashMap<>();

        int help = 0;

        for (int i = 10; i <= 16; i++) {
            map.put((char) ('a' + help), i);
            map.put((char) ('A' + help), i);
            help++;
        }

        System.out.println(map);

        int powIndex = 0;
        int ans = 0;
        for (int i = str.length()-1; i >= 0; i--) {

            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z' || str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                ans =  ans + map.get(str.charAt(i)) * (int) Math.pow(17, powIndex++);
            }else{
                ans = ans + ((str.charAt(i) - '0') * (int) Math.pow(17, powIndex++));
            }
        }

        System.out.println(ans);

    }
}
