package Normal;

public class ReverseInteger {

    public static int reverse(int x) {

      long reversed = 0;

      while (x != 0){
          int rem = x % 10;
          reversed = reversed * 10 + rem;
          x /= 10;

          if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE){
              return 0;
          }
      }

      return (int) reversed;

    }

    public static void main(String[] args) {
        System.out.println(reverse(1056389759));
//
//        1056389759
//        2147483647
    }
}
