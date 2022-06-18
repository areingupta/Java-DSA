package problems;
import java.util.Scanner;

public class replace_character_recursive {

    public static String replaceCharacter(String input, char c1, char c2) {

        if (input.length() == 1){
            if (input.charAt(0) == c1){
                return Character.toString(c2);
            } else {
                return input;
            }
        }

        String smallAns = replaceCharacter(input.substring(1), c1, c2);

        if (input.charAt(0) == c1){
            return c2 + smallAns;
        } else {
            return input.charAt(0) + smallAns;
        }
    }

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        String input = s.next();
        char c1 = s.next().charAt(0);
        char c2 = s.next().charAt(0);
        System.out.println(replace_character_recursive.replaceCharacter(input, c1, c2));

    }

}
