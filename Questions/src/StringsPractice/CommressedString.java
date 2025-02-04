package StringsPractice;

public class CommressedString {
    public static void main(String[] args) {


        String str = "abbbcddddeefg";
        String ans = "" + str.charAt(0);
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            char prev = str.charAt(i-1);
            char curr = str.charAt(i);

            if (prev == curr){
                count++;
            }else {
                if (count > 1){
                    ans += count;
                }
                count = 1;
                ans += str.charAt(i);
            }

        }
        if (count > 1){
            ans += count;
        }

        System.out.println(ans);
    }
}
