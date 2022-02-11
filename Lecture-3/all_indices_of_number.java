package problems_2;
import java.util.Scanner;

public class all_indices_of_number {

    public static int[] allIndexes(int input[], int x, int startIndex) {

        if (startIndex == input.length){
            int ans[] = new int[0];
            return ans;
        }

        int smallAns[] = allIndexes(input,x,startIndex+1);

        if (input[startIndex] == x){
            int ans[] = new int[smallAns.length+1];
            ans[0] = startIndex;
            for (int i = 0; i < smallAns.length; i++){
                ans[i+1] = smallAns[i];
            }
            return ans;

        } else {
            return smallAns;
        }
    }

    public static int[] allIndexes(int input[], int x) {

        return allIndexes(input,x,0);
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
        int output[] = all_indices_of_number.allIndexes(input, x);
        for(int i = 0; i < output.length; i++) {
            System.out.print(output[i] + " ");
        }
    }
}
