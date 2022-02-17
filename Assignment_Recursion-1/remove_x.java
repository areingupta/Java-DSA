package assignment_2;
import java.util.Scanner;

public class remove_x {

    public static String removeX(String input){

        if (input.length() == 1){

            if (input.charAt(0) == 'x'){
                return "";
            } else {
                return input;
            }
        }

        String smallAns = removeX(input.substring(1));

        if (input.charAt(0) == 'x'){
            return smallAns;
        }
        return input.charAt(0) + smallAns;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println(remove_x.removeX(input));
    }

}
