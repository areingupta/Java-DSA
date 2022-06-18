package problems;
import java.util.Scanner;

public class remove_consecutive_duplicates {

    public static String removeConsecutiveDuplicates(String s){

        if (s.length() == 1){
            return s;
        }

        String smallAns = removeConsecutiveDuplicates(s.substring(1));

        if (s.charAt(0) == smallAns.charAt(0)){
            return s.charAt(0) + smallAns.substring(1);
        } else {
            return s.charAt(0) + smallAns;
        }

    }

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String input = s.next();
        System.out.println(remove_consecutive_duplicates.removeConsecutiveDuplicates(input));
    }

}
