package problems;
import java.util.Scanner;

public class check_number_in_array {

    static int startIndexB = 0;

    public static boolean checkNumber(int input[], int x) {

        if (input.length == 1 && input[0] != x){
            return false;
        }
        if (input[0] == x){
            return true;
        }

        int smallInput[] = new int[input.length-1];
        for (int i = 1; i < input.length; i++){
            smallInput[i-1] = input[i];
        }
        boolean smallAns = checkNumber(smallInput,x);
        return smallAns;
    }

    public static boolean checkNumberBetter(int input[], int x) {

        if (startIndexB >= input.length-1 && input[startIndexB] != x){
            return false;
        }
        if (input[startIndexB] == x){
            return true;
        }
        startIndexB++;

        boolean smallAns = checkNumber(input,x);
        return smallAns;
    }

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
        int input[] = new int[n];
        for(int i = 0; i < n; i++) {
            input[i] = s.nextInt();
        }
        int x = s.nextInt();
        System.out.println(check_number_in_array.checkNumberBetter(input, x));
    }

}
