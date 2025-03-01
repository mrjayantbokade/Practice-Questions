package TCS;

public class ValleyAndMountainCount {

    public static int countValley(String str){

        int valley = 0;
        int mountain = 0;
        Boolean down = false;
        Boolean up = false;
        int count = 0;


        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'U'){
                count++;

                if (count == 0) up = false;

                if (count > 0 && !up){
                    up = true;
                    mountain++;
                }
            }else {
                count--;
                if (count == 0) down = false;

                if (count < 0 && !down){
                    down = true;
                    valley++;
                }
            }

        }

        System.out.println("mountain: " + mountain);
        System.out.println("valley: " + valley);

        return valley;
    }


    public static void main(String[] args) {

        System.out.println(countValley("DDUUUUDD"));
    }
}
