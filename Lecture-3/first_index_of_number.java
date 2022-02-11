package problems_2;
import java.util.Scanner;

public class first_index_of_number {

    static int startIndex;

    public static int firstIndex(int input[], int x) {

        if (startIndex >= input.length-1 && input[startIndex] != x){
            return -1;
        }
        if (input[startIndex] != x){
            startIndex++;
        } else {
            return startIndex;
        }

        int smallAns = firstIndex(input,x);
        return smallAns;
    }

    static Scanner s = new Scanner(System.in);

    public static int[] takeInput(){
        int size = s.nextInt();
        int[] input = new int[size];
        for(int i = 0; i < size; i++){
            input[i] = s.nextInt();
        }
        return input;
    }

    public static void main(String[] args) {
        int[] input = takeInput();
        int x = s.nextInt();
        System.out.println(first_index_of_number.firstIndex(input, x));
    }

}
