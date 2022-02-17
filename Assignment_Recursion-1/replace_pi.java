package assignment_2;
import java.util.Scanner;

public class replace_pi {

    public static String replace(String input){

        if (input.length() == 1){
            return input;
        }
        String smallAns = replace(input.substring(1));
        if (input.charAt(0) == 'p' && smallAns.charAt(0) == 'i'){
            return "3.14" + smallAns.substring(1);
        }
        return input.charAt(0) + smallAns;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println(replace_pi.replace(input));
    }

}
