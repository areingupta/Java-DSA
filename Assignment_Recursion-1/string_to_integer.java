package assignment_2;
import java.util.Scanner;

public class string_to_integer {

    public static int convertStringToInt(String input){

        if (input.length() == 1){
            int ans = input.charAt(0) - '0';
            return ans;
        }

        int smallAns = convertStringToInt(input.substring(1));

        if (input.charAt(0) == 0){
            return smallAns;
        }
        int ans = input.charAt(0) - '0';
        return (ans)*((int)Math.pow(10,input.length()-1)) + smallAns;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println(string_to_integer.convertStringToInt(input));
    }

}
