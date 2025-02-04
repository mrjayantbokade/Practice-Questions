package StringsPractice;

public class ToggleCase {


    public static void main(String[] args) {
        String str = "Jayant";
        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            int ascii = (int)ch;
            if ( ascii <= 90  ){
                ascii += 32;
                char dh = (char)ascii;
                sb.setCharAt(i, dh);
            }else {
                ascii -= 32;
                char dh = (char) ascii;
                sb.setCharAt(i, dh);
            }

        }

        System.out.println(sb);
    }
}
