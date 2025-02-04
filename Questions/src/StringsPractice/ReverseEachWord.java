package StringsPractice;


public class ReverseEachWord {


    public static void main(String[] args) {




//        String str = "Welcome at amla commerce";
//
//        String[] arr = str.split(" ");
//        StringBuilder newStr = new StringBuilder();
//
//        for (int i = 0; i < arr.length; i++) {
//
//            StringBuilder temp = new StringBuilder(arr[i]);
//            newStr.append(temp.reverse());
//            if (i == arr.length-1) break;
//            newStr.append(" ");
//        }
//
//        System.out.println(newStr);




        String str = "hello brother";
        System.out.println(str);
        String ans = "";
        StringBuilder temp =new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' '){
                temp.append(ch);

            }else {
                temp.reverse();
                ans += temp;

                if (i != str.length()-1){
                    ans += " ";
                }
            }

            if (i == str.length()-1){
                temp.reverse();
                ans += temp;


            }

            if (ch == ' '){
                temp.delete(0, temp.length());
            }
        }

        System.out.println(ans);
    }



}
