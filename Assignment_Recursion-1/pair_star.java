package assignment_2;
import java.util.Scanner;

public class pair_star {

    public static String addStars(String s) {

        if (s.length() == 1){
            return s;
        }

        String smallAns = addStars(s.substring(1));

        if (s.charAt(0) == smallAns.charAt(0)){

            return s.charAt(0)+"*"+smallAns;
        }

        return s.charAt(0) + smallAns;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println(pair_star.addStars(input));
    }

}
