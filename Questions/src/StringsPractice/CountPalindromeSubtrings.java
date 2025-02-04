package StringsPractice;

public class CountPalindromeSubtrings {


    public static boolean isPalindrome(String str){
        StringBuilder gtr = new StringBuilder(str);
        String temp = new String(gtr.reverse());
        return str.equals(temp);
    }

    public static void main(String[] args) {


//        StringBuilder sb = new StringBuilder("abc");
        String sb = "abcba";
        int countSubstrings = 0;

        for(int i=0; i < sb.length(); i++){
            for(int j = i+1; j <= sb.length(); j++){
                String temp = sb.substring(i,j);
                System.out.println(temp);
                if(isPalindrome(temp)){
                    countSubstrings += 1;
                }
            }
        }

        System.out.println(countSubstrings);
    }


}
